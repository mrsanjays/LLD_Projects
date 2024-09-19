package CompositeUsingFileSystem;

public class File implements FileSystem {
	private String fileName;
	private String oldContent;
	private String content;
	
	public File( String fileName) {
		this.fileName = fileName;
		this.oldContent = "";
		this.content ="";
		System.out.println(fileName +" File Created");
	}

	@Override
	public void ls() {
		
		System.out.println("File Name " + this.fileName);
		
	}

	@Override
	public void changeName(String newName) {
		System.out.println(getName() + "Name changed to "+ newName);
		this.fileName = newName;
		
	}
	
	public void updateContent(String newContent) {
		this.oldContent = this.content; // Save the old file
		this.content = newContent;
		System.out.println("Content updated in file: " + this.fileName);
		
	}
	
	 public void undoContentChange() { // undo content change -> copy oldContent to content
        this.content = this.oldContent;
        System.out.println("Content restored to previous state in file: " + this.fileName);
	  }

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.fileName + " File ";
	}

}
