package br.com.fiap.trabalhoFinal.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

	private long timestamp;
	private double amount;
	
	public long getTimestamp() {
		return this.timestamp;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
}
