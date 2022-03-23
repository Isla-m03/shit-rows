package shit.rows;

import java.util.ArrayList;

public class blocktexty {
    
    private ArrayList<String> blockytext;

    public blocktexty() {
        this.blockytext = new ArrayList<>();
        this.blockytext.add("0010");
        this.blockytext.add("1111");
        this.blockytext.add("1000");
        this.blockytext.add("1110");
    }

    public ArrayList<String> getBlocktexty() {
        return blockytext;
    }
    
    public void shiftRows(){
       String tempNibble = "";
       
       tempNibble = getBlocktexty().get(2);
       
       getBlocktexty().set(2, getBlocktexty().get(3));
       getBlocktexty().set(3, tempNibble);
    }
}
