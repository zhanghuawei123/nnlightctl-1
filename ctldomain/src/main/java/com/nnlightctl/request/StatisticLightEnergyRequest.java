package com.nnlightctl.request;

import java.util.Date;

public class StatisticLightEnergyRequest extends BaseRequest{

    private String lightingCode;// -- 灯具唯一编码

    private Date startDate;//  -- 开始时间

    private Date endDate;//  -- 结束时间

    public String getLightingCode() {
        return lightingCode;
    }

    public void setLightingCode(String lightingCode) {
        this.lightingCode = lightingCode;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
