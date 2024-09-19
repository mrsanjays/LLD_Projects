
import CompositeUsingFileSystem.*;
public class MainForFileSystem { 
	/*
	 * Object Inside Object - Composite Design Pattern
	 * Whenever tree based structure forms use this
	 * 
	 * File system using Composite
	 *                      Directory
	 *                       /      \
	 *         Another Directory   Another Directory
	 *              /      \         /      \
	 *            File     file   File     file
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Directory movieDirectory = new Directory("Movies");
		
		Directory englishMovies = new Directory("English Movies");
		FileSystem englishMovie1 = new File("Inception.mp4");
	    FileSystem  englishMovie2 = new File("Interstellar.mp4");
		englishMovies.add(englishMovie1);
		englishMovies.add(englishMovie2);
		
		Directory hindiMovies = new Directory("Hindi Movies");
		FileSystem hindiMovie1 = new File("Chhichhore.mp4");
	    FileSystem hindiMovie2 = new File("Rab Ne Bana Di Jodi.mp4");
	    hindiMovies.add(hindiMovie1);
	    hindiMovies.add(hindiMovie2);
		
	    movieDirectory.add(englishMovies);
		movieDirectory.add(hindiMovies);
		
		movieDirectory.ls();

	}

}
