package cn.tzinfo.log4j.es;

import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.AbstractManager;

/**
 * @Author:shenk
 * @Date: 2020/4/8
 * @Description:
 */
public class EsManager extends AbstractManager {

    protected EsManager(LoggerContext loggerContext, String name) {
        super(loggerContext, name);
    }

    public void sendEvent(LogEvent event, Layout layout) {

    }
}
