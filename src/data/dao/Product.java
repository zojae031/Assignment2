package data.dao;

public class Product {
    private int prcode;
    private String prname;
    private int price;
    private String manufacture;

    public int getPrcode() {
        return prcode;
    }

    public int getPrice() {
        return price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getPrname() {
        return prname;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setPrcode(int prcode) {
        this.prcode = prcode;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPrname(String prname) {
        this.prname = prname;
    }

}
