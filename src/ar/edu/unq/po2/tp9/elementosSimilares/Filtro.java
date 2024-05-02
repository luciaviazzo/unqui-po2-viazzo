package ar.edu.unq.po2.tp9.elementosSimilares;

import java.util.List;

public abstract class Filtro {

	public List<IWikipediaPage> getSimilarPages(IWikipediaPage page, List<IWikipediaPage> wikipedia) {
		return this.aplicarFiltro(page, wikipedia);
	}
	
	public abstract List<IWikipediaPage> aplicarFiltro(IWikipediaPage page, List<IWikipediaPage> wikipedia);
}
