
public class Musician 
{
	/*
	 * 
	class Musician(object):
    def __init__(self, sounds):
        self.sounds = sounds
	 */
	private String[] sounds; //fields are variables owned by an object
	
	public Musician(String[] sounds)
	{
		//we already have access to a variable named this
		this.sounds = sounds;
	}
	
	public void play()
	{
		System.out.println(this.sounds[0]);
	}
}
