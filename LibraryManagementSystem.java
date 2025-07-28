//Question requrements given in EmployeeManagentSystem.txt in the same folder OOP_precticeFiles.

class LibraryItem {
    private String title;
    private int itemId;

    public LibraryItem(String title, int itemId) {
        this.title = title;
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public int getItemId() {
        return itemId;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Item ID: " + itemId);
    }
}


class Book extends LibraryItem {
    private String author;

    public Book(String title, int itemId, String author) {
        super(title, itemId); 
        this.author = author;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + author);
        System.out.println("Type: Book\n");
    }
}


class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, int itemId, int issueNumber) {
        super(title, itemId);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Issue No: " + issueNumber);
        System.out.println("Type: Magazine\n");
    }
}


public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[4];

        items[0] = new Book("Java Programming", 101, "Masood Raza");
        items[1] = new Book("OOP in Java", 102, "Luqman Bhatti");
        items[2] = new Magazine("Tech Monthly", 201, 45);
        items[3] = new Magazine("Science Digest", 202, 78);

        for (LibraryItem item : items) {
            item.displayInfo();
        }
    }
}
