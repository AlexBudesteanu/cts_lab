package com.ro.ase.cts.seminar9.flyweight;

import java.util.HashMap;

public class Model3DFactory {
	static HashMap<ModelType, ModelFlyweightInterface> models;

	static {
		models = new HashMap<>();
		models.put(ModelType.SOLDIER, new Model3DFlyweight("Soldier"));
		models.put(ModelType.TREE, new Model3DFlyweight("Tree"));
	}
	
	public static ModelFlyweightInterface getModel(ModelType type) {
		return models.get(type);
	}
}
