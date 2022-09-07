package study.developia.db.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.developia.db.repository.ItemRepository;
import study.developia.db.repository.mybatis.ItemMapper;
import study.developia.db.repository.mybatis.MyBatisItemRepository;
import study.developia.db.service.ItemService;
import study.developia.db.service.ItemServiceV1;

@Configuration
@RequiredArgsConstructor
public class MyBatisConfig {

    private final ItemMapper itemMapper;

    @Bean
    public ItemService itemService() {
        return new ItemServiceV1(itemRepository());
    }

    @Bean
    public ItemRepository itemRepository() {
        return new MyBatisItemRepository(itemMapper);
    }
}
