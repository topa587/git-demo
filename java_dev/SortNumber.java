import java.util.Scanner;

public class SortNumber {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int max = 0;
        int min = 0;
        while (true){
            System.out.print("put Number: ");
            int no = kb.nextInt();
            if(no == 0){
                break;
            }
            if (no > max){
                max = no;
            }
            if (no < min){
                min = no;
            }
        }

        System.out.println("Max Number = "+max);
        System.out.println("Min Number = "+min);
    }
}
