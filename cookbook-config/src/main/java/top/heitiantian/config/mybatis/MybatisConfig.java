package top.heitiantian.config.mybatis;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author liutianyang
 * @create 2019-01-2019/1/19
 */
@MapperScan(value = "top.heitiantian.config.model.dao")
@org.springframework.context.annotation.Configuration
public class MybatisConfig {

    /**
     * 配置mybatis
     * @return
     */
    @Bean
    public ConfigurationCustomizer configurationCustomizer(){
        return new ConfigurationCustomizer() {
            @Override
            public void customize(Configuration configuration) {
            }
        };
    }
}
