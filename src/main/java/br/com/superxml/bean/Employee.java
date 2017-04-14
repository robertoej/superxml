package br.com.superxml.bean;

import java.util.Date;

/**
 * Created by robertoelerojunior on 14/4/17.
 */
public class Employee {
    String firstName;
    String lastName;
    String title;
    int salary;
    Date hireDate;

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public int getSalary() {

        return salary;
    }

    public void setSalary(int salary) {

        this.salary = salary;
    }

    public Date getHireDate() {

        return hireDate;
    }

    public void setHireDate(Date hireDate) {

        this.hireDate = hireDate;
    }

    @Override public String toString() {

        return "{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", title='" + title + '\'' + ", salary=" + salary
                + ", hireDate=" + hireDate + '}';
    }
}