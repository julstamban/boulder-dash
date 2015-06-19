package fr.enssat.BoulderDash.models;

import fr.enssat.BoulderDash.interfaces.PublisherInterface;
import fr.enssat.BoulderDash.models.DisplayableElementModel;


/**
 * SteelWallModel
 *
 * Represents the steelWall
 *
 * @author      Colin Leverger <me@colinleverger.fr>
 * @since       2015-06-19
 */
public class SteelWallModel extends DisplayableElementModel implements PublisherInterface {
	private static String spriteName;
	private static boolean isDestructible;
	private static boolean canMove;
	private static boolean impactExplosive;
	private static boolean animate;
	private static int priority;

    /**
     * Static dataset
     * Specifies the physical parameters of the object
     */
	static {
		spriteName = "steelwall";
		isDestructible = false;
		canMove = false;
		impactExplosive = false;
		animate = false;
		priority = 3;
	}

    /**
     * Class constructor
     */
	public SteelWallModel() {
		super(isDestructible, canMove, spriteName, priority, impactExplosive, animate);
		this.loadSprite(spriteName);
	}
}
