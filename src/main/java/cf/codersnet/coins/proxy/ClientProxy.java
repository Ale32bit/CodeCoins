package cf.codersnet.coins.proxy;

import cf.codersnet.coins.CoinsMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		System.out.println("Setting model to "+id);
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(CoinsMod.modId + ":" + id, "inventory"));
	}
}
