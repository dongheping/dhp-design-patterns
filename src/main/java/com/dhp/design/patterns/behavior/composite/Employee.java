package com.dhp.design.patterns.behavior.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合（Composite）模式的定义：有时又叫作部分-整体模式，
 * 它是一种将对象组合成树状的层次结构的模式，用来表示“部分-整体”的关系，
 * 使用户对单个对象和组合对象具有一致的访问性
 */
public class Employee {
    private String name;
    private String title;
    private List<Employee> employees;

    public Employee(String name,String title){
        this.name = name;
        this.title = title;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    @Override
    public String toString(){
        return ("Employee :[ Name : "+ name
            +", title : "+ title +  "]");
    }

    public static void main(String[] args) {
        Employee CEO = new Employee("比尔盖茨","CEO");
        Employee leader = new Employee("领导1","leader");
        CEO.addEmployee(leader);
        Employee employee1 = new Employee("employee1","employee");
        Employee employee2 = new Employee("employee2","employee");
        Employee employee3 = new Employee("employee3","employee");
        Employee employee4 = new Employee("employee4","employee");
        leader.addEmployee(employee1);
        leader.addEmployee(employee2);
        leader.addEmployee(employee3);
        leader.addEmployee(employee4);
        System.out.println(CEO);
        for (Employee headEmployee : CEO.getEmployees()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getEmployees()) {
                System.out.println(employee);
            }
        }
    }
}
