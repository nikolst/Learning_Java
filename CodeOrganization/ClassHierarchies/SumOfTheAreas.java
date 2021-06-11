class Sum {
    public static int sumOfAreas(Shape[] array) {
        // write your code here
        int sum = 0;
        for (Shape s : array) {
            if (s.getClass() == Shape.class) {
                sum += 0;
            } else if (s.getClass() == Square.class) {
                sum = sum + (((Square) s).getSide() * ((Square) s).getSide()); 
            } else if (s.getClass() == Rectangle.class) {
                sum = sum + (((Rectangle) s).getWidth() * ((Rectangle) s).getHeight());
            }
        }
        return sum;
    }
}

//Don't change the code below
class Shape {
}

class Square extends Shape {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
