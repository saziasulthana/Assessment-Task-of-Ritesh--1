package com.example.DozerMapping;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.DozerMapping.AlienShip.AlienShip;
import com.example.DozerMapping.Space.SpaceShip;

@SpringBootTest
class DozerMappingApplicationTests {

	@Test
	void TestMappingAlienShip() {
		 AlienShip al=new AlienShip(4,23.4,"TOAsia","Large");
		SpaceShip spaceShip=spaceShip.of(al);
		System.out.println("My spaceShip"+spaceShip);
	}
	BeanMappingBuilder builderMinusCrew= new BeanMappingBuilder() {

		@Override
		protected void configure() {
			mapping(SpaceShip.class,AlienShip.class)
			.fileds("name","nameOfShip"),
			.fields("size","shipsize"),
			.exclude("crew");
			
		}
		
	};
	
		
		@Test
		void TestMappingASpaceShip() {
			 SpaceShip spaceShip=new SpaceShip(4,"TOLondon","ExtraLarge");
			DozerBeanMapper mapper=new DozerBeanMapper();
			Mapper.addMapping(builderMinusCrew);
			AlienShip alienShip=Mapper.map(spaceShip,AlienShip.class)
			System.out.println("My alienShip"+alienShip);
			
		
	}

}
