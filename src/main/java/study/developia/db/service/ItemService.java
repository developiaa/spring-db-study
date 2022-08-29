package study.developia.db.service;

import study.developia.db.domain.Item;
import study.developia.db.repository.ItemSearchCond;
import study.developia.db.repository.ItemUpdateDto;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    Item save(Item item);

    void update(Long itemId, ItemUpdateDto updateParam);

    Optional<Item> findById(Long id);

    List<Item> findItems(ItemSearchCond itemSearch);
}
