package com.guoguo.sign.domain.signup;

import javax.persistence.Column;
import javax.persistence.Lob;

/**
 * @Author 李嘉宾
 * @Date 2018年08月15日
 * @Desc 基础组件类  其它组件的父类
 */
public class BaseComponent {
    //组件的标题
    protected String title;
    //组件的键
    protected String key;
    //组件的值
    @Lob
    @Column(columnDefinition = "TEXT")
    protected String value;
    //是否必填 参考ComponentConstant
    protected Integer required;

    public Integer getRequired() {
        return required;
    }

    public void setRequired(Integer required) {
        this.required = required;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
