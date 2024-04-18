package TestNg;

import javaHomework.InClass4;
import org.example.Calculator;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ClassUnitTest {

    @DataProvider(name = "myData")
    public Object[][] dataProvider(){
        return new Object[][]{
                {1,2,3},
                {10,2,12},
                {15,5,20}
        };
    }

    @Test(dataProvider = "myData")
    public void testSum(int a, int b, int c) {
        Assert.assertEquals(InClass4.Addition(a, b), c);
    }
    @Test
    public void testEveryOther() {
        Assert.assertEquals(InClass4.EveryOther("Heeololeo"), "Hello");
    }
    public void testArray123() {
        int[] arr1 = {1, 1, 2, 3, 1};
        int[] arr2 = {1, 1, 2, 4, 1};
        int[] arr3 = {1, 1, 2, 1, 2, 3};

        Assert.assertTrue(InClass4.Array123(arr1));
        Assert.assertTrue(InClass4.Array123(arr2));
        Assert.assertTrue(InClass4.Array123(arr3));
    }

    @Test
    public void testStringSplosion() {
        Assert.assertEquals(InClass4.StringSplosion("Code"), "CCoCodCode");
        Assert.assertEquals(InClass4.StringSplosion("abc"), "aababc");
        Assert.assertEquals(InClass4.StringSplosion("ab"), "aab");
    }

    @Test
    public void testEndsLy() {
        Assert.assertTrue(InClass4.endsLy("oddly"));
        Assert.assertFalse(InClass4.endsLy("y"));
        Assert.assertFalse(InClass4.endsLy("oddy"));
    }

    @Test
    public void testSeeColor() {
        Assert.assertEquals(InClass4.seeColor("redxx"), "red");
        Assert.assertEquals(InClass4.seeColor("xxred"), "");
        Assert.assertEquals(InClass4.seeColor("blueTimes"), "blue");
    }

    @Test
    public void testFirstHalf() {
        Assert.assertEquals(InClass4.firstHalf("WooHoo"), "Woo");
        Assert.assertEquals(InClass4.firstHalf("HelloThere"), "Hello");
        Assert.assertEquals(InClass4.firstHalf("abcdef"), "abc");
    }

    @Test
    public void testCommonEnd() {
        int[] a1 = {1, 2, 3,5,6,8};
        int[] b1 = {7, 3,3,5,6,8};
        int[] b2 = {7, 3, 2,2,5};
        int[] b3 = {1, 3,6,2};

        Assert.assertTrue(InClass4.commonEnd(a1, b1));
        Assert.assertFalse(InClass4.commonEnd(a1, b2));
        Assert.assertTrue(InClass4.commonEnd(a1, b3));
    }

    @Test
    public void testStart1() {
        int[] a1 = {1, 2, 3};
        int[] b1 = {1, 3};
        int[] a2 = {7, 2, 3};
        int[] b2 = {1};
        int[] a3 = {1, 2};
        int[] b3 = {};

        Assert.assertEquals(InClass4.start1(a1, b1), 2);
        Assert.assertEquals(InClass4.start1(a2, b2), 1);
        Assert.assertEquals(InClass4.start1(a3, b3), 1);
    }

    @Test
    public void testHelloName() {
        Assert.assertEquals(InClass4.helloName("Bob"), "Hello Bob!");
        Assert.assertEquals(InClass4.helloName("Alice"), "Hello Alice!");
        Assert.assertEquals(InClass4.helloName("X"), "Hello X!");
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(Calculator.add(5, 10), 15);
        Assert.assertEquals(Calculator.add(-5, 10), 5);
        Assert.assertEquals(Calculator.add(0, 0), 0);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(Calculator.subtract(10, 5), 5);
        Assert.assertEquals(Calculator.subtract(5, 10), -5);
        Assert.assertEquals(Calculator.subtract(0, 0), 0);
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(Calculator.multiply(5, 10), 50);
        Assert.assertEquals(Calculator.multiply(-5, 10), -50);
        Assert.assertEquals(Calculator.multiply(0, 10), 0);
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(Calculator.divide(10, 5), 2.0);
        Assert.assertEquals(Calculator.divide(5, 10), 0.5);
    }

    @Test
    public void testModulus() {
        Assert.assertEquals(Calculator.modulus(10, 5), 0);
        Assert.assertEquals(Calculator.modulus(5, 3), 2);
        Assert.assertEquals(Calculator.modulus(10, 7), 3);
    }

    @Test
    public void testIncrement() {
        Assert.assertEquals(Calculator.increment(5), 6);
        Assert.assertEquals(Calculator.increment(-5), -4);
        Assert.assertEquals(Calculator.increment(0), 1);
    }

    @Test
    public void testDecrement() {
        Assert.assertEquals(Calculator.decrement(5), 4);
        Assert.assertEquals(Calculator.decrement(-5), -6);
        Assert.assertEquals(Calculator.decrement(0), -1);
    }

}