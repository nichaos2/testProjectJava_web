package testProject;

import java.util.ArrayList;
import java.util.List;

import model.Material;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello GIT in Eclipse helps?");

		Material m1 = createMaterial(0, "first material");
		Material m2 = createMaterial(1, "second material");
		List<Material> materialList = new ArrayList<Material>();
		materialList.add(m1);
		materialList.add(m2);

		printMaterials(materialList);
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
