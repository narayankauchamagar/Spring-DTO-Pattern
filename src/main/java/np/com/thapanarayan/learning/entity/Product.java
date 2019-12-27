package np.com.thapanarayan.learning.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(name ="product")
public class Product extends AbstractEntity{
    private String name;
    private BigDecimal price;
    private String company;
    private LocalDate dof;

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public LocalDate getDof() {
        return dof;
    }

    public void setDof(LocalDate dof) {
        this.dof = dof;
    }
}
