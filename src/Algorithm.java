import java.util.ArrayList;

public class Algorithm
{
    int x = 1;
    double POWER;

    public double mod(int b, int m){
        int q;
        int r;

        q = b / m;
        if (q < 0) {                //quotient
            q = q - 1;
        }
        r = b -(q * m);             //remainder
        return r;
    }


//   public double binaryExpansion(int num){
//       String bin = Integer.toBinaryString(num);
//       return num;
//   }

    public static void main(String[] args) {
        Algorithm obj = new Algorithm();
        double power;
        int a = 3;
        int b = 11;
        double c=45;
        double result = Math.pow(a,b);
        System.out.println(result);

        power = result % c;      //Equivalent to b mod m
        System.out.println(power);
    }
}

