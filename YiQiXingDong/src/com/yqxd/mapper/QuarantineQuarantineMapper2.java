package com.yqxd.mapper;

import java.util.List;

import com.yqxd.entity.QuarantineQuarantine2;



/**
 * 隔离人员
 * Mapper层接口
 * @author 15187
 *
 */
public interface QuarantineQuarantineMapper2 {
	
	//添加所有数据
	int insert(QuarantineQuarantine2 qq);
	
	//查询所有数据
	List<QuarantineQuarantine2> selectAll();
	
	//根据隔离人员身份证号删除数据
	int delete(String quarantineId);
	
	//修改数据
	int update(QuarantineQuarantine2 qq);
	
	//查询隔离天数
	String selectByDate(String date);
	
	//根据手机号查询数据
	QuarantineQuarantine2 selectByNumber(String number);
}
