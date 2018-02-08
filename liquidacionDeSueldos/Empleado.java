public abstract class Empleado {
	private int dni;
	private String name&surname;
	private int id_number_employee;
	private int date_of_admission;
	private int gross_salary;

	public Empleado(int dni, String name&surname, int id_number_employee, int date_of_admission, int gross_salary) {
		this.dni = dni;
		
		this.name&surname = name&surname;

		if (id_number_employee < 0) {
			this.id_number_employee = 1;
		} else { 
			this.id_number_employee = id_number_employee;
		}	

		this.date_of_admission = date_of_admission;

		this.gross_salary = gross_salary;
	}

	public Empleado(int dni, int id_number_employee, int date_of_admission, int gross_salary) {
		this.dni = dni;
		
		if (id_number_employee < 0) {
			this.id_number_employee = 1;
		} else {
			this.id_number_employee = id_number_employee;
		}
		this.date_of_admission = date_of_admission;

		this.gross_salary = gross_salary;

	}	 

	public abstract int gross_salary_increases();

	public abstract int income_tax();

	public abstract int length_of_service();

	
	public int getDni() {
		return dni;
	}

	public String getName&Surname() {
		return name&surname;
	}

	public int getId_number_employee() {
		return id_number_employee;
	}

	public void id_Number_Employee() {
		id_number_employee++;
	}

	public int getDate_of_admission() {
		return date_of_admission;
	}	
    
	public int getGross_Salary() {
		return gross_salary;
	}

}	
				
