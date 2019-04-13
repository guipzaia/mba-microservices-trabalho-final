package br.com.fiap.trabalhofinal.model;

import com.wordnik.swagger.annotations.ApiModelProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Statistic {

	@ApiModelProperty(notes = "Total da soma das transacoes dos ultimos 60 segundos")
	private double sum = 0.0;
	
	@ApiModelProperty(notes = "Valor mínimo das transacoes dos ultimos 60 segundos")
	private double min = 0.0;
	
	@ApiModelProperty(notes = "Valor máximo das transacoes dos ultimos 60 segundos")
	private double max = 0.0;
	
	@ApiModelProperty(notes = "Media dos valores das transacoes dos ultimos 60 segundos")
	private double avg = 0.0;
	
	@ApiModelProperty(notes = "Numero total das transacoes dos ultimos 60 segundos")
	private long count = 0;
}
