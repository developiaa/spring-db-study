package study.developia.db.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.developia.db.repository.ItemRepository;
import study.developia.db.repository.jpa.JpaItemRepositoryV3;
import study.developia.db.repository.v2.ItemQueryRepositoryV2;
import study.developia.db.repository.v2.ItemRepositoryV2;
import study.developia.db.service.ItemServiceV2;

import javax.persistence.EntityManager;

@Configuration
@RequiredArgsConstructor
public class V2Config {

    private final EntityManager em;
    private final ItemRepositoryV2 itemRepositoryV2; // SpringDataJpa

    @Bean
    public ItemServiceV2 itemService() {
        return new ItemServiceV2(itemRepositoryV2, itemQueryRepositoryV2());
    }

    @Bean
    public ItemRepository itemRepository() {
        return new JpaItemRepositoryV3(em);
    }

    @Bean
    public ItemQueryRepositoryV2 itemQueryRepositoryV2() {
        return new ItemQueryRepositoryV2(em);
    }

}
