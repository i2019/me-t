package me.t.stydy.junit.demo1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
/**
 * 打包测试
 * 如果一个项目中有许多个测试类，一个一个去运行会非常繁琐，这个时候就可以考虑使用打包测试。
 * 将所有需要运行的测试类集中起来，一次性的运行完毕，大大的方便了我们的测试工作。
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ CalculatorSquareTest.class, CalculatorTest.class })
public class AllTests {

}
