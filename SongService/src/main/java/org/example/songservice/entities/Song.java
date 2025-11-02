package org.example.songservice.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "songs")
public class Song {

    // Använder Long id för lokalt bruk, UUID för extern länkning
    @Id
    @Column(name = "song_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Column(name = "uuid", length = 36)
    @Column(columnDefinition = "char(36)")
    @JdbcTypeCode(SqlTypes.CHAR)
    // @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Column(name = "stream_url", nullable = false, length = 255)
    private String url;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "song_genres", joinColumns = @JoinColumn(name = "song_id"), inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre> genres = new ArrayList<>();

    public Song() {
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
