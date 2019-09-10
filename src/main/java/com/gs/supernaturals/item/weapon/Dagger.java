package com.gs.supernaturals.item.weapon;

import com.google.common.collect.Multimap;
import com.gs.supernaturals.Supernaturals;
import com.gs.supernaturals.entity.player.ModPlayerEntity;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Dagger extends SwordItem {

    private float attackDamage;
    private float attackSpeed;
    private EffectInstance effect;

    public Dagger(IItemTier tier, int damageIn, float speedIn, SwordItem.Properties properties, EffectInstance effectIn) {
        super( tier, damageIn, speedIn, properties);
        this.attackDamage = damageIn + tier.getAttackDamage();
        this.attackSpeed = speedIn;
        this.effect = effectIn;
    }

    /**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
     * the damage on the stack.
     */
    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        Supernaturals.LOGGER.info("Call me on this bull: ");
        if(attacker.getActiveHand().equals(Hand.OFF_HAND)) {
            stack.damageItem(1, attacker, (x) -> {
                x.sendBreakAnimation(EquipmentSlotType.OFFHAND);
            });
        } else if (attacker.getActiveHand().equals(Hand.MAIN_HAND)) {
            stack.damageItem(1, attacker, (p_220045_0_) -> {
                p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
            });
        }
        Supernaturals.LOGGER.info("Made it out alive...");
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
        Supernaturals.LOGGER.info("Ya ya ee");
        if (playerIn.getHeldItemOffhand().getItem().equals(this.getItem())){
            ModPlayerEntity modPlayerEntity = new ModPlayerEntity(playerIn);
            modPlayerEntity.customAttackTargetEntityWithCurrentItem(playerIn, target);
            playerIn.swingArm(Hand.OFF_HAND);
            if(!playerIn.getEntityWorld().isRemote) {
                target.addPotionEffect(effect);
            }
        }
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
        Multimap<String, AttributeModifier> multimap = super.getAttributeModifiers(equipmentSlot);
        if (equipmentSlot.equals(EquipmentSlotType.OFFHAND)) {
            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double)this.attackDamage-this.getTier().getAttackDamage(), AttributeModifier.Operation.ADDITION));
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", (double)this.attackSpeed, AttributeModifier.Operation.ADDITION));
        }
        return multimap;
    }


}
