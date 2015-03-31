package dao;

import dao.mappers.ProjectMapper;
import java.util.List;
import javax.sql.DataSource;
import model.Employee;
import model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Kanishka
 */
@Repository
public class ProjectDAOImpl implements IProjectDAO{
    private JdbcTemplate jdbcTemplate;

    @Autowired( required=true)
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    public List<Project> getProjectsOfEmployee(Employee emp) {
        System.out.println("Executing : " + QUERY_GET_PROJECTS_OF_EMPLOYEE);
        
        List<Project> projectList=
                this.jdbcTemplate.query(QUERY_GET_PROJECTS_OF_EMPLOYEE,
                new ProjectMapper(),emp.getEmpID());
        
        return projectList;
    }

    public boolean createNewProject(Project proj) {
        System.out.println("Executing : " + QUERY_CREATE_NEW_PROJECT);
        
        int affectedRows=jdbcTemplate.update(QUERY_CREATE_NEW_PROJECT, 
                proj.getProjName(),proj.getProjCode(),proj.getProjDuration() );
        
        return (affectedRows == 1);
    }
    
}
