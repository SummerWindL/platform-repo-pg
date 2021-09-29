package com.platform.repo.pg.repo.user.menu;

import com.platform.repo.pg.model.base.BasePlpgsqlModel;
import com.platform.repo.pg.repo.base.CommonCustomRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * 功能字典表
 * @author: Advance
 * @date: 2018/8/2
 * @description:
 */
public interface FunctionMenuRepository extends CommonCustomRepository<BasePlpgsqlModel, Integer> {

    /**
     * 查询功能树
     * @param in_lang
     * @return
     */
    @Query(value= "select * from f_tree_menu_query(?1)", nativeQuery = true)
    BasePlpgsqlModel queryTreeMenu(String in_lang);

    /**
     * 查询功能菜单(不分页)
     * @param in_functionid
     * @param in_lang
     * @param in_functionname
     * @param in_parentfunctionid
     * @return
     */
    @Query(value= "select * from aix.f_mb_function_menu_query_nopage(?1, ?2, ?3, ?4)", nativeQuery = true)
    BasePlpgsqlModel queryFunctionMenuNopage(String in_functionid,
                                             String in_lang,
                                             String in_functionname,
                                             String in_parentfunctionid);

    /**
     * 查询功能菜单
     * @param in_functionid
     * @param in_lang
     * @param in_functionname
     * @param in_parentfunctionid
     * @param in_countflag
     * @param in_offset
     * @param in_pagesize
     * @return
     */
    @Query(value= "select * from aix.f_mb_function_menu_query(?1, ?2, ?3, ?4, ?5, ?6, ?7)", nativeQuery = true)
    BasePlpgsqlModel queryFunctionMenu(String in_functionid,
                                       String in_lang,
                                       String in_functionname,
                                       String in_parentfunctionid,
                                       Integer in_countflag,
                                       Integer in_offset,
                                       Integer in_pagesize);

    /**
     * 添加功能菜单
     * @return
     */
    @Query(value= "select * from aix.f_mb_function_menu_insert(?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9)", nativeQuery = true)
    BasePlpgsqlModel inserttFunctionMenu(String in_functionid,
                                         String in_lang,
                                         String in_functionname,
                                         String in_parentfunctionid,
                                         Integer in_sortid,
                                         String in_functionpage,
                                         String in_functionicon,
                                         Integer in_visibletype,
                                         String in_memo);

    /**
     * 修改功能菜单
     * @return
     */
    @Query(value= "select * from aix.f_mb_function_menu_update(?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9)", nativeQuery = true)
    BasePlpgsqlModel updateFunctionMenu(String in_functionid,
                                        String in_lang,
                                        String in_functionname,
                                        String in_parentfunctionid,
                                        Integer in_sortid,
                                        String in_functionpage,
                                        String in_functionicon,
                                        Integer in_visibletype,
                                        String in_memo);

    /**
     * 删除功能菜单
     * @return
     */
    @Query(value= "select * from aix.f_mb_function_menu_delete(?1, ?2)", nativeQuery = true)
    BasePlpgsqlModel deleteFunctionMenu(String in_functionid,
                                        String in_lang);

}
