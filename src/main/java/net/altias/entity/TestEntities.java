package net.altias.entity;

import net.altias.FlyingMountLibrary;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TestEntities {

    public static EntityType<net.altias.entity.TestFlyingMount> TEST_MOUNT;

    public static void register() {
        TEST_MOUNT = Registry.register(
                Registries.ENTITY_TYPE,
                Identifier.of(FlyingMountLibrary.MOD_ID, "test_flying_mount"),
                EntityType.Builder.create(TestFlyingMount::new, SpawnGroup.CREATURE)
                        .dimensions(1.4f, 1.6f)
                        .build()
        );

        FabricDefaultAttributeRegistry.register(TEST_MOUNT, TestFlyingMount.createAttributes());
    }
}
