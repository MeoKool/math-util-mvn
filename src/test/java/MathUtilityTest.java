/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.tsq.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author saeququangsss
 */
public class MathUtilityTest {
    
    //Test case #1: Verify getFactorial(with n =0)
    //Step/Procedures
    //  1.Given n  = 0
    //  2.Call/invoke getFactorial(n=0)
    //Expected result:
    //      the method must return 1 as the relust of 0!=1
    // Status PASSED | FAILED chờ lúc chạy hàm mới biết trạng thái đúng sai
    @Test
    public void verifyFactorialGivenRightArugument0RetusOk(){
        assertEquals(1, MathUtility.getFactorial(0));
    }
    @Test
    public void verifyFactorialGivenRightArugument1RetusOk(){
        assertEquals(1, MathUtility.getFactorial(1));
    }
    @Test
    public void verifyFactorialGivenRightArugument5RetusOk(){
        assertEquals(120, MathUtility.getFactorial(5));
    }
}
