package com.platform.repo.pg.repo.user.role.rolegroup;

import com.platform.repo.pg.model.base.BasePlpgsqlModel;
import com.platform.repo.pg.repo.base.CommonCustomRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoleGroupInsertRepository extends CommonCustomRepository<BasePlpgsqlModel, Integer> {

	@Query(value= "select * from aix.f_mb_role_group_insert(" +
		":in_rolegrpid, " + 
		":in_rolegrpname" +
		":in_rolegrpicon" +
	")", nativeQuery = true)
	BasePlpgsqlModel fMbRoleGroupInsert(
            @Param("in_rolegrpid") String in_rolegrpid,
            @Param("in_rolegrpname") String in_rolegrpname,
			@Param("in_rolegrpicon") String in_rolegrpicon
    );

}