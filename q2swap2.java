public class q2swap2 {
    public static void main(String[] args){
    int a=20;
    int b=10;
    int c=30;
    int d=40;
    System.out.println("Before Swapping ");
    System.out.println("a before swapping = "+a);
    System.out.println("b before swapping = "+b);
    System.out.println("c before swapping = "+c);
    System.out.println("d before swapping = "+d);
    a=a-b;
    b=a+b;
    c=c+d;
    d=c-d;
    c=c-d;

    System.out.println("After swapping,");
    System.out.println("a = "+a);
    System.out.println("b = "+b);    
    System.out.println("c = "+c);
    System.out.println("d = "+d); 
    }
}
