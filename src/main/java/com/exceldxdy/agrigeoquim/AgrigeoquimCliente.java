package com.exceldxdy.agrigeoquim;

import com.exceldxdy.agrigeoquim.bloques.RegBloques;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class AgrigeoquimCliente implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(RegBloques.HALITA, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(RegBloques.AZUFRE_NATIVO, RenderLayer.getTranslucent());
    }
}
