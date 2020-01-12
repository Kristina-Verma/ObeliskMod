package fox.obeliskmod;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fox.obeliskmod.lists.BlockList;
import fox.obeliskmod.lists.CustomStairsBlock;
import fox.obeliskmod.lists.EntitiesList;
import fox.obeliskmod.lists.ItemList;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class ObeliskModRegistries
{

	public static final String modid = "obeliskmod";
	private static final Logger logger = LogManager.getLogger(modid);
	public static final ItemGroup obelisk = ObeliskMod.obelisk;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) 
	{
		event.getRegistry().registerAll
		(
					
		//Items
		ItemList.copper_coin = new Item(new Item.Properties().group(obelisk)).setRegistryName(location("copper_coin")),
		ItemList.silver_coin = new Item(new Item.Properties().group(obelisk)).setRegistryName(location("silver_coin")),
		ItemList.gold_coin = new Item(new Item.Properties().group(obelisk)).setRegistryName(location("gold_coin")),
			
		//Weapons
		ItemList.stone_dagger = new SwordItem(ItemTier.STONE, 1, -1, new Item.Properties().group(obelisk)).setRegistryName(location("stone_dagger")),
		ItemList.iron_dagger = new SwordItem(ItemTier.IRON, 1, -1, new Item.Properties().group(obelisk)).setRegistryName(location("iron_dagger")),
		ItemList.long_sword = new SwordItem(ItemTier.IRON, 2, -1, new Item.Properties().group(obelisk)).setRegistryName(location("long_sword")),
		//ItemList.sling = (BowItem) = new CustomBow(null),
			
		//Blocks
		ItemList.earth_obelisk_block = new BlockItem(BlockList.earth_obelisk_block, new Item.Properties().group(obelisk)).setRegistryName(BlockList.earth_obelisk_block.getRegistryName()),
		ItemList.earth_obelisk_wall = new BlockItem(BlockList.earth_obelisk_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.earth_obelisk_wall.getRegistryName()),
		ItemList.earth_obelisk_slab = new BlockItem(BlockList.earth_obelisk_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.earth_obelisk_slab.getRegistryName()),
		ItemList.earth_obelisk_stairs = new BlockItem(BlockList.earth_obelisk_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.earth_obelisk_stairs.getRegistryName()),
		ItemList.dirt_slab = new BlockItem(BlockList.dirt_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dirt_slab.getRegistryName()),
		ItemList.dirt_wall = new BlockItem(BlockList.dirt_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dirt_wall.getRegistryName()),
		ItemList.dirt_stairs = new BlockItem(BlockList.dirt_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dirt_stairs.getRegistryName()),
		ItemList.coarse_dirt_wall = new BlockItem(BlockList.coarse_dirt_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.coarse_dirt_wall.getRegistryName()),
		ItemList.coarse_dirt_slab = new BlockItem(BlockList.coarse_dirt_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.coarse_dirt_slab.getRegistryName()),
		ItemList.coarse_dirt_stairs = new BlockItem(BlockList.coarse_dirt_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.coarse_dirt_stairs.getRegistryName()),
		ItemList.plains_beach_grass = new BlockItem(BlockList.plains_beach_grass, new Item.Properties().group(obelisk)).setRegistryName(BlockList.plains_beach_grass.getRegistryName()),
		ItemList.plains_beach_grass_block = new BlockItem(BlockList.plains_beach_grass_block, new Item.Properties().group(obelisk)).setRegistryName(BlockList.plains_beach_grass_block.getRegistryName()),
		ItemList.sand_slab = new BlockItem(BlockList.sand_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.sand_slab.getRegistryName()),
		ItemList.sand_wall = new BlockItem(BlockList.sand_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.sand_wall.getRegistryName()),
		ItemList.sand_stairs = new BlockItem(BlockList.sand_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.sand_stairs.getRegistryName()),
		ItemList.oak_wood_stairs = new BlockItem(BlockList.oak_wood_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_wood_stairs.getRegistryName()),
		ItemList.oak_wood_slab = new BlockItem(BlockList.oak_wood_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_wood_slab.getRegistryName()),
		ItemList.oak_wood_wall = new BlockItem(BlockList.oak_wood_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_wood_wall.getRegistryName()),
		ItemList.oak_log_stairs = new BlockItem(BlockList.oak_log_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_log_stairs.getRegistryName()),
		ItemList.oak_log_slab = new BlockItem(BlockList.oak_log_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_log_slab.getRegistryName()),
		ItemList.oak_log_wall = new BlockItem(BlockList.oak_log_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_log_wall.getRegistryName()),
		ItemList.spruce_log_stairs = new BlockItem(BlockList.spruce_log_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_log_stairs.getRegistryName()),
		ItemList.spruce_log_slab = new BlockItem(BlockList.spruce_log_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_log_slab.getRegistryName()),
		ItemList.spruce_log_wall = new BlockItem(BlockList.spruce_log_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_log_wall.getRegistryName()),
		ItemList.spruce_wood_stairs = new BlockItem(BlockList.spruce_wood_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_wood_stairs.getRegistryName()),
		ItemList.spruce_wood_slab = new BlockItem(BlockList.spruce_wood_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_wood_slab.getRegistryName()),
		ItemList.spruce_wood_wall = new BlockItem(BlockList.spruce_wood_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_wood_wall.getRegistryName()),
		ItemList.dark_oak_log_stairs = new BlockItem(BlockList.dark_oak_log_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dark_oak_log_stairs.getRegistryName()),
		ItemList.dark_oak_log_slab = new BlockItem(BlockList.dark_oak_log_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dark_oak_log_slab.getRegistryName()),
		ItemList.dark_oak_log_wall = new BlockItem(BlockList.dark_oak_log_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dark_oak_log_wall.getRegistryName()),
		ItemList.dark_oak_wood_stairs = new BlockItem(BlockList.dark_oak_wood_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dark_oak_wood_stairs.getRegistryName()),
		ItemList.dark_oak_wood_slab = new BlockItem(BlockList.dark_oak_wood_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dark_oak_wood_slab.getRegistryName()),
		ItemList.dark_oak_wood_wall = new BlockItem(BlockList.dark_oak_wood_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dark_oak_wood_wall.getRegistryName()),
		ItemList.birch_log_stairs = new BlockItem(BlockList.birch_log_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_log_stairs.getRegistryName()),
		ItemList.birch_log_slab = new BlockItem(BlockList.birch_log_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_log_slab.getRegistryName()),
		ItemList.birch_log_wall = new BlockItem(BlockList.birch_log_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_log_wall.getRegistryName()),
		ItemList.birch_wood_stairs = new BlockItem(BlockList.birch_wood_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_wood_stairs.getRegistryName()),
		ItemList.birch_wood_slab = new BlockItem(BlockList.birch_wood_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_wood_slab.getRegistryName()),
		ItemList.birch_wood_wall = new BlockItem(BlockList.birch_wood_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_wood_wall.getRegistryName())
		
		);
			
		EntitiesList.registerEntitySpawnEggs(event);
			
			
			
		logger.info("Items Registered");
	}
		
	@SubscribeEvent
	public static void registerBlock(final RegistryEvent.Register<Block> event) 
	{
		event.getRegistry().registerAll
		(
			
			BlockList.earth_obelisk_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(50f, 18000000.0f).lightValue(15).sound(SoundType.METAL)).setRegistryName(location("earth_obelisk_block")),
			BlockList.earth_obelisk_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.earth_obelisk_block)).setRegistryName(location("earth_obelisk_wall")),
			BlockList.earth_obelisk_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.earth_obelisk_block)).setRegistryName(location("earth_obelisk_slab")),
			BlockList.earth_obelisk_stairs = (StairsBlock) new CustomStairsBlock(BlockList.earth_obelisk_block.getDefaultState(), Block.Properties.from(BlockList.earth_obelisk_block)).setRegistryName(location("earth_obelisk_stairs")),
			BlockList.dirt_slab = (SlabBlock) new SlabBlock(Block.Properties.create(Material.EARTH).hardnessAndResistance(0.5f, 2.5f).sound(SoundType.GROUND)).setRegistryName(location("dirt_slab")),
			BlockList.dirt_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.dirt_slab)).setRegistryName(location("dirt_wall")),
			BlockList.dirt_stairs = (StairsBlock) new CustomStairsBlock(BlockList.dirt_slab.getDefaultState(), Block.Properties.from(BlockList.dirt_slab)).setRegistryName(location("dirt_stairs")),
			BlockList.coarse_dirt_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.dirt_slab)).setRegistryName(location("coarse_dirt_wall")),
			BlockList.coarse_dirt_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.dirt_slab)).setRegistryName(location("coarse_dirt_slab")),
			BlockList.coarse_dirt_stairs = (StairsBlock) new CustomStairsBlock(BlockList.coarse_dirt_slab.getDefaultState(), Block.Properties.from(BlockList.dirt_slab)).setRegistryName(location("coarse_dirt_stairs")),
			BlockList.plains_beach_grass = new Block(Block.Properties.create(Material.EARTH).hardnessAndResistance(0.6f, 3.0f).sound(SoundType.PLANT)).setRegistryName(location("plains_beach_grass")),
			BlockList.plains_beach_grass_block = new Block(Block.Properties.from(BlockList.plains_beach_grass)).setRegistryName(location("plains_beach_grass_block")),
			BlockList.sand_slab = (SlabBlock) new SlabBlock(Block.Properties.create(Material.EARTH).hardnessAndResistance(0.5f, 2.5f).sound(SoundType.SAND)).setRegistryName(location("sand_slab")),
			BlockList.sand_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.sand_slab)).setRegistryName(location("sand_wall")),
			BlockList.sand_stairs = (StairsBlock) new CustomStairsBlock(BlockList.sand_slab.getDefaultState(), Block.Properties.from(BlockList.sand_slab)).setRegistryName(location("sand_stairs")),
			BlockList.oak_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.sand_slab.getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(2f, 10f).sound(SoundType.WOOD)).setRegistryName(location("oak_wood_stairs")),	
			BlockList.oak_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.oak_wood_stairs)).setRegistryName(location("oak_wood_slab")),
			BlockList.oak_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.oak_wood_stairs)).setRegistryName(location("oak_wood_wall")),
			BlockList.oak_log_stairs = (StairsBlock) new CustomStairsBlock(BlockList.oak_wood_stairs.getDefaultState(), Block.Properties.from(BlockList.oak_wood_stairs)).setRegistryName(location("oak_log_stairs")),
			BlockList.oak_log_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.oak_wood_stairs)).setRegistryName(location("oak_log_slab")),
			BlockList.oak_log_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.oak_wood_stairs)).setRegistryName(location("oak_log_wall")),
			BlockList.spruce_log_stairs = (StairsBlock) new CustomStairsBlock(BlockList.oak_wood_stairs.getDefaultState(), Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("spruce_log_stairs")),
			BlockList.spruce_log_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("spruce_log_slab")),
			BlockList.spruce_log_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("spruce_log_wall")),
			BlockList.spruce_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.oak_wood_stairs.getDefaultState(), Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("spruce_wood_stairs")),
			BlockList.spruce_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("spruce_wood_slab")),
			BlockList.spruce_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("spruce_wood_wall")),
			BlockList.dark_oak_log_stairs = (StairsBlock) new CustomStairsBlock(BlockList.oak_wood_stairs.getDefaultState(), Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("dark_oak_log_stairs")),
			BlockList.dark_oak_log_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("dark_oak_log_slab")),
			BlockList.dark_oak_log_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("dark_oak_log_wall")),
			BlockList.dark_oak_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.oak_log_stairs.getDefaultState(), Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("dark_oak_wood_stairs")),
			BlockList.dark_oak_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("dark_oak_wood_slab")),
			BlockList.dark_oak_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("dark_oak_wood_wall")),
			BlockList.birch_log_stairs = (StairsBlock) new CustomStairsBlock(BlockList.dark_oak_log_stairs.getDefaultState(), Block.Properties.from(BlockList.dark_oak_log_slab)).setRegistryName(location("birch_log_stairs")),
			BlockList.birch_log_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.dark_oak_log_slab)).setRegistryName(location("birch_log_slab")),
			BlockList.birch_log_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.dark_oak_log_slab)).setRegistryName(location("birch_log_wall")),
			BlockList.birch_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.dark_oak_log_stairs.getDefaultState(), Block.Properties.from(BlockList.dark_oak_log_slab)).setRegistryName(location("birch_wood_stairs")),
			BlockList.birch_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.dark_oak_log_slab)).setRegistryName(location("birch_wood_slab")),
			BlockList.birch_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.dark_oak_log_slab)).setRegistryName(location("birch_wood_wall"))
			);
			
			
			
		logger.info("Blocks Registered");
	}
		
	@SubscribeEvent
	public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) 
	{
		event.getRegistry().registerAll
		(
					
			EntitiesList.TEST_ENTITY
		);
			
		EntitiesList.registerEntityWorldSpawn();
	}
		

	
	public static ResourceLocation location(String name) 
	{
		return new ResourceLocation(modid, name);
	}
}