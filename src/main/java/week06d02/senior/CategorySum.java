package week06d02.senior;

public class CategorySum {

    private int db;

    private Category fajta;

    public CategorySum(int db, Category fajta) {
        this.db = db;
        this.fajta = fajta;
    }

    public int getDb() {
        return db;
    }

    public Category getFajta() {
        return fajta;
    }

    @Override
    public String toString() {
        return db + " ; "+ fajta+"    ";
    }
}
