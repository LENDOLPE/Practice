package core;

import java.util.ArrayList;

import util.util_SHA;

public class block {

	private int blockID;
	private String previousBlockHash;
	private int nonce;
	private ArrayList<Transaction> transactionList;
	
	public int getBlockID() {
		return blockID;
	}
	public void setBlockID(int blockID) {
		this.blockID = blockID;
	}
	public int getNonce() {
		return nonce;
	}
	public void setNonce(int nonce) {
		this.nonce = nonce;
	}

	
	public String getPreviousBlockHash() {
		return previousBlockHash;
	}
	public void setPreviousBlockHash(String previousBlockHash) {
		this.previousBlockHash = previousBlockHash;
	}
	public block(int blockID, String previousBlockHash, int nonce, ArrayList transactionList) {
		this.blockID = blockID;
		this.previousBlockHash = previousBlockHash;
		this.nonce = nonce;
		this.transactionList = transactionList;
	}
	
	public void addTransaction(Transaction transaction) {
		transactionList.add(transaction);
	}
	
	public void getInformation() {
		System.out.println("--------------------------------");
		System.out.println("블록번호: " + getBlockID());
		System.out.println("이전해시: " + getPreviousBlockHash());
		System.out.println("채굴변수값: " + getNonce());
		System.out.println("트랜잭션 개수: " + transactionList.size()+ "개");
		for(int i = 0; i < transactionList.size(); i++) {
			System.out.println(transactionList.get(i).getInformation());
		}
		System.out.println("블록해시: " + getBlockHash());
		System.out.println("--------------------------------");
		
	}

	public String getBlockHash() {
		String transactionInformations = "";
		for(int i = 0; i < transactionList.size(); i++) {
			transactionInformations += transactionList.get(i).getInformation();
		}
		return util_SHA.getHash(nonce + transactionInformations + previousBlockHash);
	}
	

	public void mine() {
		while(true) {
			if(getBlockHash().substring(0, 4).equals("0000")) {
				System.out.println((blockID + "번째 블록의 채굴에 성공했습니다."));
				break;
			}
			nonce++;
		
		}
	}

}

