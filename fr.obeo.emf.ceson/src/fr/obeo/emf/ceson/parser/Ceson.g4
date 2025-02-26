/*******************************************************************************
 * Copyright (c) 2008, 2014 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 * Author :
 *     <a href="mailto:romain.guider@obeo.fr">Romain Guider</a>
 *******************************************************************************/
 grammar Ceson;

 model
 :
 	definition
 	(
 		';' definition
 	)*
 ;

 definition
 :
 	ID '=' value
 ;

 value
 :
 	ID # Ref
 	| Int # IntLiteral
 	| Float # RealLiteral
 	| String # StringLiteral
 	| Boolean # BooleanLiteral
 	| Date # DateLiteral
 	| enumName # EnumLiteral
 	| object # ObjectLiteral
 	| array # ArrayLiteral
 ;

 array
 :
 	'['
 	(
 		value
 		(
 			',' value
 		)*
 	)? ']'
 ;

 object
 :
 	className '{' featureList '}'
 ;

 featureList
 :
 	(
 		feature
 		(
 			',' feature
 		)*
 	)?
 ;

 enumName
 :
 	(
 		ID '.'
 	)? ID '.' ID
 ;

 className
 :
 	(
 		ID '.'
 	)? ID
 ;

 feature
 :
 	ID ':' value # Containment
 	| ID '>' value # Reference
 ;

 Boolean
 :
 	'true'
 	| 'false'
 ;

 WS
 :
 	[ \t\r\n]+ -> skip
 ; // skip spaces, tabs, newlines

 SL_COMMENT
 :
 	'//' .*? '\n' -> skip
 ;

 ML_COMMENT
 :
 	'/*' .*? '*/' -> skip
 ;

 ID
 :
 	[a-zA-Z] [_\-a-zA-Z0-9]+
 ;

 fragment
 DIGIT
 :
 	[0-9]
 ;

 Int
 :
 	DIGIT+
 ;

 Date
 :
 	DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT '-' DIGIT DIGIT
 ;

 Float
 :
 	DIGIT+ '.' DIGIT+
 ;

 String
 :
 	'\''
 	(
 		ESC
 		| ~[\\']
 	)* '\''
 ;

 fragment
 ESC
 :
 	'\\\''
 	| '\\\\'
 ;

