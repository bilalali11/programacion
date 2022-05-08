public class Professor extends Persona {
  private double sou;
  public void canviarSou(double Sou) throws Exception {
    if (Sou >= 3000) {
      throw new Exception("Error sou");
    } else {
      this.sou = Sou;
    }

  }

    public String obtenirDades() throws Exception {
      return super.obtenirDades()+ " Professor tal sou" + " " + this.sou;
    }


}
