package top.test.dew.loottables;

import java.util.ArrayList;

public record LootData(
        String id,
        String display,
        ArrayList<DropData> drop
) {
}
