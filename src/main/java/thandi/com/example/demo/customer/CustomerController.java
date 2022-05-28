package thandi.com.example.demo.customer;

// all api resources belong in this file

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;



@RestController
@RequestMapping(path="api/v1/customer")
public class CustomerController {

    @GetMapping
    public List<Customer> getCustomers() {
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
