/**
 * 
 */
package com.yqxd.service.imp;

import java.util.List;

import com.yqxd.entity.QuarantineQuarantine2;
import com.yqxd.mapper.QuarantineQuarantineMapper2;
import com.yqxd.mapper.imp.QuarantineQuarantineMapperImp;
import com.yqxd.service.QuarantineQuarantineService2;

/**
 * 隔离人员
 * Service实现逻辑
 * @author 15187
 *
 */
public class QuarantineQuarantineServiceImp2 implements QuarantineQuarantineService2 {
	QuarantineQuarantineMapper2 quarantineQuarantineMapper = new QuarantineQuarantineMapperImp();
	
	@Override
	public int insert(QuarantineQuarantine2 qq) {
		// TODO 自动生成的方法存根
		return quarantineQuarantineMapper.insert(qq);
	}

	@Override
	public List<QuarantineQuarantine2> selectAll() {
		// TODO 自动生成的方法存根
		return quarantineQuarantineMapper.selectAll();
	}

	@Override
	public int delete(String quarantineId) {
		// TODO 自动生成的方法存根
		return quarantineQuarantineMapper.delete(quarantineId);
	}

	@Override
	public int update(QuarantineQuarantine2 qq) {
		// TODO 自动生成的方法存根
		return quarantineQuarantineMapper.update(qq);
	}

	@Override
	public String selectByDate(String date) {
		// TODO 自动生成的方法存根
		return quarantineQuarantineMapper.selectByDate(date);
	}

	@Override
	public int login(String adminNumber, String adminPassword) {
		QuarantineQuarantine2 quarantineQuarantine = quarantineQuarantineMapper.selectByNumber(adminNumber);
		if (quarantineQuarantine == null) {
			return 404;
		} else if (! quarantineQuarantine.getQuarantinePassword().equals(adminPassword)) {
			return 500;
		} else {
			return 200;
		}
	}

	@Override
	public int login2(String phone, String pwd) {
		// TODO 自动生成的方法存根
		return 0;
	}


	@Override
	public String getUsername(String phone) {
		// TODO 自动生成的方法存根
		return null;
	}

}
