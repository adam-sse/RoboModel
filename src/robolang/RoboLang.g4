grammar RoboLang;

robot:
    setup program+
;

setup:
	'setup' '{'
		'Right' ':' right=motor
		'Left' ':' left=motor
		sensor*
	'}'
;

motor:
	'{'
		'port' ':' port=('A'|'B'|'C'|'D')
		'type' ':' type=('Large' | 'Medium')
		'speed' ':' speed=NUMBER
		('reverse' ':' reverse=('true' | 'false'))?
	'}'
;

sensor:
	'Sensor' ':' '{'
		'port' ':' port=('S1' | 'S2' | 'S3' | 'S4')
		'type' ':' type='ColorSensor'
		'mode' ':' modus=('RedMode' | 'AmbientMode' | 'ColorIdMode')
		'name' ':' name=ID
	'}'
;

program:
    'program' name=ID '{' command* '}'
;

command:
    drive | turn | branch | assignment
;

drive:
    direction=('forward'|'backward') ((distance=expr) | ('until' until=condition)) ';'
;

turn:
    direction=('left'|'right') amount=expr ';'
;

branch:
    kind=('if'|'while') '(' condition ')' '{' command* '}'
;

assignment:
    'set' variable=ID '=' value=expr ';'
;

expr:
      '(' bracketed=expr ')'
    | left=expr op=('+'|'-'|'*'|'/') right=expr
    | op='-' right=expr
    | value=NUMBER
    | variable=ID
;

condition:
    '(' bracketed=condition ')'
    | left=condition op=('&&'|'||') right=condition
    | op='!' right=condition
    | lExpr=expr comparison=('>'|'<'|'>='|'<='|'=='|'!=') rExpr=expr
;

NUMBER: [0-9]+('.'[0-9]+)?;

ID: [a-zA-Z_][a-zA-Z0-9_]*;

WHITESPACE: [ \t\r\n]+ -> skip;
