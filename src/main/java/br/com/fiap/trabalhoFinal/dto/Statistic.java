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

	private double sum;
	private double min;
	private double max;
	private double avg;
	private int count;
}
