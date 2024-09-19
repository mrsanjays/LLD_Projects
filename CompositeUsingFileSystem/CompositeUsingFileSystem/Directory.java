package CompositeUsingFileSystem;

import java.util.HashSet;
import java.util.Set;

public class Directory implements FileSystem {
	private String directoryName;
	private Set<FileSystem> filesList;
	
	public Directory(String name) {
		this.directoryName = name;
		filesList = new HashSet<>();
		
		System.out.println(directoryName +" Directory Created !");
	}
	public void add(FileSystem file) {
		filesList.add(file);
		System.out.println("Added Under : "+ this.directoryName);
	}
	
	public void ls() {
	    System.out.println("\n+----------------------------------+");
	    System.out.printf("| %-32s |\n", "Directory Name: " + this.directoryName);  // Align the directory name
	    System.out.println("+----------------------------------+");
	    for (FileSystem file : filesList) {
	        file.ls();  
	    }
	    System.out.println("+----------------------------------+\n");
	}



}
