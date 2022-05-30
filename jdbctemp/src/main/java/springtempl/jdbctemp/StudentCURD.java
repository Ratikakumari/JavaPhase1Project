package springtempl.jdbctemp;

import java.util.List;

public interface StudentCURD {
public int insert(StudentBean s);
public List<StudentBean> getallstudents();
}
