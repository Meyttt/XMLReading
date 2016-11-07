package Logic;

import java.util.ArrayList;

/**
 * Created by Admin on 28.10.2016.
 */
public class ArmLine {
    public ArmLine(String currentArmNumber, Condition condition, ArrayList<Statement> statements) {
        this.currentArmNumber = currentArmNumber;
        this.condition = condition;
        this.statements = statements;
    }
    public void printLine(){
        //System.out.println("current arm: "+currentArmNumber);
        System.out.println("conditon: "+"\n"+condition);
        System.out.println("statements: ");
        for(int i=0;i<statements.size();i++){
            System.out.println(statements.get(i));
        }
    }
    String currentArmNumber;
    Condition condition;
    ArrayList<Statement> statements;

}
