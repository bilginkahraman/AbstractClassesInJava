package abstractClasses;

//GameCalculator ne zaman kullanýlýrsa game over fonksiyonu oldugu gibi 
//kullanýlýr.Finalden dolayý hiç birþekilde degismez
//ancak hesapla fonksiyonu hangi class miras alýyorsa onu içermek
// ve override yapmak zorundadýr

public abstract class GameCalculator {
	public abstract void hesapla(   );
	public final void gameOver() {
		System.out.println("Oyun Bitti");
	}

}
