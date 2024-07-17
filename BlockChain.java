import java.util.ArrayList;
import com.google.gson.GsonBuilder;  // for converting objects to json 


public class BlockChain {
	
	public static ArrayList<Block> tempchain=new ArrayList<Block>();
	
	
	public static void main(String[] args) {
		
		Block genesisBlock=new Block("Genisis :First Block of Our chain","0");
//		System.out.println("Hash of block 1: "+genesisBlock.hash);
		
		Block secondBlock= new Block("Second Block",genesisBlock.hash);
//		System.out.println("Hash for secod bloc: "+secondBlock.hash);
		
		Block thirdBlock= new Block("Third Block",secondBlock.hash);
//		System.out.println("Hash for third Block: "+thirdBlock.hash);
		
		
	}
}
