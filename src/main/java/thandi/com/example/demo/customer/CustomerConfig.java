package thandi.com.example.demo.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class CustomerConfig {

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepo repo) {
        return args -> {
                    Customer kanye = new Customer(
                            1L,
                            "kanye",
                            LocalDate.of(1993, MARCH, 1),
                            29,
                            "glmxao@yahoo.com"

            );
            Customer anna = new Customer(
                    "Anna",
                    LocalDate.of(1989, MARCH, 1),
                    29,
                    "glmxao@yahoo.com"
            );

            repo.saveAll(List.of(kanye, anna));
        };
    }
}
