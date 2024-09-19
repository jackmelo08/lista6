public class Caminhao extends veiculo{

    private int capacidadeDeCarga;

    public int
    getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(int capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public Caminhao(String placa, String modelo, String quilometragem, int capacidadeDeCarga) {
        super(placa, modelo, quilometragem);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }
}
