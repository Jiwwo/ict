import static java.lang.Math.*;

public class kekw {
    public static void main(String[] args) {
        double [] arr = {3,2.5,2,1.5,1,0.5,0,-0.5,-1,-1.5,-2,-2.5,-3};
        for (double i : arr){
            if (i >= 1){
                double f = pow(i,2) + 5;
                System.out.println(f);}
                else {
                System.out.println(cos(i));
                }

        }


    }
}
