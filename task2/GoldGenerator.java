package task2;

public class GoldGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new GoldReward();
    }
}
