import java.util.Scanner;

public class client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select a command:");
        System.out.println("1 - STORE\n2 - GET\n3 - REMOVE");
        if(sc.next() == "1"){

        } else if(sc.next() == "2"){

        } else if(sc.next() == "3"){

        } else {
            System.out.println("Invalid Command.");
        }
    }

}
