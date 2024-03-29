package com.platform.repo.pg.repo.user.role;

import com.platform.repo.pg.model.base.BasePlpgsqlModel;
import com.platform.repo.pg.repo.base.CommonCustomRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * 角色组
 * @author: Advance
 * @date: 2018/7/28
 * @description:
 */
public interface RoleGroupRepository extends CommonCustomRepository<BasePlpgsqlModel, Integer> {

    /**
     * 查询角色
     * @param in_rolegrpid
     * @return
     */
    @Query(value= "select * from aix.f_mb_role_group_query(" +
            ":in_rolegrpid, " +
            ":in_countflag, " +
            ":in_offset, " +
            ":in_pagesize " +
            ")", nativeQuery = true)
    BasePlpgsqlModel queryDxRoleGroup(@Param("in_rolegrpid")String in_rolegrpid,
                                      @Param("in_countflag")Integer in_countflag,
                                      @Param("in_offset")Integer in_offset,
                                      @Param("in_pagesize")Integer in_pagesize);

    /**
     * 新增角色
     * @param in_rolegrpid
     * @param in_rolegrpname
     * @return
     */
    @Query(value= "select * from aix.f_mb_role_group_insert(?1, ?2)", nativeQuery = true)
    BasePlpgsqlModel insertDxRoleGroup(String in_rolegrpid, String in_rolegrpname);

    /**
     * 删除角色
     * @param in_rolegrpid
     * @return
     */
    @Query(value= "select * from aix.f_mb_role_group_delete(?1)", nativeQuery = true)
    BasePlpgsqlModel deleteDxRoleGroup(String in_rolegrpid);

    /**
     * 修改角色
     * @param in_rolegrpid
     * @param in_rolegrpname
     * @return
     */
    @Query(value= "select * from aix.f_mb_role_group_update(?1, ?2)", nativeQuery = true)
    BasePlpgsqlModel updateDxRoleGroup(String in_rolegrpid, String in_rolegrpname);
}
