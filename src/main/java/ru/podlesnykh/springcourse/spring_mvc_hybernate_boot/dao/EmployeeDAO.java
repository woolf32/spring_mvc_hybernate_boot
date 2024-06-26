package ru.podlesnykh.springcourse.spring_mvc_hybernate_boot.dao;


import ru.podlesnykh.springcourse.spring_mvc_hybernate_boot.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> showAllEmployee ();
    public Employee getEmployeeById (int id);
    void save(Employee employee);
    void update(int id, Employee employee);
    void delete(int id);
}
