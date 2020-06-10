package com.devskiller.orders;


import java.math.BigDecimal;
import java.time.*;
import java.util.*;

public class OrdersAnalyzer {

    static class Order {
        int orderId;
        LocalDateTime creationDate;
        List<OrderLine> orderLines;
    }

    static class OrderLine {
        int productId;
        String name;
        int quantity;
        BigDecimal unitPrice;
    }

    public Map<DayOfWeek, Integer> averageDailySales(List<Order> orders) {
		HashMap<DayOfWeek, List<Order>> medStep = new HashMap<>();
        HashMap<DayOfWeek, Integer> output = new HashMap<>();
        int sum = 0;
        int avg = 0;
        List<Order> value = new ArrayList<>();
        for (Order order : orders) {
			medStep.put(order.creationDate.getDayOfWeek(), new LinkedList<>());
        }
        for (Order order : orders) {
            if()
            medStep.put(order.creationDate.getDayOfWeek(),);
        }
		for(List<Order> order: medStep.values()){
			LocalDateTime day = null;
			for( Order o: order){
				day = o.creationDate;
				sum += getOrderTotal(o);
			}
			avg = (int) Math.round(sum / order.size());
			output.put(day.getDayOfWeek() , avg);
			sum = 0;
		}
        return output;
    }


    double getOrderTotal(Order order) {
        double result = 0;
        for (OrderLine l : order.orderLines) {
            double price = l.unitPrice.doubleValue();
            double quantity = l.quantity;
            result += price * quantity;
        }
        return result;
    }


}
