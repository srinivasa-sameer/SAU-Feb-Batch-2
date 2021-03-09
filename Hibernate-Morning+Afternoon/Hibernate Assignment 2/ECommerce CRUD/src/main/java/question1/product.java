package question1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class product {
    @Id
    private int productId;
    private String productName;

    @OneToMany (mappedBy = "productObj")
    private List<category> catlist = new ArrayList<>();


    public void setCatlist(List<category> catlist) {
        this.catlist = catlist;
    }
    public List<category> getCatlist() {
        return catlist;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
    public int getProductId() {
        return productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductName() {
        return productName;
    }


}
