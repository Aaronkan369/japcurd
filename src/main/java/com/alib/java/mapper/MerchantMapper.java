package com.alib.java.mapper;

import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.SQLInsert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.alib.java.model.Merchant;

public interface MerchantMapper extends CrudRepository<Merchant, Long>,JpaRepository<Merchant, Long>{

	
	List<Merchant> findAll();

	void deleteById(Long id);
	
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class) 
	@Modifying
	@Query(value = "insert into 94brand(name,country,thvalue) values(?1,?2,?3)",nativeQuery = true)
	void toadd(String name,String country,Double thvalue);
	
	Merchant findById(long id);
	
	/**
	 * 1.更新info表下指定id的status字段， 这里使用了原生的sql语句。
	 * 2.@Transactional 注解用于提交事务，若没有带上这句，会报事务异常提示。
	 * 3.@Modifying(clearAutomatically = true) 自动清除实体里保存的数据。
	 */
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class) 
	@Modifying(clearAutomatically = true)
	@Query(value = "update 94brand p set p.name =?1,p.country =?2,p.thvalue =?3 where p.id = ?4",nativeQuery = true)
	void updateStatusById(String name,String country,Double thvalue,  long id);
}
