package CollectionFramework;

public class Author {

	private int id;
	private String name;
	private String book;
	
	public Author(int id, String name, String book) {
		super();
		this.id = id;
		this.name = name;
		this.book = book;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Author [id=").append(id).append(",name=").append(name).append(",bookname=").append("]");
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
	
}
