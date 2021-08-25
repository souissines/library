package tech.geterrays.bookmnager.book.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;


@Entity
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)

    private Long id;
    private String title;

    private LocalDate releaseDate;

    private LocalDate registerDate;
    private Long totalExamplaries;
    private String author;

    private String imageUrl;
    private String data;

    public Book() {
    }

    public Book(Long id, String title, LocalDate releaseDate, LocalDate registerDate,
                Long totalExamplaries, String author, String imageUrl, String data) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.registerDate = registerDate;
        this.totalExamplaries = totalExamplaries;
        this.author = author;
        this.imageUrl = imageUrl;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    public Long getTotalExamplaries() {
        return totalExamplaries;
    }

    public void setTotalExamplaries(Long totalExamplaries) {
        this.totalExamplaries = totalExamplaries;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getdata() {
        return data;
    }

    public void setdata(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", registerDate='" + registerDate + '\'' +
                ", totalExamplaries='" + totalExamplaries + '\'' +
                ", author='" + author + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", data='" + data + '\'' +
                '}';

    }

}
