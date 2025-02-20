package com.platform.repo.pg.model.mq;

import com.platform.repo.pg.model.base.BaseEntity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author Advance
 * @date 2022年07月17日 11:37
 * @since V1.0.0
 */
@Entity
public class SysMqReceiveLog extends BaseEntity {
    /**
     * ID
     */
    @Id
    @Column(nullable = false,name = "id")
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "com.platform.common.util.IDGenerator")
    private String id;

    /**
     * 消息ID
     */
    @Column(name = "msg_id")
    private String msgid;

    /**
     * 消费时间
     */
    @Column(name = "receive_time")
    private Date receivetime;

    /**
     * 消费端BEAN名称
     */
    @Column(name = "receive_bean_name")
    private String receivebeanname;

    /**
     * 消费状态
     */
    @Column(name = "receive_status")
    private String receivestatus;

    @Column(name = "create_user")
    private String createuser;

    @Column(name = "create_dept")
    private String createdept;

    @Column(name = "create_time")
    private Date createtime;

    @Column(name = "update_user")
    private String updateuser;

    @Column(name = "update_time")
    private Date updatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    public Date getReceivetime() {
        return receivetime;
    }

    public void setReceivetime(Date receivetime) {
        this.receivetime = receivetime;
    }

    public String getReceivebeanname() {
        return receivebeanname;
    }

    public void setReceivebeanname(String receivebeanname) {
        this.receivebeanname = receivebeanname;
    }

    public String getReceivestatus() {
        return receivestatus;
    }

    public void setReceivestatus(String receivestatus) {
        this.receivestatus = receivestatus;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    public String getCreatedept() {
        return createdept;
    }

    public void setCreatedept(String createdept) {
        this.createdept = createdept;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}