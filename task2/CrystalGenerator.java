package task2;

public class CrystalGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new CrystalReward();
    }
}
