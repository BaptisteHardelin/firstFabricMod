package fr.babaprog.tutorial.armors.armorMaterials

import fr.babaprog.tutorial.items.RegisterItems
import net.minecraft.entity.EquipmentSlot
import net.minecraft.item.ArmorMaterial
import net.minecraft.recipe.Ingredient
import net.minecraft.sound.SoundEvent
import net.minecraft.sound.SoundEvents

object CustomArmorMaterial : ArmorMaterial {
    private val BASE_DURABILITY = intArrayOf(13, 15, 16, 11)
    private val PROTECTION_VALUES = intArrayOf(1, 3, 9, 4)
    private const val customArmorToughness = 37
    // In which [0] is boots, [1] leggings, [2] chestplate, and [3] helmet.

    override fun getDurability(slot: EquipmentSlot): Int =
        BASE_DURABILITY[slot.entitySlotId] * customArmorToughness

    override fun getProtectionAmount(slot: EquipmentSlot): Int =
        BASE_DURABILITY[slot.entitySlotId]

    override fun getEnchantability(): Int = customArmorToughness
    override fun getEquipSound(): SoundEvent = SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE

    override fun getRepairIngredient(): Ingredient =
        Ingredient.ofItems(RegisterItems.CUSTOM_ITEM)

    override fun getName(): String = "custom_armor"

    override fun getToughness(): Float = 0.5F

    override fun getKnockbackResistance(): Float = 0.2F

}