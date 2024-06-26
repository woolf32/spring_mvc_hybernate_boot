package ru.podlesnykh.springcourse.spring_mvc_hybernate_boot.services;


import ru.podlesnykh.springcourse.spring_mvc_hybernate_boot.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> showAllEmployee ();
    public Employee getEmployeeById (int id);
    void save(Employee employee);
    void update(int id, Employee employee);
    void delete(int id);
}
