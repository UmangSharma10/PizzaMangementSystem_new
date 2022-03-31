package service;

import data.Pizza;
import repo.DAO;

import java.util.HashMap;

public class Service {
    DAO dao = new DAO();
    public void createPizza(String id, Pizza create){

        dao.create(id, create);
    }

    public HashMap<String, Pizza> displayPizza(){

        return dao.readAll();

    }

    public HashMap<String, Pizza> updatePizza(){
        return dao.update();
    }
}
