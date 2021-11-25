package it.shop;

public class Main {

	public static void main(String[] args) {
		int codice =0;
		int prezzo =0;
		int iva =0;
		String nome = "";
		String descrizione = "";
		
		Prodotto p = new Prodotto(codice,prezzo,iva,nome,descrizione);
	    
		p.setDescrizione("Miglior tablet per la sua fascia prezzo!");
		p.setNome("Marca numModello-xxx Lite Tablet");
		p.setIva(18);
		p.setPrezzo(299);
		
		System.out.println(p.prezzoBase());
		System.out.println(p.prezzoIvaInclusa());
		System.out.println(p.getCodice());
		
		p.nomeEsteso();
	}

}
