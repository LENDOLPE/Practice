package core;

import java.util.ArrayList;

public class BlockChainStater {

	public static void main(String[] args) {
		
		block Block1 = new block(1, null, 0, new ArrayList());
		Block1.mine();
		Block1.getInformation();
	
		
		block Block2 = new block(2, Block1.getBlockHash(), 0, new ArrayList());
		Block2.addTransaction(new Transaction("나동빈", "박한울", 1.5));
		Block2.addTransaction(new Transaction("이태일", "박한울", 0.7));	
		Block2.mine();
		Block2.getInformation();
	
		block Block3 = new block(3, Block2.getBlockHash(), 0, new ArrayList());
		Block3.addTransaction(new Transaction("강종구", "이상욱", 8.2));
		Block3.addTransaction(new Transaction("반한울", "나동빈", 0.4));	
		Block3.mine();
		Block3.getInformation();
	
		block Block4 = new block(4, Block3.getBlockHash(), 0, new ArrayList());
		Block4.addTransaction(new Transaction("이상욱", "강종구", 0.1));
		Block4.mine();
		Block4.getInformation();
	}

}
