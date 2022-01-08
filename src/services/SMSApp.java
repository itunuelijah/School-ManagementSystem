package services;

public class SMSApp {
    public static void main(String[] args) {
        c();
    }
        public static void a(){
           System.out.println("This is method a");
        }
        public static void b() {
        a();
            System.out.println("This is method a");
        }
        public static void c () {
        b();

        }

}