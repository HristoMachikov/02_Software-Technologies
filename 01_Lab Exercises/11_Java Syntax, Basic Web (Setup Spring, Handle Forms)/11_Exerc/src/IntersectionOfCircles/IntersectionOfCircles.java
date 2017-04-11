package IntersectionOfCircles;

import java.util.Arrays;
import java.util.Scanner;

    public class IntersectionOfCircles {

        public static void main(String[] args) {
            class Point {
                private int X;
                private int Y;

                public Point(int x, int y) {
                    X = x;
                    Y = y;
                }

                public int getX() {
                    return X;
                }

                public void setX(int x) {
                    X = x;
                }

                public int getY() {
                    return Y;
                }

                public void setY(int y) {
                    Y = y;
                }
            }

            class Circle {
                private Point Center;

                private int Radius;

                public Circle(Point center, int radius) {
                    Center = center;
                    Radius = radius;
                }

                public Point getCenter() {
                    return Center;
                }

                public void setCenter(Point center) {
                    Center = center;
                }

                public int getRadius() {
                    return Radius;
                }

                public void setRadius(int radius) {
                    Radius = radius;
                }
            }

            Scanner console = new Scanner(System.in);

            int[] firstCircleArr = Arrays
                    .stream(console.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int[] secondCircleArr = Arrays
                    .stream(console.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            Point centerFirst = new Point(firstCircleArr[0], firstCircleArr[1]);

            Circle firstCircle = new Circle(centerFirst, firstCircleArr[2]);

            Point centerSecond = new Point(secondCircleArr[0], secondCircleArr[1]);

            Circle secondCircle = new Circle(centerSecond, secondCircleArr[2]);

            int horiz = firstCircle.getCenter().getX() - secondCircle.getCenter().getX();
            int vert = firstCircle.getCenter().getY() - secondCircle.getCenter().getY();
            double distence = Math.sqrt(Math.pow(horiz, 2) + Math.pow(vert, 2));
            boolean isIntersect = distence <= firstCircle.getRadius() + secondCircle.getRadius();

            if (isIntersect) {
                System.out.printf("Yes");
            } else {
                System.out.printf("No");
            }
        }

//        private static Boolean IsIntersect(Circle firstCircle, Circle secondCircle) {
//            int horiz = firstCircle.getCenter().getX() - secondCircle.getCenter().getX();
//            int vert = firstCircle.getCenter().getY() - secondCircle.getCenter().getY();
//            double distence = Math.sqrt(Math.pow(horiz, 2) + Math.pow(vert, 2));
//            return distence <= firstCircle.getRadius() + secondCircle.getRadius();
//        }
    }
