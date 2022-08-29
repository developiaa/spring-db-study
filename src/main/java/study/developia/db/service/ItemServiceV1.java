package study.developia.db.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.developia.db.domain.Item;
import study.developia.db.repository.ItemRepository;
import study.developia.db.repository.ItemSearchCond;
import study.developia.db.repository.ItemUpdateDto;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemServiceV1 implements ItemService {

    private final ItemRepository itemRepository;

    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public void update(Long itemId, ItemUpdateDto updateParam) {
        itemRepository.update(itemId, updateParam);
    }

    @Override
    public Optional<Item> findById(Long id) {
        return itemRepository.findById(id);
    }

    @Override
    public List<Item> findItems(ItemSearchCond cond) {
        return itemRepository.findAll(cond);
    }
}
