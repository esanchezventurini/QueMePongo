package src.main;

public enum Tipo {
	CHOMBA(Categoria.PARTE_SUPERIOR),
	REMERA(Categoria.PARTE_SUPERIOR),
	CAMISA(Categoria.PARTE_SUPERIOR), 
	PANTALON(Categoria.PARTE_INFERIOR), 
	PANTALON_VESTIR(Categoria.PARTE_INFERIOR),
	FALDA(Categoria.PARTE_INFERIOR), 
	ZAPATO(Categoria.CALZADO), 
	ZAPATILLA(Categoria.CALZADO), 
	ANTEOJOS(Categoria.ACCESORIO), 
	CARTERA(Categoria.ACCESORIO);

	private Categoria categoria;

	Tipo(Categoria categoria) {
		this.categoria = categoria;
	}
}
