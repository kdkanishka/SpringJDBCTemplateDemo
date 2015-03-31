package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.Employee;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Kanishka
 */
public final class EmployeeMapper implements RowMapper<Employee> {

    /*implement abstract method for declaring mapping
     *between POJO attributes and relational table attributes
     */
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee=new Employee();
        employee.setEmpID(rs.getInt("empID"));
        employee.setEmpName(rs.getString("empName"));
        employee.setEmpTel(rs.getString("empTel"));
        employee.setSalary(rs.getFloat("salary"));
        return employee;
    }
    
}
