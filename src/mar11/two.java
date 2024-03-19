package mar11;
import java.util.Scanner;
class banking_deets{
    Scanner sc = new Scanner(System.in);
    int uid;
    String cusname;
    int[] arr1 = new int[150];
    int[] starr = new int[100];
    int expenses = 0;
    int counter = 0;
    int sum = 0;
    banking_deets() {
        this.uid = 1;
        this.cusname = "John Doe";
    }
    banking_deets(int nid1, String name) {
        this.uid = nid1;
        this.cusname = name;
    }
    void get_cusname() {
        System.out.println(cusname);
    }
    void add_expense(int lenexp) {
        for(int i = counter; i<lenexp; i++) {
            arr1[i] = sc.nextInt();
        }
        counter = counter + lenexp;
    }
    void display_full_expense() {
        for(int i = 0; i<counter; i++) {
            System.out.println(arr1[i]);
        }
    }
    void tot_Exp() {
        for(int i = 0; i<counter; i++) {
            sum = sum + arr1[i];
        }
        System.out.println(cusname+" has a total expense of: "+sum);
    }
    void stock_exp() {
        System.out.println("Welcome to stock investing");
        System.out.println();
        System.out.print("Enter the money you would like to invest: ");
        int s1 = sc.nextInt();
        sum = sum - s1;
        System.out.println("Money Invested: "+s1);
        System.out.println("New balance: "+sum);
    }
}

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Customer Name: ");
        String a = sc.nextLine();
        banking_deets s1 = new banking_deets(1,a);
        System.out.print("How many expenses you want to add?: ");
        int lenexp = sc.nextInt();
        s1.add_expense(lenexp);
        s1.tot_Exp();
        s1.stock_exp();

    }

}
