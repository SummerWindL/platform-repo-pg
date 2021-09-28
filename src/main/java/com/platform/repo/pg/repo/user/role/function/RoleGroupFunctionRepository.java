package com.platform.repo.pg.repo.user.role.function;

import com.platform.repo.pg.model.base.BasePlpgsqlModel;
import com.platform.repo.pg.repo.base.CommonCustomRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *  角色组功能关联表
 * @author: fyw
 * @date: 2018/8/1
 * @description:
 */
public interface RoleGroupFunctionRepository extends CommonCustomRepository<BasePlpgsqlModel, Integer> {

    /**
     * 查询角色组功能关联
     * @param in_userid
     * @return
     */
    @Query(value= "select * from aimb.f_mb_role_group_function_query(?1)", nativeQuery = true)
    BasePlpgsqlModel queryDxRoleGroupFunction(String in_userid);

    /**
     * 保存角色组功能关联
     * @param in_rolegrpid
     * @param in_functionidlistjosn
     * @return
     */
    @Query(value= "select * from aimb.f_mb_role_group_function_save(?1, ?2)", nativeQuery = true)
    BasePlpgsqlModel saveDxRoleGroupFunction(String in_rolegrpid, String in_functionidlistjosn);

    /**
     * 删除角色组功能关联
     * @param in_rolegrpid
     * @return
     */
    @Query(value= "select * from aimb.f_mb_role_group_function_delete(?1)", nativeQuery = true)
    BasePlpgsqlModel deleteDxRoleGroupFunction(String in_rolegrpid);
}
