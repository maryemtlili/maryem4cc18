package tn.esprit.maryemtlili4cce118.Domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMaintenance;

    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String description;
    @ManyToOne
    private Agence agence1;
    @ManyToOne
    Vehicule vehicule;
}