package com.ash.karo.devparadise.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ash.karo.devparadise.entity.FileInfoEntity;

@Repository
public interface FileRepository extends JpaRepository<FileInfoEntity, Integer>{

	//public FileInfoEntity findByFileId(String fileid);

}
