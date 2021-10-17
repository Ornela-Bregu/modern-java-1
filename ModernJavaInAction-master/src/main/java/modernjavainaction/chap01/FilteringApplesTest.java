import org.junit.Test;
import org.junit.Assert; 
import modernjavainaction.chap01.FilteringApples;
import modernjavainaction.chap01.FilteringApples.Apple;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class FilteringApplesTest {
	
	@Test
	public void isGreenAppleTest()
	{
		
		FilteringApples green_apples = new FilteringApples();
		Apple a =new Apple(80, "green");
		boolean actual = green_apples.isGreenApple(a);
		boolean expected = true;
		assertEquals(expected,actual);
	  
	    
	  }
	
	@Test
	public void isHeavyAppleTest() {
		FilteringApples heavy_apples = new FilteringApples();
		Apple a =new Apple(160, "green");
		Apple b =new Apple(50, "green");

		boolean actual = heavy_apples.isHeavyApple(a);
		boolean actual2 = heavy_apples.isHeavyApple(b);
		boolean expected = true;
		assertEquals(expected,actual);
		assertEquals(false,actual2);
	
	  }

	@Test
	public void filterGreenApplesTest() {
		FilteringApples filter_green_apples = new FilteringApples();
		List<Apple> a = Arrays.asList(
		        new Apple(10, "yellow"),
		        new Apple(155, "green"),
		        new Apple(120, "red")
		    );
		List actual = filter_green_apples.filterGreenApples(a);
		List<Apple> expected = Arrays.asList(new Apple(155, "green"));
		assertEquals(expected.toString(),actual.toString());
		
		
	}
	
	@Test
	public void filterHeavyAppleTest() {
		FilteringApples filter_heavy_apples = new FilteringApples();
		List<Apple> a = Arrays.asList(
		        new Apple(10, "yellow"),
		        new Apple(155, "green"),
		        new Apple(120, "red")
		    );
		List actual = filter_heavy_apples.filterHeavyApples(a);
		List<Apple> expected = Arrays.asList(new Apple(155, "green"));
		assertEquals(expected.toString(),actual.toString());
		
	}
	
	@Test
	public void filterApplesTest() {
		FilteringApples filter_apples = new FilteringApples();
		List<Apple> a = Arrays.asList(
		        new Apple(85, "yellow"),
		        new Apple(155, "green"),
		        new Apple(180, "red"),
		        new Apple(50, "brown"),
		        new Apple(55, "orange"),
		        new Apple(300, "brown")
		        
		    );
		List<Apple> b = Arrays.asList(
	        new Apple(100, "green"),
	        new Apple(150, "red")
	    );
		
	List actual = filter_apples.filterApples(a,FilteringApples::isGreenApple);
	List actual1 = filter_apples.filterApples(a,FilteringApples::isHeavyApple);
	List<Apple> expected = Arrays.asList(new Apple(155, "green"));
	List<Apple> expected1 = Arrays.asList(new Apple(155, "green"),new Apple(180, "red"),new Apple(300, "brown"));
	assertEquals(expected.toString(),actual.toString());
	assertEquals(expected1.toString(),actual1.toString());



	


	
	}
	
//	@Test
//	public void weirdApples_Test() {
//		FilteringApples weirdApples = new FilteringApples();
//		List<Apple> a = Arrays.asList(
//		        new Apple(100, "red")
////		        new Apple(50, "red"),
////		        new Apple(155, "green"),
////		        new Apple(120, "red"),
////		        new Apple(80, "red"),
////		        new Apple(70, "brown")
//		    );
////		List<Apple> b = Arrays.asList(
////		        new Apple(20, "green"),
////		        new Apple(20, "red")
////		    );
//		List actual = weirdApples.filterApples(a, (Apple x) -> x.getWeight() < 80 || "brown".equals(x.getColor()));		
////		List actual = weirdApples.filterApples(a, (Apple x) -> x.getWeight() > 80 || !"brown".equals(x.getColor()));		
////		List<Apple> expected = Arrays.asList(new Apple(100, "brown"),new Apple(50, "red"),new Apple(70, "brown"));
//		List<Apple> expected = Arrays.asList();
//		assertEquals(expected.toString(),actual.toString());
//
//		
//	}
//	

	@Test 
	public void setters_Test() {
		FilteringApples main_testing = new FilteringApples();
		Apple a = new Apple(10, "red");
		a.setColor("yellow");
		a.setWeight(150);
		Apple expected = new Apple(150, "yellow");
		assertEquals(expected.toString(),a.toString());
//		assertArrayEquals(expected,a);
		
	}
	
	@Test
	public void mainTest() {
		
		FilteringApples main_testing = new FilteringApples();
		String [] args = {"one","two"};
		main_testing.main(args);
	}


		
	

}

