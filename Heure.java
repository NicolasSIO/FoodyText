public class Heure{
		private int heures;
		private int minutes;
		
		public Heure(int, int){
			if(heures < 0 || heures > 23){
				this.heures = 0;
			}else{
				this.heures = heures;
			} 
			if(minutes < 0 || minutes > 59){
				this.minutes = 0;
			}else{
				this.minutes = minutes;
			}
		}
		
		public int getHeures(){
			return heures;
		}
		
		public int getMinutes(){
			return minutes;
		}
				
				
		public void setHeures(int heures){
			this.heures = heures;
		}
}
