package com.platform.repo.pg.repo.sys.para;

import com.platform.repo.pg.model.base.BasePlpgsqlModel;
import com.platform.repo.pg.repo.base.CommonCustomRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author Advance
 * @date 2022年05月29日 11:32
 * @since V1.0.0
 */
public interface SysParaRepository extends CommonCustomRepository<BasePlpgsqlModel,Integer> {

    @Query(value= "select * from aix.f_aix_sys_para_query(" +
            ":in_syscode, " +
            ":in_paracode, " +
            ":in_paravalue, " +
            ":in_countflag, " +
            ":in_offset, " +
            ":in_pagesize" +
            ")", nativeQuery = true)
    BasePlpgsqlModel queryAllSysPara(
            @Param("in_syscode") String in_syscode,
            @Param("in_paracode") String in_paracode,
            @Param("in_paravalue") String in_paravalue,
            @Param("in_countflag") Integer in_countflag,
            @Param("in_offset") Integer in_offset,
            @Param("in_pagesize") Integer in_pagesize
    );
}
