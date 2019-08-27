package app.entities;

public class Services {
    private int id;
    private int price;
    private String des;
    public Services(int ID,int price,String des){
        this.id = ID;
        this.price = price;
        this.des = des;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setdes(String des) {
        this.des = des;
    }
    public int getId(){
        return this.id;
    }
    public int getPrice(){
        return price;
    }
    public String getDes() { return des; }
}