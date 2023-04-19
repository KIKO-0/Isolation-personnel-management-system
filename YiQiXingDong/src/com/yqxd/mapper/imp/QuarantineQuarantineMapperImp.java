package com.yqxd.mapper.imp;

/**
 * 实现隔离人员接口方法
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yqxd.entity.QuarantineQuarantine2;
import com.yqxd.mapper.QuarantineQuarantineMapper2;
import com.yqxd.util.BaseDao;


public class QuarantineQuarantineMapperImp implements QuarantineQuarantineMapper2 {
	BaseDao baseDao = new BaseDao();
	
	//添加所有数据
	@Override
	public int insert(QuarantineQuarantine2 qq) {
		String sql = "insert into Quarantine_Quarantine3 values(?,?,?,?,?,?,to_date(?,'yyyy-mm-dd'),sysdate,?,?,?,?,?)";
		Object[] params= {qq.getQuarantineId(), qq.getQuarantineName(), qq.getQuarantineSex(), qq.getQuarantineAge(), qq.getQuarantineNumber(), qq.getQuarantineSymptom(), qq.getQuarantineCheckDate(), qq.getQuarantineQuarantineDate(), qq.getQuarantineTravelPath(), qq.getQuarantinePassword(), qq.getDepartmentId(), qq.getRoomId(), qq.getNucleicAcidResult()};
		return baseDao.update(sql, params);
	}

	//查询所有数据
	@Override
	public List<QuarantineQuarantine2> selectAll() {
		String sql = "select * from quarantine_quarantine3";
		System.out.println(sql);
		ResultSet rs = baseDao.query(sql, null);
		List<QuarantineQuarantine2> list = new ArrayList<QuarantineQuarantine2>();
		
		try {
			while (rs.next()) {
				String quarantine_id = rs.getString(1);
				String quarantine_name = rs.getString(2);
				String quarantine_sex = rs.getString(3);
				int quarantine_age = rs.getInt(4);
				String quarantine_number = rs.getString(5);
				String quarantine_symptom = rs.getString(6);
				String quarantine_checkDate = rs.getString(7);
				String quarantine_quarantineDate = rs.getString(8);
				String quarantine_travelPath = rs.getString(9);
				//String quarantine_password = rs.getString(10);
				int department_id = rs.getInt(11);
				String room_id = rs.getString(12);
				String nucleicAcidResult = rs.getString(13);
				QuarantineQuarantine2 quarantineQuarantine = new QuarantineQuarantine2(quarantine_id, quarantine_name, quarantine_sex, quarantine_age, quarantine_number, quarantine_symptom, quarantine_checkDate, quarantine_quarantineDate, quarantine_travelPath, null, department_id, room_id, nucleicAcidResult);
				list.add(quarantineQuarantine);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			baseDao.closeAll();
		}
		return null;
	}

	//根据隔离人员身份证号删除数据
	@Override
	public int delete(String quarantineId) {
		String sql = "delete from quarantine_quarantine where quarantine_id=?";
		Object[] params = {quarantineId};
		return baseDao.update(sql, params);
	}

	//修改数据
	@Override
	public int update(QuarantineQuarantine2 qq) {
		String sql = "update quarantine_quarantine3 set quarantine_name=?, quarantine_sex=?, quarantine_age=?, quarantine_number=?, quarantine_symptom=?, quarantine_checkDate=to_date(?,'yyyy-mm-dd'), quarantine_quarantineDays=to_date(?,'yyyy-mm-dd'), quarantine_travelPath=?, quarantine_password=?, department_id=?, room_id=?,  nucleicAcidResult=? where quarantine_id=?";
		Object[] params = {qq.getQuarantineName(), qq.getQuarantineSex(), qq.getQuarantineAge(), qq.getQuarantineNumber(), qq.getQuarantineSymptom(), qq.getQuarantineCheckDate(), qq.getQuarantineQuarantineDate(), qq.getQuarantineTravelPath(), qq.getQuarantinePassword(), qq.getDepartmentId(), qq.getRoomId(), qq.getNucleicAcidResult(), qq.getQuarantineId()};
		return baseDao.update(sql, params);
	}

	@Override
	public String selectByDate(String date) {
		
		return null;
	}

	//根据手机号查询数据
	@Override
	public QuarantineQuarantine2 selectByNumber(String number) {
		String sql = "select * from quarantine_quarantine3 where quarantine_number=?";
		System.out.println(sql);
		Object[] params = {number};
		ResultSet rs = baseDao.query(sql, params);
		QuarantineQuarantine2 quarantineQuarantine = null;
		
		try {
			while (rs.next()) {
				String quarantine_id = rs.getString(1);
				String quarantine_name = rs.getString(2);
				String quarantine_sex = rs.getString(3);
				int quarantine_age = rs.getInt(4);
				String quarantine_number = rs.getString(5);
				String quarantine_symptom = rs.getString(6);
				String quarantine_checkDate = rs.getString(7);
				String quarantine_quarantineDate = rs.getString(8);
				String quarantine_travelPath = rs.getString(9);
				String quarantine_password = rs.getString(10);
				int department_id = rs.getInt(11);
				String room_id = rs.getString(12);
				String nucleicAcidResult = rs.getString(13);
				quarantineQuarantine = new QuarantineQuarantine2(quarantine_id, quarantine_name, quarantine_sex, quarantine_age, quarantine_number, quarantine_symptom, quarantine_checkDate, quarantine_quarantineDate, quarantine_travelPath, quarantine_password, department_id, room_id, nucleicAcidResult);
			}
			return quarantineQuarantine;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			baseDao.closeAll();
		}
		return null;
	}
}
