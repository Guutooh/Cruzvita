package br.com.cruzvita;

public interface Acoes {

	void sacar(double quantia);
	void depositar(double quantia);
	void transferir(Conta destino, double quantia);
	
}
