package br.com.calculaArea;

public class MainFigurasGeometricas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Retangulo objRetangulo = new Retangulo(5, 10); 
        Circulo objCirculo = new Circulo(7); 
        Triangulo objTriangulo = new Triangulo(6, 8); 
        
        
        System.out.println("Area do Retangulo: " + objRetangulo.calculaArea());
        System.out.println("Area do circulo: " + objCirculo.calculaArea());
        System.out.println("Area do triangulo: " + objTriangulo.calculaArea());
    }

	

}
