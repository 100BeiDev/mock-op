package com.bb.mo.server.domain.po;

import java.util.Date;

public class App {
    private Integer appId;

    private String groupName;

    private String appName;

    private String reqUri;

    private String reqInput;

    private String reqOutput;

    private Boolean validFlag;

    private String method;

    private Boolean mockFlag;

    private String description;

    private String protocol;

    private Date createTime;

    private Date updateTime;

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    public String getReqUri() {
        return reqUri;
    }

    public void setReqUri(String reqUri) {
        this.reqUri = reqUri == null ? null : reqUri.trim();
    }

    public String getReqInput() {
        return reqInput;
    }

    public void setReqInput(String reqInput) {
        this.reqInput = reqInput == null ? null : reqInput.trim();
    }

    public String getReqOutput() {
        return reqOutput;
    }

    public void setReqOutput(String reqOutput) {
        this.reqOutput = reqOutput == null ? null : reqOutput.trim();
    }

    public Boolean getValidFlag() {
        return validFlag;
    }

    public void setValidFlag(Boolean validFlag) {
        this.validFlag = validFlag;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public Boolean getMockFlag() {
        return mockFlag;
    }

    public void setMockFlag(Boolean mockFlag) {
        this.mockFlag = mockFlag;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol == null ? null : protocol.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}