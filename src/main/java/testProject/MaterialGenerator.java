package testProject;

import java.util.ArrayList;
import java.util.List;

import model.Material;

public class MaterialGenerator {

	public static List<Material> materialList = new ArrayList<Material>();

	public void initialiseMaterialList() {
		Material m1 = createMaterial(0, "first material");
		Material m2 = createMaterial(1, "second material");
		addMaterial(m1);
		addMaterial(m2);
	}

	public Material createMaterial(long id, String name) {
		Material m = new Material();
		m.setId(id);
		m.setName(name);
		return m;

	}

	public List<Material> addMaterial(Material m) {
		materialList.add(m);
		return materialList;

	}

	public List<Material> addMaterials(List<Material> materialListIn) {
		for (Material material : materialListIn) {
			materialList.add(material);
		}
		return materialList;

	}
}