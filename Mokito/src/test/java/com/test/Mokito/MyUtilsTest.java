package com.test.Mokito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyUtilsTest {

	@Test
	void verifyTest() {
		MyUtils mock= Mockito.mock(MyUtils.class);
		mock.add(10,30);
		verify(mock).add(10,30);
		verify(mock,times(1)).add(10,30);
		
	}
@Test
void verify1Test() {
	MyUtils mock= Mockito.mock(MyUtils.class);
	mock.add(10,30);
	mock.add(10,30);
	mock.add(10,30);
	mock.add(10,30);
	mock.add(10,30);
	verify(mock,times(5)).add(10,30);
	verify(mock,atLeast(2)).add(10,30);
	verify(mock,atLeastOnce()).add(10,30);
}
@Test
void verify2Test()
{
	MyUtils mock1= Mockito.mock(MyUtils.class);
	MyUtils mock2= Mockito.mock(MyUtils.class);
	mock1.add(10, 30);
	mock2.add(20, 30);
	
	
	verifyNoIterations(mock1,mock2);
	
	
}
@Test
void verify3Test()
{
	List mock=Mockito.mock(List.class);
	mock.add("KK");
	ArgumentCaptor<String> argumentCaptor= ArgumentCaptor.forClass(String.class);
	verify(mock).add(argumentCaptor.getValue());
	assertEquals("KK",argumentCaptor.getValue());
}


private void verifyNoIterations(MyUtils mock1, MyUtils mock2) {
	// TODO Auto-generated method stub
	
}
	

}
