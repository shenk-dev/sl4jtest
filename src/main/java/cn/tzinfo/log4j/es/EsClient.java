package cn.tzinfo.log4j.es;

import cn.tzinfo.log4j.es.entity.AlarmLog;
import cn.tzinfo.log4j.util.JSONUtil;
import com.google.gson.Gson;
import org.apache.http.HttpHost;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;

import java.io.IOException;
import java.util.Map;

/**
 * @Author:shenk
 * @Date: 2020/4/13
 * @Description:
 */
public class EsClient {

    RestHighLevelClient client;

    EsClient(RestHighLevelClient client) {
        this.client = client;
    }

    public static void main(String[] args) throws IOException {

        AlarmLog log = new AlarmLog();
        log.setMessage("报警信息");
        log.setClientCode("FT-01");
        log.setDeviceCode("A0001");
        log.setAlarmId("10001");
        log.setAlarmCode("A01");
        String str = new Gson().toJson(log);
        Map<String, String> map = JSONUtil.fromJsonStr(str, Map.class);
        RestHighLevelClient client = new RestHighLevelClient(RestClient.builder(new HttpHost("localhost", 9200, "http")));

        IndexRequest indexRequest = new IndexRequest("log","alarmlog").source(str, XContentType.JSON);

        client.index(indexRequest, RequestOptions.DEFAULT);

        client.close();
    }
}
