package dao;

import java.util.List;
import model.Employee;

/**
 *
 * @author Kanishka
 */
public interface IEmployeeDAO {
    public String QUERY_GET_ALL_EMPLOYEES="SELECT empID,empName,empTel,salary FROM employee";
    public String QUERY_FIND_EMPLOYEE_BY_ID="SELECT empID,empName,empTel,salary FROM employee e WHERE e.empID=?";
    public String QUERY_ADD_NEW_EMPLOYEE="INSERT INTO employee(empName,empTel,salary) VALUES (?,?,?)";
    
    public List<Employee> getAllEmployees();
    public Employee findEmployeeByID(int id);
    public boolean createNewEmployee(Employee empl);
}
