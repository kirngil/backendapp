package com.example.backendapp.Repository;

import com.example.backendapp.model.Album;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlbumRep {
    List<Album> albumList = new ArrayList();

    public List<Album> allAlbums() {
        return albumList;
    }

    public Album saveAlbum( Album album) {
        album.setAlbumId(albumList.size() + 1);
        albumList.add(album);
        return album;
    }

    public Album albumById(int albumID) {
        for(Album a : albumList){
            if(a.getAlbumId()==albumID){
                return a;
            }
        }
        return null ;
    }

    public Album updateAlbum(int albumID, Album a) {
        for(Album al : albumList){
            if(al.getAlbumId()==albumID){
                al.setName(a.getName());
                al.setDescription(a.getDescription());
                al.setCoverPicUrl(a.getCoverPicUrl());
                return al;
            }
        }
        return null;
    }

    public Album delete(int albumid) {
        Album dltAl ;
        for(Album alb : albumList){
            if(alb.getAlbumId()==albumid){
                dltAl=alb;
                albumList.remove(alb);
                return dltAl;
            }
        }
        return null;
    }
}
