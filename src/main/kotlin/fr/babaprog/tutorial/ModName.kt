package fr.babaprog.tutorial

import fr.babaprog.tutorial.items.CustomItem
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import java.util.function.Supplier
import java.util.logging.Logger


object ModName : ModInitializer {
    private val logger = Logger.getLogger(ModName::class.java.name)
    private const val MOD_ID = "tutorial"
    private val CUSTOM_ITEM_GROUP_REPRESENTATION = CustomItem(FabricItemSettings().maxCount(16))
    private val CUSTOM_GROUP: ItemGroup = FabricItemGroupBuilder.create(
        Identifier(MOD_ID, "custom_group")
    )
        .icon { ItemStack(CUSTOM_ITEM_GROUP_REPRESENTATION) }
        .build()
    private val CUSTOM_ITEM = CustomItem(FabricItemSettings().group(CUSTOM_GROUP).maxCount(16))


    override fun onInitialize() {
        registerItems()
    }

    private fun registerItems() {
        Registry.register(Registry.ITEM, Identifier(MOD_ID, "custom_item_rep"), CUSTOM_ITEM_GROUP_REPRESENTATION)
        Registry.register(Registry.ITEM, Identifier(MOD_ID, "custom_item"), CUSTOM_ITEM)
        logger.info("All Items has been registered")
    }
}