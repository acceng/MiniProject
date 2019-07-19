package com.eksad.MiniProject.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.eksad.MiniProject.common.BizparCategory;
import com.eksad.MiniProject.common.CreationalSpecification;
import com.eksad.MiniProject.common.DataStatus;

import lombok.Data;

@Data
@Entity
@Table(name = "bizpar")
public class Bizpar {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String key;
	private String value;
	
	@Enumerated(EnumType.STRING)
	private BizparCategory bizparCategory;
	
	@Embedded
	private CreationalSpecification creationalSpec;
	
	@Enumerated(EnumType.STRING)
	private DataStatus dataStatus;
	
}
