package thandi.com.example.demo.customer;

// all api resources belong in this file

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@RequestMapping(path="api/v1/customer")
public class CustomerController {
    private CustomerService customerService;

    public void CustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }
}
