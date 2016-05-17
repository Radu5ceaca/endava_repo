package com.test.dto.onetomany;

import java.io.Serializable;
 

public class DepartmentDTO implements Serializable {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1116984254069509810L;

	private Long departmentId;
     
    private String departmentName;
     
    public DepartmentDTO() {

	}
    
	public DepartmentDTO(String departmentName) {
		super();
		
		this.departmentName = departmentName;
	}

	/**
	 * @return the departmentId
	 */
	public Long getDepartmentId() {
		return departmentId;
	}

	/**
	 * @param departmentId the departmentId to set
	 */
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DepartmentDTO [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}

}