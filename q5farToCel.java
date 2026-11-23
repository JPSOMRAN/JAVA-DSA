import java.util.*;
public class q5farToCel {
            public static void main(String[] args) {
            try(Scanner sc=new Scanner(System.in)){
            System.out.println("Tempreture in Fahrenheit : ");
            double Fah=sc.nextDouble();
            
            
            double Cel=(Fah-32)*5/9;
            System.out.println("Tempreture in Fahrenheit is :\n"  +Cel);
}
            }
}