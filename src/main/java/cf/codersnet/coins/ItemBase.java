package cf.codersnet.coins;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {

	protected String name;

	public ItemBase(String name) {
		this.name = name;
		System.out.println("Setting up new item "+name);
		setUnlocalizedName("codecoins."+name);
		setRegistryName(name);
		setCreativeTab(CoinsMod.creativeTab);
		
	}

	public void registerItemModel() {
		CoinsMod.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
