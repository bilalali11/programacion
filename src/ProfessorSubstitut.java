import java.util.Date;

public class ProfessorSubstitut extends Professor {
    private Date dataInici;

    private Date dataFi;
            public void assignarSubstitucio(Date dataInici,Date dataFi){
                this.dataInici=dataInici;
                this.dataFi=dataFi;
}
            public String obtenirDades() throws Exception {
                return super.obtenirDades()+ " ProfessorSubstitut assigna data " + this.dataInici+this.dataFi;
            }
}

