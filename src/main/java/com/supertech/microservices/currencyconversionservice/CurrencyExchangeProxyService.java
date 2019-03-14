/**
 * 
 */
package com.supertech.microservices.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author jillU
 *
 */
@FeignClient(name="currency-exchange-service",url="localhost:8000")
public interface CurrencyExchangeProxyService {
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConverterBean retrieveExchange(@PathVariable String from, @PathVariable String to);

}
