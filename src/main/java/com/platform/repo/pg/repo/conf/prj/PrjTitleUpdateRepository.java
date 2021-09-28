package com.platform.repo.pg.repo.conf.prj;

import com.platform.repo.pg.model.base.BasePlpgsqlModel;
import com.platform.repo.pg.repo.base.CommonCustomRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PrjTitleUpdateRepository extends CommonCustomRepository<BasePlpgsqlModel, Integer> {

	@Query(value= "select * from aimb.f_mb_prj_title_update(" +
		":in_projectid, " + 
		":in_titleid, " + 
		":in_titlename, " + 
		":in_titlelogo" +
	")", nativeQuery = true)
	BasePlpgsqlModel fMbPrjTitleUpdate(
            @Param("in_projectid") String in_projectid,
            @Param("in_titleid") String in_titleid,
            @Param("in_titlename") String in_titlename,
            @Param("in_titlelogo") String in_titlelogo
    );

}