package junit.parameterized;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AdditionTestNamingTestCases {

    private int expected;
    private int first;
    private int second;

    public AdditionTestNamingTestCases(int expectedResult, int firstNumber, int secondNumber) {
        this.expected = expectedResult;
        this.first = firstNumber;
        this.second = secondNumber;
    }
    
    //To see it, after passing - expand test name
    @Parameters(name= "{index}: adding {1} + {2} = {0}")
    public static Collection<Integer[]> addedNumbers() {
    	return Arrays.asList(new Integer[][] { { 3, 1, 2 }, { 5, 2, 3 }, { 7, 3, 4 }, { 9, 4, 5 }, });
    }

    @Test
    public void sum() {
        assertEquals(expected, addNumbers(first, second));
    }
    
    
    
    public int addNumbers(int a, int b){
    	int sum = a + b;
    	return sum;
    }
    
}