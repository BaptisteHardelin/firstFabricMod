package fr.babaprog.tutorial.tools

import net.minecraft.item.AxeItem
import net.minecraft.item.ToolMaterial

class CustomAxe(material: ToolMaterial?, attackDamage: Float, attackSpeed: Float, settings: Settings?) :
    AxeItem(material, attackDamage, attackSpeed, settings) {
}