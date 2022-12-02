package fr.babaprog.tutorial

import fr.babaprog.tutorial.items.CustomItem
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.registry.FuelRegistry
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import java.util.logging.Logger


object ModName : ModInitializer {
    private val logger = Logger.getLogger(ModName::class.java.name)
    private const val MOD_ID = "tutorial"
    private val CUSTOM_ITEM = CustomItem(FabricItemSettings().group(ItemGroup.MISC).maxCount(16))

    override fun onInitialize() {
        registerItems()
    }

    private fun registerItems() {
        Registry.register(Registry.ITEM, Identifier(MOD_ID, "custom_item"), CUSTOM_ITEM)
        logger.info("All Items has been registered")
    }
}