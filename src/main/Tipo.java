package main;

public enum Tipo {
	
	REMERA(Categoria.PARTE_SUPERIOR),
	CAMISA(Categoria.PARTE_SUPERIOR), 
	PANTALON(Categoria.PARTE_INFERIOR), 
	FALDA(Categoria.PARTE_INFERIOR), 
	ZAPATO(Categoria.CALZADO), 
	ZAPATILLA(Categoria.CALZADO), 
	ANTEOJOS(Categoria.ACCESORIO), 
	CARTERA(Categoria.ACCESORIO);

	Tipo(Categoria categoria) {
		
	}
}
