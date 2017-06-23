package cf.codersnet.coins;

import org.apache.logging.log4j.Logger;

import cf.codersnet.coins.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CoinsMod.modid, name = CoinsMod.name, version = CoinsMod.version, acceptedMinecraftVersions = "[1.10.2]")
public class CoinsMod {

	public static final String modid = "codecoins";
	public static final String name = "CodeCoins";
	public static final String version = "1.2";
	
	public static final CoinsTab creativeTab = new CoinsTab();
	
	public static Logger logger;
	
	@SidedProxy(serverSide = "cf.codersnet.coins.proxy.CommonProxy", clientSide = "cf.codersnet.coins.proxy.ClientProxy")
	public static CommonProxy proxy;

	@Mod.Instance(modid)
	public static CoinsMod instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is loading!");
		System.out.println("CodeCoins created by Ale32bit!");
		ModItems.init();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

}
