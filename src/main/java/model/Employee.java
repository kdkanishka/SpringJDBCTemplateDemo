package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kanishka
 */
public class Employee {
    private int empID;
    private String empName;
    private String empTel;
    private float salary;
    private List<Project> projects;

    public Employee() {
        projects=new ArrayList<Project>();
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpTel() {
        return empTel;
    }

    public void setEmpTel(String empTel) {
        this.empTel = empTel;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Employee{" + "empID=" + empID + ", empName=" + empName + ", empTel=" + empTel + ", salary=" + salary + ", projects=" + projects + '}';
    }
}
