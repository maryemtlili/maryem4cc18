package tn.esprit.maryemtlili4cce118.Domain;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDate;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idContrat;

    private LocalDate dateSignature;

    private double montantTotal;

    private boolean valide;
    @OneToMany(cascade = CascadeType.REMOVE,fetch = FetchType.LAZY)
    Set<Paiement>paiements;
    @OneToOne(mappedBy = "contrat")
    Reservation reservation;
}