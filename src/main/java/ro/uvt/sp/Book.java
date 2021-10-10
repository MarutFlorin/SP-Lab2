package ro.uvt.sp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Book {
    private final Collection<Author> authors = new LinkedList<>();
    private final List<Chapter> chapters = new ArrayList<>();
    private final String title;
    private final TableOfContents contents;

    public Book(String title){
        this.title = title;
        this.contents = new TableOfContents(chapters);
    }

    public void addAuthor(Author author){
        authors.add(author);
    }

    public void removeAuthor(Author author){
        authors.remove(author);
    }

    public Collection<Author> getAuthors(){
        return authors;
    }

    public int createChapter(String cTitle){
        Chapter chapter = new Chapter(cTitle);
        chapters.add(chapter);
        int index = chapters.indexOf(chapter);
        contents.addContent(index, chapter);
        return index;
    }

    public Chapter getChapter(int index){
        return chapters.get(index);
    }

    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Book{" +
                "authors=" + authors +
                ", chapters=" + chapters +
                ", title='" + title + '\'' +
                ", contents=" + contents +
                '}';
    }
}
