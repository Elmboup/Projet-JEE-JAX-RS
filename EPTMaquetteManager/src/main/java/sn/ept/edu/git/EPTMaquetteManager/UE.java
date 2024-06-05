package sn.ept.edu.git.EPTMaquetteManager;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class UE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String code;
    private int credits;
    private int chargeHoraire;

    @ManyToOne
    @JoinColumn(name = "semestre_id")
    private Semestre semestre;

    @OneToMany(mappedBy = "ue")
    private Set<ElementConstitutif> elementsConstitutifs;

    // Getters and Setters
}
