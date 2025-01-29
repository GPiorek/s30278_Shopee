package pl.edu.pjwtsk.Shopee.Items;

public class ItemsService {
private final ItemsStorage itemsStorage;

    public ItemsService(ItemsStorage itemsStorage) {
        this.itemsStorage = itemsStorage;
    }

   public Items getItems(int ID){
        Items currentItem = null;
        for(Items items : itemsStorage.getItems()){
            if(items.getId() == ID){
                currentItem = items;
            }
        }
        if(currentItem == null){
            throw new RuntimeException("Didnt found item");
        }
        return currentItem;
   }
}
