package data.dao;

public class Product {

    private int prcode;

    private String prname;
    private int price;
    private String manufacture;

    public Product(int prcode, String prname, int price, String manufacture) {
        this.prcode = prcode;
        this.prname = prname;
        this.price = price;
        this.manufacture = manufacture;
    }

    public Product(){

    }

    public void setPrcode(int prcode) {
        this.prcode = prcode;
    }

    public void setPrname(String prname) {
        this.prname = prname;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getPrname() {
        return prname;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getPrice() {
        return price;
    }

    public int getPrcode() {
        return prcode;
    }

}

