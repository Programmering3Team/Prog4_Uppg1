package files;

public class FileTree {
	private Folder rootFolder;
	
	public FileTree() {
		rootFolder = new Folder("All Sound Clips", null, true);
	}
	
	public void createFolder(Folder parent) {
		Folder folder = new Folder("", parent, false);
	}
	
	public void createSoundClip() {
		
	}

}
