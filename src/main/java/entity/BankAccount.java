package entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class BankAccount implements Serializable {

    private Integer account_number;
    private Integer balance;
    private String firstname;
    private String lastname;
    private Integer age;
    private String gender;
    private String address;
    private String employer;
    private String email;
    private String city;
    private String state;

    public Integer getAccountNumber() {
        return account_number;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.account_number = accountNumber;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("accountNumber", account_number)
                .append("balance", balance)
                .append("firstname", firstname)
                .append("lastname", lastname)
                .append("age", age)
                .append("gender", gender)
                .append("address", address)
                .append("employer", employer)
                .append("email", email)
                .append("city", city)
                .append("state", state)
                .toString();
    }

}