package fr.babaprog.tutorial.tools

import net.minecraft.item.HoeItem
import net.minecraft.item.ToolMaterial

class CustomHoe(material: ToolMaterial?, attackDamage: Int, attackSpeed: Float, settings: Settings?) :
    HoeItem(material, attackDamage, attackSpeed, settings) {
}