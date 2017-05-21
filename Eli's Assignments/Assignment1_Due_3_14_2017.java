
import java.util.Scanner;

public class Assignment1_Due_3_14_2017
{
  public Assignment1_Due_3_14_2017() {}
  
  public static void main(String[] args)
  {
    Scanner eliScanner = new Scanner(System.in);
    double firstNumber = eliScanner.nextDouble();
    double secondNumber = eliScanner.nextDouble();
    double thirdNumber = eliScanner.nextDouble();
    double printedSum = numberSum(firstNumber, secondNumber);
    double printedAverage = numberAverage(firstNumber, secondNumber);
    double printedSubtracted = subtractNumber(firstNumber, secondNumber);
    double printedDivide = divideNumber(firstNumber, secondNumber);
    double printedMultiply = multiplyNumber(firstNumber, secondNumber);
    double printedMultiplyThree = multiplyThreeNumbers(firstNumber, secondNumber, thirdNumber);
    double printedAddThree = addThreeNumbers(firstNumber, secondNumber, thirdNumber);
    double printedSubtractThree = subtractThreeNumbers(firstNumber, secondNumber, thirdNumber);
    double printedDivideThree = divideThreeNumbers(firstNumber, secondNumber, thirdNumber);
    double printedAverageThree = averageThreeNumbers(firstNumber, secondNumber, thirdNumber);
    System.out.println("The sum of these two numbers is " + printedSum);
    System.out.println("The average of these two numbers is " + printedAverage);
    System.out.println("The difference between these two numbers is " + printedSubtracted);
    System.out.println("The quotient of these two numbers is " + printedDivide);
    System.out.println("The product of these two numbers is " + printedMultiply);
    System.out.println("The product of these three numbers is " + printedMultiplyThree);
    System.out.println("The sum of these three numbers is " + printedAddThree);
    System.out.println("The difference between these three numbers is " + printedSubtractThree);
    System.out.println("The quotient of these three numbers is " + printedDivideThree);
    System.out.println("The average of these three numbers is " + printedAverageThree);
  }
  



  public static double numberSum(double a, double b)
  {
    double sumResult = a + b;
    return sumResult;
  }
  


  public static double numberAverage(double a, double b)
  {
    double averageResult = (a + b) / 2.0D;
    return averageResult;
  }
  


  public static double subtractNumber(double a, double b)
  {
    double subtractNumber = a - b;
    return subtractNumber;
  }
  


  public static double divideNumber(double a, double b)
  {
    double divideNumber = a / b;
    return divideNumber;
  }
  
  public static double multiplyNumber(double a, double b)
  {
    double multiplyNumber = a * b;
    return multiplyNumber;
  }
  


  public static double multiplyThreeNumbers(double a, double b, double c)
  {
    double multiplyThreeNumbers = a * b * c;
    return multiplyThreeNumbers;
  }
  

  public static double addThreeNumbers(double a, double b, double c)
  {
    double addThreeNumbers = a + b + c;
    return addThreeNumbers;
  }
  

  public static double divideThreeNumbers(double a, double b, double c)
  {
    double divideThreeNumbers = a / b / c;
    return divideThreeNumbers;
  }
  


  public static double subtractThreeNumbers(double a, double b, double c)
  {
    double subtractThreeNumbers = a - b - c;
    return subtractThreeNumbers;
  }
  


  public static double averageThreeNumbers(double a, double b, double c)
  {
    double averageThreeNumbers = (a + b + c) / 3.0D;
    return averageThreeNumbers;
  }
}