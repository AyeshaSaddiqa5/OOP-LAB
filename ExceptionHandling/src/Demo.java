import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int a;
        int b;

       // a=10;
       // b=0;
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
       // System.out.println(array[6]);
       // Scanner input=new Scanner(System.in);
      // System.out.println("a/b"+(a/b));
       /*try{
           a=scan.nextInt();
           b=scan.nextInt();
           int[] array={0,1,2,3};
           System.out.println("a/b"+(a/b));
           System.out.println(array[6]);
       }
       catch(ArithmeticException e){
           System.out.println("ArithematicException error");

        }
       catch (ArrayIndexOutOfBoundsException e){
           System.out.println("ArrayIndexOutOfBoundsException");
       }
       catch (InputMismatchException e){
           System.out.println("InputMismatchException");
       }

       finally {
           System.out.println("error resolved");
       }
       *//* a=input.nextInt();
        b=input.nextInt();*//*
        System.out.println("this message should be printed");
*/


      /* int divisionResult=exceptionCheck(a,b);

        //exceptionCheck(a,b);
        System.out.println(divisionResult);*/
        System.out.println("this message should be printed");
int result=divide(a,b);

    }
    /*static int exceptionCheck(int a, int b){
       int division;
        division=a/b;

        try{

            System.out.println(division);
        }
        catch(ArithmeticException e){
            System.out.println("ArithematicException error");

        }
        return division;*/
    static int divide(int v1, int v2){
        int result;
        try{
            result=v1/v2;
        }
        catch(ArithmeticException e){
            System.out.println("error");
            result=0;
        }
        return result;
    }


}
