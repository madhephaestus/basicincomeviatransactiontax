//Your code here

int supplyChainDepth =46
double annualIncome =24000
double netMoneyCreation = annualIncome
double transactionFeePercent=5.0
double numberOfYears =5
for (int i=0;i<supplyChainDepth;i++) {
	
	double transactionTax = (netMoneyCreation*transactionFeePercent/100.0)
	netMoneyCreation=netMoneyCreation-transactionTax
	double createdNetAnnual=netMoneyCreation/numberOfYears
	double inflationPerceived =( createdNetAnnual/annualIncome)*100.0
	println "Iteration "+i+" net anual created "+createdNetAnnual+" percentage inflation "+inflationPerceived+"%"
	
}