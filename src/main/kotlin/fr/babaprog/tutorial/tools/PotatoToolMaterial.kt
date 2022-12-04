package fr.babaprog.tutorial.tools

import net.minecraft.item.Items
import net.minecraft.item.ToolMaterial
import net.minecraft.recipe.Ingredient

class PotatoToolMaterial : ToolMaterial {

    companion object {
        val INSTANCE = PotatoToolMaterial()
    }

    override fun getDurability(): Int = 500

    override fun getMiningSpeedMultiplier(): Float = 8.0F

    override fun getAttackDamage(): Float = 3.0F

    override fun getMiningLevel(): Int = 4

    override fun getEnchantability(): Int = 15

    override fun getRepairIngredient(): Ingredient = Ingredient.ofItems(Items.POTATO)
}