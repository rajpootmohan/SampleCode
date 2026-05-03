public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }

    class Test {
        void show() {}

        void show(int x) {}  // ✅ allowed (overloading)
    }
    
}