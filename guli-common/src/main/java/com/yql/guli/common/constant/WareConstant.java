package com.yql.guli.common.constant;

public interface WareConstant {
    /**
     * 采购单
     * @author yql
     * @date 13:05 2023/5/13
     * @param 
     * @return 
     **/
    enum PurchaseEnum{
        CREATED(0,"新建"),
        ASSIGNED(1,"已分配"),
        RECEIVE(2,"已领取"),
        FINISH(3,"已完成"),
        HASERROR(4,"异常");

        private final int code;
        private final String msg;

        PurchaseEnum(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public int getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }
    }
    /**
     * 采购需求
     * @author yql
     * @date 13:06 2023/5/13
     * @param
     * @return
     **/
    enum PurchaseDetailEnum {
        CREATED(0, "新建"),
        ASSIGNED(1, "完成分配"),
        RECEIVE(2, "正在采购"),
        FINISH(3, "完成"),
        HASERROR(4, "异常");

        private final int code;
        private final String msg;

        PurchaseDetailEnum(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public int getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }
    }
}
