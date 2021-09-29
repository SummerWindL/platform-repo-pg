package com.platform.repo.pg.repo.conf.prj;

import com.platform.repo.pg.model.base.BasePlpgsqlModel;
import com.platform.repo.pg.repo.base.CommonCustomRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PrjTitleDeleteRepository extends CommonCustomRepository<BasePlpgsqlModel, Integer> {

	@Query(value= "select * from aix.f_mb_prj_title_delete(" +
		":in_projectid, " + 
		":in_titleid" +
	")", nativeQuery = true)
	BasePlpgsqlModel fMbPrjTitleDelete(
            @Param("in_projectid") String in_projectid,
            @Param("in_titleid") String in_titleid
    );

}