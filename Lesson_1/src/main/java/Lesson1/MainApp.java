package Lesson1;

class Human implements IMember {
    String name;
    int maxL;
    int maxH;

    public Human(String name, int maxL, int maxH) {
        this.name = name;
        this.maxL = maxL;
        this.maxH = maxH;
    }

    @Override
    public int getWidth() {
        return maxL;
    }

    @Override
    public int getHeigh() {
        return maxH;
    }

    public void Run() {
        System.out.println(name + " побежал");
    }

    public void Jump() {
        System.out.println(name + " прыгнул");
    }
}

class Robot implements IMember {
    String model;
    int maxL;
    int maxH;

    public Robot(String model, int maxL, int maxH) {
        this.model = model;
        this.maxL = maxL;
        this.maxH = maxH;
    }

    @Override
    public int getWidth() {
        return maxL;
    }

    @Override
    public int getHeigh() {
        return maxH;
    }

    public void Run() {
        System.out.println(model + " робот побежал");
    }

    public void Jump() {
        System.out.println(model + " робот прыгнул");
    }
}

class Cat implements IMember {
    String name;
    int maxL;
    int maxH;

    public Cat(String name, int maxL, int maxH) {
        this.name = name;
        this.maxL = maxL;
        this.maxH = maxH;
    }

    @Override
    public int getWidth() {
        return maxL;
    }

    @Override
    public int getHeigh() {
        return maxH;
    }

    public void Run() {
        System.out.println(name + " кот побежал");
    }

    public void Jump() {
        System.out.println(name + " кот прыгнул");
    }
}

class Treadmill implements IObstacle {
    public int l;

    public Treadmill(int l) {
        this.l = l;
    }

    public boolean Go(IMember member) {
        member.Run();
        if (member.getWidth() >= l) {
            System.out.println(" препятсвие пройдено!");
            return true;
        } else {
            System.out.println(" препятствие не пройдено!");
            return false;
        }
    }

}

class Wall implements IObstacle {
    public int h;

    public Wall(int h) {
        this.h = h;
    }

    public boolean Go(IMember member) {
        member.Jump();
        if (member.getHeigh() >= h) {
            System.out.println(" препятсвие пройдено!");
            return true;
        } else {
            System.out.println(" препятствие не пройдено!");
            return false;
        }
    }
}

interface IObstacle {
    public boolean Go(IMember member);
}

interface IMember {
    public int getWidth();

    public int getHeigh();

    public void Run();

    public void Jump();
}

public class MainApp {
    public static void main(String[] args) {
        IMember[] members = new IMember[]{
                new Human("Василий", 500, 1),
                new Robot("T1000", 600, 5),
                new Cat("Багира", 200, 2)};

        IObstacle[] obstacles = new IObstacle[]{
                new Wall(1),
                new Treadmill(250),
                new Treadmill(300),
                new Wall(2),
                new Wall(5)
        };
        for (int i = 0; i <= members.length - 1; i++) {
            for (int j = 0; j <= obstacles.length - 1; j++) {
                if (obstacles[j].Go(members[i]) != true) {
                    System.out.println("Выбыл!");
                    break;
                }
            }
        }
    }
}










