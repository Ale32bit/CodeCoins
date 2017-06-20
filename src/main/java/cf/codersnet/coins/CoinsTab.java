package cf.codersnet.coins;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CoinsTab extends CreativeTabs {

	public CoinsTab() {
		super(CoinsMod.modId);
		System.out.println("Setting up creative tab");
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.oneCoin;
	}

}
