package testProject;

import java.util.ArrayList;
import java.util.List;

import model.Material;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello GIT in Eclipse helps?");

		MaterialGenerator mg = new MaterialGenerator();
		Material m1 = mg.createMaterial(0, "first material");
		Material m2 = mg.createMaterial(1, "second material");
		Material m3 = mg.createMaterial(2, "third material");
		Material m4 = mg.createMaterial(3, "fourth material");

		List<Material> materialList = new ArrayList<Material>();
		materialList.add(m1);
		materialList.add(m2);

		List<Material> materialList1 = mg.addMaterial(m3, materialList);

		printMaterials(materialList1);
	}

	private static void printMaterials(List<Material> materialList) {
		for (Material material : materialList) {
			System.out.println(material);
		}

	}

	private static Material createMaterial(long id, String name) {
		Material m = new Material();
		m.setId(id);
		m.setName(name);
		return m;

	}

}
