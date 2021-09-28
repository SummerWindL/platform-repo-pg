package com.platform.repo.pg.repo.conf.prj;

import com.platform.repo.pg.model.base.BasePlpgsqlModel;
import com.platform.repo.pg.repo.base.CommonCustomRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PrjDeleteRepository extends CommonCustomRepository<BasePlpgsqlModel, Integer> {

	@Query(value= "select * from aimb.f_mb_prj_delete(" +
		":in_projectid" +
	")", nativeQuery = true)
	BasePlpgsqlModel fMbPrjDelete(
            @Param("in_projectid") String in_projectid
    );

}