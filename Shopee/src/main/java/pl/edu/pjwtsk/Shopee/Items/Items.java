package pl.edu.pjwtsk.Shopee.Items;

public class Items {
    int id;
    String itemName;
    double prize;

    public Items(int id, String itemName, double prize) {
        this.id = id;
        this.itemName = itemName;
        this.prize = prize;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }
}
