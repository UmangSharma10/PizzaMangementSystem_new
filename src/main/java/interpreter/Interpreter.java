package interpreter;


import data.Order;
import data.Pizza;
import service.ServicePizza;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Interpreter  {
    ServicePizza servicePizza = new ServicePizza();
    public void Start(){

        int switchChoice = 0;


            Scanner scanner = new Scanner(System.in);
            System.out.println("********************* Welcome to Pizza House *********************");
            System.out.println("Enter your name");
            String name;
            name = scanner.next();
            scanner.nextLine();

        System.out.println("Hello Welcome " + name );
           // scanner.nextLine();
        while (!(switchChoice == 6)){
            System.out.println("1 : Create a Pizza :");
            System.out.println("2 : Display all Pizza");
            System.out.println("3 : Update a Pizza");
            System.out.println("4 : Delete a Pizza");
            System.out.println("5 : Order a Pizza");
            System.out.println("6 : Exit");
            switchChoice = scanner.nextInt();
            switch (switchChoice){
                case 1:
                    Pizza pizza = new Pizza();
                    System.out.println("Adding a pizza");
                    System.out.println("id of the pizza");
                    pizza.id= scanner.next();
                    scanner.nextLine();

                    System.out.println("Name of the Pizza");
                    pizza.name = scanner.next();
                    scanner.nextLine();
                    System.out.println("Enter the price of the pizza");
                    pizza.price = scanner.nextFloat();


                    servicePizza.createPizza(pizza.id, pizza);

                    break;
                case 2:
                    System.out.println("Displaying all Pizza");
                   HashMap<String , Pizza> temp = servicePizza.displayPizza();
                    for (Map.Entry<String, Pizza> entry : temp.entrySet()) {
                        System.out.println(entry.getKey() + " : " + entry.getValue().name + "    " + entry.getValue().price);
                    }
                    System.out.println("***********************************************");
                    break;

                case 3: {
                    Pizza pizza1 = new Pizza();
                    System.out.println("Update the Pizza");
                    {
                        System.out.println("Enter the number ");
                        pizza1.id = scanner.next();
                        System.out.println("Enter the name ");
                        pizza1.name = scanner.next();
                        scanner.nextLine();
                        System.out.println("Enter the Price");
                        pizza1.price = scanner.nextFloat();
                        servicePizza.updatePizza(pizza1.id, pizza1);
                        HashMap<String , Pizza> temp1 = servicePizza.displayPizza();
                        for (Map.Entry<String, Pizza> entry : temp1.entrySet()) {
                            System.out.println(entry.getKey() + " : " + entry.getValue().name + "    " + entry.getValue().price);
                        }
                        System.out.println("***********************************************");
                    }



                    break;
                }
                case 4:
                    Pizza pizza1 = new Pizza();
                    System.out.println("Deleting Pizza From the menu");
                    System.out.println("Please Enter the id");
                    pizza1.id = scanner.next();
                    scanner.nextLine();
                    System.out.println("Followind id has been deleted");
                    servicePizza.deleteById(pizza1.id);
                    HashMap<String , Pizza> temp2 = servicePizza.displayPizza();
                    for (Map.Entry<String, Pizza> entry : temp2.entrySet()) {
                        System.out.println(entry.getKey() + " : " + entry.getValue().name + "    " + entry.getValue().price);
                    }
                    System.out.println("***********************************************");


                break;

                case 5:
                    Order order = new Order();
                    System.out.println("Enter the Order you want");

                    break;
                case 6:
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + switchChoice);
            }

        }

    }
}
