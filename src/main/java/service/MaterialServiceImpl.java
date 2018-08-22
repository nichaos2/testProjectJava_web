package service;

import java.util.List;

import model.Material;
import testProject.MaterialGenerator;

public class MaterialServiceImpl implements IMaterialService {

	// Generator instead of database
	MaterialGenerator mg = new MaterialGenerator();
	static List<Material> materialList;

	public List<Material> getAllMaterials() {
		return materialList;
	}

	public List<Material> addMaterialToList(Material m) {
		mg.addMaterial(m, materialList);
		return materialList;
	}

	public List<Material> addMaterialsToList(List<Material> mListIn) {
		mg.addMaterials(mListIn, materialList);
		return materialList;
	}

}
