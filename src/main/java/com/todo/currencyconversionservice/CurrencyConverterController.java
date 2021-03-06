package com.todo.currencyconversionservice;


import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConverterController {

	
	@GetMapping("/converter/from/{from}/to/{to}/value/{value}")
	public CurrencyExchangeData convert(@PathVariable String from,@PathVariable String to,@PathVariable String value){
		
		//currencyDataExchange.setPort(Integer.parseInt(environment.getProperty("CURRENCY_EXCHANGE_ENDPOINT")));
		
		Map<String,String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		ResponseEntity<CurrencyExchangeData> respEntity = new RestTemplate().
			getForEntity("http://currency-exchange-service:8001/exchange/from/{from}/to/{to}",
					CurrencyExchangeData.class,uriVariables);
		CurrencyExchangeData data = respEntity.getBody();
		CurrencyExchangeData resp = new CurrencyExchangeData(data.getId(), from, to, data.getConversionRate(), Double.parseDouble(value)*data.getConversionRate()  );
		
		resp.setPort(data.getPort());
		resp.setIpAddress(data.getIpAddress());
		return  resp;
	}
}
