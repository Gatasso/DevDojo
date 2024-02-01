package academy.devdojo.aulas.Exceptions.Runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        try {
            System.out.println(division(1,0));
        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }

    /**
     *
     * @param a
     * @param b cant be 0
     * @return
     * @throws IllegalArgumentException
     */
    public static int division(int a, int b)throws IllegalArgumentException{
        if (b == 0){
            throw new RuntimeException("Illegal Argument");//substituivel por IllegalArgumentException
        }
        return a/b;
    }
}
