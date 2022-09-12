package study.developia.db.repository.v2;

import org.springframework.data.jpa.repository.JpaRepository;
import study.developia.db.domain.Item;

public interface ItemRepositoryV2 extends JpaRepository<Item, Long> {
}
