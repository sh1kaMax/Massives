import java.util.Random;

public class main {

    public static short funk(int x) {
        short[] a = new short[9];
        for (int i=1; i <= 9; i++) {
            a[i - 1] = (short) (i * 2);
        }
        return a[x];
    }
    public static void main(String[] args){
        float[] x = new float[19];
        double[][] a = new double[9][19];
        Random rnd = new Random();
        for(int i=0; i <= 18; i++) {
            x[i] = (float) Math.random() * 21 - 13;
        }
        for(int i=0; i <= 8; i++){
            for(int j=0; j<= 18; j++){
                if(funk(i) == 16)
                    a[i][j] = Math.asin(((2 * (x[j] -2.5)) / 63));
                else
                if(funk(i) == 4 || funk(i) == 6 || funk(i) == 8 || funk(i) == 18){
                    a[i][j] = Math.exp(Math.asin(Math.exp(-Math.abs(x[j]))));
                }else {
                    a[i][j] = Math.pow(Math.asin(Math.pow(Math.pow((x[j] -2.5) / 21, 2), 2)) / 2,3);
                }
            }
        }
        for(int i=0; i <= 8; i++) {
            for (int j = 0; j <= 18; j++) {
                if(a[i][j] < 0) {
                    System.out.printf("%.2f", a[i][j]);
                    System.out.print(" ");
                }else{
                    System.out.printf("%.2f", a[i][j]);
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


