package repo;

import data.Pizza;

import java.util.HashMap;

public class DAO {
    HashMap<String , Pizza> hashMap = new HashMap<>();
    public void create(String id , Pizza create){
        hashMap.put(id, create);

    }
    public void delete(){

    }

    public HashMap<String, Pizza> update(){

        return hashMap;
    }

    public HashMap<String, Pizza> readAll(){
        return hashMap;

    }
}
