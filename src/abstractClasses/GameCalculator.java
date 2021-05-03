package abstractClasses;

//GameCalculator ne zaman kullan�l�rsa game over fonksiyonu oldugu gibi 
//kullan�l�r.Finalden dolay� hi� bir�ekilde degismez
//ancak hesapla fonksiyonu hangi class miras al�yorsa onu i�ermek
// ve override yapmak zorundad�r

public abstract class GameCalculator {
	public abstract void hesapla(   );
	public final void gameOver() {
		System.out.println("Oyun Bitti");
	}

}
