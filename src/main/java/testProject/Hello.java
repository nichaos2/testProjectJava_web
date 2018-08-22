package testProject;

import java.util.List;

import model.Material;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello GIT in Eclipse helps?");

		// initial List
		/*
		 * MaterialGenerator mg = new MaterialGenerator(); Material m1 =
		 * mg.createMaterial(0, "first"); Material m2 = mg.createMaterial(1, "second");
		 * List<Material> initialMaterialList = new ArrayList<Material>();
		 * 
		 * IMaterialService ms = new MaterialServiceImpl(); // more materials Material
		 * m3 = mg.createMaterial(2, "third"); Material m4 = mg.createMaterial(3,
		 * "fourth"); ms.addMaterialToList(m3); ms.addMaterialToList(m4);
		 * 
		 * List<Material> materialListNew = ms.getAllMaterials();
		 * printMaterials(materialListNew);
		 */
	}

	private static void printMaterials(List<Material> materialList) {
		for (Material material : materialList) {
			System.out.println(material);
		}

	}

}
