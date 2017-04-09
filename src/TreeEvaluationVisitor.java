import java.util.Date;

public final class TreeEvaluationVisitor extends DataOperationBaseVisitor<Long> {
    @Override
    public Long visitDataTime(DataOperationParser.DataTimeContext dataTime) throws IllegalArgumentException {
        try {
                return Main.parseDate(dataTime.getText());
        } catch (java.text.ParseException e) {
            throw new IllegalArgumentException();
        }
    }
    @Override
    public Long visitTimeSpan(DataOperationParser.TimeSpanContext timeSpan) throws IllegalArgumentException {
        try {
            return Main.parseTime(timeSpan.getText());
        } catch (java.text.ParseException e) {
            throw new IllegalArgumentException();
        }
    }


    @Override
    public Long visitExpressionResultData(DataOperationParser.ExpressionResultDataContext ctx) throws IllegalArgumentException {
        Function<Long, Long, Long> operand;
        switch(ctx.op.getType()) {
            case DataOperationParser.Add:
                operand = (a, b) -> a + b;
                break;
            case DataOperationParser.Substract:
                operand = (a, b) -> a - b;
                break;
            default:
                throw new IllegalArgumentException();
        }



        Long left = visit(ctx.getChild(0));
        Long right = visit(ctx.getChild(2));
        return operand.binary(left, right);
    }

    @Override
    public Long visitExpressionResultTime(DataOperationParser.ExpressionResultTimeContext ctx) throws IllegalArgumentException {
        Function<Long, Long, Long> operand;
        switch(ctx.op.getType()) {
            case DataOperationParser.Add:
                operand = (a, b) -> a + b;
                break;
            case DataOperationParser.Substract:
                operand = (a, b) -> a - b;
                break;
            default:
                throw new IllegalArgumentException();
        }



        Long left = visit(ctx.getChild(0));
        Long right = visit(ctx.getChild(2));
        return operand.binary(left, right);
    }

    @Override
    public Long visitExpressionResultDataRightERT(DataOperationParser.ExpressionResultDataRightERTContext ctx) throws IllegalArgumentException {
        Function<Long, Long, Long> operand;
        switch(ctx.op.getType()) {
            case DataOperationParser.Add:
                operand = (a, b) -> a + b;
                break;
            case DataOperationParser.Substract:
                operand = (a, b) -> a - b;
                break;
            default:
                throw new IllegalArgumentException();
        }



        Long left = visit(ctx.getChild(0));
        Long right = visit(ctx.getChild(2));
        return operand.binary(left, right);
    }


}
