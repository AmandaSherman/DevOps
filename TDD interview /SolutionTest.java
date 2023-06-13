package com.sourceallies.interview;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void calculator_shouldReturnSevenWhenSeven() {

        Solution solution = new Solution();
        String input = "7";
        String expected = "7";

        String actual = solution.doMath(input);

        
        assertEquals(expected, actual);
    }

    @Test
    void calculator_shouldReturnErrorString_whenInputIsNotRecognized() {
        Solution solution = new Solution();
        String expected = Solution.errorMessage;

        // Input is "not recognized" when the string is not a number.
        String actual = solution.doMath("this is not a number");

        assertEquals(expected, actual);
    }

    @Test
    void calculator_shouldNotReturnErrorWithPlus() {
        Solution solution = new Solution();
        String expected = Solution.errorMessage;

        // Input is "not recognized" when the string is not a number.
        String actual = solution.doMath("1+1");

        assertNotEquals(expected, actual);
    }

    @Test
    void calculator_shouldAdd_WhenPlusBetweenTwoNumbers() {
        Solution solution = new Solution();
        String expected = "2.0";

        // Input is "not recognized" when the string is not a number.
        String actual = solution.doMath("1+1");

        assertEquals(expected, actual);
    }

    @Test
    void calculator_shouldAdd_WhenPlusWithOneNumber() {
        Solution solution = new Solution();
        String expected = "1.0";

        // Input is "not recognized" when the string is not a number.
        String actual = solution.doMath("+1");

        assertEquals(expected, actual);
    }

    @Test
    void calculator_shouldReturnErrorWithTwoPlusses() {
        Solution solution = new Solution();
        String expected = Solution.invalidSyntaxError;

        // Error message when double plus symbols.
        String actual = solution.doMath("1++1");

        assertEquals(expected, actual);
    }
    // @Test
    // void calculator_shouldReturnSevenWhenSeven() {

    //     Solution solution = new Solution();
    //     String input = "7";
    //     String expected = "7";

    //     String actual = solution.doMath(input);

        
    //     assertEquals(expected, actual);
    // }

    // @Test
    // void calculator_example() {
    //     // Arrange
    //     Solution solution = new Solution();
    //     String input = "5";
    //     String expected = "5";

    //     // Act
    //     String actual = solution.doMath(input);

    //     // Assert
    //     assertEquals(expected, actual);
    // }

    // @Test
    // void shouldPass() {
    //     Solution solution = new Solution();
    //     String name = "world";

    //     assertEquals("Hello "+ name, solution.greeting(name));
    // }

    // @Test
    // void shouldPrintHelloNull() {
    //     Solution solution = new Solution();
    //     String name = null;

    //     assertEquals("Hello", solution.greeting(name));
    // }

    // @Test
    // void shouldPrintHelloUser() {
    //     Solution solution = new Solution();
    //     String name = "world";

    //     assertEquals("Hello User", solution.greeting(name));
    // }

}
