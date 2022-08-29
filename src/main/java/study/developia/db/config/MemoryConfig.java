package study.developia.db.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.developia.db.repository.ItemRepository;
import study.developia.db.repository.memory.MemoryItemRepository;
import study.developia.db.service.ItemService;
import study.developia.db.service.ItemServiceV1;

@Configuration
public class MemoryConfig {

    @Bean
    public ItemService itemService() {
        return new ItemServiceV1(itemRepository());
    }

    @Bean
    public ItemRepository itemRepository() {
        return new MemoryItemRepository();
    }

}
