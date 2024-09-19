package CompositeUsingFileSystem;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Directory implements FileSystem {
	private String directoryName;
	private Set<FileSystem> filesList;
	private Stack<FileSystem> recycleBin;
	
	public Directory(String name) {
		this.directoryName = name;
		filesList = new HashSet<>();
		recycleBin = new Stack<>();
		
		System.out.println(directoryName +" Directory Created !");
	}
	
	public void changeName(String newName) { // change name 
		System.out.println(getName()+"Name changed to "+ newName);
		this.directoryName = newName;
		
	}
	public void add(FileSystem file) {
		filesList.add(file);
		System.out.println("Added Under : "+ this.directoryName);
	}
	
	public void delete(FileSystem file) { // remove from Stack and add to recycle bin
		if(filesList.contains(file)) { 
			
			filesList.remove(file);
			recycleBin.push(file);
		}
		else {
			System.out.println("No Such File/Directory Found");
		}
		
	}
	public void restore() {
		if(!recycleBin.isEmpty()) {
			FileSystem lastDeletedItem = recycleBin.pop();
			filesList.add(lastDeletedItem);
			System.out.println(lastDeletedItem.getName() + " was  Restored in " + this.directoryName);
		}
		else {
			System.out.println("No items in Recycle Bin");
		}
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

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.directoryName + " Directory ";
	}



}
