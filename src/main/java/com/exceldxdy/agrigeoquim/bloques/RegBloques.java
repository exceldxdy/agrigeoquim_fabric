package com.exceldxdy.agrigeoquim.bloques;

import com.exceldxdy.agrigeoquim.Agrigeoquim;
import com.exceldxdy.agrigeoquim.items.Grupos;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.TransparentBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class RegBloques {

    public static final Block CASITERITA = registrarBloque("casiterita",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()),
            Grupos.NATURALES);

    public static final Block BLOQUE_EST = registrarBloque("bloque_est",
            new Block(FabricBlockSettings.of(Material.METAL).strength(1.5f).requiresTool()),
            Grupos.PROCESADOS);

    public static final Block WILL = registrarBloque("will",
            new Block(FabricBlockSettings.of(Material.DECORATION).strength(20f).requiresTool()),
            Grupos.ESPECIALES, Rarity.EPIC);

    public static final Block FOSFORITA = registrarBloque("fosforita",
            new Block(FabricBlockSettings.of(Material.STONE).strength(5f).requiresTool()),
            Grupos.NATURALES);

    public static final Block CINABRIO = registrarBloque("cinabrio",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2.5f).requiresTool()),
            Grupos.NATURALES);

    public static final Block ARGENTITA = registrarBloque("argentita",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2.5f).requiresTool()),
            Grupos.NATURALES);

    public static final Block AZUFRE_NATIVO = registrarBloque("azufre_nativo",
            new TransparentBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool().nonOpaque()),
            Grupos.NATURALES);

    public static final Block TEZONTLE = registrarBloque("tezontle",
            new Block(FabricBlockSettings.of(Material.STONE).strength(5f).requiresTool()),
            Grupos.NATURALES);

    public static final Block HALITA = registrarBloque("halita",
            new TransparentBlock(FabricBlockSettings.of(Material.STONE).strength(2.5f).requiresTool().nonOpaque()),
            Grupos.NATURALES);

    public static final Block URANINITA = registrarBloque("uraninita",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()),
            Grupos.NATURALES, Rarity.UNCOMMON);

    public static final Block BLOQUE_BRONCE = registrarBloque("bloque_bronce",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3f).requiresTool()),
            Grupos.PROCESADOS);

    private static Block registrarBloque(String nom, Block blq, ItemGroup grp) {
        registrarItemBloque(nom, blq, grp);
        return Registry.register(Registries.BLOCK, new Identifier(Agrigeoquim.MOD_ID, nom), blq);
    }

    private static Block registrarBloque(String nom, Block blq, ItemGroup grp, Rarity rar) {
        registrarItemBloque(nom, blq, grp, rar);
        return Registry.register(Registries.BLOCK, new Identifier(Agrigeoquim.MOD_ID, nom), blq);
    }

    private static Item registrarItemBloque(String nom, Block blq, ItemGroup grp) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Agrigeoquim.MOD_ID, nom),
                new BlockItem(blq, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(grp).register(entries -> entries.add(item));
        return item;
    }

    private static Item registrarItemBloque(String nom, Block blq, ItemGroup grp, Rarity rar) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Agrigeoquim.MOD_ID, nom),
                new BlockItem(blq, new FabricItemSettings().rarity(rar)));
        ItemGroupEvents.modifyEntriesEvent(grp).register(entries -> entries.add(item));
        return item;
    }

    public static void registrarBloquesMod() {
        Agrigeoquim.LOGGER.info("Registrando bloques de " + Agrigeoquim.MOD_ID + "...");

    }
}