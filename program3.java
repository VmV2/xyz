package dich;
import java.util.Random;
public class program3 {
    public static void main(String[] args) {
        Random random = new Random();
        int max = 0, i, maxindex = 0;
        int[] massive1 = new int[15];
        for (i = 0; i < 12; i++) {
            massive1[i] = random.nextInt(30)-15;
                                }
        max = massive1[0];
        for (i = 0; i < 12; i++) {
            if (max < massive1[i]  )  {
                max = massive1[i];
                maxindex = i;
            }
        }
        System.out.println("Наибольшее число массива ="+  max + "  " + "Его индекс ="+ maxindex );
    }
}