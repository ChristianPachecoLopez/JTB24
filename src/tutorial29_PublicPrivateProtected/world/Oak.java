package tutorial29_PublicPrivateProtected.world;

public class Oak extends Plant {
	public Oak() {
		// won't work -- type is privates
		// type="tree"

		// This works --- size is protected, Oak is a subclass of plant.
		this.size = "large";

		// No access specifier; works because Oak and Plant in same package
		// this.height = 10;
	}

}
