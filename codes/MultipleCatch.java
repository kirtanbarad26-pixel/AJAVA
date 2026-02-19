public class  {

    public static void main(String[] args) {

        try {
            int a = args.length;   // may cause ArrayIndex issue
            int b = 10 / a;        // may cause ArithmeticException
            System.out.println(b);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");

        } catch (Exception e) {
            System.out.println("General Exception");
        }
    }
}