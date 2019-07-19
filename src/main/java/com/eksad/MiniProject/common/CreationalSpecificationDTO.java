package com.eksad.MiniProject.common;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
	public class CreationalSpecificationDTO implements Serializable {

	    /**
	 * ;
	 */
	private static final long serialVersionUID = 1L;
		private String createdBy;
	    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = "GMT+7")
	    private Date createdDate;
	    private String modifiedBy;
	    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = "GMT+7")
	    private Date modifiedDate;

	    @JsonIgnore
	    public CreationalSpecificationDTO getInstance() {
	        CreationalSpecificationDTO creationalSpecificationDTO = new CreationalSpecificationDTO();
	        creationalSpecificationDTO.setCreatedDate(new Date());
	        creationalSpecificationDTO.setCreatedBy("SYSTEM");
	        return creationalSpecificationDTO;
	    }

	}
