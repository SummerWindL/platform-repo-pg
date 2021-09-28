package com.platform.repo.pg.repo;

import com.platform.repo.pg.model.base.BasePlpgsqlModel;
import com.platform.repo.pg.repo.base.CommonCustomRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AuthHospUserAccountListQueryRepository extends CommonCustomRepository<BasePlpgsqlModel, Integer> {

	@Query(value= "select * from aimb.f_mb_auth_hosp_user_account_list_query(" +
		":in_userid, " + 
		":in_hospcode, " + 
		":in_doctoruserid, " + 
		":in_deptcode, " + 
		":in_hospname, " + 
		":in_doctorname, " + 
		":in_deptname, " + 
		":in_countflag, " + 
		":in_offset, " + 
		":in_pagesize" +
	")", nativeQuery = true)
	BasePlpgsqlModel fMbAuthHospUserAccountListQuery(
            @Param("in_userid") String in_userid,
            @Param("in_hospcode") String in_hospcode,
            @Param("in_doctoruserid") String in_doctoruserid,
            @Param("in_deptcode") String in_deptcode,
            @Param("in_hospname") String in_hospname,
            @Param("in_doctorname") String in_doctorname,
            @Param("in_deptname") String in_deptname,
            @Param("in_countflag") Integer in_countflag,
            @Param("in_offset") Integer in_offset,
            @Param("in_pagesize") Integer in_pagesize
    );

}