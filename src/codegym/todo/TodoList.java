package codegym.todo;

public class TodoList {
    private Entry[] list = new Entry[100];

    public void showTodoList() {
        for (Entry entry : list
        ) {
            if (entry != null)
                System.out.println("NoteID: " + entry.getId() + " Notes: " + entry.getNotes());
        }
    }

    public void addEntry(Entry entry) {
        list[Entry.count - 1] = entry;
        Entry.count++;
    }

    public void removeEntry(int id) {
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getId() == id) {
                index = i;
                break;
            }
        }

        for (int i = index; i < list.length - 1; i++) {
            list[i] = list[i + 1];
        }
    }

    public Entry getEntryByID(int id) {
        int index = 0;
        for (int i = 0; i < list.length - 1; i++)
            if (list[i] != null) {
                if (id == list[i].getId()) {
                    index = i;
                    break;
                }
            }
        System.out.println(list[index]);
        return list[index];
    }

    public void sortList() {
        Entry entry = new Entry();
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i + 1] != null) {
                if (list[i].getId() > list[i + 1].getId()) {
                    entry = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = entry;
                }
            }
        }
    }
}
