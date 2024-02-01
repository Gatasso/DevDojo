package academy.devdojo.aulas.Exceptions.Runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(division(1,0));
    }

    public static int division(int a, int b){
        if (b == 0){
            throw new RuntimeException("Illegal Argument");//substituivel por IllegalArgumentException
        }
        return a/b;

//        try {
//            return a/b;
//        }catch (RuntimeException e){
//            e.printStackTrace();
//        }
//        return 0;
    }
}
