package projectj2ee.baitap1_5;
import projectj2ee.baitap1_5.controller.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Baitap15Application {

	public static void main(String[] args) {
		var context = SpringApplication.run(Baitap15Application.class, args);

		PizzaController pizzaController = context.getBean(PizzaController.class);
		System.out.println(pizzaController.getPizza());
	}
}