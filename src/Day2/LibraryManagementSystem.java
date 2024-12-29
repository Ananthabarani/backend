package Day2;
import java.util.ArrayList;
import java.util.List;
public class LibraryManagementSystem {

        static class Book {
            private String title;
            private String author;
            private String isbn;
            private boolean isAvailable;

            public Book(String title, String author, String isbn) {
                this.title = title;
                this.author = author;
                this.isbn = isbn;
                this.isAvailable = true;
            }

            public String getTitle() {
                return title;
            }

            public String getAuthor() {
                return author;
            }

            public String getIsbn() {
                return isbn;
            }

            public boolean isAvailable() {
                return isAvailable;
            }

            public void setAvailable(boolean available) {
                isAvailable = available;
            }

            @Override
            public String toString() {
                return "Book{" +
                        "title='" + title + '\'' +
                        ", author='" + author + '\'' +
                        ", isbn='" + isbn + '\'' +
                        ", isAvailable=" + isAvailable +
                        '}';
            }
        }

        static class Member {
            private String name;
            private String memberId;
            private List<Book> borrowedBooks;

            public Member(String name, String memberId) {
                this.name = name;
                this.memberId = memberId;
                this.borrowedBooks = new ArrayList<>();
            }

            public String getName() {
                return name;
            }

            public String getMemberId() {
                return memberId;
            }

            public List<Book> getBorrowedBooks() {
                return borrowedBooks;
            }

            public void borrowBook(Book book) {
                borrowedBooks.add(book);
            }

            public void returnBook(Book book) {
                borrowedBooks.remove(book);
            }

            @Override
            public String toString() {
                return "Member{" +
                        "name='" + name + '\'' +
                        ", memberId='" + memberId + '\'' +
                        ", borrowedBooks=" + borrowedBooks +
                        '}';
            }
        }

        static class Librarian {
            private String name;
            private List<Book> books;
            private List<Member> members;

            public Librarian(String name) {
                this.name = name;
                this.books = new ArrayList<>();
                this.members = new ArrayList<>();
            }

            public void addBook(Book book) {
                books.add(book);
            }

            public void removeBook(Book book) {
                books.remove(book);
            }

            public void registerMember(Member member) {
                members.add(member);
            }

            public void lendBook(String isbn, String memberId) {
                Book bookToLend = findBookByIsbn(isbn);
                Member borrowingMember = findMemberById(memberId);
                if (bookToLend != null && borrowingMember != null && bookToLend.isAvailable()) {
                    bookToLend.setAvailable(false);
                    borrowingMember.borrowBook(bookToLend);
                    System.out.println("Book lent successfully!");
                } else {
                    System.out.println("Book is not available or Member not found!");
                }
            }

            public void returnBook(String isbn, String memberId) {
                Book bookToReturn = findBookByIsbn(isbn);
                Member returningMember = findMemberById(memberId);
                if (bookToReturn != null && returningMember != null) {
                    bookToReturn.setAvailable(true);
                    returningMember.returnBook(bookToReturn);
                    System.out.println("Book returned successfully!");
                } else {
                    System.out.println("Book or Member not found!");
                }
            }

            private Book findBookByIsbn(String isbn) {
                for (Book book : books) {
                    if (book.getIsbn().equals(isbn)) {
                        return book;
                    }
                }
                return null;
            }

            private Member findMemberById(String memberId) {
                for (Member member : members) {
                    if (member.getMemberId().equals(memberId)) {
                        return member;
                    }
                }
                return null;
            }

            public void listBooks() {
                System.out.println("Books in the library:");
                for (Book book : books) {
                    System.out.println(book);
                }
            }

            public void listMembers() {
                System.out.println("Registered Members:");
                for (Member member : members) {
                    System.out.println(member);
                }
            }
        }
        public static void main(String[] args) {
            Librarian librarian = new Librarian("Alice");
            librarian.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890"));
            librarian.addBook(new Book("1984", "George Orwell", "0987654321"));
            librarian.registerMember(new Member("John Doe", "MEM001"));
            librarian.registerMember(new Member("Jane Smith", "MEM002"));
            librarian.listBooks();
            librarian.listMembers();
            librarian.lendBook("1234567890", "MEM001");
            librarian.listBooks();
            librarian.listMembers();
            librarian.returnBook("1234567890", "MEM001");
            librarian.listBooks();
            librarian.listMembers();
        }
    }


