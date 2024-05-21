package project1;

public class CountNotes {

	public static void main(String[] args) {
		
		int note_500=0,note_200=0,note_100=0,note_50=0,
				note_20=0,note_10=0,note_5=0,coin_2=0,coin_1=0;
		
		int rupees = 39;
		System.out.println("given num" +rupees);
		if(rupees >50) {
			note_50 = rupees/ 50;// 29/20---1
			rupees = rupees - (note_50 * 50);// 29 - (1*20)--29 -20--9
		}
		if(rupees >20) {
			note_20 = rupees/ 20;// 29/20---1
			rupees = rupees - (note_20 * 20);// 29 - (1*20)--29 -20--9
		}
		if(rupees > 10) {
			note_10 = rupees/ 10;// 29/20---1
			rupees = rupees - (note_10 * 10);// 29 - (1*20)--29 -20--9
		}
if(rupees > 5) {
			note_5 = rupees/ 5;// 29/20---1
			rupees = rupees - (note_5 * 5);// 29 - (1*20)--29 -20--9
		}
		if(rupees > 2) {
			coin_2 = rupees/ 2;// 29/20---1
			rupees = rupees - (coin_2 * 2);// 29 - (1*20)--29 -20--9
		}
		if(rupees > 1) {
			coin_1 = rupees/ 1;// 29/20---1
			rupees = rupees - (coin_1 * 1);// 29 - (1*20)--29 -20--9
		}
		
		if(note_20 > 0) System.out.println("20 rupees Note--->"+note_20);
		if(note_10 > 0) System.out.println("10 rupees Note--->"+note_10);
		if(note_5 > 0) System.out.println("5 rupees Note--->"+note_5);
		if(coin_2 > 0) System.out.println("2 rupee coin Note--->"+coin_2);
		if(coin_1 > 0) System.out.println("1 rupee coin Note--->"+coin_1);
	}

}
