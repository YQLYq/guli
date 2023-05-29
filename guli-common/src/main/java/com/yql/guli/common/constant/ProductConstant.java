package com.yql.guli.common.constant;

/** product的公共常量
 * @author ASUS
 */
public interface ProductConstant {
    enum AttrEnum{
        /**ATTR_TYPE_BASE(是基本属性)*/
        ATTR_TYPE_BASE(1,"基本属性"),
        /**ATTR_TYPE_SALE(销售属性)*/
        ATTR_TYPE_SALE(0,"销售属性");

        private final int code;
        private final String msg;

        AttrEnum(int code, String msg) {
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

    enum StatusEnum {
        /**
         * NEW_SPU(0,"新建")
         **/
        NEW_SPU(0,"新建"),
        /**
         *  SPU_UP(1, "上架")
         */
        SPU_UP(1, "上架"),
        /**
         * SPU_DOWN(2, "下架")
         */
        SPU_DOWN(2, "下架");

        private final int code;
        private final String msg;

        StatusEnum(int code, String msg) {
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
