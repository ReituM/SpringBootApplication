package com.example.demo;

public class Convert
{

        private int centimeterValue = 1;
        private int meterValue = 5;
        private int mileValue = 10;
        
        
        
        
        
        
		public Convert() {
			super();
		}
		
		public Convert(int centimeterValue, int meterValue, int oneMileValue, int mileValue) {
			super();
			this.centimeterValue = centimeterValue;
			this.meterValue = meterValue;
			this.mileValue= mileValue;
		}
		public int getcentimeterValue() {
			return centimeterValue;
		}
		public void setcentimeterValue(int centimeterValue) {
			this.centimeterValue = centimeterValue;
		}
		public int getmeterValue() {
			return meterValue;
		}
		public void setmeterValue(int meterValue) {
			this.meterValue = meterValue;
		}
		public int getmileValue() {
			return mileValue;
		}
		public void setmileValue(int mileValue) {
			this.mileValue = mileValue;
		}
        
        
}

