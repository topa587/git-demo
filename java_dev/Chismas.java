import java.util.Scanner;

public class Chismas {
	public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("put Number: ");
        int x = kb.nextInt();
        int p = 1;
        for(int i=1; i <= x; i++){
            for(int y = i;y < x;y++){
                System.out.print(" ");
        }
            for(int z=1; z <= p;z++){
                System.out.print("*");               
        }
        p=p+2;
        System.out.println("");
        }
    }
}
