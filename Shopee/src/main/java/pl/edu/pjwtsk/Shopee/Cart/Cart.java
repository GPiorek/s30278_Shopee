package pl.edu.pjwtsk.Shopee.Cart;

import pl.edu.pjwtsk.Shopee.Items.Item;

public class Cart {
    int cartID;
    int clientID;
    Item item;


    public Cart(int cartID, int clientID, Item item) {
        this.cartID = cartID;
        this.clientID = clientID;
        this.item = item;
    }

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public Item getItems() {
        return item;
    }

    public void setItems(Item item) {
        this.item = item;
    }
}

