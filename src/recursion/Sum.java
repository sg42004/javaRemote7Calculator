package recursion;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sumOfAllNumber(5));
    }

    public static long sumOfAllNumber(long number){
        if(number != 0){
            return number + sumOfAllNumber(number - 1);
        } else{
            return 0;
        }
    }
}
