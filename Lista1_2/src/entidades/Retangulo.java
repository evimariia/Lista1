package entidades;

public class Retangulo {
	public float altura;
	public float largura;
	public float area;
	public float perimetro;
	public float diagonal;
	
	public Retangulo() {
		
	}

	public Retangulo(float altura, float largura) {
		this.altura = altura;
		this.largura = largura;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	public float getArea() {
		area = altura * largura;
		return area;
	}

	public float getPerimetro() {
		perimetro = (2*altura) + (2*largura);
		return perimetro;
	}

	public float getDiagonal() {
		double hip = Math.pow(altura, 2) + Math.pow(largura, 2);
		diagonal = (float) Math.sqrt(hip);
		return diagonal;
	}
	
	
}
