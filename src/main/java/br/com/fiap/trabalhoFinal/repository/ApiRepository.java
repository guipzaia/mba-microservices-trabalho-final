package br.com.fiap.trabalhoFinal.repository;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import br.com.fiap.trabalhoFinal.dto.Statistic;
import br.com.fiap.trabalhoFinal.dto.Transaction;

public class ApiRepository {

	private ArrayList<Transaction> transactions = new ArrayList<>();
	private final int minute = 60000;
	
	public boolean save(Transaction transaction) {
		
		if (System.currentTimeMillis() - transaction.getTimestamp() <= minute) {			
			transactions.add(transaction);
			return true;			
		}
		
		return false;
    }
	
	public Statistic all() {
		
		Statistic statistic = new Statistic();
		
		DoubleStream ds = (DoubleStream) ((Stream<Transaction>) transactions
					.stream()
					.filter(t -> System.currentTimeMillis() - t.getTimestamp() <= minute)
					.collect(Collectors.toList()))
					.mapToDouble(Transaction::getAmount);

		statistic.setSum(ds.sum());
		statistic.setAvg(ds.average().getAsDouble());
		statistic.setMax(ds.max().getAsDouble());
		statistic.setMin(ds.min().getAsDouble());
		statistic.setCount((int) ds.count());
		
		return statistic;
	}
}
