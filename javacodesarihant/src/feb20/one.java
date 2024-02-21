package feb20;
import java.util.Scanner;
class database {
    int index;
    String name1;
    String[] arr1 = new String[5];
    database(int in1, String n1) {
        this.index = in1;
        this.name1 = n1;
    }
    void create_array() {
        arr1[index] = name1;
    }
}
public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in1 = sc.nextInt();
        String cname = sc.nextLine();
        database d1 = new database(in1, cname);
        


    }
}
