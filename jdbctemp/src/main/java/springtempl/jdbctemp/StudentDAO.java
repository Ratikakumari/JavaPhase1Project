package springtempl.jdbctemp;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAO implements StudentCURD {
  JdbcTemplate temp;
  //jdbc-driver,connection,statement,execution,close
  //table need to be created by the user
  //jdbcTemplate-driver,connection-xml file

public void setTemp(JdbcTemplate temp) {
	this.temp = temp;
}

	public int insert(StudentBean s) {
		String sql="insert into student values("+s.getSid()+",'"+s.getSname()+"')";
		return temp.update(sql);
	}

	public List<StudentBean> getallstudents() {
		// TODO Auto-generated method stub
		return null;
	}

}
