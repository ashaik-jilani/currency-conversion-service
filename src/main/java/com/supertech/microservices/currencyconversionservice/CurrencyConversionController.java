/**
 * 
 */
package com.supertech.microservices.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author jillU
 *
 */
@RestController
public class CurrencyConversionController {
	
	@Autowired
	private CurrencyExchangeProxyService proxy;
	
	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConverterBean retrieveConversion(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
		
		Map<String, String> uriVariables=new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		ResponseEntity<CurrencyConverterBean> responseEntity=new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}/", CurrencyConverterBean.class, uriVariables);
		
		CurrencyConverterBean response = responseEntity.getBody();
		return new CurrencyConverterBean(response.getId(), from, to, response.getConversionMultiple(), quantity, quantity.multiply(response.getConversionMultiple()), response.getPort());
	}
	
	
	@GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConverterBean retrieveConversionFeign(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
		
		CurrencyConverterBean response = proxy.retrieveExchange(from, to);
		return new CurrencyConverterBean(response.getId(), from, to, response.getConversionMultiple(), quantity, quantity.multiply(response.getConversionMultiple()), response.getPort());
	}

}
