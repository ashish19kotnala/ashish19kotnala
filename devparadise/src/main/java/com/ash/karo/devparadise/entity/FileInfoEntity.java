package com.ash.karo.devparadise.entity;

import java.io.Serializable;

import com.ash.karo.devparadise.validator.ValidEmail;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FileInfoEntity implements Serializable{

	private static final long serialVersionUID = 4932021271040415316L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer fileid;
	
	@Getter
	@Setter
	private String filename;
	
	@Getter
	@Setter
	private String location;
	
	@Getter
	@Setter
	@ValidEmail
	private String email;
}
