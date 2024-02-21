package feb21;
import java.util.Scanner;
public class one {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter RollNumber:");
                int a = sc.nextInt();
                System.out.print("Enter Name:\n");
                String name = sc.nextLine();

                System.out.println("Enter BookID:");
                String bid = sc.nextLine();
                System.out.println("Enter Number of days have passed since book was issued: ");
                int dd = sc.nextInt();

                if (dd<10) {
                    System.out.println(name+" no needs to pay any fine");
                } else{
                    System.out.println(name+" needs to pay 10 Rs Fine");
                }
            }
        }


