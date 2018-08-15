package com.guoguo.sign.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.util.Date;

/**
 * @Author 李嘉宾
 * @Date 2018年08月15日
 * @Desc 报名信息的实体类
 */
@Entity
public class SignUpInfo {
    @Id
    //报名信息的ID 采用自动生成UUID的形式
    private String signUpId;
    //报名信息的标题
    private String signUpTitle;
    @Lob
    @Column(columnDefinition = "TEXT")
    //报名信息的描述
    private String signUpDesc;
    //报名信息的元数据(JSON格式)
    private String signUpMetaData;
    //报名开始时间
    private Date signUpStartTime;
    //报名结束时间
    private Date signUpEndTime;
    //报名信息的页眉图片路径
    private String signUpHeaderImg;
    //报名信息的页脚图片路径
    private String signUpFooterImg;
    //报名信息的二维码图片路径
    private String signUpQrCodeImg;
    //报名信息的背景图片路径
    private String signUpBgImg;
    //报名信息的宣传图片（主要用于手机端的宣传）
    private String signUpPropagandaImg;
    //记录添加时间
    private Date addTime;

    public String getSignUpMetaData() {
        return signUpMetaData;
    }

    public void setSignUpMetaData(String signUpMetaData) {
        this.signUpMetaData = signUpMetaData;
    }

    public String getSignUpTitle() {
        return signUpTitle;
    }

    public void setSignUpTitle(String signUpTitle) {
        this.signUpTitle = signUpTitle;
    }

    public String getSignUpHeaderImg() {
        return signUpHeaderImg;
    }

    public void setSignUpHeaderImg(String signUpHeaderImg) {
        this.signUpHeaderImg = signUpHeaderImg;
    }

    public String getSignUpFooterImg() {
        return signUpFooterImg;
    }

    public void setSignUpFooterImg(String signUpFooterImg) {
        this.signUpFooterImg = signUpFooterImg;
    }

    public String getSignUpQrCodeImg() {
        return signUpQrCodeImg;
    }

    public void setSignUpQrCodeImg(String signUpQrCodeImg) {
        this.signUpQrCodeImg = signUpQrCodeImg;
    }

    public String getSignUpBgImg() {
        return signUpBgImg;
    }

    public void setSignUpBgImg(String signUpBgImg) {
        this.signUpBgImg = signUpBgImg;
    }

    public String getSignUpPropagandaImg() {
        return signUpPropagandaImg;
    }

    public void setSignUpPropagandaImg(String signUpPropagandaImg) {
        this.signUpPropagandaImg = signUpPropagandaImg;
    }

    public String getSignUpId() {
        return signUpId;
    }

    public void setSignUpId(String signUpId) {
        this.signUpId = signUpId;
    }

    public String getSignUpDesc() {
        return signUpDesc;
    }

    public void setSignUpDesc(String signUpDesc) {
        this.signUpDesc = signUpDesc;
    }

    public Date getSignUpStartTime() {
        return signUpStartTime;
    }

    public void setSignUpStartTime(Date signUpStartTime) {
        this.signUpStartTime = signUpStartTime;
    }

    public Date getSignUpEndTime() {
        return signUpEndTime;
    }

    public void setSignUpEndTime(Date signUpEndTime) {
        this.signUpEndTime = signUpEndTime;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
