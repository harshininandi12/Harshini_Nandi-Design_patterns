package interpreter_Behavioral2;

public class AddExpression implements Expression{
	 private String expression;
	    
	    public AddExpression(String expression) {
	        this.expression = expression;
	    }
	    
	    @Override
	    public int interpret(InterpreterEngine engine) {
	        return engine.add(expression);
	    }
	}

class MultiplyExpression implements Expression {
	    private String expression;
	    
	    public MultiplyExpression(String expression) {
	        this.expression = expression;
	    }

	    @Override
	    public int interpret(InterpreterEngine engine) {
	        return engine.multiply(expression);
	    }
	}

