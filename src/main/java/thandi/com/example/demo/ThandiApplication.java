package thandi.com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import thandi.com.example.demo.customer.Customer;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@SpringBootApplication
@RestController
public class ThandiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThandiApplication.class, args);
	}

	@GetMapping
	public List<Customer> justEat() {
		return List.of(
				new Customer(
						1L,
						"kanye",
						LocalDate.of(1993, Month.MARCH, 1),
						29,
						"glmxao@yahoo.com"




				)
		);
	}

}
