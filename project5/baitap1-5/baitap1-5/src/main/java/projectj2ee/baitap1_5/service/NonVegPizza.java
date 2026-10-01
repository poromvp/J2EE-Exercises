package projectj2ee.baitap1_5.service;

import org.springframework.stereotype.Component;

@Component("nonVegPizza")
public class NonVegPizza implements Pizza {
    @Override
    public String getPizza() {
        return "Bánh Pizza mặn (Non-Veg Pizza) đã sẵn sàng!";
    }
}
