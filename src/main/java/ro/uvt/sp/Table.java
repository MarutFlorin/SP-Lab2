package ro.uvt.sp;

public class Table implements Element {
    private final String title;

    public Table(String title){
        this.title = title;
    }

    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Table{" +
                "title='" + title + '\'' +
                '}';
    }
}
