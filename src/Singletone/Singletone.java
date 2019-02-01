package Singletone;

class Singletone {
    private static Singletone instance;
    public String value;

    private Singletone(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static Singletone getInstance(String value) {
        if (instance == null) {
            instance = new Singletone(value);
        }
        return instance;

    }
}
