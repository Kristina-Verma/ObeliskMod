package fox.obeliskmod;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fox.obeliskmod.lists.BlockList;
import fox.obeliskmod.lists.CustomStairsBlock;
import fox.obeliskmod.lists.ItemList;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("obeliskmod")
public class ObeliskMod 
{
	public static ObeliskMod instance;
	public static final String modid = "obeliskmod";
	private static final Logger logger = LogManager.getLogger(modid);
	
	public static final ItemGroup obelisk = new ObeliskItemGroup();
	
	public ObeliskMod() 
	{
		MinecraftForge.EVENT_BUS.register(this);
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
	}
	
	private void setup(final FMLCommonSetupEvent event) 
	{
		logger.info("Setup method registered");
	}
	
	private void clientRegistries(final FMLClientSetupEvent event) 
	{
		logger.info("clientRegistries method registered");
	}
	
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents
	{
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) 
		{
			event.getRegistry().registerAll
			(
					
			//Items
			ItemList.copper_coin = new Item(new Item.Properties().group(obelisk)).setRegistryName(location("copper_coin")),
			ItemList.silver_coin = new Item(new Item.Properties().group(obelisk)).setRegistryName(location("silver_coin")),
			ItemList.gold_coin = new Item(new Item.Properties().group(obelisk)).setRegistryName(location("gold_coin")),
			
			//Blocks
			ItemList.earth_obelisk_block = new Item(new Item.Properties().group(obelisk)).setRegistryName(BlockList.earth_obelisk_block.getRegistryName()),
			ItemList.earth_obelisk_wall = new BlockItem(BlockList.earth_obelisk_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.earth_obelisk_wall.getRegistryName()),
			ItemList.earth_obelisk_slab = new BlockItem(BlockList.earth_obelisk_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.earth_obelisk_slab.getRegistryName()),
			ItemList.earth_obelisk_stairs = new BlockItem(BlockList.earth_obelisk_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.earth_obelisk_stairs.getRegistryName()),
			ItemList.dirt_slab = new BlockItem(BlockList.dirt_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dirt_slab.getRegistryName()),
			ItemList.dirt_wall = new BlockItem(BlockList.dirt_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dirt_wall.getRegistryName()),
			ItemList.dirt_stairs = new BlockItem(BlockList.dirt_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dirt_stairs.getRegistryName()),
			ItemList.coarse_dirt_wall = new BlockItem(BlockList.coarse_dirt_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.coarse_dirt_wall.getRegistryName()),
			ItemList.coarse_dirt_slab = new BlockItem(BlockList.coarse_dirt_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.coarse_dirt_slab.getRegistryName()),
			ItemList.coarse_dirt_stairs = new BlockItem(BlockList.coarse_dirt_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.coarse_dirt_stairs.getRegistryName())
			);
			
			
			
			logger.info("Items Registered");
		}
		
		@SubscribeEvent
		public static void registerBlock(final RegistryEvent.Register<Block> event) 
		{
			event.getRegistry().registerAll
			(
			
				BlockList.earth_obelisk_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(50.0f, 18000000.0f).lightValue(15).sound(SoundType.METAL)).setRegistryName(location("earth_obelisk_block")),
				BlockList.earth_obelisk_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.earth_obelisk_block)).setRegistryName(location("earth_obelisk_wall")),
				BlockList.earth_obelisk_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.earth_obelisk_block)).setRegistryName(location("earth_obelisk_slab")),
				BlockList.earth_obelisk_stairs = (StairsBlock) new CustomStairsBlock(BlockList.earth_obelisk_block.getDefaultState(), Block.Properties.from(BlockList.earth_obelisk_block)).setRegistryName(location("earth_obelisk_stairs")),
				BlockList.dirt_slab = (SlabBlock) new SlabBlock(Block.Properties.create(Material.EARTH).hardnessAndResistance(0.5f, 2.5f).sound(SoundType.GROUND)).setRegistryName(location("dirt_slab")),
				BlockList.dirt_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.dirt_slab)).setRegistryName(location("dirt_wall")),
				BlockList.dirt_stairs = (StairsBlock) new CustomStairsBlock(BlockList.dirt_slab.getDefaultState(), Block.Properties.from(BlockList.dirt_slab)).setRegistryName(location("dirt_stairs")),
				BlockList.coarse_dirt_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.dirt_slab)).setRegistryName(location("coarse_dirt_wall")),
				BlockList.coarse_dirt_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.dirt_slab)).setRegistryName(location("coarse_dirt_slab")),
				BlockList.coarse_dirt_stairs = (StairsBlock) new CustomStairsBlock(BlockList.coarse_dirt_stairs.getDefaultState(), Block.Properties.from(BlockList.dirt_slab)).setRegistryName(location("coarse_dirt_stairs"))
			
			);
			
			
			
			logger.info("Blocks Registered");
		}
		
	}
	
	private static ResourceLocation location(String name) 
	{
		return new ResourceLocation(modid, name);
	}
}
