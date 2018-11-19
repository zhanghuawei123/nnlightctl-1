package com.nnlightctl.request;

import java.util.List;

public class CommandRequest {
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getLightPercent() {
        return lightPercent;
    }

    public void setLightPercent(int lightPercent) {
        this.lightPercent = lightPercent;
    }

    public Integer getTerminalSendMsgPeriod() {
        return terminalSendMsgPeriod;
    }

    public void setTerminalSendMsgPeriod(Integer terminalSendMsgPeriod) {
        this.terminalSendMsgPeriod = terminalSendMsgPeriod;
    }

    public Boolean getTerminalEleboxOn() {
        return terminalEleboxOn;
    }

    public void setTerminalEleboxOn(Boolean terminalEleboxOn) {
        this.terminalEleboxOn = terminalEleboxOn;
    }


    public List<Long> getEleboxIds() {
        return eleboxIds;
    }

    public void setEleboxIds(List<Long> eleboxIds) {
        this.eleboxIds = eleboxIds;
    }

    public List<Long> getLightIds() {
        return lightIds;
    }

    public void setLightIds(List<Long> lightIds) {
        this.lightIds = lightIds;
    }

    public Integer getAutoModel() {
        return autoModel;
    }

    public void setAutoModel(Integer autoModel) {
        this.autoModel = autoModel;
    }

    public List<String> getLightUUIDs() {
        return lightUUIDs;
    }

    public void setLightUUIDs(List<String> lightUUIDs) {
        this.lightUUIDs = lightUUIDs;
    }


    private List<String> lightUUIDs;

    private Integer autoModel;

    private List<Long> eleboxIds;

    private List<Long> lightIds;

    private Boolean terminalEleboxOn;

    private Integer terminalSendMsgPeriod;

    private int lightPercent;

    private String msg;
}
