package notebook1_class_notebook;

import notebook1_class_note.Note;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Notebook {
    private List<Note> notes;

    public Notebook() {
        this.notes = new ArrayList<>();
    }

    public void addNote(String content) {
        Note newNote = new Note(content);
        notes.add(newNote);
    }

    public List<Note> searchNotesByContent(String searchContent) {
        List<Note> result = new ArrayList<>();
        for (Note note : notes) {
            if (note.getContent().contains(searchContent)) {
                result.add(note);
            }
        }
        return result;
    }

    public List<Note> searchNotesByDate(Date searchDate) {
        List<Note> result = new ArrayList<>();
        for (Note note : notes) {
            if (note.getCreationDate().equals(searchDate)) {
                result.add(note);
            }
        }
        return result;
    }

    public void displayNotes() {
        for (Note note : notes) {
            System.out.println(note);
        }
    }
}