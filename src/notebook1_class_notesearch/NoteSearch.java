package notebook1_class_notesearch;

import notebook1_class_note.Note;
import notebook1_class_notebook.Notebook;

import java.util.Date;
import java.util.List;

public class NoteSearch {
    public static void main(String[] args) {

        Notebook notebook = new Notebook();

        notebook.addNote("Заметка 1");
        notebook.addNote("Заметка 2");
        notebook.addNote("Важное событие");

        List<Note> searchByContentResult = notebook.searchNotesByContent("Заметка");
        System.out.println("Результат поиска по содержимому:");
        searchByContentResult.forEach(System.out::println);

        List<Note> searchByDateResult = notebook.searchNotesByDate(new Date());
        System.out.println("\nРезультат поиска по дате создания:");
        searchByDateResult.forEach(System.out::println);

        System.out.println("\nВсе записи в блокноте:");
        notebook.displayNotes();
    }
}