package thandi.com.example.demo.customer;

import java.time.LocalDate;

public class Customer {
    private Long id;
    private String name;
    private LocalDate dob;
    private Integer age;
    private String email;

    public Customer() {
    }

    public Customer(Long id, String name, LocalDate dob, Integer age, String email) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.email = email;
    }

    public Customer(String name, LocalDate dob, Integer age, String email) {
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
