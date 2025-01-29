package pl.edu.pjwtsk.Shopee.Items;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ItemsStorage {
    List<Item> items = new ArrayList<>();

    public ItemsStorage(List<Item> items) {
        this.items = items;
        items.add(new Item(1, "Milk", 10));
        items.add(new Item(2, "Beer", 5));
    }

    public List<Item> getItems() {
        return items;
    }


}
