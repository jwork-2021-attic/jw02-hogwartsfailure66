package S202220012;

public class Matrix extends Line{
    public Matrix(int length){
        super(length);
    }

    @Override
    public String toString() {
        String lineString = "\t";
        int cnt = 0;
        Position[] positions = this.getPositions();
        for (Position p : positions) {
            cnt++;
            if (cnt > 16) {
                cnt = 1;
                lineString += "\n\t";
            }
            lineString += p.getLinable().toString();
        }
        return lineString;
    }
}
