package CollectionFramework;

public class Author2 implements Comparable<Author> {   //new addition

	private int id;
	private String name;
	private String book;
	
	public Author2(int id, String name, String book) {
		super();
		this.id = id;
		this.name = name;
		this.book = book;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Author2 [id=").append(id).append(",name=").append(name).append(",bookname=").append("]");
		return super.toString();
	}


	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBook() {
		return book;
	}
	
  //new addition
	public int compareTo(Author2 o)
	{
		return ((name.length()>o.name.length())?1:-1);
	}
}
