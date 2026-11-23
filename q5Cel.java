import java.util.Scanner;

public class q5Cel {
        public static void main(String[] args) {
            try(Scanner sc=new Scanner(System.in)){
            System.out.println("Tempreture in Celsius : ");
            double Cel=sc.nextDouble();
            
            
            double F=(Cel*9/5)+32;
            System.out.println("Tempreture in Fahrenheit is :\n"  +F);
            

            }
        }
}
