package ru.podlesnykh.springcourse.spring_mvc_hybernate_boot.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceContextType;
import org.springframework.stereotype.Repository;
import ru.podlesnykh.springcourse.spring_mvc_hybernate_boot.entity.Employee;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @PersistenceContext(type = PersistenceContextType.EXTENDED)
    private EntityManager em;

    @Override
    public List<Employee> showAllEmployee() {
        return em.createQuery("from Employee", Employee.class).getResultList();
    }

    @Override
    public Employee getEmployeeById(int id) {
        return em.find(Employee.class, id);
    }

    @Override
    public void save(Employee employee) {
        em.persist(employee);
    }

    @Override
    public void update(int id, Employee employee) {
        em.merge(employee);
    }

    @Override
    public void delete(int id) {
        Employee employee = em.find(Employee.class, id);
        if (employee != null) {
            em.remove(em.find(Employee.class, id));
        }

    }
}
