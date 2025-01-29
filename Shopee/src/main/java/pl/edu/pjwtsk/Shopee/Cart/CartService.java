package pl.edu.pjwtsk.Shopee.Cart;

import org.springframework.stereotype.Service;
import pl.edu.pjwtsk.Shopee.Items.ItemsService;
import pl.edu.pjwtsk.Shopee.Items.ItemsStorage;

@Service
public class CartService {
    private final ItemsStorage itemsStorage;
    private final ItemsService itemsService;

    public CartService(ItemsStorage itemsStorage, ItemsService itemsService) {
        this.itemsStorage = itemsStorage;
        this.itemsService = itemsService;
    }


}
