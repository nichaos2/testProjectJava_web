package testProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.Material;

public class MaterialGenerator {

	public static List<Material> materialList = new ArrayList<Material>();

	public List<Material> initialiseMaterialList() {
		Material m1 = createMaterial(0, "first material");
		Material m2 = createMaterial(1, "second material");
		addMaterial(m1);
		addMaterial(m2);
		return materialList;
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

	public void deleteMaterial(int id) {
		// TODO Auto-generated method stub
		for (Iterator<Material> iter = materialList.listIterator(); iter.hasNext();) {
			Material m = iter.next();
			if (m.getId() == id)
				iter.remove();
		}

	}

	public Material getMaterialById(long id) {
		Material mId = new Material();
		for (Iterator<Material> iter = materialList.listIterator(); iter.hasNext();) {
			Material m = iter.next();
			if (m.getId() == id)
				mId = m;
		}
		return mId;
	}

	public List<Material> updateMaterial(Material m, String name) {
		m.setName(name);
		return materialList;
	}
}