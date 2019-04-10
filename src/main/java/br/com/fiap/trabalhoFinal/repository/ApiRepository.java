package br.com.fiap.trabalhoFinal.repository;

import java.util.ArrayList;

import br.com.fiap.trabalhoFinal.dto.Transaction;

public class ApiRepository {

	public ArrayList<Transaction> transactions = new ArrayList<>();
	
	public boolean save(Transaction transaction) {
		
		long timestamp = System.currentTimeMillis();
		
		if (timestamp - transaction.getTimestamp() <= 60000) {			
			transactions.add(transaction);
			return true;			
		}
		
		return false;        
    }
}
