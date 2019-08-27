package app.entities;
import java.util.*;
import app.entities.Services;

public class User {
    private String name;
    private int balance;
    private List<Services> ordered = new ArrayList<Services>();
    User(String name,int balance){
        this.name = name;
        this.balance = balance;
    }
    public void addService(Services service){
        this.ordered.add(service);
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public void deleteService(Services service){
         this.ordered.remove(service);
    }
    public String getName() {
        return this.name;
    }
    public int getBalance(){
        return this.balance;
    }
    public List<Services> getOrdered(){
        return this.ordered;
    }
}
