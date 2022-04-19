package io.lab.Filmy.dao.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class VideoCassette {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String title;
    private LocalDate productionYear;

    public Long getId() { return this.id; }
    public String getTitle() { return this.title; }
    public LocalDate getProductionYear() { return this.productionYear; }

    public void setId(Long id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setProductionYear(LocalDate productionYear) { this.productionYear = productionYear; }

    public VideoCassette() {}
    public VideoCassette(Long id, String title, LocalDate productionYear) {
        this.id = id;
        this.title = title;
        this.productionYear = productionYear;
    }
}
