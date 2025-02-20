package com.platform.repo.pg.model.mq;


import com.platform.repo.pg.model.base.BaseEntity;

/**
 * @author Advance
 * @date 2022年07月17日 11:37
 * @since V1.0.0
 */
public class SysMqExchange  extends BaseEntity {
    /**
     * 交换机名称
     */
    private String exchangename;

    /**
     * 是否持久化(是：01 否：02)
     */
    private String isdurable;

    /**
     * 交换机类型(01:Direct,02:Fanout,03:Topic,04:Headers)
     */
    private String exchangetype;

    /**
     * 备注
     */
    private String remark;

    public String getExchangename() {
        return exchangename;
    }

    public void setExchangename(String exchangename) {
        this.exchangename = exchangename;
    }

    public String getIsdurable() {
        return isdurable;
    }

    public void setIsdurable(String isdurable) {
        this.isdurable = isdurable;
    }

    public String getExchangetype() {
        return exchangetype;
    }

    public void setExchangetype(String exchangetype) {
        this.exchangetype = exchangetype;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}