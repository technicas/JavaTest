public class Welcome {
    public static void main(String args[]) {
        String welcomeStr = "Welcome to core java!";
        System.out.println(welcomeStr);
        for(int i = 0; i < welcomeStr.length(); i++) {
            System.out.print("=");
        }
    }
}
