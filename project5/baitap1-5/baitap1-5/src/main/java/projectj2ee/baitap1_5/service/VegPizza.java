package projectj2ee.baitap1_5.service;
import org.springframework.stereotype.Component;

@Component("vegPizza")
public class VegPizza implements Pizza {
    @Override
    public String getPizza() {
        return "Bánh Pizza chay (Veg Pizza) đã sẵn sàng!";
    }
}