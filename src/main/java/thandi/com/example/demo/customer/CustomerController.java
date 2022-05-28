package thandi.com.example.demo.customer;

// all api resources belong in this file

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@RequestMapping(path="api/v1/customer")
public class CustomerController {
    private final CustomerService customerService;


    @Autowired // autowired ensure the customer service object is inserted in the customer
        // controller method - example of dependency injection
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }
}
