package com.platform.repo.pg.repo.user;

import com.platform.repo.pg.model.base.BasePlpgsqlModel;
import com.platform.repo.pg.repo.base.CommonCustomRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserAccountQueryRepository extends CommonCustomRepository<BasePlpgsqlModel, Integer> {

	@Query(value= "select * from aix.f_mb_user_account_query(" +
		":in_acc, " + 
		":in_userid, " + 
		":in_hospcode, " + 
		":in_countflag, " + 
		":in_offset, " + 
		":in_pagesize" +
	")", nativeQuery = true)
	BasePlpgsqlModel fMbUserAccountQuery(
            @Param("in_acc") String in_acc,
            @Param("in_userid") String in_userid,
            @Param("in_hospcode") String in_hospcode,
            @Param("in_countflag") Integer in_countflag,
            @Param("in_offset") Integer in_offset,
            @Param("in_pagesize") Integer in_pagesize
    );

}