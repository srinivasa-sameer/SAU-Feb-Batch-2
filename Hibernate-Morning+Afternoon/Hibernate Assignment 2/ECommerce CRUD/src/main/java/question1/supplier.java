package question1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class supplier {
    @Id
    private int supplierId;
    private String supplierName;

    @ManyToMany
    private List<category> catm2m = new ArrayList<>();


    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }
    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    public String getSupplierName() {
        return supplierName;
    }

    public void setCatm2m(List<category> catm2m) {
        this.catm2m = catm2m;
    }
    public List<category> getCatm2m() {
        return catm2m;
    }

}

