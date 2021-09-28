package com.platform.repo.pg.repo.user;

import com.platform.repo.pg.model.base.BasePlpgsqlModel;
import com.platform.repo.pg.repo.base.CommonCustomRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserAccountRoleQueryRepository extends CommonCustomRepository<BasePlpgsqlModel, Integer> {

	@Query(value= "select * from aimb.f_mb_user_account_role_query(" +
		":in_userid, " + 
		":in_roleid, " + 
		":in_rolename" +
	")", nativeQuery = true)
	BasePlpgsqlModel fMbUserAccountRoleQuery(
            @Param("in_userid") String in_userid,
            @Param("in_roleid") String in_roleid,
            @Param("in_rolename") String in_rolename
    );

}