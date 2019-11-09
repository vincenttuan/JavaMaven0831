package day09_csv2;

import com.opencsv.bean.CsvBindByName;

public class Sales {
    @CsvBindByName(column = "Region")
    private String region;
    @CsvBindByName(column = "Country")
    private String country;
    @CsvBindByName(column = "Item Type")
    private String itemType;
    @CsvBindByName(column = "Sales Channel")
    private String salesChannel;
    @CsvBindByName(column = "Order Priority")
    private String orderPriority;
    @CsvBindByName(column = "Order Date")
    private String orderDate;
    @CsvBindByName(column = "Order ID")
    private String orderId;
    @CsvBindByName(column = "Ship Date")
    private String shipDate;
    @CsvBindByName(column = "Units Sold")
    private Double unitsSold;
    @CsvBindByName(column = "Unit Price")
    private Double unitsPrice;
    @CsvBindByName(column = "Unit Cost")
    private Double unitsCost;
    @CsvBindByName(column = "Total Revenue")
    private Double totalRevenue;
    @CsvBindByName(column = "Total Cost")
    private Double totalCost;
    @CsvBindByName(column = "Total Profit")
    private Double totalProfit;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getSalesChannel() {
        return salesChannel;
    }

    public void setSalesChannel(String salesChannel) {
        this.salesChannel = salesChannel;
    }

    public String getOrderPriority() {
        return orderPriority;
    }

    public void setOrderPriority(String orderPriority) {
        this.orderPriority = orderPriority;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getShipDate() {
        return shipDate;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    public Double getUnitsSold() {
        return unitsSold;
    }

    public void setUnitsSold(Double unitsSold) {
        this.unitsSold = unitsSold;
    }

    public Double getUnitsPrice() {
        return unitsPrice;
    }

    public void setUnitsPrice(Double unitsPrice) {
        this.unitsPrice = unitsPrice;
    }

    public Double getUnitsCost() {
        return unitsCost;
    }

    public void setUnitsCost(Double unitsCost) {
        this.unitsCost = unitsCost;
    }

    public Double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(Double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public Double getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(Double totalProfit) {
        this.totalProfit = totalProfit;
    }

    @Override
    public String toString() {
        return "Sales{" + "region=" + region + ", country=" + country + ", itemType=" + itemType + ", salesChannel=" + salesChannel + ", orderPriority=" + orderPriority + ", orderDate=" + orderDate + ", orderId=" + orderId + ", shipDate=" + shipDate + ", unitsSold=" + unitsSold + ", unitsPrice=" + unitsPrice + ", unitsCost=" + unitsCost + ", totalRevenue=" + totalRevenue + ", totalCost=" + totalCost + ", totalProfit=" + totalProfit + '}';
    }

}
