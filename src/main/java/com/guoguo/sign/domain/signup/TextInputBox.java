package com.guoguo.sign.domain.signup;

/**
 * @Author 李嘉宾
 * @Date 2018年08月15日
 * @Desc 输入框
 */
public class TextInputBox extends BaseComponent {

    //提示信息 placeholder
    protected String placeHolder;
    //最少输入的个数
    protected Integer minInputSize;
    //最多输入的个数
    protected Integer maxInputSize;

    public String getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(String placeHolder) {
        this.placeHolder = placeHolder;
    }

    public Integer getMinInputSize() {
        return minInputSize;
    }

    public void setMinInputSize(Integer minInputSize) {
        this.minInputSize = minInputSize;
    }

    public Integer getMaxInputSize() {
        return maxInputSize;
    }

    public void setMaxInputSize(Integer maxInputSize) {
        this.maxInputSize = maxInputSize;
    }

}
