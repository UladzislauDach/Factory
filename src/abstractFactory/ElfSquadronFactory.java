package abstractFactory;

public class ElfSquadronFactory extends SquadronFactory {
    @Override
    public Mage createMage() {
        return new ElfMage();
    }

    @Override
    public Archer createArcher() {
        return new ElfArcher();
    }

    @Override
    Warrior createWarrior() {
        return new ElfWarrior();
    }
}
