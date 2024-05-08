public class Disciplina {
    private double P1, P2, media;
    private String situacao, nome;
    private ICalcMedia iCalcMedia;
    public Disciplina(ICalcMedia iCalcMedia) {
        this.iCalcMedia = iCalcMedia;
    }
    public void calcularMedia() {
        media = iCalcMedia.calculaMedia(P1, P2);
    }
    public void setNome(String nome) {
        this.nome = nome;
        System.out.println("Disciplina definida como: " + nome);
    }
    public void setP1(double p1) {
        this.P1() = P1;
        System.out.println("Nota da P1 definida como: " + p1);
    }
    public void setP2(double p2) {
        this.P2() = P2;
        System.out.println("Nota da P2 definida como: " + p2);
    }
    public double getP1() {
        return P1;
    }
    public double getP2() {
        return P2;
    }
    public double getMedia() {
        return media;
    }
    public String getSituacao() {
        situacao = iCalcMedia.situacao(media);
        return situacao;
    }
}
