"Alton Hardware" 
BEGIN 
		Set Building Permit=50.00
		Set Tax Rate =6%
		Prompt What Kind of Fencing do you want?
		Get Fencing
		Prompt How many feet do you want?
		Get Feet
		Prompt How many Gates Do you want 
		Get Amount of Gates
		While loop to set minimum to 1
		Cost of gates= (150*amountOfGates);
		gateTax=costOfGates*taxRate;
		totalGateCost=gateTax+costOfGates;
		 IF Wooden Fencing THEN
			FenceTax=(25*Foot) (6%)
			FencePrice=(25*feet) +fencetax
			total=fencePrice++totalGateCost++buildingPermit
			Print Total
			ELSE IF Chain Link Fence THEN
				FenceTax=(15*Foot) (6%)
				FencePrice=(15*feet) +fencetax
				total=fencePrice++totalGateCost++buildingPermit
				Print Total
				ELSE
					Print The only options are 1 or 2.
	END
			
			
