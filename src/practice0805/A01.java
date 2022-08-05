package practice0805;

class A01 {
        static {
            System.out.println("1");
        }
    {
        System.out.println("2"); }
    public A01() {
        System.out.println("3");  }
} class B extends A01{
    static {
        System.out.println("4");    }
    {
        System.out.println("5");    }
    public B() {
        System.out.println("6");
    }
    public static class C {
        public static void main(String[] args) {
            B n = new B();
        }
    }}