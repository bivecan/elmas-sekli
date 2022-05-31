import java.util.Scanner;

public class ElmasSekli {
    public static void main(String[] args) {
        int n; int i; int j; int k; int b;

        Scanner scan= new Scanner(System.in);
        System.out.println("Satır sayısı girin");
        b= scan.nextInt();
        n= (b+1)/2;
        /*n=9 dusunerek dene*/
        for (i=1; i<=n; i++){
            for (j=1; j<=(n-i); j++){
                System.out.print(" ");
                }
            for (k=1; k<=(2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (i=(n+1); i<=b; i++){
            for (j=1; j<=(i-n); j++){
                System.out.print(" ");
            }
            for (k=1; k<=b-2*(i-n); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
