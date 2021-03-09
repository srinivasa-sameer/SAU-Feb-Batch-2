package question2;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

@Entity
//@Table(name = "categories")
public class Categories {
    @Id
    @Column(name = "catid")
    private int categoryId;
    @Column(name = "catname", length = 10)
    private String categoryName;
    @ManyToMany(targetEntity = item.class, cascade = CascadeType.ALL)
    @JoinTable(name = "categories_items",
            joinColumns = @JoinColumn(referencedColumnName = "catid"),
            inverseJoinColumns = @JoinColumn(referencedColumnName = "itemid"))
    private Set<Item> items;
    
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    public int getCategoryId() {
        return categoryId;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }
    public Set<Item> getItems() {
        return items;
    }

    public void setCategoryName(String categoryname) {
        this.categoryName = categoryname;
    }
    public String getCategoryName() {
        return categoryName;
    }


}