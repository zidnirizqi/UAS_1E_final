import java.util.Arrays;

public class JAWABAN2 {
    public static String countPositivesSumNegativesSumNegatives(int[] input) {
        int BilanganPositif = 0;
        int BilanganNegatif = 0;

        for (int i = 0; i <input.length; i++){

            if (input[i] >0) {
                BilanganPositif++;
            }else if (input[i] < 0) {
                BilanganNegatif +=input[i];
            }
        }
        return Arrays.toString(new int[]{BilanganPositif,BilanganNegatif});
    }
    public static void main(String[] args) {
        //Output {}
        // System.out.println(new int[]{Integer.parseInt(null)});

        //Output {}
        //System.out.println(new int[]{});

        //Output {10,-65}
        System.out.println(countPositivesSumNegativesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));

        //Ouput {8,-50}
        System.out.println(countPositivesSumNegativesSumNegatives(new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));


    }


}







