package br.com.fiap.trabalhoFinal.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.trabalhoFinal.dto.Statistic;
import br.com.fiap.trabalhoFinal.dto.Transaction;
import br.com.fiap.trabalhoFinal.repository.ApiRepository;

@RestController
public class ApiController {

	private static ApiRepository repository = new ApiRepository();
	
	@GetMapping("/statistics")
    public ResponseEntity<Statistic> statistic() throws Exception {

        return new ResponseEntity<>(repository.all(), HttpStatus.OK);
    }
	
	@PostMapping("/transactions")
    public ResponseEntity<Transaction> transaction(@RequestBody Transaction transaction) throws Exception {

		return new ResponseEntity<Transaction>(repository.save(transaction) ? HttpStatus.CREATED : HttpStatus.NO_CONTENT);       
    }
}
