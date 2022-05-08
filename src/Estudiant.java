public class Estudiant extends Persona {
    private double nota;


    void CanviarNota(double nota)throws Exception{
        if (nota > 10 || nota < 0) {
            throw new Exception("error sou");
        } else {
            this.nota = nota;
        }

    }
    public String obtenirDades() throws Exception {

        return super.obtenirDades() + " Estudiante tal nota " + this.nota;

   }
}

