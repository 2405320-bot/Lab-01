import java.util.Scanner;
public class Q1 {//-Write a program to print your name, roll no, section and branch in separate lines.

        public static void main(String args[])//c type args declaration
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name= sc.nextLine();// use whatever u name in sys.in line
            System.out.println("Enter you roll no.: ");
            int roll= sc.nextInt();
            sc.nextLine();
            System.out.println("Enter you Section: ");
            String section= sc.nextLine();
            System.out.println("Enter your branch");
            String branch= sc.nextLine();
            sc.close();//added this to remove the extra line input that is generally took from the console

            System.out.println(name);
            System.out.println(roll);
            System.out.println(section);
            System.out.println(branch);
        }
}
