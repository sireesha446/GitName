package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.StudentBeanReq;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public StudentBeanReq studentInform(StudentBeanReq studentbeanreq) {

		MapSqlParameterSource parameter = new MapSqlParameterSource();
		parameter.addValue("studentid", studentbeanreq.getStudentId());
		parameter.addValue("studentname", studentbeanreq.getStudentName());
		parameter.addValue("studentcourse", studentbeanreq.getStudentCourse());

		String insertQuery = "INSERT INTO PRACTICE_DEV.STUDENTINFO(STUDENTID,STUDENTNAME,STUDENTCOURSE) VALUES(:studentid,:studentname,:studentcourse)";

		namedParameterJdbcTemplate.update(insertQuery, parameter);

		return studentbeanreq;
	}
	// public class StudentBeanReq studentUpdateData(StudentBeanReq studentbeanreq)
	// {
	//
	// MapSqlParameterSource parameterNew = new MapSqlParameterSource();
	// parameterNew.addValue("studentid",studentbeanreq.getStudentId());
	// parameterNew.addValue("studentname",studentbeanreq.getStudentName());
	// parameterNew.addValue("studentcourse", studentbeanreq.getStudentCourse());
	//
	// String updateQuery= "UPDATE practice_dev.student_info SET studentid=:,
	// studentname=:, course=: WHERE ";
	//
	//
	// namedParameterJdbcTemplate.update(updateQuery, parameterNew);
	// return studentbeanreq;
	// }

}
