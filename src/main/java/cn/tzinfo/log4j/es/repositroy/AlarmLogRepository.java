package cn.tzinfo.log4j.es.repositroy;

import cn.tzinfo.log4j.es.entity.AlarmLog;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

/**
 * @Author:shenk
 * @Date: 2020/3/24
 * @Description:
 */
public interface AlarmLogRepository extends ElasticsearchCrudRepository<AlarmLog, String> {
}
