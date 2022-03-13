import java.util.Scanner;

public class Piramid {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i=1; i<=x; i++){
        for(int y=1;y<=i;y++){
        System.out.print("*");
        }
      System.out.println("");
    }
	}
}
