package com.github.kalev181.app;


import com.github.kalev181.app.model.ItemType;
import com.github.kalev181.app.model.StockItem;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StockItemRepository extends CrudRepository<StockItem, Long> {
    List<StockItem> findByType(ItemType type);
}


