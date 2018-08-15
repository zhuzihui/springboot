package com.yc.dao.impl;
/*package com.yc.dao.impl;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.yc.bean.User;
import com.yc.dao.UserDao;

@Mapper
@Component
@Transactional		//事务注解
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{
	
	@Resource(name="aaa")
	private SqlSessionTemplate sqlSessionTemplate;

	
  	@Resource(name="sessionTemplate")
	@Override
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}


	
	@Override
	public User login(User user) {
		return super.getSqlSession().selectOne("com.yc.dao.mapper.userDaoMapper.login",user);
		
	}

	@Override
	public int reg(User user) {
		int i= super.getSqlSession().insert("com.yc.dao.mapper.userDaoMapper.reg",user);
		System.out.println(i);
		return i;
		
	}

}
*/