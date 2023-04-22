import java.util.Scanner;

public class Overloaded{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int num;
    num = scanner.nextInt();
    int sum = multiply(num);
    System.out.println("sum: " + sum);
    
    }
    public static int multiply(int a){
    if (a == 1) return 1;
    else{
      return a*multiply(a-1)  ;
    }
    }
   }