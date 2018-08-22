package service;

import java.util.List;

import model.Material;
import testProject.MaterialGenerator;

public class MaterialServiceImpl implements IMaterialService {

	// Generator instead of database
	MaterialGenerator mg = new MaterialGenerator();
	static List<Material> materialList;

	public void initialiseMaterialList() {
		materialList = mg.initialiseMaterialList();
	}

	public List<Material> getAllMaterials() {
		return materialList;
	}

	public List<Material> addMaterial(Material m) {
		materialList = mg.addMaterial(m);
		return materialList;
	}

	public List<Material> addMaterials(List<Material> mListIn) {
		materialList = mg.addMaterials(mListIn);
		return materialList;
	}

}
