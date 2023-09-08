package java_study.ch7;

public class DrawShape {
    public static void main(String[] args) {
        Point[] p = {
                new Point(100,100),
                new Point(140,50),
                new Point(200,100)
        };
        Triangle t = new Triangle(p);
        Circle c = new Circle(new Point(150,150),50);

        t.draw(); // 삼각형을 그린다
        c.draw(); // 원을 그린다.

    }
}


class Shape{
    String color = "black"; // iv

    void draw(){
        System.out.printf("[color=%s]%n",color);
    }

}

class Point{
    int x; // iv (자동으로 0으로 초기화됨)
    int y; // iv (자동으로 0으로 초기화됨)

    Point(int x, int y){ // 생성자
        this.x = x;
        this.y = y;
    }
    Point(){ // 생성자
        this(0,0); // 위에 생성자를 호출
    }

    String getXY(){ // method
        return "("+x+" , "+y +" )"; // x,y 를 문자열로 return
    }
}

class Circle extends Shape{ // Shape class 를 상속받음으써 Shape 의 멤버인 color 와 draw() 를 멤버로 갖음.
    Point center; // 원의 좌표. - Point class 를 포함관계로 갖음.
    int r; // 반지름

    Circle(){ // 생성자 -> 밑에서 선언한 생성자를 이용해서 멤버 변수를 모두 0과 100으로 초기화
        this(new Point(0,0),100);
    }

    Circle(Point center,int r){ // 생성자 -> Point 변수과, int 변수를 모두 매개변수로 받음.
        this.center = center;
        this.r = r;
    }

    void draw(){
        System.out.printf("[center=(%d,%d), r=%d, color=%s]%n",
                center.x,center.y,r,color);

    }
}

class Triangle extends Shape{ // Shape class 를 상속받음으써 Shape 의 멤버인 color 와 draw() 를 멤버로 갖음.
    Point[] p = new Point[3]; // Point 클래스 배열을 포함

    Triangle(Point[] p) { // 생성자
        this.p = p;
    }
        void draw(){
            System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n",
                    p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
        }
}
