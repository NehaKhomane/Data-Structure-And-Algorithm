import java.util.Queue;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        circularqueue c = new circularqueue(5);
        int ch ;
        do{
            System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek");
            System.out.println("Enter the elements in the queue : ");
            ch = input.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter the elements in the queue : ");
                    int q = input.nextInt();
                    c.push(q);
                    break;
                    case 2:
                        System.out.println("Popped elements in the queue : " +c.pop());
                        break;
                        case 3:
                            System.out.println("Peek elements in the queue : " +c.peek());
                            break;
            }

        } while (ch!=0);
input.close();


    }
}