package cf.codersnet.coins;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static ItemBase oneCoin;
	public static ItemBase tenCoin;
	public static ItemBase hundredCoin;
	public static ItemBase fiveHundredCoin;
	public static ItemBase thousandCoin;

	public static void init() {
		oneCoin = register(new ItemBase("oneCoin"));
		tenCoin = register(new ItemBase("tenCoin"));
		hundredCoin = register(new ItemBase("hundredCoin"));
		fiveHundredCoin = register(new ItemBase("fiveHundredCoin"));
		thousandCoin = register(new ItemBase("thousandCoin"));
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemBase) {
			((ItemBase)item).registerItemModel();
		}

		return item;
	}

}
