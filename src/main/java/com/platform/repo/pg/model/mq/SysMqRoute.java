package com.platform.repo.pg.model.mq;

/**
 * @author Advance
 * @date 2022年07月17日 11:37
 * @since V1.0.0
 */
public class SysMqRoute extends SysMqRouteKey {
    /**
     * 备注
     */
    private String remark;

    /**
     * 取得 备注
     * @return 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
