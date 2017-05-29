package FridaySalesProject;
import java.util.*;
public class FridaySalesProject {
			public static void main(String[] args) {
				
						int customerID;
						String customerName;
						String taxCode;
						double salesAmount;
						double totalAmountDue;
						double taxAmount=0;
						char yesOrNo;
						Scanner s = new Scanner(System.in);
						do{
							
							
							System.out.println("Enter Customer ID: ");
							while(!s.hasNextInt()){
								System.out.println("Wrong data Type. Enter a valid number");
								s.next();
								}
							customerID = s.nextInt();
							
							System.out.println("Enter Customer name: ");
							customerName = s.next();
							
							System.out.println("Enter the sales amount: ");
							while(!s.hasNextDouble()){
								System.out.println("Wrong data Type. Enter a valid number");
								s.next();
								}
							salesAmount = s.nextDouble();
							do{
							System.out.println("Enter the tax code (NRM/NPF/BIZ): ");
							taxCode = s.next();
							}while (!(taxCode.equals("nrm"))&&!(taxCode.equals("npf")) &&!(taxCode.equals("biz"))&&!(taxCode.equals("NRM"))&& !(taxCode.equals("NPF"))&&!(taxCode.equals("BIZ")));
							taxCode = taxCode.toLowerCase();
							
							switch(taxCode){
							case "nrm":
								taxAmount=(salesAmount*(6/100));
								break;
							case "npf":
								taxAmount=0;
								break;
							case "biz":
								taxAmount=(salesAmount*(4.5/100));
								break;
							}
							totalAmountDue = salesAmount + taxAmount;			
							
							System.out.println("Customer ID: " + customerID);
							System.out.println("Customer Name:  "+ customerName);
							System.out.println("Sales Amount:  "+ salesAmount);
							System.out.println("Tax Code: "+ taxCode);
							System.out.println("Total Amount Due:  "+ totalAmountDue);
							
							do{
							System.out.println("Do you want to continue(Y/N)");
							yesOrNo=s.next(".").charAt(0);
							}while(yesOrNo!='Y'&& yesOrNo!='N'&& yesOrNo!='y'&& yesOrNo!='n');
							}while(yesOrNo=='Y'||yesOrNo=='y');
							s.close();

					}

				}


	/*
	 Enter Customer ID: 
	214
	Enter Customer name: 
	sdaf
	Enter the sales amount: 
	234
	Enter the tax code (NRM/NPF/BIZ): 
	sdfa
	Enter the tax code (NRM/NPF/BIZ): 
	npf
	Customer ID: 214
	Customer Name:  sdaf
	Sales Amount:  234.0
	Tax Code: npf
	Total Amount Due:  234.0
	Do you want to continue(Y/N)
	n

	Enter Customer ID: 
	234
	Enter Customer name: 
	sdfads
	Enter the sales amount: 
	234
	Enter the tax code (NRM/NPF/BIZ): 
	npf
	Customer ID: 234
	Customer Name:  sdfads
	Sales Amount:  234.0
	Tax Code: npf
	Total Amount Due:  234.0
	Do you want to continue(Y/N)
	n

	 */
	 