package com.muthamizh.assignment1;

import com.muthamizh.assignment1.employees.Developer;
import com.muthamizh.assignment1.employees.Manager;
import com.muthamizh.assignment1.utilities.EmployeeUtilities;

public class AssignmentMain {

	public static void main(String[] args) {
		 Manager manager = new Manager("muthamizh", 202, 234517, "HR");
	        
	        // Creating Developer Objects
	        Developer developer = new Developer("kavi", 207, 87888, "Java");

	        // Creating Utility Object
	        EmployeeUtilities util = new EmployeeUtilities();

	        // Display Details
	        util.printEmployeeDetails(manager);
	        util.printEmployeeDetails(developer);

	        // Update Salary Using Protected Method
	        util.updateSalary(manager, 345346);
	        util.updateSalary(developer, 120000);

	}

}