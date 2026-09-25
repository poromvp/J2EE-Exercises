package projectj2ee.baitap1_5.controller;
import projectj2ee.baitap1_5.service.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PizzaController {

    private Pizza pizza;

    @Autowired
    public PizzaController(@Qualifier("vegPizza") Pizza pizza) {
        System.out.println("Đang tiêm (inject) qua Constructor của PizzaController");
        this.pizza = pizza;
    }

    public String getPizza(){
        return pizza.getPizza();
    }
}