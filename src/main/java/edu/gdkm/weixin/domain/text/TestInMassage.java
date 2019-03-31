package edu.gdkm.weixin.domain.text;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import edu.gdkm.weixin.domain.InMassage;

@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class TestInMassage extends InMassage{


	private static final long serialVersionUID = 1L;
	
	@XmlElement(name="Content")
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	

}
