package com.ash.karo.devparadise.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FileInfoResponse {

	private String fileid;
	private String filename;
	private String location;
}
