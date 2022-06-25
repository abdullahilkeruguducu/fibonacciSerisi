import java.util.Scanner;
//Patika.dev linkim --> https://app.patika.dev/ailker
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman Sayisini giriniz: ");
        int n = input.nextInt();
        int a = 0, b = 1, total;

        for (int i = 2; i <= n; i++) {
            total = a+b;
            System.out.print(a + " + " +b + " = "+total);
            a=b;
            b=total;
            System.out.println();
        }
    }
}