
package dich;
        import java.util.Scanner;
        import java.util.Random;
public class program1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int n, i;
        int z = 0;
        System.out.println("Введите размер массива");
        n = scan.nextInt();
        if (n < 3) {
            System.out.println("Введите число больше 3");
        } else {
            int[] massive1 = new int[n];
            int[] massive2 = new int[n];
            for (i = 0; i < n; i++) {
                massive1[i] = random.nextInt(n);
                System.out.print(massive1[i] + " ");
                if (massive1[i] % 2 == 0) {
                    massive2[z] = massive1[i];
                    z = z + 1;
                }

            }
            System.out.println(" ");
            for (i = 0; i < z; i++) {
                System.out.print(massive2[i] + " ");
            }
        }
    }
}