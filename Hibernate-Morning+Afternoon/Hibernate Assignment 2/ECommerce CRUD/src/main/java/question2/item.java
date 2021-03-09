package question2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

    @Entity
    public class item {
        @Id
        @Column(name = "itemid")
        private int itemId;
        @Column(name = "itemname", length = 10)
        private String itemName;
        @ManyToMany(targetEntity = Categories.class, mappedBy = "items")
        private Set<Categories> categories;

        public void setCategories(Set<Categories> categories) {
            this.categories = categories;
        }
        public Set<Categories> getCategories() {
            return categories;
        }

        public void setItemId(int itemId) {
            this.itemId = itemId;
        }
        public int getItemId() {
            return itemId;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }
        public String getItemName() {
            return itemName;
        }
 }

