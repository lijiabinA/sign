package com.guoguo.sign.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.util.Date;

/**
 * @Author 李嘉宾
 * @Date 2018年08月15日
 * @Desc 报名提交的个人信息表单
 */
@Entity
public class SignUpSubmitForm {
    @Id
    //表单ID
    private String signUpFormId;
    //表单元数据(JSON格式)
    @Lob
    @Column(columnDefinition = "TEXT")
    private String signUpFormMetaData;
    //添加时间
    private Date addTime;

    public String getSignUpFormId() {
        return signUpFormId;
    }

    public void setSignUpFormId(String signUpFormId) {
        this.signUpFormId = signUpFormId;
    }

    public String getSignUpFormMetaData() {
        return signUpFormMetaData;
    }

    public void setSignUpFormMetaData(String signUpFormMetaData) {
        this.signUpFormMetaData = signUpFormMetaData;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
