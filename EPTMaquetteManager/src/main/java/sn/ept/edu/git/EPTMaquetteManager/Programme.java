package sn.ept.edu.git.EPTMaquetteManager;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Programme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String description;

    @OneToMany(mappedBy = "programme")
    private Set<Semestre> semestres;

    // Getters and Setters
}

