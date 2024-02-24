
import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
public class Main {

    static int power(int base , int exponent){

        int result=1 ,i=1;

        if(i <= exponent) {
            //System.out.println("sayinin üst degeri" + exponent);
            result = base*power(base, exponent - 1);;
            // System.out.println("sonuc degeri" + result);

        }
        return result;
    }



    public static void main(String[] args) {

        do {
            Scanner userInp = new Scanner(System.in);
            int result;
            System.out.print("Taban sayisini girin: ");
            int base = userInp.nextInt();
            System.out.print("Üs sayisini giriniz");
            int exponent = userInp.nextInt();
            result = power(base, exponent);
            System.out.println("Sonuç :"+result);
        } while(true);
    }
}
