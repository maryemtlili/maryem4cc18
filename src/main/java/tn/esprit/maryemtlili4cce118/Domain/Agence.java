package tn.esprit.maryemtlili4cce118.Domain;

import jakarta.persistence.*;
import java.util.List;
import lombok.*;
import jakarta.persistence.OneToMany;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAgence;

    private String nom;
    private String ville;
    private String adresse;
    private String telephone;
    @OneToMany(mappedBy = "agence")

    List <Vehicule> Vehicules;
    @OneToMany(mappedBy = "agence")
    List <Employe> employes;
}