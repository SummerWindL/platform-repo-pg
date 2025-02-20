package com.platform.repo.pg.repo.sys.rabbitmq;

import com.platform.repo.pg.model.base.BasePlpgsqlModel;
import com.platform.repo.pg.repo.base.CommonCustomRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author Advance
 * @date 2022年07月18日 15:44
 * @since V1.0.0
 */

public interface SysRabbitMqRepository extends CommonCustomRepository<BasePlpgsqlModel,Integer> {

    @Query(value= "select * from aix.f_aix_sys_mq_queue_query(" +
            ":in_countflag, " +
            ":in_offset, " +
            ":in_pagesize" +
            ")", nativeQuery = true)
    BasePlpgsqlModel findAllSysMqQueues(@Param("in_countflag") Integer in_countflag,
                                        @Param("in_offset") Integer in_offset,
                                        @Param("in_pagesize") Integer in_pagesize);

    @Query(value= "select * from aix.f_aix_sys_mq_exchange_query(" +
            ":in_countflag, " +
            ":in_offset, " +
            ":in_pagesize" +
            ")", nativeQuery = true)
    BasePlpgsqlModel findAllSysMqExchange(@Param("in_countflag") Integer in_countflag,
                                             @Param("in_offset") Integer in_offset,
                                             @Param("in_pagesize") Integer in_pagesize);

    @Query(value= "select * from aix.f_aix_sys_mq_route_query(" +
            ":in_countflag, " +
            ":in_offset, " +
            ":in_pagesize" +
            ")", nativeQuery = true)
    BasePlpgsqlModel findAllSysMqRoute(@Param("in_countflag") Integer in_countflag,
                                       @Param("in_offset") Integer in_offset,
                                       @Param("in_pagesize") Integer in_pagesize);
}
