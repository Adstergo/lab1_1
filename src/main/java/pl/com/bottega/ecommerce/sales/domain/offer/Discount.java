package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Discount {
	private BigDecimal discountValue;
	private String discountCause;
	
	public Discount(BigDecimal discountValue, String discountCause) {
		this.discountValue=discountValue;
		this.discountCause=discountCause;
	}
	
	public BigDecimal getDiscountValue() {
		return this.discountValue;
	}
	
	public String getDiscountCause() {
		return this.discountCause;
	}
	
	public void setDiscountValue(BigDecimal value) {
		this.discountValue=value;
	}
	
	public void setDiscountCause(String cause) {
		this.discountCause=cause;
	}
	
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (discountValue == null ? 0 : discountValue.hashCode());
        result = prime * result + (discountCause == null ? 0 : discountCause.hashCode());
        return result;
    }
	
}
