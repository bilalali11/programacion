import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {

        Institut ins = new Institut();
        ins.assignarnom("Guineueta");
        String dades = ins.imprimirInformacio();
        System.out.println(dades);


        Persona p1 = new Persona();
        p1.CanviarNom("Bilal");
        p1.assignarDni("24242424T");
        dades = p1.obtenirDades();
        System.out.println(dades);

        Estudiant e1 = new Estudiant();
        e1.CanviarNom("Bilal");
        e1.assignarDni("24242424T");
        e1.CanviarNota(2);
        dades = e1.obtenirDades();
        System.out.println(dades);

        Professor pr1 = new Professor();
        pr1.CanviarNom("German");
        pr1.assignarDni("24242424T");
        pr1.canviarSou(2000);
        dades = pr1.obtenirDades();
        System.out.println(dades);

        ProfessorSubstitut ps1 = new ProfessorSubstitut();
        ps1.CanviarNom("Marc");
        ps1.assignarDni("24242424T");
        Date dataInici = new Date(2021,03,3);
        Date datafi = new Date(2021,03,3);
        ps1.assignarSubstitucio(dataInici,datafi);
        dades = ps1.obtenirDades();
        System.out.println(dades);





}
}
