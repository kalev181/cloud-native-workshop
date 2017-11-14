package com.github.Pets36.app;


import domain.model.ItemType;
import domain.model.StockItem;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StockItemRepository extends CrudRepository<StockItem, Long> {
    List<StockItem> findByType(ItemType type);
}


