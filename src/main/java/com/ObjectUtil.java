package com;

import java.math.BigDecimal;

public class ObjectUtil {
    public static long obj2long(Object obj) {
        return obj2long(obj, 0l);
    }

    public static long obj2long(Object obj, long defaultVal) {

        if (obj == null) {
            return 0l;
        }

        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        } else {
            if (strIsEmpty(obj.toString())) {
                return defaultVal;
            }
            try {
                BigDecimal bd = new BigDecimal(obj.toString().trim());
                return bd.longValue();
            } catch (Exception e) {
//                LOG.warn("[{}]转换Long失败", obj);
                return defaultVal;
            }
        }

    }

    /**
     * 判断字符串是否为空<br>
     * null, "", "  "均返回true
     *
     */
    public static boolean strIsEmpty(String str) {
        if (str == null || str.trim().isEmpty()) {
            return true;
        }
        return false;
    }
}
