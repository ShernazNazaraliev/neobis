import java.util.Scanner;
public class  Sequence_IJ_4{
    public static void main(String agrs[]) {
        Scanner in = new Scanner(System.in);
        float[] arr = new float[3];
        arr[0] = (float) 0.8;
        arr[1] = (float) 1.8;
        arr[2] = (float) 2.8;
        for (float i = 0; i <= 2.2; i += 0.2) {
            for (int j = 0; j < 3; j++) {
            arr[j] += 0.20001;
                if (i - ((int)i) == 0 ||((int)i)==2 ) {
                    System.out.printf("I=%d J=%d\n", (int)i, (int)arr[j]);
                } else {
                            System.out.printf("I=%.1f J=%.1f\n", i, arr[j]);
                }
            }
        }
    }
}