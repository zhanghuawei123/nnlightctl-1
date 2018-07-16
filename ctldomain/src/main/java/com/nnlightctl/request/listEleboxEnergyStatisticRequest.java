package com.nnlightctl.request;

import java.util.Date;

public class listEleboxEnergyStatisticRequest extends BaseRequest{

    private Long eleboxId;

    private Date startDate;//  -- 开始时间

    private Date endDate;//  -- 结束时间

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

    public Long getEleboxId() {
        return eleboxId;
    }

    public void setEleboxId(Long eleboxId) {
        this.eleboxId = eleboxId;
    }
}
