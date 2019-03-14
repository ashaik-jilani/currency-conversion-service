/**
 * 
 */
package com.supertech.microservices.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author jillU
 *
 */
//@FeignClient(name="currency-exchange-service",url="localhost:8000")
@FeignClient(name="currency-exchange-service")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeProxyService {
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConverterBean retrieveExchange(@PathVariable String from, @PathVariable String to);

}
