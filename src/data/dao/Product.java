package data.dao;

public class Product {

    private int prcdoe;

    private String prname;
    private int price;
    private String manufacture;


    public Product(int prcdoe, String prname, int price, String manufacture) {
        this.prcdoe = prcdoe;
        this.prname = prname;
        this.price = price;
        this.manufacture = manufacture;
    }

    public int getPrcdoe() {
        return prcdoe;
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

    public void setPrcdoe(int prcdoe) {
        this.prcdoe = prcdoe;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPrname(String prname) {
        this.prname = prname;
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

