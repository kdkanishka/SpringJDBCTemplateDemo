package dao;

import java.util.List;
import model.Employee;
import model.Project;

/**
 *
 * @author Kanishka
 */
public interface IProjectDAO {
    public String QUERY_CREATE_NEW_PROJECT="INSERT INTO project(projName,projCode,projDuration) VALUES (?,?,?)";
    public String QUERY_GET_PROJECTS_OF_EMPLOYEE="SELECT  proj.projID AS `projID`,  proj.projName AS `projName`,  proj.projCode AS `projCode`,  proj.projDuration AS `projDuration`,  ehp.Employee_empID AS `empID` FROM  employee_has_project ehp  INNER JOIN project proj ON ehp.Project_projID = proj.projID WHERE  ehp.Employee_empID = ?";
    
    public List<Project> getProjectsOfEmployee(Employee emp);
    public boolean createNewProject(Project proj);
}
