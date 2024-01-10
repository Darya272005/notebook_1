package notebook1_class_note;

import java.util.Date;

public class Note {
	private String content;
	private Date creationDate;

	public Note(String content) {
		this.content = content;
		this.creationDate = new Date();
	}

	public String getContent() {
		return content;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	@Override
	public String toString() {
		return "Note{" + "content='" + content + '\'' + ", creationDate=" + creationDate + '}';
	}
}