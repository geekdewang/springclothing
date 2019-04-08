package com.zdwsh.springclothing.menu;

public class Menu {
    private Integer id;

    private Integer hId;

    private String hHomepage;

    private String hWoman;

    private String hMan;

    private String hBlogs;

    private String hWebpage;

    private String hLink;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
    }

    public String gethHomepage() {
        return hHomepage;
    }

    public void sethHomepage(String hHomepage) {
        this.hHomepage = hHomepage == null ? null : hHomepage.trim();
    }

    public String gethWoman() {
        return hWoman;
    }

    public void sethWoman(String hWoman) {
        this.hWoman = hWoman == null ? null : hWoman.trim();
    }

    public String gethMan() {
        return hMan;
    }

    public void sethMan(String hMan) {
        this.hMan = hMan == null ? null : hMan.trim();
    }

    public String gethBlogs() {
        return hBlogs;
    }

    public void sethBlogs(String hBlogs) {
        this.hBlogs = hBlogs == null ? null : hBlogs.trim();
    }

    public String gethWebpage() {
        return hWebpage;
    }

    public void sethWebpage(String hWebpage) {
        this.hWebpage = hWebpage == null ? null : hWebpage.trim();
    }

    public String gethLink() {
        return hLink;
    }

    public void sethLink(String hLink) {
        this.hLink = hLink == null ? null : hLink.trim();
    }
}