package cn.tzinfo.log4j.appender;

import cn.tzinfo.log4j.SpringBeanUtil;
import cn.tzinfo.log4j.es.EsManager;
import cn.tzinfo.log4j.es.entity.AlarmLog;
import cn.tzinfo.log4j.es.repositroy.AlarmLogRepository;
import org.apache.logging.log4j.core.*;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginAttribute;
import org.apache.logging.log4j.core.config.plugins.PluginElement;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.apache.logging.log4j.core.filter.ThresholdFilter;
import org.apache.logging.log4j.core.impl.MutableLogEvent;
import org.apache.logging.log4j.core.layout.HtmlLayout;
import org.apache.logging.log4j.core.layout.PatternLayout;
import org.apache.logging.log4j.core.util.Booleans;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author:shenk
 * @Date: 2020/4/8
 * @Description:
 */
@Plugin(name = "ElasticSearch", category = Core.CATEGORY_NAME, elementType = Appender.ELEMENT_TYPE, printObject = true)
public class EsAppender extends AbstractAppender {

    private EsManager esManager;

    protected EsAppender(String name, Filter filter, Layout<? extends Serializable> layout, EsManager esManager) {
        super(name, filter, layout);
        this.esManager = esManager;
    }

    protected EsAppender(String name, Filter filter, Layout<? extends Serializable> layout, boolean ignoreExceptions, EsManager esManager) {
        super(name, filter, layout, ignoreExceptions);
        this.esManager = esManager;
    }

    @PluginFactory
    public static EsAppender createAppender(
            @PluginAttribute("name") @Required final String name,
            @PluginAttribute("ip") @Required final String ip,
            @PluginAttribute("port") @Required final String port,
            @PluginAttribute("cluster") @Required final String cluster,
            @PluginElement("Filter") Filter filter,
            @PluginElement("Layout") Layout<? extends Serializable> layout,
            @PluginAttribute("ignoreExceptions") final String ignore
    ) {
        if (name == null) {
            LOGGER.error("No name provided for EsAppender");
            return null;
        }
        if (layout == null) {
            //TODO
        }
//        if (filter == null) {
//            filter = ThresholdFilter.createFilter(null, null, null);
//        }
        final boolean ignoreExceptions = Booleans.parseBoolean(ignore, true);
        EsManager esManager = null;
        return new EsAppender(name, filter, layout, ignoreExceptions, esManager);
    }

    @Override
    public void append(LogEvent event) {
//        AlarmLog alarmLog = new AlarmLog();
//        alarmLog.setAlarmCode("10001");
//        alarmLog.setAlarmId("123");
//        alarmLog.setAlarmDesc("high temperature");
//        alarmLog.setDeviceCode("AO-1007");
//        alarmLog.setDate(new Date());
//        alarmLog.setMessage("message");
//        AlarmLogRepository alarmLogRepository = SpringBeanUtil.getBean(AlarmLogRepository.class);
//        System.out.println(alarmLogRepository);
//        alarmLogRepository.save(alarmLog);
        MutableLogEvent mutableLogEvent = (MutableLogEvent) event;
        System.out.println(mutableLogEvent.getFormattedMessage());
        System.out.println(mutableLogEvent.getMessage());
    }
}
