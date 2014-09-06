package alienMod.managers;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class SoundManager {
	
	@ForgeSubscribe
	public void onSound(SoundLoadEvent event) {
		event.manager.addSound("starbeings:mob/alien/say.ogg");
		event.manager.addSound("starbeings:mob/alien/hurt.ogg");
		event.manager.addSound("starbeings:step/viri.ogg");
		event.manager.addSound("starbeings:dig/viri.ogg");
		event.manager.addMusic("starbeings:creepy.ogg");
	}
}