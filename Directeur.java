public class Directeur {
    private String nom;
    private String prenom;
    private String diplome;
    private int anneesExperience;

    public Directeur(String nom, String prenom, String diplome, int anneesExperience) {
        this.nom = nom;
        this.prenom = prenom;
        this.diplome = diplome;
        this.anneesExperience = anneesExperience;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDiplome() {
        return diplome;
    }

    public int getAnneesExperience() {
        return anneesExperience;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public void setAnneesExperience(int anneesExperience) {
        this.anneesExperience = anneesExperience;
    }

    @Override
    public String toString() {
        return "Directeur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", diplome='" + diplome + '\'' +
                ", anneesExperience=" + anneesExperience +
                '}';
    }
}
