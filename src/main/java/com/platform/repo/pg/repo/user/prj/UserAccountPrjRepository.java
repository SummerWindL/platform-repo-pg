package com.platform.repo.pg.repo.user.prj;

import com.platform.repo.pg.model.base.BasePlpgsqlModel;
import com.platform.repo.pg.repo.base.CommonCustomRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * 用户项目关联
 * @author: Advance
 * @date: 2018/8/5
 * @description:
 */
public interface UserAccountPrjRepository extends CommonCustomRepository<BasePlpgsqlModel, Integer> {

    @Query(value= "select * from aix.f_mb_user_account_prj_query(?1)", nativeQuery = true)
    BasePlpgsqlModel queryUserAccountPrj(String in_userid);

    @Query(value= "select * from aix.f_mb_user_account_prj_save(?1, ?2, ?3)", nativeQuery = true)
    BasePlpgsqlModel saveUserAccountPrj(String in_userid, String in_projectid, String in_titleid);
}
