package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Calculator {

    public int add(int a, int b){
        return a + b;
    }
    public int subtract(int a, int b){
        return a - b;
    }
    public  int multiply(int a, int b){
        return a * b;
    }
    public  int divide(int a, int b) {
        return a / b;
    }

    @Test
    void testAdd(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.add(1,2),3);
        Assert.assertEquals(calculator.add(100,200),300.0);
    }
    @Test
    void testSubtract(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.add(5,2),7);
    }
    @Test
    void multiply(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.add(5,2),7);
        Assert.assertThrows(ArithmeticException.class, ()->{calculator.divide(5,2);});

    }
    @Test
    void Divide(){
        Calculator calculator = new Calculator();

    }
}
