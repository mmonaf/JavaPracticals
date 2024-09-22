@echo off
setlocal

rem List of categories and their functions
set "categories=MathOperations:Summation Division Square Addition Factorial Swap NaturalNumber SecondPractice PracticeOdd IsPrime SineNumber Voting DivideNumber Floating SquareArea Rectangle Cube ReverseNumber Code Numbers NumbersDiv Multi ArrayLength ArrayElement ArraySum ArrayMaxValue SquareRoot CubeRoot Max Negate Min IsEven IsPrime Factorial IsPalindrome FindMax FindMin Reverse Add MultiplicationWithNegativeNumber"

rem Create directories for each category
for %%c in (%categories%) do (
    mkdir %%c
    mkdir %%c\Tests
)

rem Create class files for each category
for %%c in (%categories%) do (
    echo public class %%c { > %%c\%%c.java
    rem Add functions for the category
    for %%f in (%%c) do (
        echo     public static int %%f(int a, int b) { >> %%c\%%c.java
        echo         // Add implementation for %%f function >> %%c\%%c.java
        echo         return 0; >> %%c\%%c.java
        echo     } >> %%c\%%c.java
    )
    echo } >> %%c\%%c.java
)

rem Create test files for each class
for %%c in (%categories%) do (
    echo import static org.junit.Assert.*; > %%c\Tests\%%cTest.java
    echo import org.junit.Test; >> %%c\Tests\%%cTest.java
    echo. >> %%c\Tests\%%cTest.java
    echo public class %%cTest { >> %%c\Tests\%%cTest.java
    rem Add test cases for the functions
    for %%f in (%%c) do (
        echo     @Test >> %%c\Tests\%%cTest.java
        echo     public void test%%f() { >> %%c\Tests\%%cTest.java
        echo         assertEquals(0, %%c.%%f(0, 0)); >> %%c\Tests\%%cTest.java
        echo     } >> %%c\Tests\%%cTest.java
    )
    echo } >> %%c\Tests\%%cTest.java
)

echo Done creating class and test files for each category.

endlocal