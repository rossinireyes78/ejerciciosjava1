package com.jobs.application;

import com.jobs.domain.IPaymentRate;

public class PaymentFactory {

	//bossemployee su sueldo mas el 50%  1.5
	public static IPaymentRate createPaymentRateBoss(){
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.5;
			}
		};
	}
	
	//employee reduccion del 15% 0.85
	public static IPaymentRate createPaymentRateEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*0.85;
			}
		};
	}
	
	//manageremployee su sueldo mas el 10%  1.1
	public static IPaymentRate createPaymentRateManagerEmployee(){
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.1;
			}
		};
	}
	
	
	// volunter no cobran
	public static IPaymentRate createPaymentRateVolunteer(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return 0;//todo 
			}
		};
	}
	
}
