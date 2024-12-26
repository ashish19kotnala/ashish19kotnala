package com.ash.karo.devparadise.service;

import java.util.List;
import java.util.Optional;

import com.ash.karo.devparadise.entity.FileInfoEntity;

public interface FileInfoService {

	public Optional<FileInfoEntity> extractFileInfo(int fileid);

	public FileInfoEntity updateFileInfo(int fileid);

	FileInfoEntity saveFileInfo(FileInfoEntity fileInfoEntity);

	public Optional<List<FileInfoEntity>> extractAllFileInfo();
}
