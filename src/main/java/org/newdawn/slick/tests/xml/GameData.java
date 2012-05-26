package org.newdawn.slick.tests.xml;

import java.util.ArrayList;

/**
 * The top level node of our test structure for XML -> object parsing
 * 
 * @author kevin
 */
public class GameData {
	/** The list of entities added */
	private ArrayList<Entity> entities = new ArrayList<Entity>();

	/**
	 * Called by XML parser to add a configured entity to the GameData
	 * 
	 * @param entity The entity to be added
	 */
	@SuppressWarnings("unused")
	private void add(Entity entity) {
		entities.add(entity);
	}

	/**
	 * Dump this object to sysout
	 * 
	 * @param prefix The prefix to apply to all lines
	 */
	public void dump(String prefix) {
		System.out.println(prefix+"GameData");
		for (int i=0;i<entities.size();i++) {
			entities.get(i).dump(prefix+"\t");
		}
	}
}
