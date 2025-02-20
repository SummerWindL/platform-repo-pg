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
public class SysMqSendLog extends BaseEntity {
    /**
     * ID
     */
    @Id
    @Column(nullable = false,name = "id")
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "com.platform.common.util.IDGenerator")
    private String id;

    /**
     * 发送时间
     */
    @Column(name = "send_time")
    private Date sendtime;

    /**
     * 消息体
     */
    @Column(name = "msg")
    private String msg;

    /**
     * 路由名称
     */
    @Column(name = "route_name")
    private String routename;

    /**
     * 发送状态
     */
    @Column(name = "send_status")
    private String sendstatus;

    /**
     * 发送端BEAN名称
     */
    @Column(name = "send_bean_name")
    private String sendbeanname;

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

    /**
     * 取得 ID
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置 ID
     * @param id ID
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getRoutename() {
        return routename;
    }

    public void setRoutename(String routename) {
        this.routename = routename;
    }

    public String getSendstatus() {
        return sendstatus;
    }

    public void setSendstatus(String sendstatus) {
        this.sendstatus = sendstatus;
    }

    public String getSendbeanname() {
        return sendbeanname;
    }

    public void setSendbeanname(String sendbeanname) {
        this.sendbeanname = sendbeanname;
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
