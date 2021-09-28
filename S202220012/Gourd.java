package S202220012;

import S202220012.Line.Position;

import java.util.Random;

public class Gourd implements Linable {

    private final int r;
    private final int g;
    private final int b;

    private Position position;

    private final int rank;

    Gourd(int rank) {
        Random random = new Random();
        if (rank < 86) {
            this.r = 255 - rank * 2;
            this.g = random.nextInt(50) + 100;
            this.b = random.nextInt(50) + 100;
        } else if (rank < 170) {
            this.r = random.nextInt(50) + 100;
            this.g = 255 - (rank - 85) * 2;
            this.b = random.nextInt(50) + 100;
        } else {
            this.r = random.nextInt(50) + 100;
            this.g = random.nextInt(50) + 100;
            this.b = 255 - (rank - 169) * 2;
        }
        this.rank = rank;
    }

    public int rank() {
        return this.rank;
    }

    @Override
    public String toString() {
        String temp = "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m    ";
        if (this.rank() < 10) temp += this.rank() + "    \033[0m";
        else if (this.rank() < 100) temp += this.rank() + "   \033[0m";
        else temp += this.rank() + "  \033[0m";
//        return "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m    " + this.rank() + "  \033[0m";
        return temp;
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    public void swapPosition(Gourd another) {
        Position p = another.position;
        this.position.setLinable(another);
        p.setLinable(this);
    }

    @Override
    public int getValue() {
        return this.rank();
    }

}