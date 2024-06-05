package sn.ept.edu.git.EPTMaquetteManager;

import jakarta.persistence.*;

@Entity
public class ElementConstitutif {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String code;
    private String typeCours;
    private int chargeHoraire;
    private int credits;

    @ManyToOne
    @JoinColumn(name = "ue_id")
    private UE ue;

    // Getters and Setters
}
