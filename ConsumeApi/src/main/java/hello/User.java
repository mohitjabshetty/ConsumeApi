package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class User {

	private String id;
	private String content;
	
	
	public User()
	{
		
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		System.out.println("\n''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''\n");
		return "User {counter : " + id + ", name : " + content + "}";		
	}
	
	
}
