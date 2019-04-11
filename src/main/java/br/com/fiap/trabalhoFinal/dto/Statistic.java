package br.com.fiap.trabalhoFinal.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Statistic {

	private double sum = 0.0;
	private double min = 0.0;
	private double max = 0.0;
	private double avg = 0.0;
	private int count = 0;
	
	public double getSum() {
		return sum;
	}
	
	public void setSum(double sum) {
		this.sum = sum;
	}
	
	public double getMin() {
		return min;
	}
	
	public void setMin(double min) {
		this.min = min;
	}
	
	public double getMax() {
		return max;
	}
	
	public void setMax(double max) {
		this.max = max;
	}
	
	public double getAvg() {
		return avg;
	}
	
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
}
