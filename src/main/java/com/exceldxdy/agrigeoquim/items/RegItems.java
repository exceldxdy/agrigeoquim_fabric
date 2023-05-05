package com.exceldxdy.agrigeoquim.items;

import com.exceldxdy.agrigeoquim.Agrigeoquim;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RegItems {

    public static final Item LINGOTE_EST = registrarItem("lingote_est",
            new Item(new FabricItemSettings()));

    public static final Item CASITERITA_PULV = registrarItem("casiterita_pulv",
            new Item(new FabricItemSettings()));

    private static Item registrarItem(String nom, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Agrigeoquim.MOD_ID, nom), item);
    }

    public static void agregarItemsAGrupo() {
        agregarAGrupo(ItemGroups.INGREDIENTS, CASITERITA_PULV);
        agregarAGrupo(ItemGroups.INGREDIENTS, LINGOTE_EST);
        agregarAGrupo(Grupos.NATURALES, CASITERITA_PULV);
        agregarAGrupo(Grupos.PROCESADOS, LINGOTE_EST);
    }

    private static void agregarAGrupo(ItemGroup grp, Item item) {
        ItemGroupEvents.modifyEntriesEvent(grp).register(entries -> entries.add(item));
    }

    public static void registrarItemsMod() {
        Agrigeoquim.LOGGER.info("Registrando items de " + Agrigeoquim.MOD_ID + "...");
        agregarItemsAGrupo();
    }
}
