package br.com.fiap.trabalhoFinal.repository;

import java.util.ArrayList;
import java.util.stream.Collectors;

import br.com.fiap.trabalhoFinal.dto.Statistic;
import br.com.fiap.trabalhoFinal.dto.Transaction;

public class ApiRepository {

	public ArrayList<Transaction> transactions = new ArrayList<>();
	
	public boolean save(Transaction transaction) {
		
		if (System.currentTimeMillis() - transaction.getTimestamp() <= 60000) {			
			transactions.add(transaction);
			return true;			
		}
		
		return false;        
    }
	
	public Statistic all() {
		
		Statistic statistic = new Statistic();
		
		ArrayList<Transaction> filterTransactions = 
				(ArrayList<Transaction>) transactions
					.stream()
					.filter(t -> System.currentTimeMillis() - t.getTimestamp() <= 60000)
					.collect(Collectors.toList());
		
		double sum = filterTransactions
				.stream()
				.mapToDouble(Transaction::getAmount)
				.sum();
		
		double avg = filterTransactions
			.stream()
			.mapToDouble(Transaction::getAmount)
			.average()
			.getAsDouble();
		
		double max = filterTransactions
				.stream()
				.mapToDouble(Transaction::getAmount)
				.max()
				.getAsDouble();
		
		double min = filterTransactions
				.stream()
				.mapToDouble(Transaction::getAmount)
				.min()
				.getAsDouble();
		
		int count = filterTransactions.size();
		
		statistic.setAvg(avg);
		statistic.setSum(sum);
		statistic.setMax(max);
		statistic.setMin(min);
		statistic.setCount(count);
		
		return statistic;
	}
}
