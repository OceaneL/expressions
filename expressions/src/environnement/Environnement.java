package environnement;

import java.util.HashMap;

import expressions.Variable;

public class Environnement {
	protected HashMap<Variable, Integer> hashMap = new HashMap<Variable, Integer>();
	
	public void setValue(Variable var, int value){
		hashMap.put(var, value);
	}
	
	public Integer getValue(Variable var){
		return hashMap.get(var);
	}
	
}
