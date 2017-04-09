grammar DataOperation;

fragment SINGLE_SPACE   : '\u0020'; // ' '
fragment TABULATION     : '\u0009'; // '\t'
fragment LINE_FEED      : '\u000A'; // '\n'
fragment CARRAIGE_RETURN: '\u000D'; // '\r'

WhiteSpace    : ( SINGLE_SPACE | TABULATION )+ -> skip;
NewLine       : ( CARRAIGE_RETURN | LINE_FEED )+ -> skip;

Add: '+';
Substract: '-';
Slash: '/';
Colon: ':';
Dash : '-';
Dot : '.';

Data :
    ('0'?[1-9] | [1-2][0-9] | '3'[0-1])//day
    (Slash|Dash|Dot)
    ('0'?[1-9] | '1'[0-2]) //Month
    (Slash|Dash|Dot)
    ([1-9]|[1-9][0-9]|[1-9][0-9][0-9]|[1-9][0-9][0-9][0-9])//year
    ;
Time:
    ([0-1][0-9]|'2'[0-3])
    Colon
    ([0-5][0-9]) //min
    Colon
    ([0-5][0-9])//sec
    ;
Timespan:('0'|([1-9][0-9]*))Colon
                              ([0-5][0-9]) //min
                              Colon
                              ([0-5][0-9])//sec
                              ;


timeSpan : Time|Timespan;
dataTime: Data Time;

expressionResultData :
timeSpan Add dataTime|
timeSpan Add expressionResultData|
dataTime (Substract|Add) timeSpan|
dataTime (Add|Substract) expressionResultTime|
expressionResultData (Substract|Add) timeSpan|
expressionResultData (Substract|Add) expressionResultTime
;

expressionResultDataRightERT:
expressionResultTime Add dataTime|
expressionResultTime Add expressionResultData;

expressionResultTime:
dataTime Substract dataTime|
dataTime Substract expressionResultData|
expressionResultData Substract dataTime|
expressionResultData Substract expressionResultData|

timeSpan(Add|Substract)timeSpan|
expressionResultTime (Add|Substract)timeSpan|
timeSpan (Add|Substract) expressionResultTime
expressionResultTime (Add|Substract)expressionResultTime;




expressionRoot : expressionResultData|expressionResultDataRightERT|expressionResultTime|dataTime|timeSpan;
