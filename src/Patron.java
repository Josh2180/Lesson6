
public class Patron {

    private String name;
    private Book b1, b2, b3;

    public Patron(String n) {
        name = n;
        b1 = null;
        b2 = null;
        b3 = null;
    }

    public boolean hasBook(Book temp) {
        if (b1 == temp) {
            return true;
        } else if (b2 == temp) {
            return true;
        } else if (b3 == temp) {
            return true;
        } else {
            return false;
        }
    }
    
    public String getName(String n){
        name = n;
        return name;
    }

    public boolean borrow(Book temp) {
        boolean canBorrow = (b1 == null || b2 == null || b3 == null);
        if (canBorrow) {
            if (b1 == null) {
                b1 = temp;
            } else if (b2 == null) {
                b2 = temp;
            } else {
                b3 = temp;
            }
            return true;
        } else {
            return false;
        }
    }
}