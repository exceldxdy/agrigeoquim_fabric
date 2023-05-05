package com.exceldxdy.agrigeoquim.items;

import com.exceldxdy.agrigeoquim.Agrigeoquim;
import com.exceldxdy.agrigeoquim.bloques.RegBloques;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class Grupos {

    public static ItemGroup NATURALES;
    public static ItemGroup PROCESADOS;
    public static ItemGroup ESPECIALES;

    public static void registrarGrupos() {
        NATURALES = FabricItemGroup.builder(new Identifier(Agrigeoquim.MOD_ID, "naturales"))
                .displayName(Text.translatable("itemgroup.naturales"))
                .icon(() -> new ItemStack(RegItems.CASITERITA_PULV)).build();
        PROCESADOS = FabricItemGroup.builder(new Identifier(Agrigeoquim.MOD_ID, "procesados"))
                .displayName(Text.translatable("itemgroups.procesados"))
                .icon(() -> new ItemStack(RegItems.LINGOTE_EST)).build();
        ESPECIALES = FabricItemGroup.builder(new Identifier(Agrigeoquim.MOD_ID, "especiales"))
                .displayName(Text.translatable("itemgroups.especiales"))
                .icon(() -> new ItemStack(RegBloques.WILL.asItem())).build();
    }
}
