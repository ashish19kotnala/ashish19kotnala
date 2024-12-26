package com.ash.karo.devparadise.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FileInfo {

	private String fileid;
	private String filename;
	private String location;
	
}
