package com.greatlearning.studentregistration.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.greatlearning.studentregistration.entity.Student;

public class StudentRegistrationService {

	static JdbcTemplate jdbctemplateobj;
	static SimpleDriverDataSource datasourceObj;

	static String USERNAME = "root";
	static String PASSWORD = "root";
	static String URL = "jdbc:mysql://localhost:3306/student_registration_db";

	public static SimpleDriverDataSource getDatabaseconnection() {
		datasourceObj = new SimpleDriverDataSource();
		try {
			datasourceObj.setDriver(new com.mysql.cj.jdbc.Driver());
			datasourceObj.setUrl(URL);
			datasourceObj.setUsername(USERNAME);
			datasourceObj.setPassword(PASSWORD);
		} catch (SQLException sqlexception) {
			sqlexception.printStackTrace();
		}
		return datasourceObj;
	}

	public static void main(String[] args) {
		System.out.println("Connecting to Database");
		jdbctemplateobj = new JdbcTemplate(getDatabaseconnection());
		System.out.println("Connection: " + jdbctemplateobj);
		if (jdbctemplateobj != null) {
			String sqlInsertQuery = "INSERT INTO student_info(f_name,l_name,email,branch_name,country) VALUES (?,?,?,?,?)";
			for (int counter = 1; counter < 5; counter++) {
				jdbctemplateobj.update(sqlInsertQuery, "a" + counter, "b" + counter, "ab" + counter + "@gmail.com",
						"Engineering", "India");
			}
			String sqlUpdatetQuery = "UPDATE student_info SET f_name = ? where l_name = ?";
			jdbctemplateobj.update(sqlUpdatetQuery, "f_z", "b1");

			String sqlSelectQuery = "SELECT f_name,l_name,branch_name,email FROM student_info";

			List listEmployee = jdbctemplateobj.query(sqlSelectQuery, new RowMapper<Student>() {
				public Student mapRow(ResultSet result, int num) throws SQLException {
					Student studentobj = new Student();
					studentobj.setF_name(result.getString("f_name"));
					studentobj.setL_name(result.getString("l_name"));
					studentobj.setBranch_name(result.getString("branch_name"));
					studentobj.setEmail(result.getString("email"));
					return studentobj;
				}
			});
			System.out.println(listEmployee);

			String sqlDeleteQuery = "DELETE from student_info where f_name =?";
			jdbctemplateobj.update(sqlDeleteQuery, "f_z");
		} else {
			System.out.println("No Connection could be established");
		}

	}
}
