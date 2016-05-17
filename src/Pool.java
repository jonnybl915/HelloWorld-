/**
 * Created by jonathandavidblack on 5/16/16.
 */
public class Pool {
    int depth;
    double length;
    boolean isAboveGround;

    public Pool(int depth, double length, boolean isAboveGround){
        this.depth = depth;
        this.length = length;
        this.isAboveGround = isAboveGround;
    }
    public int getDepth(){
        return depth;
    }
    public void setDepth(int setDepth){
        if(depth > 20)
        this.depth = setDepth;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double setLength){
        this.length = setLength;
    }
    public boolean getIsAboveGround(){
        return isAboveGround;
    }
    public void setIsAboveGround(boolean setIsAboveGround){
        this.isAboveGround = setIsAboveGround;
    }
}
