package it.shop;

import java.util.Objects;
import java.util.Random;

public class Prodotto {
	
	private int codice;
	private String nome;
	private String descrizione;
	private int prezzo;
	private int iva;
	
	private static Random generazioneCodice;
	
	public Prodotto(int codice, int prezzo, int iva, String nome, String descrizione) {
		this.codice = getRandom().nextInt(10000);
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = iva;
	}
	
	public static Random getRandom() {
	    if (Objects.isNull(generazioneCodice)) {
	        generazioneCodice = new Random(); 	
	    }
	    return generazioneCodice; 
	}
	
	public int getCodice() {
		return this.codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}
	
    public int prezzoBase(){
    	return prezzo;
    }
    
    public int prezzoIvaInclusa(){
    	return prezzo + (prezzo*iva/100);
    }
    
    public void nomeEsteso(){
    	System.out.println(codice + "-" + nome);
    }
	
}
