package designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
	
	Map<String,FlyWeight> hashMap = new HashMap<String, FlyWeight>();
	
	public FlyWeight factory(String state){
		FlyWeight result = hashMap.get(state);
		
		if(result == null){
			result = new ConcreteFlyWeight(state);
			hashMap.put(state, result);
			
		}
		return result;
	}
}
