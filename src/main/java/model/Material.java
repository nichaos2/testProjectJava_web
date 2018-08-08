package model;

public class Material {

	long id;

	String name;

	float energy_consum;
	int rank_energy_consum;

	float kg_CO2;
	int rank_kg_CO2;

	float bf_ratio;
	float avg_impact;
	float avg_impact_x_bfratio;

	// constructors
	public Material() {
	}

	public Material(long id, String name, float energy_consum, int rank_energy_consum, float kg_CO2, int rank_kg_CO2,
			float bf_ratio, float avg_impact, float avg_impact_x_bfratio) {
		this.id = id;
		this.name = name;
		this.energy_consum = energy_consum;
		this.rank_energy_consum = rank_energy_consum;
		this.kg_CO2 = kg_CO2;
		this.rank_kg_CO2 = rank_kg_CO2;
		this.bf_ratio = bf_ratio;
		this.avg_impact = avg_impact;
		this.avg_impact_x_bfratio = avg_impact_x_bfratio;
	}

	// getters - setters

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getEnergy_consum() {
		return energy_consum;
	}

	public void setEnergy_consum(float energy_consum) {
		this.energy_consum = energy_consum;
	}

	public int getRank_energy_consum() {
		return rank_energy_consum;
	}

	public void setRank_energy_consum(int rank_energy_consum) {
		this.rank_energy_consum = rank_energy_consum;
	}

	public float getKg_CO2() {
		return kg_CO2;
	}

	public void setKg_CO2(float kg_CO2) {
		this.kg_CO2 = kg_CO2;
	}

	public int getRank_kg_CO2() {
		return rank_kg_CO2;
	}

	public void setRank_kg_CO2(int rank_kg_CO2) {
		this.rank_kg_CO2 = rank_kg_CO2;
	}

	public float getBf_ratio() {
		return bf_ratio;
	}

	public void setBf_ratio(float bf_ratio) {
		this.bf_ratio = bf_ratio;
	}

	public float getAvg_impact() {
		return avg_impact;
	}

	public void setAvg_impact(float avg_impact) {
		this.avg_impact = avg_impact;
	}

	public float getAvg_impact_x_bfratio() {
		return avg_impact_x_bfratio;
	}

	public void setAvg_impact_x_bfratio(float avg_impact_x_bfratio) {
		this.avg_impact_x_bfratio = avg_impact_x_bfratio;
	}

	@Override
	public String toString() {
		return "MaterialRest [id=" + id + ", name=" + name + ", energy_consum=" + energy_consum
				+ ", rank_energy_consum=" + rank_energy_consum + ", kg_CO2=" + kg_CO2 + ", rank_kg_CO2=" + rank_kg_CO2
				+ ", bf_ratio=" + bf_ratio + ", avg_impact=" + avg_impact + ", avg_impact_x_bfratio="
				+ avg_impact_x_bfratio + "]";
	}

}
