package com.ash.karo.devparadise.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ash.karo.devparadise.entity.FileInfoEntity;
import com.ash.karo.devparadise.service.FileInfoService;
import com.ash.karo.devparadise.validator.EnableRestCallLogs;
import com.ash.karo.devparadise.validator.ValidEmail;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class FileController {
	
	@Autowired
	private FileInfoService fileService;
	
	@Operation(description = "File extracted", tags = {"File Info"})
	@ApiResponses(value = {
	        @ApiResponse(responseCode = "200", description = "Successful operation"),
	        @ApiResponse(responseCode =  "400", description = "Bad request"),
	        @ApiResponse(responseCode =  "404", description = "File not found")})
	@GetMapping(path = "/fileid")
	@EnableRestCallLogs
	@Cacheable(value = "fileid", key = "#fileid")
	public ResponseEntity<?> extractFileInfo(@RequestHeader(required = false) String header, @RequestParam int fileid) throws Exception {
		System.out.println("GET Controller File");
		Optional<FileInfoEntity> response = fileService.extractFileInfo(fileid);
		if(response.isPresent()) {
			System.out.println("Extracted file info entity : " + response);
		} else {
			System.out.println("NOT Extracted file info entity : " + response);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
		}
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	/*
	@Operation(description = "All File extracted", tags = {"File Info"})
	@ApiResponses(value = {
	        @ApiResponse(responseCode = "200", description = "Successful operation"),
	        @ApiResponse(responseCode =  "400", description = "Bad request"),
	        @ApiResponse(responseCode =  "404", description = "File not found")})
	@GetMapping(path = "/allfileids")
	@EnableRestCallLogs
	@Cacheable(value = "allfileids")
	public ResponseEntity<?> extractAllFileInfo(@RequestHeader(required = false) String header) throws Exception {
		System.out.println("GET Controller File");
		Optional<List<FileInfoEntity>> response = fileService.extractAllFileInfo();
		/*
		 * if(response.isPresent()) { System.out.println("Extracted file info entity : "
		 * + response); } else { System.out.println("NOT Extracted file info entity : "
		 * + response); return
		 * ResponseEntity.status(HttpStatus.NOT_FOUND).body(response); }
		 */
		/*return ResponseEntity.status(HttpStatus.OK).body(response);
	}*/
	
	@PostMapping(path = "/fileid", produces = "application/json", consumes = "application/json")
	@EnableRestCallLogs(enable = true)
	//@Cacheable(value = "product", key = "#fileInfoEntity")
	public ResponseEntity<?> saveFileInfo(@RequestBody @ValidEmail FileInfoEntity fileInfoEntity) {
		System.out.println("SAVING Controller File");
		FileInfoEntity response = fileService.saveFileInfo(fileInfoEntity);
		System.out.println("Saved file info entity : " + response.toString());
		return ResponseEntity.status(HttpStatus.OK).body(response);	
	}
}
