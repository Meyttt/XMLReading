package Logic;

import java.util.ArrayList;

/**
 * Created by master on 31.10.2016.
 */
public class Arm {
    String currentNodeNumber;
    ArrayList<ArmLine> lines;
    public Arm(String currentNodeNumber, ArrayList<ArmLine> lines) {
        this.currentNodeNumber = currentNodeNumber;
        this.lines = lines;
    }
    public void printArm(){
        System.out.println("current arm: "+currentNodeNumber);
        System.out.println("armLines:");
        for(ArmLine armLine:lines){
            armLine.printLine();
        }
    }


}
