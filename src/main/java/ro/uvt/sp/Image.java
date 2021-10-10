package ro.uvt.sp;

public class Image implements Element {
    private final String imageName;

    public Image(String imageName){
        this.imageName = imageName;
    }

    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Image{" +
                "imageName='" + imageName + '\'' +
                '}';
    }
}
