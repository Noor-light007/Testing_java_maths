class maths{
    public static int square(int a){
        return a * a;
    }
    public static boolean is_perfect(int a){
        int test = (int)Math.sqrt(a);
        if(test * test == a){
            return true;
        }
        return false;
    }
    public static boolean is_cube(int a){
        if (a == 1){
            return true;
        } else if (a == 0){
            return true;
        }else{
            for(int x = 2; x < a; x++){
                if(is_perfect(x)){
                    int test = (int)Math.sqrt(x);
                    if(test * x == a){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static int facto(int a){
        if (a == 0){
            return 1;
        }
        return a * facto(a-1);
    }
}
public class Devine {
    public static void main (String[] args){
        for(int x = 0; x <= 10; x++){
            System.out.println(x+" result of Cube: "+maths.is_cube(x));
            System.out.println(x+" result of Square: "+maths.is_perfect(x));
            System.out.println("Factorial of "+x+": "+maths.facto(x));
        }
    }
}