/*
 * This service is connected to a list generator
 * When Dao is up and running the treatment should be replaced accordingly
 *  
 *  
 */

package service;

import java.util.List;

import org.springframework.stereotype.Service;

import model.Material;
import testProject.MaterialGenerator;

@Service
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

	public Material getMaterialById(long id) {
		Material m = mg.getMaterialById(id);
		return m;
	}

	public void deleteMaterial(int id) {
		mg.deleteMaterial(id);

	}

	// TODO this needs more addressing
	public List<Material> updateMaterial(Material m, String name) {
		materialList = mg.updateMaterial(m, name);
		return materialList;
	}

}
