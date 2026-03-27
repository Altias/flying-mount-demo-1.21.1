package net.altias;

import net.altias.entity.TestEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class FlyingMountDemoClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		EntityRendererRegistry.register(TestEntities.TEST_MOUNT, TestFlyingMountRenderer::new);
	}
}