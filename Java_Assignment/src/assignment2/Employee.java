package assignment2;

/**
 * 7.Create a class Employee.java with attributes empNo, empName, address, State, zipCode, phone,
 * designation (manager, lead, analyst) , experience in Years, emailAddress, basic, hra, bonus (% of basic).
 * Choose appropriate data types and create a constructor, getters & setters for the attributes.
 * Also create a method to return the total salary (basic + hra + (bonus/100)*basic)
 */

public class Employee {
    public static void main(String[] args) {
        EmployeeDetails emp = new EmployeeDetails();
        emp.setEmpNo(123);
        emp.setEmpName("Yugma");
        emp.setAddress("Berkeley");
        emp.setState("California");
        emp.setZipCode(94612);
        emp.setPhone("2222654872");
        emp.setDesignation("Analyst");
        emp.setExpInYears(2.4);
        emp.setEmailAddress("yugma@abc.com");
        emp.setBasic(100000.00);
        emp.setHra(5000.00);

        System.out.println("Employee number: "+emp.getEmpNo());
        System.out.println("Employee name: "+emp.getEmpName());
        System.out.println("Address: "+emp.getAddress());
        System.out.println("State: "+emp.getState()+" ZipCode: "+emp.getZipCode());
        System.out.println("Phone number: "+emp.getPhone());
        System.out.println("Email address: "+emp.getEmailAddress());
        System.out.println("Designation: "+emp.getDesignation()+" Experience in years: "+emp.getExpInYears());
        System.out.println("Salary: "+emp.salaryEmp(emp.getBasic(),emp.getHra()));

    }
}

class EmployeeDetails{

    private int empNo, zipCode;
    private String empName, address, state, designation, emailAddress, phone;
    private double salary,basic,hra,bonus,expInYears;

    public double salaryEmp(double basic, double hra ){
        bonus = (0.07 * basic);
        salary = (basic+ hra+ bonus);
        return salary;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getExpInYears() {
        return expInYears;
    }

    public void setExpInYears(double expInYears) {
        this.expInYears = expInYears;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

}
