package tn.esprit.maryemtlili4cce118.Domain;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Equipement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEquipement;

    private String libelle;
    @ManyToMany(mappedBy = "equipements")
    Set <Vehicule> vehicule;


}