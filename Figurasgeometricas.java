// Exercício 2: Sistema de Figuras Geométricas
// Christian Sangalli

import java.util.Scanner;
import java.lang.Math;

abstract class Figura {
    public abstract void ExibirDetalhes();
}

interface FiguraPlana {
    double calcularArea();
    double calcularPerimetro();
}

interface FiguraEspacial {
    double calcularVolume();
}

class Retangulo extends Figura implements FiguraPlana {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    @Override
    public void ExibirDetalhes() {
        System.out.println("\nRetângulo:");
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
        System.out.printf("Área: %.2f\n", calcularArea());
        System.out.printf("Perímetro: %.2f\n", calcularPerimetro());
    }
}

class Circulo extends Figura implements FiguraPlana {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public void ExibirDetalhes() {
        System.out.println("\nCirculo:");
        System.out.println("Raio: " + raio);
        System.out.printf("Área: %.2f\n", calcularArea());
        System.out.printf("Circunferência: %.2f\n", calcularPerimetro());
    }
}

class Triangulo extends Figura implements FiguraPlana {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    @Override
    public double calcularArea() {
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public void ExibirDetalhes() {
        System.out.println("\nTriângulo:");
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Lado 3: " + lado3);
        System.out.printf("Área: %.2f\n", calcularArea());
        System.out.printf("Perímetro: %.2f\n", calcularPerimetro());
    }
}

class Esfera extends Figura implements FiguraEspacial {
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double calcularAreaSuperficial() {
        return 4 * Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    @Override
    public void ExibirDetalhes() {
        System.out.println("\nEsfera:");
        System.out.println("Raio: " + raio);
        System.out.printf("Área superficial: %.2f\n", calcularAreaSuperficial());
        System.out.printf("Volume: %.2f\n", calcularVolume());
    }
}

class Cubo extends Figura implements FiguraEspacial {
    private double aresta;

    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    public double getAresta() {
        return aresta;
    }

    public double calcularAreaSuperficial() {
        return 6 * Math.pow(aresta, 2);
    }

    @Override
    public double calcularVolume() {
        return Math.pow(aresta, 3);
    }

    @Override
    public void ExibirDetalhes() {
        System.out.println("\nDetalhes do Cubo:");
        System.out.println("Aresta: " + aresta);
        System.out.printf("Área superficial: %.2f\n", calcularAreaSuperficial());
        System.out.printf("Volume: %.2f\n", calcularVolume());
    }
}

class Cone extends Figura implements FiguraEspacial {
    private double raio;
    private double altura;

    public Cone(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularGeratriz() {
        return Math.sqrt(Math.pow(raio, 2) + Math.pow(altura, 2));
    }

    public double calcularAreaSuperficial() {
        return Math.PI * raio * (raio + calcularGeratriz());
    }

    @Override
    public double calcularVolume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(raio, 2) * altura;
    }

    @Override
    public void ExibirDetalhes() {
        System.out.println("\nCone:");
        System.out.println("Raio: " + raio);
        System.out.println("Altura: " + altura);
        System.out.printf("Geratriz: %.2f\n", calcularGeratriz());
        System.out.printf("Área superficial: %.2f\n", calcularAreaSuperficial());
        System.out.printf("Volume: %.2f\n", calcularVolume());
    }
}

public class Figurasgeometricas {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5.0);
        Figura retangulo = new Retangulo(4.0, 6.0);
        Figura triangulo = new Triangulo(3.0, 4.0, 5.0);
        Figura esfera = new Esfera(3.0);
        Figura cubo = new Cubo(2.5);
        Figura cone = new Cone(3.0, 4.0);
        
        circulo.ExibirDetalhes();
        retangulo.ExibirDetalhes();
        triangulo.ExibirDetalhes();
        esfera.ExibirDetalhes();
        cubo.ExibirDetalhes();
        cone.ExibirDetalhes();
    }
}