      class Author
      {
      	String name;
      	String email;
      	char gender;
      	
      	Author(String name,String email,char gender)
      	{
      		this.name = name;
      		this.email = email;
      		this.gender = gender;
      	}
               }
      
      class Book
      {
      	String name;
      	Author author;
      	double price;
      	int qtyInStock;
      	
      	Book(String name,Author author,double price,int qtyInStock)
      	{
      		this.name = name;
      		this.author = author;
      		this.price = price;
      		this.qtyInStock = qtyInStock;
      	}
      	
      	void setName(String name)
      	{
      		this.name = name;
      	}
      	
      	void setAuthor(Author author)
      	{
      			this.author = author;
      	}
      	
      	void setPrice(double price)
      	{
      		this.price = price;
      	}
      	
      	void setQtyInStock(int qtyInStock)
      	{
      		this.qtyInStock = qtyInStock;
      	}
      	
      	String getName()
      	{
      		return name;
      	}
      	
      	String getAuthor()
      	{
      		return "Author Name:"+author.name+"\n Email:"+author.email+"\n Gender:"+author.gender ;
      	}
      	
      	double getPrice()
      	{
      		return price;
      	}
      	
      	int getQtyInStock()
      	{
      		return qtyInStock;
      	}	
      }
      
      public class HOA1
      {
      	public static void main(String[] args)
      	{
      		Author author = new Author("Javed","javedansarirnc@gmail.com",'M');
      		Book book = new Book("WiproS",author,500.99,3);
      		Author auth = new Author("Javed","javedansarirnc@live.com",'m');
            book.setAuthor(auth);
      		System.out.println("Book Name:" + book.getName());
            String authDetails = book.getAuthor();
            System.out.println(authDetails);
      		      		
      		
      	}
      }