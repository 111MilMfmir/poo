public class Operario extends Empleado {
	private String type_Of_Machionery;

	public Operario(int dni, String name&surname, int id_number_employee, int date_of _admission, int gross_salary, String type_of_machionery) {
		super(dni, name&surname, id_number_employee, date_of_admission, gross_salary);
		this.type_of_machionery = machionery;
	}

	public Operario(int dni, int id_number_employee, int date_of_admission, int gross_salary, String type_of_machionery) {
		super(dni, id_number_employee, date_of_admission, gross_salary);		
		this.type_of_machionery = machionery;
	}
	
	public int gross_salary_increases() {
		gross_salary = gross_salary + (gross_salary * 0.08);
	}	

	public int income_taxe() {
		income_tax = gross_salary * 0.05;
	}

	public int length_of_service() {
		length_of_service ++;
	}


