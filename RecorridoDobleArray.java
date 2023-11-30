import java.util.Random;

public class RecorridoDobleArray {

    public static void main(String[] args) {

        double notRandy = Math.random() * 10 + 1;
        int randy = (int)notRandy;
        Random rnd = new Random();

        int[][] arrayNum = new int[randy][];

        for (int i = 0; i < randy; i++) {
            arrayNum[i] = new int[randy];
            
            for (int j = 0; j < randy; j++) {
                arrayNum[i][j] = Math.abs((rnd.nextInt()) / 10000000);
            }
        }

        for (int k = 0; k < arrayNum.length; k++) {
            for (int l = 0; l < arrayNum[k].length; l++) {
                if (l == (arrayNum[k].length) - 1) {
                    System.out.print(arrayNum[k][l]);
                } else {
                    System.out.print(arrayNum[k][l]);
                    System.out.print(" - ");
                }
                
            }
            System.out.println();
        } 
    }
}
