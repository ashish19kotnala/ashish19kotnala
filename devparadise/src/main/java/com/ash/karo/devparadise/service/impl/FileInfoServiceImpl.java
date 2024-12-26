package com.ash.karo.devparadise.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ash.karo.devparadise.entity.FileInfoEntity;
import com.ash.karo.devparadise.repository.FileRepository;
import com.ash.karo.devparadise.service.FileInfoService;

@Service
public class FileInfoServiceImpl implements FileInfoService{

	@Autowired
	private FileRepository repository;
	
	@Override
	public Optional<FileInfoEntity> extractFileInfo(int fileid) {
		System.out.println("GET File");
		Optional<FileInfoEntity> entity = repository.findById(fileid);
		return entity;
	}

	@Override
	public FileInfoEntity updateFileInfo(int fileid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileInfoEntity saveFileInfo(FileInfoEntity fileInfoEntity) {
		System.out.println("SAVING File");
		FileInfoEntity file = repository.save(fileInfoEntity);
		return file;
	}

	@Override
	public Optional<List<FileInfoEntity>> extractAllFileInfo() {
		System.out.println("GET All Files");
		Optional<List<FileInfoEntity>> entity = Optional.of(repository.findAll());
		return entity;
	}


	
}
