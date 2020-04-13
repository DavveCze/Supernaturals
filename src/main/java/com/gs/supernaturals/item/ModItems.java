package com.gs.supernaturals.item;

import com.gs.supernaturals.Supernaturals;
import com.gs.supernaturals.effect.ModEffectInstance;
import com.gs.supernaturals.effect.ModEffects;
import com.gs.supernaturals.entity.ModEntities;
import com.gs.supernaturals.item.weapon.DaggerItem;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.gs.supernaturals.Supernaturals.creativeTab;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Supernaturals.MOD_ID);

    public static final RegistryObject<Item> SILVER_INGOT  = ITEMS.register("silver_ingot" , () -> new Item(new Item.Properties().group(creativeTab)));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties().group(creativeTab)));

    public static final RegistryObject<Item> WHITE_GOLD_INGOT  = ITEMS.register("white_gold_ingot" , () -> new Item(new Item.Properties().group(creativeTab)));
    public static final RegistryObject<Item> WHITE_GOLD_NUGGET = ITEMS.register("white_gold_nigget", () -> new Item(new Item.Properties().group(creativeTab)));

    public static final RegistryObject<Item> AMETHYST       = ITEMS.register("amethyst"      , () -> new Item(new Item.Properties().group(creativeTab)));
    public static final RegistryObject<Item> AMETHYST_BLOCK = ITEMS.register("amethyst_block", () -> new Item(new Item.Properties().group(creativeTab)));

    public static final RegistryObject<Item> MAGIC_WOOD  = ITEMS.register("magic_wood" , () -> new Item(new Item.Properties().group(creativeTab)));
    public static final RegistryObject<Item> CURSED_WOOD = ITEMS.register("cursed_wood", () -> new Item(new Item.Properties().group(creativeTab)));

    public static final RegistryObject<DaggerItem> DAGGER            = ITEMS.register("dagger"           , () -> new DaggerItem(ItemTier.IRON, 1, -2.4f, new SwordItem.Properties().maxDamage(150).group(creativeTab), new ModEffectInstance(ModEffects.BLEEDING,900,0,false,true), "iron_ingot"));
    public static final RegistryObject<DaggerItem> SILVER_DAGGER     = ITEMS.register("silver_dagger"    , () -> new DaggerItem(ItemTier.IRON, 1, -2.4f, new SwordItem.Properties().maxDamage(132).group(creativeTab), new ModEffectInstance(ModEffects.BLEEDING, 900, 0, false, true), "silver_ingot"));
    public static final RegistryObject<DaggerItem> WHITE_GOLD_DAGGER = ITEMS.register("white_gold_dagger", () -> new DaggerItem(ItemTier.IRON, 1, -2.4f, new SwordItem.Properties().maxDamage(104).group(creativeTab), new ModEffectInstance(ModEffects.BLEEDING, 900, 0, false, true), "white_gold_ingot"));

    public static final RegistryObject<Item> DRUID_LEAF = ITEMS.register("druid_leaf", () -> new Item(new Item.Properties().group(creativeTab)));

    public static final RegistryObject<Item> BEAR_FANG    = ITEMS.register("bear_fang"    , () -> new Item(new Item.Properties().group(creativeTab)));
    public static final RegistryObject<Item> WOLF_FUR     = ITEMS.register("wolf_fur"     , () -> new Item(new Item.Properties().group(creativeTab)));
    public static final RegistryObject<Item> WOLF_HEART   = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties().group(creativeTab)));
    public static final RegistryObject<Item> BIRD_WING    = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties().group(creativeTab)));
    public static final RegistryObject<Item> DOLPHIN_FIN  = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties().group(creativeTab)));
    public static final RegistryObject<Item> JAGUAR_FANG  = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties().group(creativeTab)));
    public static final RegistryObject<Item> JAGUAR_COAT  = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties().group(creativeTab)));
    public static final RegistryObject<Item> LIZARD_SCALE = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties().group(creativeTab)));
    public static final RegistryObject<Item> LIZARD_HEART = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties().group(creativeTab)));

    public static final RegistryObject<Item> SILVER_TIP = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties().group(creativeTab)));
    public static final RegistryObject<Item> BREW_GLASS = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties().group(creativeTab)));

    public static final RegistryObject<Item> SCREAM_BOTTLE = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties().group(creativeTab)));

}
