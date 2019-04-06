package edu.gdkm.weixin.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class  InMessage implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Xml开头都是JAXB
	@XmlElement(name="ToUserName")
	private String toUserName;
	
	@XmlElement(name="FormUserName")
	private String formUserName;
	
	@XmlElement(name="CreateTime")
	private long createTime;
	
	@XmlElement(name="MsgType")
	private String msgType;
	
	@XmlElement(name="MagId")
	private Long magId;

	public String getToUserName() {
		return toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public String getFormUserName() {
		return formUserName;
	}

	public void setFormUserName(String formUserName) {
		this.formUserName = formUserName;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public Long getMagId() {
		return magId;
	}

	public void setMagId(Long magId) {
		this.magId = magId;
	}
	
	abstract public  String toString();
	
}
