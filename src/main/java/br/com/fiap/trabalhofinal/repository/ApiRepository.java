package br.com.fiap.trabalhofinal.repository;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import br.com.fiap.trabalhofinal.dto.Statistic;
import br.com.fiap.trabalhofinal.dto.Transaction;

public class ApiRepository {

	private final long minute = 60000;
	
	private ArrayList<Transaction> transactions = new ArrayList<>();
	
	public boolean save(Transaction transaction) {
		
		if (System.currentTimeMillis() - transaction.getTimestamp() <= minute) {			
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
					.filter(t -> System.currentTimeMillis() - t.getTimestamp() <= minute)
					.collect(Collectors.toList());
		
		if (filterTransactions.size() > 0) {
		
			DoubleStream ds = filterTransactions
					.stream()
					.mapToDouble(Transaction::getAmount);
			
			statistic.setAvg(ds.average().getAsDouble());
			statistic.setSum(ds.sum());
			statistic.setMax(ds.max().getAsDouble());
			statistic.setMin(ds.min().getAsDouble());
			statistic.setCount(ds.count());
		}
		
		return statistic;
	}
}
