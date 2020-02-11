class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        double area = length*width;
        return area;
    }
    public double getDiagonal(){
        double diagonal = Math.sqrt(length*length + width*width);
        return diagonal;
    }
    public boolean getSquare(){
        if(length==width){
            return true;
        }
        return false;
    }
}
