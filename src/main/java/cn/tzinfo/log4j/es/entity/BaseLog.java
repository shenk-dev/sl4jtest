package cn.tzinfo.log4j.es.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

/**
 * @Author:shenk
 * @Date: 2020/3/24
 * @Description:
 */
public class BaseLog {

    @Id
    private String id;

    @Field(type = FieldType.Text)
    private String clientCode;

    @Field(type = FieldType.Text)
    private String deviceCode;

    @Field(type = FieldType.Text)
    private String message;

    @Field(type = FieldType.Date)
    private Date date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
