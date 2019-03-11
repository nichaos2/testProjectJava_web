package testProject;

import java.util.ArrayList;
import java.util.List;

import model.Material;
import service.IMaterialService;
import service.MaterialServiceImpl;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello GIT in Eclipse helps? I am going to retry\n");

		IMaterialService ms = new MaterialServiceImpl();

		// some Materials
		MaterialGenerator mg = new MaterialGenerator();
		Material m3 = mg.createMaterial(2, "third material");
		Material m4 = mg.createMaterial(3, "fourth material");
		Material m5 = mg.createMaterial(4, "fifth material");

		List<Material> materialListTest = new ArrayList<Material>();
		materialListTest.add(m4);
		materialListTest.add(m5);

		// initialse with:
		// Material m1 = mg.createMaterial(0, "first material");
		// Material m2 = mg.createMaterial(1, "second material");
		ms.initialiseMaterialList();

		List<Material> mList = ms.addMaterial(m3);

		mList = ms.addMaterials(materialListTest);

		ms.deleteMaterial(3);

		System.out.println(ms.getMaterialById(2));

		mList = ms.getAllMaterials();

		printMaterials(mList);

		// choose a specific material with id
		for (Material m : mList) {
			if (m.getId() == 1)
				mList = ms.updateMaterial(m, "update1 material");
		}

		printMaterials(mList);
	}

	private static void printMaterials(List<Material> materialList) {
		for (Material material : materialList) {
			System.out.println(material);
		}
		System.out.println("");

	}

}
