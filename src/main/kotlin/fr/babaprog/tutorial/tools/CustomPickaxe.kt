package fr.babaprog.tutorial.tools

import net.minecraft.item.PickaxeItem
import net.minecraft.item.ToolMaterial

class CustomPickaxe(material: ToolMaterial?, attackDamage: Int, attackSpeed: Float, settings: Settings?) :
    PickaxeItem(material, attackDamage, attackSpeed, settings) {
}