package testProject;

import java.util.ArrayList;
import java.util.List;

import model.Material;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello GIT in Eclipse helps? I going to retry\n");

		MaterialGenerator mg = new MaterialGenerator();
		Material m1 = mg.createMaterial(0, "first material");
		Material m2 = mg.createMaterial(1, "second material");
		Material m3 = mg.createMaterial(2, "third material");
		Material m4 = mg.createMaterial(3, "fourth material");
		Material m5 = mg.createMaterial(4, "fifth material");

		List<Material> materialList = new ArrayList<Material>();
		materialList.add(m4);
		materialList.add(m5);

		// mg.initialiseMaterialList();

		List<Material> materialList1 = mg.addMaterial(m3);
		printMaterials(materialList1);

		List<Material> materialList2 = mg.addMaterials(materialList);
		printMaterials(materialList2);

	}

	private static void printMaterials(List<Material> materialList) {
		for (Material material : materialList) {
			System.out.println(material);
		}
		System.out.println("");

	}

}
