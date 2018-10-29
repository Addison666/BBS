package com.ibm.coding.util;

import com.ibm.coding.exceptions.RunTimeException;


public class EmptyUtil {

    public static void isNotNull(Object obj, String msg) {
        if(obj == null) {
            throw new RunTimeException(403,msg);
        }
    }
}
