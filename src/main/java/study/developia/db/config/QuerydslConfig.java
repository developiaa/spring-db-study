package study.developia.db.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.developia.db.repository.ItemRepository;
import study.developia.db.repository.jpa.JpaItemRepositoryV3;
import study.developia.db.service.ItemService;
import study.developia.db.service.ItemServiceV1;

import javax.persistence.EntityManager;

@Configuration
@RequiredArgsConstructor
public class QuerydslConfig {

    private final EntityManager em;

    @Bean
    public ItemService itemService() {
        return new ItemServiceV1(itemRepository());
    }

    @Bean
    public ItemRepository itemRepository() {
        return new JpaItemRepositoryV3(em);
    }
}
