package thandi.com.example.demo.customer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class CustomerService {
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
