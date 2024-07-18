import java.util.ArrayList;
import com.google.gson.GsonBuilder;  // for converting objects to json 


public class BlockChain {
	
	public static ArrayList<Block> tempchain=new ArrayList<Block>();
	
	public static int difficulty = 5;
	
	
	public static void main(String[] args) {

		//		Block genesisBlock=new Block("Genisis :First Block of Our chain","0");
////		System.out.println("Hash of block 1: "+genesisBlock.hash);
//		
//		Block secondBlock= new Block("Second Block",genesisBlock.hash);
////		System.out.println("Hash for secod bloc: "+secondBlock.hash);
//		
//		Block thirdBlock= new Block("Third Block",secondBlock.hash);
////		System.out.println("Hash for third Block: "+thirdBlock.hash);
//		
//		tempchain.add(genesisBlock);
//		tempchain.add(secondBlock);
//		tempchain.add(thirdBlock);
//		
//		String tempchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(tempchain);		
//		System.out.println(tempchainJson);
		
		tempchain.add(new Block("Hi im the first block", "0"));
		System.out.println("Trying to Mine block 1... ");
		tempchain.get(0).mineBlock(difficulty);
		
		tempchain.add(new Block("Yo im the second block",tempchain.get(tempchain.size()-1).hash));
		System.out.println("Trying to Mine block 2... ");
		tempchain.get(1).mineBlock(difficulty);
		
		tempchain.add(new Block("Hey im the third block",tempchain.get(tempchain.size()-1).hash));
		System.out.println("Trying to Mine block 3... ");
		tempchain.get(2).mineBlock(difficulty);	
		
		System.out.println("\ntempchain is Valid: " + isChainValid());
		
		String tempchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(tempchain);
		System.out.println("\nThe block chain: ");
		System.out.println(tempchainJson);
	}
	
	
	
	
	public static Boolean isChainValid() {
		Block currentBlock; 
		Block previousBlock;
		String hashTarget = new String(new char[difficulty]).replace('\0', '0');
		
		//loop through tempchain to check hashes:
		for(int i=1; i < tempchain.size(); i++) {
			currentBlock = tempchain.get(i);
			previousBlock = tempchain.get(i-1);
			//compare registered hash and calculated hash:
			if(!currentBlock.hash.equals(currentBlock.calculateHash()) ){
				System.out.println("Current Hashes not equal");			
				return false;
			}
			//compare previous hash and registered previous hash
			if(!previousBlock.hash.equals(currentBlock.previousHash) ) {
				System.out.println("Previous Hashes not equal");
				return false;
			}
			//check if hash is solved
			if(!currentBlock.hash.substring( 0, difficulty).equals(hashTarget)) {
				System.out.println("This block hasn't been mined");
				return false;
			}
		}
		return true;
	}
}
