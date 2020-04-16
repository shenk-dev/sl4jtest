package cn.tzinfo.log4j.util;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @Author:shenk
 * @Date: 2020/4/16
 * @Description:
 */
public class ExceptionUtil {

    public static String getStackInfo(Throwable t) {
        StringWriter stringWriter=new StringWriter();
        PrintWriter printWriter=new PrintWriter(stringWriter);

        try {
            t.printStackTrace(printWriter);
            return stringWriter.toString();
        }finally {
            printWriter.close();
        }
    }
}
