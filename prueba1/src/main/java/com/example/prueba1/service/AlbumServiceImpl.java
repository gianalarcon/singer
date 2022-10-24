package com.example.prueba1.service;

import com.example.prueba1.model.Album;
import com.example.prueba1.model.Singer;
import com.example.prueba1.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService{
  @Autowired
  private AlbumRepository albumRepository;

  @Override
  public Album saveAlbum(Album album) {
    return albumRepository.save(album);
  }

  @Override
  public List<Album> getAllAlbums() {
    return albumRepository.findAll();
  }
}
