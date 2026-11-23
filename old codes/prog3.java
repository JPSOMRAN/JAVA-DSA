import java.util.*;
public class prog3 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the tempreture in Celcius:");
     double cel=sc.nextDouble();
     double f=(cel*(9.0/5.0)+32);
     System.out.println("Tempreture in fahrenheit "+ f);

     sc.close();

    }
}
