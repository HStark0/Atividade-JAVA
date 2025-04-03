// Exercício 1: Sistema de Gerenciamento de Veículos
// Henderson Lima

abstract class Veiculo {
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private String cambio;
    private float km;
    private float preco;

    // -------------------------------------------------------

    public Veiculo(String marca, String modelo, String cor, int ano, String cambio, float km, float preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.cambio = cambio;
        this.km = km;
        this.preco = preco;
    }

    // -------------------------------------------------------

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    // -------------------------------------------------------

    public abstract void exibirDetalhes();
}

// ----------------------------------------------------------------

interface Desconto {
    void aplicarDesconto(double porcentagem);
}

// ----------------------------------------------------------------

class Carro extends Veiculo implements Desconto {
    private int numeroPortas;

    public Carro(String marca, String modelo, String cor, int ano, String cambio, float km, float preco, int numeroPortas) {
        super(marca, modelo, cor, ano, cambio, km, preco);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    // -------------------------------------------------------

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do carro: \n");
        System.out.println("- Carro: " + getMarca());
        System.out.println("- Modelo: " + getModelo());
        System.out.println("- Cor: " + getCor());
        System.out.println("- Ano: " + getAno());
        System.out.println("- Câmbio: " + getCambio());
        System.out.println("- Quilometros: " + getKm());
        System.out.println("- Qtd. Portas: " + getNumeroPortas());
        System.out.println("- Preço: " + getPreco());
    }

    @Override
    public void aplicarDesconto(double porcentagem) {
        float desconto = getPreco() * (float)(porcentagem / 100);
        setPreco(getPreco() - desconto);
    }
}

// ----------------------------------------------------------------

class Moto extends Veiculo implements  Desconto {
    private int cilindradas;

    public Moto(String marca, String modelo, String cor, int ano, String cambio, float km, float preco, int cilindradas) {
        super(marca, modelo, cor, ano, cambio, km, preco);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    // -------------------------------------------------------

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes da moto: \n");
        System.out.println("- Carro: " + getMarca());
        System.out.println("- Modelo: " + getModelo());
        System.out.println("- Cor: " + getCor());
        System.out.println("- Ano: " + getAno());
        System.out.println("- Câmbio: " + getCambio());
        System.out.println("- Quilometros: " + getKm());
        System.out.println("- Cilindradas: " + getCilindradas());
        System.out.println("- Preço: " + getPreco());
    }

    @Override
    public void aplicarDesconto(double porcentagem) {
        float desconto = getPreco() * (float)(porcentagem / 100);
        setPreco(getPreco() - desconto);
    }
}

// ----------------------------------------------------------------

public class Gerenciarveiculos {
    public static void main(String[] args) {

        // Características:

        Carro carro = new Carro("Audi", "A7", "Prata", 2023, "Automatico", 18000, 260890, 4);

        Carro carro2 = new Carro("Chevrolet", "Onix", "Azul", 2024, "Automatico", 7000, 100800, 4);

        Moto moto = new Moto("Honda", "CG TITAN", "Azul", 2022, "Manual", 12000, 17800, 160);

        Moto moto2 = new Moto("Honda", "XRE SAHARA", "Marrom", 2024, "Manual", 11000,  32960, 300);

        // -------------------------------------------------------

        carro.aplicarDesconto(10);
        moto.aplicarDesconto(5);

        // -------------------------------------------------------

        System.out.println("Carros disponíveis: \n");
        carro.exibirDetalhes();
        System.out.println();
        System.out.println("\n- - - - - - - - - -\n");
        carro2.exibirDetalhes();
        System.out.println("\n- - - - - - - - - -\n");
        System.out.println("Motos disponíveis: \n");
        moto.exibirDetalhes();
        System.out.println("\n- - - - - - - - - -\n");
        moto2.exibirDetalhes();
        System.out.println("\n- - - - FIM - - - -\n");
    }
}








