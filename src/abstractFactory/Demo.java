package abstractFactory;

import java.util.Scanner;

public class Demo {
    private static Squadron getSquadron(String type) {
        Squadron squadron = null;
        SquadronFactory squadronFactory;
        switch (type) {
            case "elf":
                squadronFactory = new ElfSquadronFactory();
                squadron = new Squadron(squadronFactory);
                break;
            case "ork":
                System.out.println("Need to create orks");
                break;
            case "human":
                System.out.println("Need to create humans");
                break;
        }
        return squadron;
    }

    public static void main(String[] args) {
        System.out.println("Enter type");
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        Squadron squadron = getSquadron(type);
        squadron.fight();
    }
}
