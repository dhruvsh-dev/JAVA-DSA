import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number to check odd or even: ");
        int a= in.nextInt();

        if(a%2==0){
            System.out.println("Even");
        }else{
         System.out.println("Odd");   
        }
    }
}
