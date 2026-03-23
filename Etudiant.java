public class Etudiant {
    private String nom;
    private String prenom;
    private int numeroEtudiant;
    private double moyenne;

    public Etudiant(String nom, String prenom, int numeroEtudiant, double moyenne) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroEtudiant = numeroEtudiant;
        this.moyenne = moyenne;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getNumeroEtudiant() {
        return numeroEtudiant;
    }

    public double getMoyenne() {
        return moyenne;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numeroEtudiant=" + numeroEtudiant +
                ", moyenne=" + moyenne +
                '}';
    }
}
