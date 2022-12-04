package fr.babaprog.tutorial.enchantment

import net.minecraft.enchantment.Enchantment
import net.minecraft.enchantment.EnchantmentTarget
import net.minecraft.entity.Entity
import net.minecraft.entity.EquipmentSlot
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.effect.StatusEffects

class FrostEnchantment :
    Enchantment(Rarity.UNCOMMON, EnchantmentTarget.WEAPON, arrayOf(EquipmentSlot.MAINHAND)) {

    override fun getMinPower(level: Int): Int = 1

    override fun getMaxLevel(): Int = 3

    override fun onTargetDamaged(user: LivingEntity?, target: Entity?, level: Int) {
        if (target is LivingEntity) {
            if (level == 1) {
                target.addStatusEffect(StatusEffectInstance(StatusEffects.SLOWNESS, 20 * 2 * level, level - 1))
            }

            if (level == 2) {
                target.addStatusEffect(StatusEffectInstance(StatusEffects.SLOWNESS, 40 * 2 * level, level - 1))
                target.addStatusEffect(StatusEffectInstance(StatusEffects.BLINDNESS, 20 * 2 * level, level - 1))
            }

        }



        super.onTargetDamaged(user, target, level)
    }

}