package fr.babaprog.tutorial

import fr.babaprog.tutorial.items.CustomItem
import fr.babaprog.tutorial.items.RegisterItems
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

    const val MOD_ID = "tutorial"

    val CUSTOM_GROUP: ItemGroup = FabricItemGroupBuilder.create(
        Identifier(MOD_ID, "custom_group")
    )
        .icon { ItemStack(RegisterItems.CUSTOM_ITEM) }
        .build()

    override fun onInitialize() {
        RegisterItems.register()
    }

}