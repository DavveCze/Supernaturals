package com.gs.supernaturals.item.weapon;

import com.google.common.collect.Multimap;
import com.gs.supernaturals.item.ModItemTier;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Supplier;

public class DaggerItem extends SwordItem {

    private Supplier<Effect> effect;

    public DaggerItem(IItemTier tier, int damageIn, float speedIn, SwordItem.Properties properties, Supplier<Effect> effectIn) {
        super(tier, damageIn, speedIn, properties);
        this.effect = effectIn;
    }

    /**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
     * the damage on the stack.
     */
    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        stack.damageItem(1, attacker, (p_220045_0_) -> {
            p_220045_0_.sendBreakAnimation(attacker.getActiveHand());
        });

        if (!attacker.getEntityWorld().isRemote) {
            target.addPotionEffect(new EffectInstance(effect.get(), 900, 0, false, true));
        }

        if (this.getTier() instanceof ModItemTier) {
            switch ((ModItemTier)this.getTier()) {
                case SILVER:
                    // TODO: Add x2 Damage to Supernatural Monsters
                    break;
                case WHITE_GOLD:
                    // TODO: Get Low / High Range from Design
                    if (Math.random() * 100 >= 90) {
                        target.attackEntityFrom(DamageSource.MAGIC, 2.0f);
                    }
                    break;
            }
        }

        return true;
    }

    /**
     * Called when a Block is destroyed using this Item. Return true to trigger the "Use Item" statistic.
     */
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving) {
        if (state.getBlockHardness(worldIn, pos) != 0.0F) {
            stack.damageItem(2, entityLiving, (p_220044_0_) -> {
                p_220044_0_.sendBreakAnimation(stack.getEquipmentSlot());
            });
        }

        return true;
    }


    @Override
    public boolean itemInteractionForEntity(ItemStack stack, PlayerEntity playerIn, LivingEntity target, Hand hand) {
//        if (playerIn.getHeldItemOffhand().getItem().getClass().equals(this.getItem().getClass())) {
//            ModPlayerEntity modPlayerEntity = new ModPlayerEntity(playerIn);
//            modPlayerEntity.customAttackTargetEntityWithCurrentItem(playerIn, target);
//            this.hand = Hand.OFF_HAND;
//        }
        return false;
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return false;
    }

    /**
     * Called to trigger the item's "innate" right click behavior. To handle when this item is used on a Block, see
     * {@link #onItemUse}.
     */
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        playerIn.setActiveHand(handIn);
        return new ActionResult<>(ActionResultType.SUCCESS, itemstack);
    }

    /**
     * Gets a map of item attribute modifiers, used by ItemSword to increase hit damage.
     */
    public Multimap<String, AttributeModifier> getAttributeModifiers(EquipmentSlotType equipmentSlot) {
        Multimap<String, AttributeModifier> multimap = super.getAttributeModifiers(equipmentSlot == EquipmentSlotType.OFFHAND ? EquipmentSlotType.MAINHAND : equipmentSlot);
        return multimap;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        ITextComponent tipText = new TranslationTextComponent("item.supernaturals.dagger.basic_tip").applyTextStyle(TextFormatting.ITALIC).applyTextStyle(TextFormatting.GRAY);
        tooltip.add(tipText);

        // Adds Metal Specific tooltips
        tipText = new TranslationTextComponent(this.getTranslationKey() + ".tooltip").applyTextStyle(TextFormatting.ITALIC).applyTextStyle(TextFormatting.GRAY);
        tooltip.add(tipText);

        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
