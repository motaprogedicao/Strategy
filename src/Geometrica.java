public class Geometrica implements ICalcMedia {

    @Override
    public double CalculaMedia(double P1, double P2) {
        return Media ;
    }

    @Override
    public String Situacao(double Media) {
        if(Media > 5){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }

}


