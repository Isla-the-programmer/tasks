package app.Model;
import app.entities.Services;
import app.entities.User;
import java.util.*;

public class Model {
    private static Model instance = new Model();

    private int balance;

    private List<Services> model;

    public static Model getInstance() {
        return instance;
    }

    private Model() {
        model = new ArrayList<>();
        balance = 4000;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void add(Services service) {
        model.add(service);
        balance -= service.getPrice();
    }

    public void delete(int index) {
        balance += model.get(index).getPrice();
        model.remove(index);
    }

    public List<Services> getServices() {
        return model;
    }

    public List<Integer> getserids(){
        List<Services> services = getServices();
        List<Integer> ids= new ArrayList<Integer>();
        for(Services s:services){
            ids.add(s.getId());
        }
        return ids;
    }
    public List<Integer> getserprice(){
        List<Services> services = getServices();
        List<Integer> price= new ArrayList<Integer>();
        for(Services s:services){
            price.add(s.getPrice());
        }
        return price;
    }
    public List<String> getserdes(){
        List<Services> services = getServices();
        List<String> des = new ArrayList<>();
        for(Services s:services){
            des.add(s.getDes());
        }
        return des;
    }
}