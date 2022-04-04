package service;

import data.Pizza;
import repo.DAO;

import java.util.HashMap;

public class ServicePizza {
    DAO dao = new DAO();
    public void createPizza(String id, Pizza create){

        dao.create(id, create);
    }

    public HashMap<String, Pizza> displayPizza(){

        return dao.readAll();

    }

    public void updatePizza(String id, Pizza pizza){
        dao.update(id, pizza);
    }

    public void deleteById(String id){
        dao.delete(id);
    }
}
