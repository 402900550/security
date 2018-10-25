package qhliao.security.validate;

/**
 * @ClassName ValidateType
 * @Author qhliao
 * @Date 2018/10/25 9:43
 * @Version 1.0
 */
public enum ValidateType {
    IMAGE_CODE {
        @Override
        public String getType() {
            return "imageCode";
        }
    },
    SMS_CODE {
        @Override
        public String getType() {
            return "smsCode";
        }
    };

    public abstract String getType();
}

