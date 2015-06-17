package chapter2;
public class Television {
    public Television() {
        System.out.println("Now create an object of Television.");
    }
    public static void main(String[] args) {
        Television tv1 = new Television();
        Television tv2 = new Television();
        System.out.println(tv1);
        System.out.println(tv2);
    }
}
