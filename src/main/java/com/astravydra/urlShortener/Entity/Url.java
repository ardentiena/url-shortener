package com.astravydra.urlShortener.Entity;

import jakarta.persistence.*;

@Entity
public class Url {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "url_seq")
    @SequenceGenerator(name = "url_seq", sequenceName = "url_id_seq",  allocationSize = 1)
    private Long id;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String longUrl;
    @Column(nullable = false, unique = true)
    private String shortUrl;

    protected Url() {}
    public Url(String longUrl){
        this.longUrl = longUrl;
    }

    public Long getId(){return id;}
    public String getLongUrl(){return longUrl;}
    public String getShortUrl(){return shortUrl;}
    public void setShortUrl(String shortUrl){this.shortUrl = shortUrl;}
}
