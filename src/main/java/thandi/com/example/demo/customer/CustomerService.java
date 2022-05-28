package thandi.com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo){
        this.customerRepo = customerRepo;
    }
    public List<Customer> getCustomers() {
        return customerRepo.findAll();
    }


    public void addNewCustomer(Customer customer) {
        Optional <Customer> customerByEmail = customerRepo
                .findCustomerByEmail(customer.getEmail());
        if (customerByEmail.isPresent()){
            throw new IllegalStateException("email already exists");
        }
        customerRepo.save(customer);
    }

    public void deleteCustomer(Long customerId) {
        boolean exists = customerRepo.existsById(customerId);
        if (!exists) {
            throw new IllegalStateException("Customer doesnt exist :" + customerId);
        }
        customerRepo.deleteById(customerId);


    }
}
