package com.astravydra.urlShortener.Repository;

import com.astravydra.urlShortener.Entity.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UrlShortenerRepository extends JpaRepository<Url, Long> {
    Optional<Url> findByLongUrl(String longUrl);
    Optional<Url> findByShortUrl(String shortUrl);
}
