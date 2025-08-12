package TypeAnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


@Target(ElementType.PARAMETER)
@interface MyPara{
	
	
}




// Will Give compile time error if used annotation @MyPara
//@MyPara
public class ParamerterA {

	
	public static int SUM(@MyPara int a ,@MyPara int b) {
		return a + b;
	}
}
