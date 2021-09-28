package com.platform.repo.pg.repo.conf.prj;

import com.platform.repo.pg.model.base.BasePlpgsqlModel;
import com.platform.repo.pg.repo.base.CommonCustomRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * 项目标题
 * @author: Allen
 * @date: 2018/7/19
 * @description:
 */
public interface PrjTitleRepository extends CommonCustomRepository<BasePlpgsqlModel, Integer> {

    /**
     * 查询项目标题列表
     * @param in_prjectid
     * @return
     */
    @Query(value= "select * from aimb.f_mb_prj_title_query(?1, ?2, ?3, ?4)", nativeQuery = true)
    BasePlpgsqlModel queryPrjTitle(String in_prjectid, Integer in_countflag, Integer in_offset, Integer in_pagesize);

    /**
     * 添加项目标题
     * @param in_prjectid
     * @param in_titleid
     * @param in_titlename
     * @param in_titlelogo
     * @return
     */
    @Query(value= "select * from aimb.f_mb_prj_title_insert(?1, ?2, ?3, ?4)", nativeQuery = true)
    BasePlpgsqlModel insertPrjTitle(String in_prjectid, String in_titleid, String in_titlename, String in_titlelogo);

    /**
     * 修改项目标题
     * @param in_prjectid
     * @param in_titleid
     * @param in_titlename
     * @param in_titlelogo
     * @return
     */
    @Query(value= "select * from aimb.f_mb_prj_title_update(?1, ?2, ?3, ?4)", nativeQuery = true)
    BasePlpgsqlModel updatePrjTitle(String in_prjectid, String in_titleid, String in_titlename, String in_titlelogo);

    /**
     * 删除
     * @param in_prjectid
     * @param in_titleid
     * @return
     */
    @Query(value= "select * from aimb.f_mb_prj_title_delete(?1, ?2)", nativeQuery = true)
    BasePlpgsqlModel deletePrjTitle(String in_prjectid, String in_titleid);

}
