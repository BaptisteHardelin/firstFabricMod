package fr.babaprog.tutorial

import fr.babaprog.tutorial.items.RegisterItems
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier


object ModName : ModInitializer {

    const val MOD_ID = "tutorial"

    val CUSTOM_GROUP: ItemGroup = FabricItemGroupBuilder.create(
        Identifier(MOD_ID, "custom_group")
    )
        .icon { ItemStack(RegisterItems.CUSTOM_ITEM) }
        .build()

    override fun onInitialize() {
        RegisterItems.register_tutorial()
    }

}