package com.example.deletelist;

public class SubjectData {
    String SubjectName;
    String Link;
    String Image;
    Boolean isDelete;
    public SubjectData(String subjectName, String link, String image,Boolean isDelete ) {
        this.SubjectName = subjectName;
        this.Link = link;
        this.Image = image;
        this.isDelete=isDelete;
    }
}
