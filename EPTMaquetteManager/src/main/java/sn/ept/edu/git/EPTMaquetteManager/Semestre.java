package sn.ept.edu.git.EPTMaquetteManager;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Semestre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;

    @ManyToOne
    @JoinColumn(name = "programme_id")
    private Programme programme;

    @OneToMany(mappedBy = "semestre")
    private Set<UE> ues;

    // Getters and Setters
}

