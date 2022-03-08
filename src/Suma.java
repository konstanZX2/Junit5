public class Suma {
   int atributoTipoInt1;
    int atributoTipoInt2;

    public void setAtributoTipoInt1(int atributoTipoInt1) {
        this.atributoTipoInt1 = atributoTipoInt1;
    }

    public void setAtributoTipoInt2(int atributoTipoInt2) {
        this.atributoTipoInt2 = atributoTipoInt2;
    }



   public int sumar(){
        int resultado;
       resultado= this.atributoTipoInt1+this.atributoTipoInt2;
       return resultado;
   }
}
