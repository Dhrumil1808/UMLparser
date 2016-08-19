import japa.parser.ast.expr.MethodCallExpr;
import japa.parser.ast.visitor.VoidVisitorAdapter;

/**
 * 
 */

/**
 * @author Darshil
 *
 */
public class MethodCallVisitor extends VoidVisitorAdapter{
	
	@Override
	public void visit(MethodCallExpr methodCallExpr, Object obj){
		
		System.out.println("Name of the Method Calling : " + methodCallExpr.getName());
		System.out.println("Args of the Method Calling : " + methodCallExpr.getArgs());
		System.out.println("Scope(Object of the name which is calling method) of the Method Calling : " + methodCallExpr.getScope());
		System.out.println("Type Args of the Method Calling : " + methodCallExpr.getTypeArgs());
		System.out.println("---------------------------------------------------------");
		
		if(methodCallExpr.getScope() != null){
			StaticClass.classList.get(StaticClass.index).getMethodCall().put(methodCallExpr.getScope().toString(), methodCallExpr.getName());
		}
		else {
			StaticClass.classList.get(StaticClass.index).getMethodCall().put(StaticClass.classList.get(StaticClass.index).getName(), methodCallExpr.getName());
		}
	}
}
