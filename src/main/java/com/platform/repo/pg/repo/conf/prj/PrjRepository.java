package com.platform.repo.pg.repo.conf.prj;

import com.platform.repo.pg.model.base.BasePlpgsqlModel;
import com.platform.repo.pg.repo.base.CommonCustomRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * 项目
 * @author: Allen
 * @date: 2018/7/19
 * @description:
 */
public interface PrjRepository extends CommonCustomRepository<BasePlpgsqlModel, Integer> {

    /**
     * 根据参数查询项目列表
     * @param in_prjectid
     * @param in_prjectname
     * @return
     */
    @Query(value= "select * from aix.f_mb_prj_query(?1, ?2, ?3, ?4, ?5)", nativeQuery = true)
    BasePlpgsqlModel queryPrj(String in_prjectid, String in_prjectname, Integer in_countflag, Integer in_offset, Integer in_pagesize);

    /**
     * 添加项目
     * @param in_prjectid
     * @param in_prjectname
     * @param in_prjectdesc
     * @return
     */
    @Query(value= "select * from aix.f_mb_prj_insert(?1, ?2, ?3)", nativeQuery = true)
    BasePlpgsqlModel insertPrj(String in_prjectid, String in_prjectname, String in_prjectdesc);


    /**
     * 修改项目
     * @param in_prjectid
     * @param in_prjectname
     * @param in_prjectdesc
     * @return
     */
    @Query(value= "select * from aix.f_mb_prj_update(?1, ?2, ?3)", nativeQuery = true)
    BasePlpgsqlModel updatePrj(String in_prjectid, String in_prjectname, String in_prjectdesc);

    /**
     * 删除项目
     * @param in_prjectid
     * @return
     */
    @Query(value= "select * from aix.f_mb_prj_delete(?1)", nativeQuery = true)
    BasePlpgsqlModel deletePrj(String in_prjectid);

}
