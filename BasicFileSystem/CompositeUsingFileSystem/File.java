package CompositeUsingFileSystem;

public class File implements FileSystem {
	private String fileName;
	public File( String fileName) {
		this.fileName = fileName;
		
		System.out.println(fileName +" File Created");
	}

	@Override
	public void ls() {
		
		System.out.println("File Name " + this.fileName);
		
	}

}
