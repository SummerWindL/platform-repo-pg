package com.platform.repo.pg.repo.conf.prj;

import com.platform.repo.pg.model.base.BasePlpgsqlModel;
import com.platform.repo.pg.repo.base.CommonCustomRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PrjInsertRepository extends CommonCustomRepository<BasePlpgsqlModel, Integer> {

	@Query(value= "select * from aix.f_mb_prj_insert(" +
		":in_projectid, " + 
		":in_projectname, " + 
		":in_projectdesc, " + 
		":in_hospcode" +
	")", nativeQuery = true)
	BasePlpgsqlModel fMbPrjInsert(
            @Param("in_projectid") String in_projectid,
            @Param("in_projectname") String in_projectname,
            @Param("in_projectdesc") String in_projectdesc,
            @Param("in_hospcode") String in_hospcode
    );

}