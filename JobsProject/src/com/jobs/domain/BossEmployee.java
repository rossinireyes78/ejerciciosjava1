package com.jobs.domain;

public class BossEmployee extends AbsStaffMember{

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	

	public BossEmployee(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate)
			throws Exception {
		super(name, address, phone);	
			if(salaryPerMonth<0) throw new Exception();
			if(paymentRate==null) throw new Exception();
					
			this.salaryPerMonth=salaryPerMonth;
			this.paymentRate=paymentRate;
		}

		@Override
		public void pay() {
			totalPaid=paymentRate.pay(salaryPerMonth);
		}

}
