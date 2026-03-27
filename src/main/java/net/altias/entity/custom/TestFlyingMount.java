package net.altias.entity;

import net.altias.entity.base.FlyingMountEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.world.World;


public class TestFlyingMount extends FlyingMountEntity {

    public TestFlyingMount(EntityType<? extends FlyingMountEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createAttributes() {
        return FlyingMountEntity.createBaseHorseAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.2)
                .add(EntityAttributes.GENERIC_FLYING_SPEED, 0.5); // optional if you want separate flying speed
    }
}
