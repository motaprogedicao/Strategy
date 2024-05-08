import javax.print.attribute.standard.Media;

public class Aritmetica implements ICalcMedia {

    @Override
    public double CalculaMedia(double P1, double P2) {
        double Media = P1 + P2 / 2;
        return Media;
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