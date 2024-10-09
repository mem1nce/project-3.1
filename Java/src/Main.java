import java.sql.SQLOutput;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int a,i;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        a = input.nextInt();

        for(i=0 ; i<a ; i++ ){
            if(i%2 == 0){
                System.out.println("The number is :"+i);
            }
        }
    }
}
