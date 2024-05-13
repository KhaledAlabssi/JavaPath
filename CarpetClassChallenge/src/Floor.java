public class Floor {
    private double width;
    private double height;

    public Floor(double width, double height) {
        this.width = width;
        this.height = height;
        if(width < 0){
            this.width = 0;
        }
        if (height < 0) {
            this.height = 0;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea () {
        double result = this.height * this.width;
        return result;
    }
}
