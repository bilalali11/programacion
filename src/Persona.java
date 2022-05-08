public class Persona {
    private String dni;
    private String nom;
    public void CanviarNom(String nom) throws Exception{
        if (this.nom == null) {
            this.nom = nom;
        } else {
            System.out.println("error");
        }
    }
    public void assignarDni(String dni) throws Exception{
        if (this.dni == null) {
            this.dni = dni;
        } else {
            throw new Exception("Error dni");
        }

    }
    public String obtenirDades() throws Exception {
        if (this.nom == null || this.dni == null) {
            throw new Exception("Error");
        } else {
            return "Persona que es diu " + this.nom + " " + this.dni;
        }
    }
}
