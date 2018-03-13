package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Date;

public class Product {

    protected String productId;

    protected BigDecimal productPrice;

    protected String productName;

    protected Date productSnapshotDate;

    protected String productType;

    protected int quantity;

    protected BigDecimal totalCost;

    protected String currency;
}
