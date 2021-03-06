package com.speedstersreborn.proxy;


import com.speedstersreborn.client.renderers.RenderEntityTrail;
import com.speedstersreborn.client.renderers.RenderRingDummy;
import com.speedstersreborn.common.entity.EntityRingDummy;
import com.speedstersreborn.util.handlers.client.TrailRenderHandler;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy implements IProxy {

    @Override
    public void preInit() {
        RenderingRegistry.registerEntityRenderingHandler(EntityRingDummy.class, RenderRingDummy::new);
        RenderingRegistry.registerEntityRenderingHandler(TrailRenderHandler.EntityTrail.class, RenderEntityTrail::new);
    }

    @Override
    public void init() {
    }

    @Override
    public void registerModelBakeryVariants() {
    }
}
