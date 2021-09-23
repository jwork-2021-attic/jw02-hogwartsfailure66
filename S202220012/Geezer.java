package S202220012;

import S202220012.Gourd;
import S202220012.Linable;
import S202220012.Line;

public class Geezer {

    private static Geezer theGeezer;

    public static Geezer getTheGeezer() {
        if (theGeezer == null) {
            theGeezer = new Geezer();
        }
        return theGeezer;
    }

    private Geezer() {

    }

    private Sorter sorter;

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    public String lineUp(Line line) {

        String log = new String();

        if (sorter == null) {
            return null;
        }

        Linable[] linables = line.toArray();
        int[] ranks = new int[linables.length];

        for (int i = 0; i < linables.length; i++) {
            ranks[i] = linables[i].getValue();
        }

//        for (int i = 0; i < 7; i++) {
//            System.out.print(ranks[i]+" ");
//        }

        sorter.load(ranks);
        sorter.sort();

        String[] sortSteps = this.parsePlan(sorter.getPlan());

        for (String step : sortSteps) {
//            System.out.println(step);
            this.execute(step, line);
            System.out.println(line.toString());
            log += line.toString();
            log += "\n[frame]\n";
        }

        return log;

    }

    private String[] parsePlan(String plan) {
        return plan.split("\n");
    }

    private void execute(String step, Line line) {
        String[] couple = step.split("<->");
//        for (String c : couple
//        ) {
//            System.out.println(c);
//        }
        int pos0 = Integer.parseInt(couple[0]);
        int pos1 = Integer.parseInt(couple[1]);
//        System.out.println(pos0);
        Gourd gourd0 = (Gourd) line.get(pos0);
        Gourd gourd1 = (Gourd) line.get(pos1);
        gourd0.swapPosition(gourd1);
    }

}
