package com.example.backendapp.Service;

import com.example.backendapp.Repository.AlbumRep;
import com.example.backendapp.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {
    @Autowired
    private AlbumRep albumRep ;

    public List<Album> allAlbums() {
        return albumRep.allAlbums();
    }

    public Album saveAlbum(Album album) {
        return albumRep.saveAlbum(album);
    }

    public Album albumById(int albumID) {
        return albumRep.albumById(albumID);
    }

    public Album updateAlbum(int albumID, Album a) {
        return albumRep.updateAlbum(albumID, a);
    }

    public Album delete(int albumid) {
        return albumRep.delete(albumid);
    }
}
