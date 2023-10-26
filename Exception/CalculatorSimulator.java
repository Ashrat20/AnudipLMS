package expcetionpack;

// Created Custom exception class for invalid country
class CountryNotValidException extends Exception 
{
    private String message;
    
    public CountryNotValidException(String message) 
    {
        this.message = message;
    }
    
    @Override
    public String toString() 
    {
        return message;
    }    
}
// Created Custom exception class for invalid employee name
class EmployeeNameInvalidException extends Exception 
{
    private String message;
    
    public EmployeeNameInvalidException(String message) 
    {
        this.message = message;
    }
    
    @Override
    public String toString() 
    {
        return message;
    }
}

// Custom exception class for tax ineligibility
@SuppressWarnings("serial")
class TaxNotEligibleException extends Exception {
    private String message;
    
    public TaxNotEligibleException(String message) {
        this.message = message;
    }
    
    @Override
    public String toString() {
        return message;
    }
}

// TaxCalculator class to calculate tax
class TaxCalculator 
{
    public static double calculateTax(String empname, boolean isIndian, double empSal) 
            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException 
    {
        // Check if the employee is Indian
        if (!isIndian) 
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
        
        // Check if the employee name is empty or null
        if (empname == null || empname.isEmpty()) 
            throw new EmployeeNameInvalidException("The employee name cannot be empty");
        
        double taxAmount;
        // Calculate tax based on salary range
        if (empSal > 100000)
            taxAmount = empSal * 8 / 100;
        else if (empSal >= 50000 && empSal <= 100000)
            taxAmount = empSal * 6 / 100;
        else if (empSal >= 30000 && empSal < 50000)
            taxAmount = empSal * 5 / 100;
        else if (empSal >= 10000 && empSal < 30000)
            taxAmount = empSal * 4 / 100;
        else
            throw new TaxNotEligibleException("The employee does not need to pay tax");
        
        return taxAmount;
    }
}

public class CalculatorSimulator {
    public static void main(String[] args) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException 
    {
        try {
            // Calculate tax for an employee with an empty name, who is Indian and has a salary of 20000
            double tax = TaxCalculator.calculateTax("Vijay", true, 20000);
            System.out.println("Tax Amount will be: " + tax);
        } catch (CountryNotValidException e) {
            System.out.println("Exception caught: " + e);
            e.printStackTrace();
        } catch (EmployeeNameInvalidException e) {
            System.out.println("Exception caught: " + e);
            e.printStackTrace();
        } catch (TaxNotEligibleException e) {
            System.out.println("Exception caught: " + e);
            e.printStackTrace();
        }
    }
}