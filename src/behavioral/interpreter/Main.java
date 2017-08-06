package behavioral.interpreter;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEE = getJavaEEEExpression();

        System.out.println("Does developer knows Java Core: " + isJava.interpret("Java Core"));
        System.out.println("Does developer knows Java EE: " + isJavaEE.interpret("Java Spring"));
    }

    public static Expression getJavaExpression(){
        Expression java = new TerminalExpression("Java");
        Expression core = new TerminalExpression("Java Core");

        return new OrExpression(java, core);
    }

    public static Expression getJavaEEEExpression(){
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");

        return new AndExpression(java, spring);

    }
}
