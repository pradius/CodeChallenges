package com.devskiller.orders;

import java.time.DayOfWeek;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OrdersAnalyzerTest {


	private List<OrdersAnalyzer.Order> orders;

	@Before
	public void setUp() throws Exception {
		orders = OrdersTestHelper.readOrders("/orders.json");
	}
	@Ignore
	@Test
	public void shouldReturnCorrectValueForMonday() {
		// given
		OrdersAnalyzer ordersAnalyzer = new OrdersAnalyzer();

		// then
		OrdersTestHelper.testResults(ordersAnalyzer, DayOfWeek.MONDAY, orders);
	}
	@Ignore
	@Test
	public void shouldReturnCorrectValueForTuesday() {
		//given
		OrdersAnalyzer ordersAnalyzer = new OrdersAnalyzer();

		// then
		OrdersTestHelper.testResults(ordersAnalyzer, DayOfWeek.TUESDAY, orders);
	}
	@Ignore
	@Test
	public void shouldReturnCorrectValueForWednesday() {
		//given
		OrdersAnalyzer ordersAnalyzer = new OrdersAnalyzer();

		// then
		OrdersTestHelper.testResults(ordersAnalyzer, DayOfWeek.WEDNESDAY, orders);
	}
	@Ignore
	@Test
	public void shouldReturnCorrectValueForThursday() {
		//given
		OrdersAnalyzer ordersAnalyzer = new OrdersAnalyzer();

		// then
		OrdersTestHelper.testResults(ordersAnalyzer, DayOfWeek.THURSDAY, orders);
	}
	@Ignore
	@Test
	public void shouldReturnCorrectValueForFriday() {
		//given
		OrdersAnalyzer ordersAnalyzer = new OrdersAnalyzer();

		// then
		OrdersTestHelper.testResults(ordersAnalyzer, DayOfWeek.FRIDAY, orders);
	}

	@Test
	public void shouldReturnCorrectValueForSaturday() {
		//given
		OrdersAnalyzer ordersAnalyzer = new OrdersAnalyzer();

		// then
		OrdersTestHelper.testResults(ordersAnalyzer, DayOfWeek.SATURDAY, orders);
	}
	@Ignore
	@Test
	public void shouldReturnCorrectValueForSunday() {
		//given
		OrdersAnalyzer ordersAnalyzer = new OrdersAnalyzer();

		// then
		OrdersTestHelper.testResults(ordersAnalyzer, DayOfWeek.SUNDAY, orders);
	}
}
