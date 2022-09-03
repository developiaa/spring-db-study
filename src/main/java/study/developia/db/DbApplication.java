package study.developia.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import study.developia.db.config.JdbcTemplateV1Config;
import study.developia.db.config.JdbcTemplateV2Config;
import study.developia.db.config.MemoryConfig;
import study.developia.db.repository.ItemRepository;

//@Import(MemoryConfig.class)
//@Import(JdbcTemplateV1Config.class)
@Import(JdbcTemplateV2Config.class)
@SpringBootApplication(scanBasePackages = "study.developia.db.web")
public class DbApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbApplication.class, args);
    }

    @Bean
    @Profile("local")
    public TestDataInit testDataInit(ItemRepository itemRepository) {
        return new TestDataInit(itemRepository);
    }

}
