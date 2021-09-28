package com.platform.repo.pg.repo.conf.prj;

import com.platform.repo.pg.model.base.BasePlpgsqlModel;
import com.platform.repo.pg.repo.base.CommonCustomRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PrjQueryRepository extends CommonCustomRepository<BasePlpgsqlModel, Integer> {

	@Query(value= "select * from aimb.f_mb_prj_query(" +
		":in_projectid, " + 
		":in_projectname, " + 
		":in_hospcode, " + 
		":in_countflag, " + 
		":in_offset, " + 
		":in_pagesize" +
	")", nativeQuery = true)
	BasePlpgsqlModel fMbPrjQuery(
            @Param("in_projectid") String in_projectid,
            @Param("in_projectname") String in_projectname,
            @Param("in_hospcode") String in_hospcode,
            @Param("in_countflag") Integer in_countflag,
            @Param("in_offset") Integer in_offset,
            @Param("in_pagesize") Integer in_pagesize
    );

}