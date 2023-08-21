package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<ItemFabric> fabricList = new ArrayList<>();

        fabricList.add(new GoldGenerator());
        fabricList.add(new GemGenerator());
        fabricList.add(new CrystalGenerator());

        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            int index = random.nextInt(fabricList.size());
            ItemFabric fabric = fabricList.get(index);
            fabric.openReward();
        }
    }
}
