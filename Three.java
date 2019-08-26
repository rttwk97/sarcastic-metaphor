/* Create an abstract class Instrument which is having the abstract function play. 

Create three more sub classes from Instrument which is Piano, Flute, Guitar. 
Override the play method inside all three classes printing a message 
Piano is playing  tan tan tan tan    for Piano class
Flute is playing  toot toot toot toot for Flute class
Guitar is playing  tin  tin  tin  for Guitar class 

Create an array of 10 Instruments.
Assign different type of instrument to Instrument reference.
Check for the polymorphic behavior of  play method.
Use the instanceof operator to print which object is stored at which index of instrument array.*/
import java.util.*;
abstract class Instrument
{
	public abstract void play();
}
class Piano extends Instrument
{
    public void play()
    {
        System.out.println("Piano is playing  tan tan tan tan  ");
    }
}

class Flute extends Instrument
{
    public void play()
    {
        System.out.println("Flute is playing  toot toot toot toot");
    }
}

class Guitar extends Instrument
{
    public void play()
    {
        System.out.println("Guitar is playing  tin  tin  tin ");
    }
}

class Three 
{
    public static void main(String args[])
    {
		Instrument arr[]=new Instrument[10];
		
		arr[0] = new Piano();
        arr[1] = new Flute();
        arr[2] = new Guitar();
        arr[3] = new Piano();
        arr[4] = new Flute();
        arr[5] = new Guitar();
        arr[6] = new Piano();
        arr[7] = new Flute();
        arr[8] = new Guitar();
        arr[9] = new Piano();
		
		for(int i=0;i<10;i++)
		{
			if(arr[i] instanceof Instrument)
			{
				System.out.println((i+1)+":"+arr[i].getClass());
				arr[i].play();
			}
		}
	}
}
		