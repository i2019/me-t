package me.t.stydy.junit.demo1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
/**
 * �������
 * ���һ����Ŀ�������������࣬һ��һ��ȥ���л�ǳ����������ʱ��Ϳ��Կ���ʹ�ô�����ԡ�
 * ��������Ҫ���еĲ����༯��������һ���Ե�������ϣ����ķ��������ǵĲ��Թ�����
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ CalculatorSquareTest.class, CalculatorTest.class })
public class AllTests {

}
