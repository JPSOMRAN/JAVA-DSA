public class prog4 {
    public static void main(String[] args) {
   int total = 3672;

int hours = total / 3600;
int minutes = (total % 3600) / 60;
int seconds = total % 60;

System.out.println(hours + "h " + minutes + "m " + seconds + "s");
    }
}
