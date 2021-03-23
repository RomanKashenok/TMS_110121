package com.tms.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Builder
@ToString
@Data
public class Book {
    private int id;
    private String name;
    private List<Author> authors;
    private String genre;
    private String isbn;
}
