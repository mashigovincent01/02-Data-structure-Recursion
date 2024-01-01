public class Example{
    public static void main(String[] args){
        //test factorial
        System.out.println(factorial(5));
    }

    public static long factorial(long number){
        if(number <= 1){
            return 1;
        }
        else{
            return number * factorial(number - 1);
        }
    }
}