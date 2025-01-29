package pl.edu.pjwtsk.Shopee.Items;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ItemsStorage {
    List<Items> items = new ArrayList<>();

    public ItemsStorage(List<Items> items) {
        this.items = items;
        items.add(new Items(1,"Milk", 10));
        items.add(new Items(2, "Beer", 5));
    }

    public List<Items> getItems() {
        return items;
    }


}
