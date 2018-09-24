grammar Compliance;

@header {
package com.example.compliance.language;
}

error
 : UNEXPECTED_CHAR
   {
     throw new RuntimeException("UNEXPECTED_CHAR=" + $UNEXPECTED_CHAR.text);
   }
;




document
    : (compliance_object | error) EOF
    ;


compliance_object
    : compliance_version compliance_meta compliance_control+ |
    ;

compliance_version
    : (K_VERSION version_number_value)
    ;

version_number_value: VERSION_NUMBER ;

compliance_meta: compliance_meta_name compliance_meta_description compliance_meta_type ;


compliance_meta_name: (K_NAME compliance_meta_name_value) ;
compliance_meta_description: (K_DESCRIPTION compliance_meta_description_value) ;
compliance_meta_type: (K_TYPE compliance_meta_type_value) ;

compliance_meta_name_value:  STRING;
compliance_meta_description_value:  STRING;
compliance_meta_type_value:  STRING;


compliance_control: (compliance_control_ctrl compliance_control_description) ;


compliance_control_ctrl: (K_CONTROL compliance_control_ctrl_value) ;
compliance_control_ctrl_value: STRING;

compliance_control_description: (K_DESCRIPTION compliance_control_description_value) ;
compliance_control_description_value: STRING;

VERSION_NUMBER: (DIGIT+ (DOT DIGIT+)*) ;

K_VERSION: (V E R S I O N COLON);

K_NAME : (N A M E COLON);

K_DESCRIPTION : (D E S C R I P T I O N COLON);

K_TYPE: (T Y P E COLON);

K_CONTROL: (C O N T R O L COLON);

STRING: DBL_QUOTE (UPPERCASE | LOWERCASE | ' ' | '-' | DIGIT )*? DBL_QUOTE;


// Fragments
fragment DOT: '.' ;
fragment COLON : ':';
fragment DBL_QUOTE : '"';

fragment DIGIT : [0-9];

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];



fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z] ;

NEWLINE: '\r'? '\n' -> skip;
WS  :   (' '|'\r'|'\n'|'\t') -> skip;

// Default definitions

UNEXPECTED_CHAR
 : .
;

