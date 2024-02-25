
// library book management program

public class books {
    String Title;
    String author;
    int publication_year;

    books(String Title,String author,int publication_year){
        this.Title = Title;
        this.author = author;
        this.publication_year = publication_year;
    }

    void getDetails(){
        System.out.println("the title of the book is : "+Title);
        System.out.println("the author of the book is : "+author);
        System.out.println("year of publication : "+publication_year);
    }

    public static void main(String args[]){
        books b1 = new books("physics", "isaac newton", 1960);
        books b2 = new books("mathematics", "ramanujan", 1950);
        books b3 = new books("chemistry", "walter white", 2003);
        b1.getDetails();
        System.out.println("----------------------------");
        b2.getDetails();
        System.out.println("----------------------------");
        b3.getDetails();
    }
}

class author{
    String Author;
    String Biography;

    author(String Author,String Biography){
        this.Author = Author;
        this.Biography = Biography;
    }

    void getDetails(){
        System.out.println("the author name is : "+Author);
        System.out.println("biography : "+Biography);
    }

}

class library extends books{
    
    library(String Title,String author,int publication_year){
        super(Title, author, publication_year);
    }


}
