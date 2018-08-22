package service;

import java.util.List;

import model.Material;

public interface IMaterialService {

	public List<Material> getAllMaterials();

	public List<Material> addMaterialToList(Material m);
}
