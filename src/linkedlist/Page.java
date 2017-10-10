package linkedlist;

public class Page {

	String url;
	String name;
	String header;
	String footer;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getFooter() {
		return footer;
	}
	public void setFooter(String footer) {
		this.footer = footer;
	}
	public Page(String url, String name, String header, String footer) {
		super();
		this.url = url;
		this.name = name;
		this.header = header;
		this.footer = footer;
	}
	
	
	
	
	
}
