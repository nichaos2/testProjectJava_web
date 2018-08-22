package testProject;

import model.Material;

public class MaterialGenerator {
	public Material createMaterial(long id, String name) {
		Material m = new Material();
		m.setId(id);
		m.setName(name);
		return m;

	}

	public List<Material> addMaterial(Material m, List<Material> materialList) {
		materialList.add(m);
		return materialList;

	}

	public List<Material> addMaterials(List<Material> materialListIn, List<Material> materialListOut) {
		for (Material material : materialListIn) {
			materialListOut.add(material);
		}
		return materialListOut;

	}
}
