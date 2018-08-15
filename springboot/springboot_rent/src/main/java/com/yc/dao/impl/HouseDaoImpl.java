/*package com.yc.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Component;

import com.yc.bean.House;
import com.yc.dao.HouseDao;

@Component
public class HouseDaoImpl extends SqlSessionDaoSupport implements HouseDao {

	
	@Resource(name="sqlSession")
	@Override
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}

	@Override
	public List<House> findAllHouse() {
		List<House> listHouse=super.getSqlSession().selectList("com.yc.dao.mapper.houseDaoMapper.findAllHouse");
		return listHouse;
	}

	@Override
	public void addHouse(House house) {
		super.getSqlSession().insert("com.yc.dao.mapper.houseDaoMapper.findAllHouse", house);
		
	}

	@Override
	public void updataHouse(House house) {
		
	}

	@Override
	public void deleteHouse(House house) {

	}

}
*/