package com.example.DozerMapping.Space;

import org.apache.catalina.mapper.Mapper;
import org.dozer.DozerBeanMapper;


import com.example.DozerMapping.AlienShip.AlienShip;

public class SpaceShip {
	private int crew;
	private String name;
	private String size;
	
	public static SpaceShip of(AlienShip alienShip) {
		
		DozerBeanMapper mapper=new DozerBeanMapper();
		SpaceShip spaceShip =Mapper.map(alienShip,SpaceShip.class);
		
		return spaceShip;
		
	}

}
