package br.com.fiap.trabalhofinal.dto;

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
	private long count = 0;
}
