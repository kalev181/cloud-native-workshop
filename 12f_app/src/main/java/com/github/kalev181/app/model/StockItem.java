package com.github.kalev181.app.model;




import javax.persistence.Id;

import javax.persistence.*;

/**
 *
 */
@Entity
@Table(name = "stock_item")
public class StockItem {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Enumerated(EnumType.STRING)
    private com.github.kalev181.app.model.ItemType type;

    @Column(name = "title", nullable = false, length = 45)
    private String title;

    @Column(name = "description", length = 1000)
    private String description;

    public StockItem() {
    }

    public StockItem(Long id, com.github.kalev181.app.model.ItemType type, String title, String description) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public com.github.kalev181.app.model.ItemType getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }


}
