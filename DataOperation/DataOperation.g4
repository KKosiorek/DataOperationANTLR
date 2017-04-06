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
dataTime (Substract|Add) timeSpan|
expressionResultData (Substract|Add) expressionResultTime|
expressionResultData (Substract|Add) timeSpan|
timeSpan Add expressionResultData|
dataTime (Add|Substract) expressionResultTime
;

expressionResultTime:
dataTime Substract dataTime|
timeSpan(Add|Substract)timeSpan|
expressionResultTime (Add|Substract)expressionResultTime|
expressionResultData Substract expressionResultData|
expressionResultTime (Add|Substract)timeSpan|
expressionResultData Substract dataTime|
dataTime Substract expressionResultData|
timeSpan (Add|Substract) expressionResultTime;

expressionResultDataRight:
expressionResultTime Add dataTime|
expressionResultTime Add expressionResultData;

expressionRoot : expressionResultData|expressionResultTime|expressionResultDataRight|timeSpan|dataTime;
