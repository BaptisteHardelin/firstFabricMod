package fr.babaprog.tutorial.items

import fr.babaprog.tutorial.ModName
import fr.babaprog.tutorial.armors.armorMaterials.CustomArmorMaterial
import fr.babaprog.tutorial.tools.CustomAxe
import fr.babaprog.tutorial.tools.CustomHoe
import fr.babaprog.tutorial.tools.CustomPickaxe
import fr.babaprog.tutorial.tools.PotatoToolMaterial
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.entity.EquipmentSlot
import net.minecraft.item.ArmorItem
import net.minecraft.item.Item
import net.minecraft.item.ShovelItem
import net.minecraft.item.SwordItem
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import java.util.logging.Logger


class RegisterItems {

    companion object {
        private val logger = Logger.getLogger(RegisterItems::class.java.name)
        val settingsGroup = Item.Settings().group(ModName.CUSTOM_GROUP)
        val CUSTOM_ITEM: Item = CustomItem(FabricItemSettings().group(ModName.CUSTOM_GROUP).maxCount(16))
        private val CUSTOM_ARMOR_MATERIAL = CustomArmorMaterial
        val CUSTOM_MATERIAL = CustomMaterialItem(settingsGroup)
        val CUSTOM_MATERIAL_HELMET =
            ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.HEAD, settingsGroup)
        val CUSTOM_MATERIAL_CHESTPLATE =
            ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.CHEST, settingsGroup)
        val CUSTOM_MATERIAL_LEGGINS =
            ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.LEGS, settingsGroup)
        val CUSTOM_MATERIAL_BOOTS =
            ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.FEET, settingsGroup)

        val POTATO_SHOVEL = ShovelItem(PotatoToolMaterial.INSTANCE, 1.5F, -3.0F, settingsGroup)
        val POTATO_SWORD = SwordItem(PotatoToolMaterial.INSTANCE, 3, -2.4F, settingsGroup)
        val POTATO_PICKAXE = CustomPickaxe(PotatoToolMaterial.INSTANCE, 1, -2.8F, settingsGroup)
        val POTATO_AXE = CustomAxe(PotatoToolMaterial.INSTANCE, 7.0F, -3.2F, settingsGroup)
        val POTATO_HOE = CustomHoe(PotatoToolMaterial.INSTANCE, 7, -3.2F, settingsGroup)

        fun register() {
            custom_registry("custom_item", CUSTOM_ITEM)
            custom_registry("custom_material", CUSTOM_MATERIAL)
            custom_registry("custom_material_helmet", CUSTOM_MATERIAL_HELMET)
            custom_registry("custom_material_chestplate", CUSTOM_MATERIAL_CHESTPLATE)
            custom_registry("custom_material_leggins", CUSTOM_MATERIAL_LEGGINS)
            custom_registry("custom_material_boots", CUSTOM_MATERIAL_BOOTS)
            custom_registry("potato_shovel", POTATO_SHOVEL)
            custom_registry("potato_sword", POTATO_SWORD)
            custom_registry("potato_pickaxe", POTATO_PICKAXE)
            custom_registry("potato_axe", POTATO_AXE)
            custom_registry("potato_hoe", POTATO_HOE)

            logger.info("All Items has been registered")
        }

        private fun custom_registry(name: String, item: Item) {
            Registry.register(
                Registry.ITEM,
                Identifier(ModName.MOD_ID, name),
                item
            )
        }
    }
}