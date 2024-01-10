package com.eugene.spring.mvc;







import com.eugene.spring.mvc.validation.CheckEmail;
import jakarta.validation.constraints.*;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@EnableWebMvc
@Validated
public class Employee {
    //@Size(min = 2, message = "name must be minimum 2 symbols")
    @NotBlank(message = "Name is mandatory")
    private String name;
    @NotBlank(message = "surname is mandatory")
    private String surname;
    @Min(value = 500, message = "must be greater than 499")
    @Max(value = 1000, message = "must be smaller than 1001")
    private int salary;

    private String department;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use XXX-XX-XX")
    private String phoneNumber;
    @CheckEmail(value = "@abc.com", message = "email must ends abc.com")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private Map<String, String> departments;

    public Map<String, String> getDepartments() {
        return departments;
    }
    private String language;

    private List<String> languages;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    private String company;

    private List<String> companies;

    public List<String> getCompanies() {
        return companies;
    }

    public void setCompanies(List<String> companies) {
        this.companies = companies;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public Employee() {
        departments = new HashMap<>();
        companies = new ArrayList<>();
        languages = new ArrayList<>();

        languages.add("EN");
        languages.add("RU");
        languages.add("FR");



        companies.add("Yandex");
        companies.add("Sber");
        companies.add("Tinkoff");


        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
