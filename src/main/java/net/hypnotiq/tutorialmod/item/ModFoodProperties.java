package net.hypnotiq.tutorialmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties KOHLRABI = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.3F).effect(new MobEffectInstance(MobEffects.REGENERATION, 200, 1), 1.0f).build();

}
