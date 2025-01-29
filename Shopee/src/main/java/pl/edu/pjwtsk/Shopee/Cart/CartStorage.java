package pl.edu.pjwtsk.Shopee.Cart;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CartStorage {
    List<Cart> cartContent = new ArrayList<>();

    public CartStorage(List<Cart> cartContent) {
        this.cartContent = cartContent;
    }
}
