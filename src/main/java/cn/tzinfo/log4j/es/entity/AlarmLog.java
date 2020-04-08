package cn.tzinfo.log4j.es.entity;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @Author:shenk
 * @Date: 2020/3/24
 * @Description:
 */
@Document(indexName = "log", type = "alarmlog")
public class AlarmLog extends BaseLog {

    @Field(type = FieldType.Keyword)
    private String alarmId;

    @Field(type = FieldType.Keyword)
    private String alarmCode;

    @Field(type = FieldType.Keyword)
    private String alarmDesc;

    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public String getAlarmCode() {
        return alarmCode;
    }

    public void setAlarmCode(String alarmCode) {
        this.alarmCode = alarmCode;
    }

    public String getAlarmDesc() {
        return alarmDesc;
    }

    public void setAlarmDesc(String alarmDesc) {
        this.alarmDesc = alarmDesc;
    }
}