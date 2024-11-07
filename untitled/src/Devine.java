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
}
public class Devine {
    public static void main (String[] args){
        System.out.println("Welcome we will make mathematical codes ready for testing of git");
    }
}