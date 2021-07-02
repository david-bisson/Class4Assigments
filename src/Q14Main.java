public class Q14Main {
    public static void main(String[] args) {
        try{
            throw new Q14ExceptionClass();
        } catch (Q14ExceptionClass e){
            e.printStackTrace();
        }
    }
}
