package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.Project;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Kanishka
 */
public class ProjectMapper implements RowMapper<Project>{

     /*implement abstract method for declaring mapping
     *between POJO attributes and relational table attributes
     */
    public Project mapRow(ResultSet rs, int rowNum) throws SQLException {
        Project proj=new Project();
        proj.setProjCode(rs.getString("projCode"));
        proj.setProjDuration(rs.getInt("projDuration"));
        proj.setProjID(rs.getInt("projID"));
        proj.setProjName(rs.getString("projName"));
        return proj;
    }
    
}
