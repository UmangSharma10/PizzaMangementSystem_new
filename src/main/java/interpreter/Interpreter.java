package interpreter;


import data.Pizza;
import service.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Interpreter  {
    public void Start(){

        Pizza pizza = null;
        Service service = new Service();
        int switchChoice = 0;


            Scanner scanner = new Scanner(System.in);
            System.out.println("********************* Welcome to Pizza House *********************");
            System.out.println("Enter your name");
            String name;
            name = scanner.next();

        System.out.println("Hello Welcome " + name );
           // scanner.nextLine();
        while (!(switchChoice == 6)){
            System.out.println("1 : Create a Pizza :");
            System.out.println("2 : Display all Pizza");
            System.out.println("3 : Update a Pizza");
            System.out.println("4 : Delete a Pizza");
            System.out.println("5 : Order a Pizza");
            switchChoice = scanner.nextInt();
            switch (switchChoice){
                case 1:
                    pizza = new Pizza();
                    System.out.println("Adding a pizza");
                    System.out.println("id of the pizza");
                    pizza.id= scanner.next();
                    scanner.nextLine();

                    System.out.println("Name of the Pizza");
                    pizza.name = scanner.next();
                    scanner.nextLine();
                    System.out.println("Enter the price of the pizza");
                    pizza.price = scanner.nextFloat();


                    service.createPizza(pizza.id, pizza);

                    break;
                case 2:
                    System.out.println("Displaying all Pizza");
                   HashMap<String , Pizza> temp = service.displayPizza();
                    for (Map.Entry<String, Pizza> entry : temp.entrySet()) {
                        System.out.println(entry.getKey() + " : " + entry.getValue().name + "    " + entry.getValue().price);
                    }
                    System.out.println("***********************************************");
                    break;

                case 3:
                    int updatePizza;
                    System.out.println("Update the Pizza");
                    System.out.println("1 : Change the name");
                    System.out.println("2 : Change the price");
                    System.out.println("choose from the following");
                    updatePizza = scanner.nextInt();
                    if (updatePizza == 1) {
                        System.out.println("Enter the number ");
                        System.out.println("Enter the name ");
                        assert pizza != null;
                        pizza.name = scanner.nextLine();
                    }


                    break;

                case 4:
                break;

                case 5:
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + switchChoice);
            }

        }

    }
}
