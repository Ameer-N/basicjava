package practice2;
public class BookDetail {
	 String authorName="";
	 String bookName="";
	 double price;
	 int year;
	 public BookDetail(String authorName,String bookName,double price, int year) {
		 if(authorName !=null)
			 this.authorName = authorName;
		 if(bookName !=null)
			 this.bookName = bookName;
         this.price = price;
         this.year = year;
	 }
	 @Override
	public String toString() {
		return authorName+", "+bookName+" ,$"+price+" ,"+ year;
	}
	 public static void main(String[] args) {
		 BookDetail book1 = new BookDetail("Daniel Defoe", "Robinson Crusoe", 15.50, 1719);
		 System.out.println(book1);
		 BookDetail book2 = new BookDetail("Joseph Conrad", "Heart of Darkness", 12.80, 1902);
		 System.out.println(book2);
		 BookDetail book3 = new BookDetail("Pat Conroy", "Beach Music", 9.50, 1996);
		 System.out.println(book3);
	 }
}
