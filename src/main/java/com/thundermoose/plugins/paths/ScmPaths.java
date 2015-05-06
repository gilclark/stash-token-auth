package com.thundermoose.plugins.paths;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ScmPaths implements Paths {
	@XmlElement
	@Matches({"/scm/**"})
	private boolean scm;

	public ScmPaths(boolean scm) {
		this.scm = scm;
	}

	public ScmPaths() {
	}
	
	public boolean getScm() {
		return scm;
	}

	public void setScm(boolean scm) {
		this.scm = scm;
	}
}
