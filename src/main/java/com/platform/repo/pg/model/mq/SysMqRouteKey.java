package com.platform.repo.pg.model.mq;


import com.platform.repo.pg.model.base.BaseEntity;

/**
 * @author Advance
 * @date 2022年07月17日 11:37
 * @since V1.0.0
 */
public class SysMqRouteKey extends BaseEntity {
    /**
     * 路由名称
     */
    private String routename;

    /**
     * 交换机名称
     */
    private String exchangename;

    /**
     * 队列名称
     */
    private String queuename;

    public String getRoutename() {
        return routename;
    }

    public void setRoutename(String routename) {
        this.routename = routename;
    }

    public String getExchangename() {
        return exchangename;
    }

    public void setExchangename(String exchangename) {
        this.exchangename = exchangename;
    }

    public String getQueuename() {
        return queuename;
    }

    public void setQueuename(String queuename) {
        this.queuename = queuename;
    }
}
