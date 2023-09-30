import java.util.function.DoubleToIntFunction;
public class test01 {
    public static void main(String[] args){
        int a[][]=new int[5][5];
        for(int i=0;i<=4;i++){
            a[i][0]=1;
            a[i][i]=1;
        }
        for(int i=0;i<=4;i++) {
            for (int j = 1; j <= i - 1; j++) {
                a[i][j] = a[i - 1][j - 1] + a[i - 1][j - 1];

            }
        }
            for(int i=0;i<=4;i++) {
                for(int j=0;j<=i;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }

    }

}
123123123123123







