package shit.rows;

import java.util.ArrayList;

public class ShitRows {

   
    public static void main(String[] args) {
        
        ArrayList<String> blocktext = new ArrayList<>(); //from our encryption working
        blocktext.add("0010");
        blocktext.add("1111");
        blocktext.add("1000");
        blocktext.add("1110");

        //shiftRows(blocktext);
        
        System.out.println(shiftRows(blocktext));
        
        blocktexty srTest = new blocktexty();
        
        System.out.println(srTest.getBlocktexty());
        
        srTest.shiftRows();
        
        System.out.println(srTest.getBlocktexty());

    }
   
    public static ArrayList<String> shiftRows(ArrayList<String>blocktext) {
       String tempNibble = "";
       
       tempNibble = blocktext.get(2);
       
       blocktext.set(2, blocktext.get(3));
       blocktext.set(3, tempNibble);
       
       return blocktext;
    }

}
