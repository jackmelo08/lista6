public class Carro extends veiculo{

    private String tipoDeCombustivel;

    public Carro(String placa, String modelo, String quilometragem, String tipoDeCombustivel) {
        super(placa, modelo, quilometragem);
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }
}
