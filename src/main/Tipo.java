package src.main;

public enum Tipo {
	CHOMBA(Categoria.PARTE_SUPERIOR,(short)30),
	REMERA(Categoria.PARTE_SUPERIOR, (short)40),
	CAMISA(Categoria.PARTE_SUPERIOR, (short)30),
	CAMPERON(Categoria.PARTE_SUPERIOR, (short)5),
	PANTALON(Categoria.PARTE_INFERIOR, (short)25),
	PANTALON_VESTIR(Categoria.PARTE_INFERIOR, (short)20),
	FALDA(Categoria.PARTE_INFERIOR, (short)35),
	ZAPATO(Categoria.CALZADO, (short)30),
	ZAPATILLA(Categoria.CALZADO, (short)40),
	ANTEOJOS(Categoria.ACCESORIO, (short)50),
	CARTERA(Categoria.ACCESORIO, (short)35);

	private Categoria categoria;
	private short temperaturaMaxima;

	Tipo(Categoria categoria, short temperaturaMaxima) {
		this.categoria = categoria;
		this.temperaturaMaxima = temperaturaMaxima;
	}

	public boolean esAdecuadoParaTemperatura(short unaTemperatura){
		return this.temperaturaMaxima > unaTemperatura;
	}

	public boolean esDeCategoria(Categoria categoria){
		return this.categoria == categoria;
	}
}
