package GCD;

public class Euclid {

    public static int gcdDivision(int a, int b){

        while (b != 0){

            int t = b;
            b = a % b;
            a = t;

        }
        return a;
    }

    public static int gcdRecursion(int a, int b) {

        if (b == 0){

            return a;

        }
        return gcdRecursion(b, a % b);

    }

    public static int gcdSubtraction(int a, int b){

        while (a != b){

            if (a > b){
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        return a;

    }

    public static void main(String[] args) {
        System.out.println(Euclid.gcdDivision(12, 36));
        System.out.println(Euclid.gcdRecursion(12, 36));
        System.out.println(Euclid.gcdSubtraction(12, 36));
    }

}
