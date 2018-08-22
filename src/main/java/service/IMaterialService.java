package service;

import java.util.List;

import model.Material;

public interface IMaterialService {

	public void initialiseMaterialList();

	public List<Material> getAllMaterials();

	public List<Material> addMaterial(Material m);

	public List<Material> addMaterials(List<Material> materialList);
}