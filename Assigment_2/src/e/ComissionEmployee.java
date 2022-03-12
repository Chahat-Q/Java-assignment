package e;



	
	
	

	public class ComissionEmployee extends Employee {
		private double commisionPercentage;
		private double totalSales;

		public ComissionEmployee(int id, String name, double commisionPercentage, double totalSales) {
			super(id, name);
			this.commisionPercentage = commisionPercentage;
			this.totalSales = totalSales;
		}

		@Override
		public double getPayment() {
			return totalSales * commisionPercentage / 100;
		}

	}


