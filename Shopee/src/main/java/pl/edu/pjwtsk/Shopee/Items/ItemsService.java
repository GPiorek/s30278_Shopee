package pl.edu.pjwtsk.Shopee.Items;

import org.springframework.stereotype.Service;

@Service
public class ItemsService {
    private final ItemsStorage itemsStorage;

    public ItemsService(ItemsStorage itemsStorage) {
        this.itemsStorage = itemsStorage;
    }

    public Item getItems(int ID) {
        Item currentItem = null;
        for (Item item : itemsStorage.getItems()) {
            if (item.getId() == ID) {
                currentItem = item;
            }
        }
        if (currentItem == null) {
            throw new RuntimeException("Didnt found item");
        }
        return currentItem;
    }
}
