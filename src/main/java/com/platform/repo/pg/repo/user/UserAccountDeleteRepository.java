package com.platform.repo.pg.repo.user;

import com.platform.repo.pg.model.base.BasePlpgsqlModel;
import com.platform.repo.pg.repo.base.CommonCustomRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserAccountDeleteRepository extends CommonCustomRepository<BasePlpgsqlModel, Integer> {

	@Query(value= "select * from aimb.f_mb_user_account_delete(" +
		":in_acc, " + 
		":in_userid" +
	")", nativeQuery = true)
	BasePlpgsqlModel fMbUserAccountDelete(
            @Param("in_acc") String in_acc,
            @Param("in_userid") String in_userid
    );

}