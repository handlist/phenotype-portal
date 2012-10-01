package edu.mayo.phenoportal.shared;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Demographic implements Serializable {

	

	private static final long serialVersionUID = 1L;

	String type;
	int total;
	List<DemographicsCategory> demoCategoryList = new ArrayList<DemographicsCategory>();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<DemographicsCategory> getDemoCategoryList() {
		return demoCategoryList;
	}

	public void setDemoCategoryList(List<DemographicsCategory> demoCategoryList) {
		this.demoCategoryList = demoCategoryList;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	

}
