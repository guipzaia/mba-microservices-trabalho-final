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
public class Transaction {

	@ApiModelProperty(notes = "Tempo da transacao em millisegundos no timezone UTC")
	private long timestamp;
	
	@ApiModelProperty(notes = "Valor da transacao")
	private double amount;
}
