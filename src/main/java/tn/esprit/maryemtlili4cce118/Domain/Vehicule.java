package tn.esprit.maryemtlili4cce118.Domain;
import jakarta.persistence.*;
import lombok.*;
import java.util.Set;
import java.util.List;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Vehicule {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long idVehicule;
    private String immatriculation;
    private String marque;
    private String modele;
    private double tarifJournalier;
    @Enumerated(EnumType.STRING)
    private CategorieVehicule categorie;
    @Enumerated(EnumType.STRING)
    private StatutVehicule statut;
    @ManyToOne
    Agence agence;
    @ManyToMany
    Set<Equipement>equipements;
    @OneToMany(mappedBy = "vehicule")
    List<Reservation> reservations;


}
