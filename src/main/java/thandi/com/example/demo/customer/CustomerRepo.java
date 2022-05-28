package thandi.com.example.demo.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long> {

    // customer function
//    @Query("SELECT s FROM Customer s WHERE s.email = ?1")

    Optional<Customer> findCustomerByEmail(String email);
}

