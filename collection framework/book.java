public class book{
    private int id;
    private String title;
    private String author;
    private float price;
    public book (int id, String title, String author, float price){
        super ();
        this.id=id;
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public int getid(){
        return id;
    }
    public String gettitle(){
      return title;  
    }
    public String getauthor(){
        return author;  
    }
    public float getprice(){
        return  price;  
     }
     
}