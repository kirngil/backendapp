package com.example.backendapp.model;

public class Album {
   private int albumId;
   private String name;
   private String description;
   private String coverPicUrl;

   public Album(String name, String description, String coverPicUrl){
       this.name = name;
       this.description = description;
       this.coverPicUrl=coverPicUrl;
   }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoverPicUrl() {
        return coverPicUrl;
    }

    public void setCoverPicUrl(String coverPicUrl) {
        this.coverPicUrl = coverPicUrl;
    }
   /*
    albumId: int
name:String
description:String
coverPicUrl:String
Create api endpoints for User model (just follow the video to complete)
Create the following rest apis with endpoint:
GET /api/album
Return all albums
GET /api/album/{albumId}
Return the album of specific albumId
POST /api/album
Add a new album
PUT /api/album/{albumId}
Update the album of specific albumId
DELETE /api/album?albumId=
Delete the album

     */
}
