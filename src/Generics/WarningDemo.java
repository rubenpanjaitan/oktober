
import Generics.BoxTest.Box;

public class WarningDemo {
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        
        Box<Integer> bi;
        bi = createBox();
    }

    static Box createBox(){
        return new Box();
    }
}