package atvl2;

public class Date {
	int day;
	int month;
	int year;
	public Date atual = new Date();
	
	public void nowDate(int dd, int mm, int yyyy) {
		atual.day = dd;
		atual.month = mm;
		atual.year = yyyy;
	}
	
	public void skipTimeDays(int days) {
		for(int d = 1; d <= days; d++) {
			this.day++;
			if (this.day > 30) {
				this.month++;
				this.day = 1;
			}
			if (this.month > 12) {
				this.year++;
				this.month = 1;
			}
		}
	}
	
	public void skipTimeMonths(int months) {
		for(int m = 1; m <= months; m++) {
			this.month++;
			if (this.month > 12) {
				this.year++;
				this.month = 1;
			}
		}
	}
	
	public void skipTimeYears(int years) {
		for(int y = 1; y <= years; y++) {
			this.year++;
		}
	}
}