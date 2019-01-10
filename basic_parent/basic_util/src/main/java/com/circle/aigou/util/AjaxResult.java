package com.circle.aigou.util;

public class AjaxResult {
    private boolean success=true;
    private String message = "操作成功！";

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AjaxResult() {
    }
    //    成功
    public static AjaxResult me(){
        return new AjaxResult();
    }

    public AjaxResult(String message) {
        this.message = message;
    }

    public AjaxResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}
