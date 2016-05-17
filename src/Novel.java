/**
 * Created by jonathandavidblack on 5/16/16.
 */
public class Novel {

    int yearWritten;
    String author;
    String genre;
    boolean isCaptivating;
    int numberOfPages;
    boolean haveRead;

    public Novel(int yearWritten, String author, String genre, boolean isCaptivating, int numberOfPages, boolean haveRead){
        this.yearWritten = yearWritten;
        this.author = author;
        this.genre = genre;
        this.isCaptivating = isCaptivating;
        this.numberOfPages = numberOfPages;
        this.haveRead = haveRead;
    }
    public int getYearWritten(){
        return yearWritten;
    }
    public void setYearWritten(int yearWritten){
        this.yearWritten = yearWritten;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        if(author.contains("King"))
        this.author = author;
    }
    public void setIsCaptivating(boolean isCaptivating){
        this.isCaptivating = isCaptivating;
    }
    public boolean getIsCaptivating(){
        return isCaptivating;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
    public boolean getHaveRead(){
        return haveRead;
    }
    public int getNumberOfPages(){
        return numberOfPages;
    }
    public void setHaveRead(boolean haveRead){
        this.haveRead = haveRead;
    }
    public String getGenre(){
        return genre;
    }
}
