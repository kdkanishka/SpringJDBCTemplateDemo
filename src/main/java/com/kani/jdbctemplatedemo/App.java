package com.kani.jdbctemplatedemo;

import dao.EmployeeDAOImpl;
import dao.ProjectDAOImpl;
import java.util.List;
import model.Employee;
import model.Project;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kanishka
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        
        ProjectDAOImpl proDaoImplBean = context.getBean("projectDAOImpl", ProjectDAOImpl.class);
        EmployeeDAOImpl emplDaoImplBean = context.getBean("employeeDAOImpl",EmployeeDAOImpl.class);
        
        //Operation 1 : creating a new roject
        Project proj=new Project();
        proj.setProjCode("P11");
        proj.setProjDuration(23);
        proj.setProjName("MACYS");
        System.out.println(proDaoImplBean.createNewProject(proj));
        
        //operation 2 : create new employee
        Employee newEmpl=new Employee();
        newEmpl.setEmpName("Madhuranga Sampath");
        newEmpl.setEmpTel("0773284329");
        newEmpl.setSalary(2000);
        System.out.println(emplDaoImplBean.createNewEmployee(newEmpl));
        
        //operation 3 : get employee by id
        Employee empl=emplDaoImplBean.findEmployeeByID(2);

        //operation 4 : load employee's projects
        List<Project> projs=proDaoImplBean.getProjectsOfEmployee(empl);
        empl.setProjects(projs);
        System.out.println(empl);
        
        //operation 5 : get all employees
        List<Employee> employees=emplDaoImplBean.getAllEmployees();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
