package com.platform.repo.pg.model.mq;


import com.platform.repo.pg.model.base.BaseEntity;

/**
 * @author Advance
 * @date 2022年07月17日 11:37
 * @since V1.0.0
 */
public class SysMqQueue extends BaseEntity {
    /**
     * 队列名称
     */
    private String queuename;

    /**
     * 是否持久化(是：01 否：02)
     */
    private String isdurable;

    /**
     * 是否自动删除(是：01 否：02)
     */
    private String isautodelete;

    /**
     * 是否独占(是：01 否：02)
     */
    private String isexclusive;

    /**
     * 备注
     */
    private String remark;

    public String getQueuename() {
        return queuename;
    }

    public void setQueuename(String queuename) {
        this.queuename = queuename;
    }

    public String getIsdurable() {
        return isdurable;
    }

    public void setIsdurable(String isdurable) {
        this.isdurable = isdurable;
    }

    public String getIsautodelete() {
        return isautodelete;
    }

    public void setIsautodelete(String isautodelete) {
        this.isautodelete = isautodelete;
    }

    public String getIsexclusive() {
        return isexclusive;
    }

    public void setIsexclusive(String isexclusive) {
        this.isexclusive = isexclusive;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
