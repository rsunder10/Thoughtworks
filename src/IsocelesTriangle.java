import java.util.Scanner;

/**
 * Created by sunder on 30/11/16.
 */
public class IsocelesTriangle {
    public static void main(String [] args){
        int n, c, k, space = 1;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        space = n - 1;
        for (k = 1; k<=n; k++) {
            for (c = 1; c<=space; c++)
                System.out.print(" ");
            space--;
            for (c = 1; c<= 2*k-1; c++)
                System.out.print("*");

            System.out.print("\n");
        }

    }
}