package cf.codersnet.coins.proxy;

import net.minecraft.item.Item;

public class CommonProxy {
	public void registerItemRenderer(Item item, int meta, String id) {
		System.out.println("Not setting model to "+id+" because running on server.");
	}

}
