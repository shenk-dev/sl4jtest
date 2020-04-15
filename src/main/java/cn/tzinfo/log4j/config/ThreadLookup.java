package cn.tzinfo.log4j.config;

import org.apache.logging.log4j.ThreadContext;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.lookup.StrLookup;

//@Plugin(name = "thread", category = StrLookup.CATEGORY)
public class ThreadLookup implements StrLookup {

    @Override
    public String lookup(String key) {
        return ThreadContext.get("deviceCode");
    }

    @Override
    public String lookup(LogEvent event, String key) {
        Thread t = Thread.currentThread();
        return ThreadContext.get("deviceCode") != null ? ThreadContext.get("deviceCode")
                : event.getThreadName();
    }

}