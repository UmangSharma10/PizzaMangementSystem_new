package repo;

import data.Pizza;

import java.util.HashMap;

public class DAO {
    HashMap<String , Pizza> hashMap = new HashMap<>();
    Pizza pizza = new Pizza();
    public void create(String id , Pizza create){
        hashMap.put(id, create);

    }
    public void delete(String id){
        hashMap.remove(id);
    }

    public void update(String id, Pizza update){
        hashMap.put(id, update);

    }

    public HashMap<String, Pizza> readAll(){
        HashMap<String, Pizza> tempHash = new HashMap<>(hashMap);
        return tempHash;

    }
}
