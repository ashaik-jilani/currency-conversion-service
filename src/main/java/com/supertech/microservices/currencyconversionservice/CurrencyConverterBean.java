/**
 * 
 */
package com.supertech.microservices.currencyconversionservice;

import java.math.BigDecimal;

/**
 * @author jillU
 *
 */
public class CurrencyConverterBean {
	
	private Integer id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private BigDecimal quantity;
	private BigDecimal totalCalculatedAmount;
	private int port;
	
	
	/**
	 * 
	 */
	public CurrencyConverterBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param from
	 * @param to
	 * @param conversionMultiple
	 * @param quantity
	 * @param totalCalculatedAmount
	 * @param port
	 */
	public CurrencyConverterBean(Integer id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,
			BigDecimal totalCalculatedAmount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.port = port;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}
	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}
	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}
	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}
	/**
	 * @return the conversionMultiple
	 */
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	/**
	 * @param conversionMultiple the conversionMultiple to set
	 */
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	/**
	 * @return the quantity
	 */
	public BigDecimal getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the totalCalculatedAmount
	 */
	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}
	/**
	 * @param totalCalculatedAmount the totalCalculatedAmount to set
	 */
	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}
	/**
	 * @return the port
	 */
	public int getPort() {
		return port;
	}
	/**
	 * @param port the port to set
	 */
	public void setPort(int port) {
		this.port = port;
	}
	
	

}
