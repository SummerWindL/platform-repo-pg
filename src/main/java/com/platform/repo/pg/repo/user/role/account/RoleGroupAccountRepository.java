package com.platform.repo.pg.repo.user.role.account;

import com.platform.repo.pg.model.base.BasePlpgsqlModel;
import com.platform.repo.pg.repo.base.CommonCustomRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * 角色帐号关联表
 * @author: Advance
 * @date: 2018/8/1
 * @description:
 */
public interface RoleGroupAccountRepository extends CommonCustomRepository<BasePlpgsqlModel, Integer> {

    /**
     * 查询角色帐号关联
     * @param in_userid
     * @param in_rolegrpid
     * @return
     */
    @Query(value= "select * from aix.f_mb_role_group_account_query(?1, ?2)", nativeQuery = true)
    BasePlpgsqlModel queryDxRoleGroupAccount(String in_userid, String in_rolegrpid);

    /**
     * 保存角色帐号关联
     * @param in_userid
     * @param in_rolegrpidarrayjson
     * @return
     */
    @Query(value= "select * from aix.f_mb_role_group_account_save(?1, ?2)", nativeQuery = true)
    BasePlpgsqlModel saveDxRoleGroupAccount(String in_userid, String in_rolegrpidarrayjson);

    /**
     * 删除角色帐号关联
     * @param in_userid
     * @param in_rolegrpid
     * @return
     */
    @Query(value= "select * from aix.f_mb_role_group_account_delete(?1, ?2)", nativeQuery = true)
    BasePlpgsqlModel deleteDxRoleGroupAccount(String in_userid, String in_rolegrpid);
}
