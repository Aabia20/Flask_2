public class Main {
    public static void main(String[] args) {
        String password = "admin_password_123"; 

        int a = 10;
        int b = 0;

        if (a > 5) {
            int result = a / b;
            System.out.println(result);
        }

        try {
            String text = null;
            System.out.println(text.length());
        } catch (Exception e) {
        }
    }
}
