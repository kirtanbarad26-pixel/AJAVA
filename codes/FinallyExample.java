public class FinallyExample{ 
    public static void main(String[] args) { 
        try { 
            int a = 10 / 2; 
        } finally { 
            System.out.println("Always executed"); 
        }
    }
}