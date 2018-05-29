package robot;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import robodump.EcoreToJavaConverter;
import robolang.AntlrToEcoreTransformer;
import robolang.RoboLangLexer;
import robolang.RoboLangParser;
import robolang.RoboLangParser.RobotContext;
import robomodel.robo.Program;
import robomodel.robo.Robot;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("Parsing...");
		
		ANTLRInputStream in = new ANTLRFileStream("input/test.robot");
        RoboLangLexer lexer = new RoboLangLexer(in);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        RoboLangParser parser = new RoboLangParser(tokenStream);
        RobotContext ctx = parser.robot();

        System.out.println("Converting to ecore model...");
        Robot result = new AntlrToEcoreTransformer().visitRobot(ctx);
        
        File outputDir = new File("output");
        
        for (Program p : result.getProgramms()) {
        	System.out.println("Dumping as Java file...");
        	File f = new EcoreToJavaConverter(result, outputDir).writeProgram(p);
        	System.out.println("Compiling...");
        	f = compileFile(f);
        	System.out.println("Zipping...");
        	f = zipFile(f);
        	System.out.println("Created: " + f);
        }
	}
	
	private static File compileFile(File f) throws IOException {
		ProcessBuilder pb = new ProcessBuilder("javac", "-cp", "../lib/ev3classes.jar", "-source", "1.7", "-target", "1.7", f.getName());
		pb.directory(f.getParentFile());
		pb.redirectError(Redirect.INHERIT);
		pb.redirectOutput(Redirect.INHERIT);
		
		Process p = pb.start();
		
		int exit = 1;
		try {
			exit = p.waitFor();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if (exit != 0) {
			throw new IOException("Error while compiling");
		}
		
		return new File(f.getParentFile(), f.getName().replaceAll("\\.java$", ".class"));
	}
	
	private static File zipFile(File f) throws IOException {
		String name = f.getName().replaceAll("\\.class$", "");
		File zip = new File(f.getParentFile(), name + ".jar");
		
		File manifest = new File(f.getParentFile(), "manifest.mf");
		try (FileWriter out = new FileWriter(manifest)) {
			out.write("Manifest-Version: 1.0\n");
			out.write("Main-Class: " + name + "\n");
		}
		
		
		ProcessBuilder pb = new ProcessBuilder("jar", "cfm", zip.getName(), manifest.getName(), f.getName());
		pb.directory(f.getParentFile());
		pb.redirectError(Redirect.INHERIT);
		pb.redirectOutput(Redirect.INHERIT);
		
		Process p = pb.start();
		
		int exit = 1;
		try {
			exit = p.waitFor();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if (exit != 0) {
			throw new IOException("Error while zipping");
		}
		
		return zip;
	}
	
}
