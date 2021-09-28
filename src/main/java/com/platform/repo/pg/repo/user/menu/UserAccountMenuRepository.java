package com.platform.repo.pg.repo.user.menu;

import com.platform.repo.pg.model.base.BasePlpgsqlModel;
import com.platform.repo.pg.repo.base.CommonCustomRepository;
import org.springframework.data.jpa.repository.Query;


/**
 * @date 2018/04/23
 */
public interface UserAccountMenuRepository extends CommonCustomRepository<BasePlpgsqlModel, Integer> {

    /**
     * 查询用户菜单
     * @param in_acc
     * @param in_visibletype
     * @return
     */
    @Query(value= "select * from aix.f_mb_user_account_menu_query(?1, ?2)", nativeQuery = true)
    BasePlpgsqlModel menuQuery(String in_acc, Integer in_visibletype);
}
