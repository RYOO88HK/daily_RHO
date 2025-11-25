package com.human.dalligo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.human.dalligo.vo.RRcourseVO;
import com.human.dalligo.vo.RRtrainerVO;



@Repository
public class RRtrainingDAO {
	
	
	@Autowired
	SqlSession sqlsession;
	private static final String Mapper ="com.human.dalligo.dao.RRtrainingDAO";
	
	
	public void insert(RRtrainerVO trainervo) {
		sqlsession.insert(Mapper+".insert", trainervo);
		
		System.out.println(trainervo);
	}
	
	public RRtrainerVO select(RRtrainerVO trainervo){
		return   sqlsession.selectOne(Mapper+".getBySelectId", trainervo);
		
	}
	
	public void insertcourse(RRcourseVO coursevo) {
		sqlsession.insert(Mapper+".insertcourse", coursevo);
	}
	
	public List<RRcourseVO> selectAll(){
		List<RRcourseVO> course=sqlsession.selectList(Mapper+".selectAllcourse");
		return course;
	}
}

	
