
package testing;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
@SuppressWarnings("unused")
public class Calculator {
	
	@Test
	public void testCalculator()//method for to check whether the calculator is working or not 
	{
		Demo testing=new Demo();
		assertEquals("Answer",26,testing.operations(9, 17, '+'));//checks if addition of two numbers is done correct or not
		assertEquals("Answer",19,testing.operations(24, 5, '-'));//checks if subtraction of two numbers is done correct or not
		assertEquals("Answer",65,testing.operations(13, 5, '*'));//checks if multiplication of two numbers is done correct or not
		assertEquals("Answer",9,testing.operations(45, 5, '/'));//checks if division of two numbers is done correct or not
	}
	
    class Demo{
    	public int operations(int i,int j,char op)//method to perform arithmetic operation 
    	{
    		int ans = 0;
    		switch(op) {
    		case '+':ans=i+j;//performs addition of two numbers
    		         break;
    		case '-':ans=i-j;//performs subtraction of two numbers
    		         break;
    		case '*':ans=i*j;//performs multiplication of two numbers
    		         break;
    		case '/':ans=(int)i/j;//performs division of two numbers
    		         break;
    		}
    		return ans;
    	}
    }
}
