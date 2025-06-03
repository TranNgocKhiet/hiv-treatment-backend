package backend.regimen.model;

import backend.healthrecord.model.HealthRecord;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Regimen")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Regimen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String regimenName;
    private String components;
    private String description;
    private String indications;
    private String contradications;
    private String note;

    @OneToOne
    @JoinColumn(name = "healthRecordId", referencedColumnName = "id")
    private HealthRecord healthRecord;
}
