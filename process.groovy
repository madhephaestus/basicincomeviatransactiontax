/**
 * Assume supply chain depth 
 * Assume the number of years for the money to work its way through that supply chain
 * Assume an annual wage
 * Assume a transaction fee percentage
 * This will check for the effect of the 
 * net money creation, 
 * annualized money creation, and 
 * annualized inflation due to the money creation
 * @author hephaestus
 *
 */

int supplyChainDepth =46
double annualIncome =24000
double netMoneyCreation = annualIncome
double transactionFeePercent=4.0
double numberOfYears =14
for (int i=0;i<supplyChainDepth;i++) {
	
	double transactionTax = (netMoneyCreation*transactionFeePercent/100.0)
	netMoneyCreation=netMoneyCreation-transactionTax
	double createdNetAnnual=netMoneyCreation/numberOfYears
	double inflationPerceived =( createdNetAnnual/annualIncome)*100.0
	println "Iteration "+i+" net anual created "+createdNetAnnual+" percentage inflation "+inflationPerceived+"%"
	
}