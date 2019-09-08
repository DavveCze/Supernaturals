package com.gs.supernaturals.entity.player;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.AttackEntityEvent;

public class ModPlayerHooks extends ForgeHooks {

    public static boolean onPlayerOffhandAttackTarget(PlayerEntity player, Entity target) {
        if (MinecraftForge.EVENT_BUS.post(new AttackEntityEvent(player, target))) return false;
        ItemStack stack = player.getHeldItemOffhand();
        return stack.isEmpty() || !stack.getItem().onItemRightClick(player.getEntityWorld(), player, Hand.OFF_HAND).equals(null);
    }
}
