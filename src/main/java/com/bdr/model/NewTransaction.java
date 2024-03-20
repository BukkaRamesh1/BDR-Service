public interface NewTransaction {
	public void createTransaction(String transactionTime, String transactionID, String transactionDate, String transactionType, double transactionAmount);
	public void updateTransaction(String transactionTime, String transactionDate, String transactionType, double transactionAmount);	
}
