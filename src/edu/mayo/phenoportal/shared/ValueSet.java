package edu.mayo.phenoportal.shared;

import java.io.Serializable;

public class ValueSet implements Serializable {
	public String name;
	public String description;
	public String version;
	public String comment;
	public String changeSetId;
	public String documentUri;

	public ValueSet() { }

	public ValueSet(String name, String description, String version) {
		this.name = name;
		this.description = description;
		this.version = version;
	}

	@Override
	public boolean equals(Object other) {
		return other instanceof ValueSet &&
		  ((ValueSet) other).name.equalsIgnoreCase(name) &&
		  ((ValueSet) other).version.equalsIgnoreCase(version);
	}

}
