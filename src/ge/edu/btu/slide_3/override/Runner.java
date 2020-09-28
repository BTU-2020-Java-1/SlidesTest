package ge.edu.btu.slide_3.override;

public class Runner {

    public static void main(String[] args) {
        Figure figure1 = new Rectangle(4, 5);
        Figure figure2 = new Circle(3);
        double totalArea = figure1.area() + figure2.area();
        System.out.println("სრული ფართობია: " + totalArea);

        Figure[] figures = new Figure[100];
        figures[0] = new Rectangle(4, 5);
        figures[1] = new Circle(3);

        double area = 0;
        for (int i = 0; i < 2; i++) {
            area = area + figures[i].area();
        }
        System.out.println(area);
    }
}

