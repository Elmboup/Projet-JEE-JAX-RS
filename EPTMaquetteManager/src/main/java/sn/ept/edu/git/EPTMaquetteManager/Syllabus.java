package sn.ept.edu.git.EPTMaquetteManager;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Syllabus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomCours;
    private String codeCours;
    private String semestre;
    private String anneeAcademique;
    private String enseignant;
    private String description;
    private String objectifsGeneraux;
    private String objectifsSpecifiques;
    private String contenu;
    private String calendrier;
    private String methodesEnseignement;
    private String evaluation;
    private String ressources;

    // Getters and Setters
}
