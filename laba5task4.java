import static java.lang.Math.*;

public class kekw {
    public static void main(String[] args) {
        double [] arr = {3,2.5,2,1.5,1,0.5,0,-0.5,-1,-1.5,-2,-2.5,-3};
        for (double i : arr){
            if (i < 0){
                System.out.println(exp(pow(i,2)));
            }
            if (i > 0 & i < 2){
                System.out.println(pow(i,2)+5);
            }
            if (i > 2){
                System.out.println(4/(pow(i,2)));
            }
            if (i == 2 || i == 0){
                System.out.println(1);
            }
        }
    }
}
