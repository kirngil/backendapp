package com.example.backendapp.resource;

import com.example.backendapp.Service.AlbumService;
import com.example.backendapp.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlbumResource {
    @Autowired
    private AlbumService albumService;
    @GetMapping("/album")
    public List<Album> allAlbums(){
        return albumService.allAlbums();
    }
    @GetMapping("album/{albumID}")
    public Album albumById(@PathVariable("albumID") int albumID){
        return albumService.albumById(albumID);
    }

    @PutMapping("album/{albumID}")
    public Album updateAlbum(@PathVariable("albumID") int albumID, @RequestBody Album a){
        return albumService.updateAlbum(albumID, a);
    }
    @PostMapping("/album")
    public Album saveAlbum(@RequestBody Album album){
      return albumService.saveAlbum(album);
    }
    @DeleteMapping()
    public Album delete(@RequestParam(name="albumid") int albumid){
   return albumService.delete(albumid);
    }
}
