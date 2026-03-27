package net.altias;

import net.altias.entity.TestFlyingMount;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.util.Identifier;

public class TestFlyingMountRenderer extends EntityRenderer<TestFlyingMount> {

    private static final Identifier DUMMY_TEXTURE = Identifier.of("minecraft", "textures/block/stone.png");

    public TestFlyingMountRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public void render(TestFlyingMount entity, float yaw, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {

    }

    @Override
    public Identifier getTexture(TestFlyingMount entity) {
        return DUMMY_TEXTURE;
    }
}
