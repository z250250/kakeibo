package jp.co.z250.kakeibo.model.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import jp.co.z250.kakeibo.model.domain.MstUser;

@Mapper
public interface MstUserMapper {
	
	@Insert("INSERT INTO mst_user(user_name, password, mail_address)"+
			"VALUES(#{userName},#{password},#{mailAddress})")
	@Options(useGeneratedKeys=true,keyProperty="id")
	int insert(MstUser user);

}
