package Singletone;

public class Demo {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Singletone singletone = Singletone.getInstance("FOO");
        Singletone singletone2 = Singletone.getInstance("BAR");
        System.out.println(singletone.value);
        System.out.println(singletone2.value);
    }
}
