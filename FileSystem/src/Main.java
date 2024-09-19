import CompositeUsingFileSystem.*;

public class Main {
	/*
	Module1: Create a new directory and file in all Levels.
	Module2: List all directories and files.
	Module3: Update file content.
	Module4: Update directory and file names.
	Module5: Delete directory and file.
	Module6: Restore deleted directories and files.
	 */
    public static void main(String[] args) {
        
        Directory movieDirectory = new Directory("Movies");
        Directory englishMovies = new Directory("EnglishMovies");
        File movie1 = new File("Inception.mp4");
        File movie2 = new File("Interstellar.mp4");

        // Module 1: Adding files and directories
        englishMovies.add(movie1);
        englishMovies.add(movie2);
        movieDirectory.add(englishMovies);

        // Module 2: List all directories and files
        movieDirectory.ls();

        // Module 3: Update file content
        movie1.updateContent("Inception movie content...");
        movie1.updateContent("New content for Inception");
        movie1.undoContentChange();  // Restoring the previous content

        // Module 4: Update directory and file names
        englishMovies.changeName("English Blockbusters");
        movie1.changeName("Inception_2010.mp4");

        // Module 5: Delete file
        englishMovies.delete(movie2);
        movieDirectory.ls();  // Listing after deletion

        // Module 6: Restore deleted file
        englishMovies.restore();
        movieDirectory.ls();  // Listing after restoring
    }
}