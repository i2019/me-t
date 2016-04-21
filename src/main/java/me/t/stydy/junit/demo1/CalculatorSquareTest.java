package me.t.stydy.junit.demo1;

import java.util.Arrays;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;
/*
 * 参数化测试方法:
 * 这个时候运行器也不是默认的运行器，而是通过@RunWith(Parameterized.class)来标注。
 */
@RunWith(Parameterized.class)
public class CalculatorSquareTest {
	private static Logger log=Logger.getLogger(LogTest.class);
	private static Calculator calculator = new Calculator();
	private int param;
	private int result;

	public CalculatorSquareTest(int param, int result) {
		this.param = param;
		this.result = result;
	}
	//定义测试数据的集合
	@SuppressWarnings("rawtypes")
	@Parameters
	public static Collection data(){
		return Arrays.asList(new Object[][] { { 2, 4 }, { 0, 0 }, { -3, 9 }, });
	}
	// 先将结果清零
	@Before
	public void setUp() {
		calculator.clear();
	}
	
	@Test
	public void testSquare(){
		
		calculator.square(param);
		
		log.info("---------------------------------------------------------------------------");
		log.info("testSquare() param="+param);
		log.info("testSquare() calculator.getResult()="+calculator.getResult());
		log.info("testSquare() result="+result);
		log.info("---------------------------------------------------------------------------");
		
		assertEquals(result, calculator.getResult());
	}
	
	@Test(timeout=1000)
	public void testSquareRoot(){
		//calculator.squareRoot(4);
		//assertEquals(2, calculator.getResult());
	}
}
