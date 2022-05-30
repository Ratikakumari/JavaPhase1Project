package springtempl.jdbctemp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
private static final String StudentDAO = null;

public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
	StudentBean sb=ac.getBean(StudentBean.class);
	StudentDAO dao=(springtempl.jdbctemp.StudentDAO) ac.getBean(StudentDAO);
	int row=dao.insert(sb);
	if(row>0) {
		System.out.println("isnertion is sucess");
	}
	else {
		System.out.println("check the code");
	}
	
}
}
