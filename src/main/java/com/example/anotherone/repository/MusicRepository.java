package com.example.anotherone.repository;

import com.example.anotherone.model.MusicModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends JpaRepository<MusicModel, Long> {
}
