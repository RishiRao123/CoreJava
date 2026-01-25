package model_type_questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CakeOrder {
	private Map<String, Double> orderMap = new HashMap<>();

	public Map<String, Double> getOrderMap() {
		return orderMap;
	}

	public void setOrderMap(Map<String, Double> orderMap) {
		this.orderMap = orderMap;
	}

	public void addOrderDetails(String orderId, double cakeCost) {
		orderMap.put(orderId, cakeCost);
	}

	public Map<String, Double> findOrdersAboveSpecifiedCost(double cakeCost) {
		Map<String, Double> filteredOrders = new HashMap<>();

		for (Map.Entry<String, Double> entry : orderMap.entrySet()) {
			if (entry.getValue() > cakeCost) {
				filteredOrders.put(entry.getKey(), entry.getValue());
			}
		}
		return filteredOrders;
	}

}

public class Practise1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		CakeOrder cakeOrder = new CakeOrder();

		System.out.println("Enter number of cake orders to be added");
		int noOfOrders = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the cake order details (Order Id: CakeCost)");

		for (int i = 0; i < noOfOrders; i++) {
			String input = sc.nextLine();

			String[] parts = input.split(":");
			String orderId = parts[0];
			double cakeCost = Double.parseDouble(parts[1]);
			cakeOrder.addOrderDetails(orderId, cakeCost);
		}

		System.out.println("Enter the cost to search the cake orders");
		double searchCost = sc.nextDouble();

		Map<String, Double> filteredOrders = cakeOrder.findOrdersAboveSpecifiedCost(searchCost);

		if (filteredOrders.isEmpty()) {
			System.out.println("No cake orders found");
		} else {
			System.out.println("Cake Orders above the specified cost");
			for (Map.Entry<String, Double> entry : filteredOrders.entrySet()) {
				System.out.println("Order ID: " + entry.getKey() + ", Cake Cost: " + entry.getValue());
			}
		}

		sc.close();
	}

}
