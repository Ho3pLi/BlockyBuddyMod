package com.mylifeblike.blockybuddymod.entity;

import com.mylifeblike.blockybuddymod.init.EntityInit;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

public class BBEntity extends LivingEntity {
    public BBEntity(EntityType<BBEntity> type, Level level) {
        super(type, level);
    }

    public BBEntity(Level level, double x, double y, double z){
        this(EntityInit.entityHolder.get(), level);
        setPos(x, y, z);
    }

    public BBEntity(Level level, BlockPos position){
        this(level, position.getX(), position.getY(), position.getZ());
    }

    @Override
    public Iterable<ItemStack> getArmorSlots() {
        return null;
    }

    @Override
    public ItemStack getItemBySlot(EquipmentSlot pSlot) {
        return null;
    }

    @Override
    public void setItemSlot(EquipmentSlot pSlot, ItemStack pStack) {

    }

    @Override
    public HumanoidArm getMainArm() {
        return null;
    }

//    protected void registerGoals(){
//        this.goalSelector.addGoal(0, new FloatGoal(this));
//        this.goalSelector.addGoal(1, new TryFindWaterGoal(this));
//    }

    public static AttributeSupplier.Builder createAttributes(){
        return Player.createAttributes();
    }

    protected static boolean isBrightEnoughToSpawn(BlockAndTintGetter level, BlockPos position) {
        return level.getRawBrightness(position, 0) > 8;
    }

    public static boolean canSpawn(EntityType<BBEntity> entityType, LevelAccessor level, MobSpawnType spawnType, BlockPos position, RandomSource random){
        boolean flag = MobSpawnType.ignoresLightRequirements(spawnType) || isBrightEnoughToSpawn(level, position);
        return level.getBlockState(position.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && flag;
    }

//    public BBEntity(EntityType<? extends Animal> pEntityType, Level pLevel) {
//        super(pEntityType, pLevel);
//    }
//
//    @Override
//    public boolean isFood(ItemStack pStack) {
//        return false;
//    }
//
//    @Nullable
//    @Override
//    public AgeableMob getBreedOffspring(ServerLevel pLevel, AgeableMob pOtherParent) {
//        return null;
//    }
//
//    @Override
//    protected void registerGoals() {
//        this.goalSelector.addGoal(0, new FloatGoal(this));
//        this.goalSelector.addGoal(1, new TryFindWaterGoal(this));
//    }
//
//    public static AttributeSupplier.Builder createAttributes(){
//        return Animal.createLivingAttributes()
//                .add(Attributes.MAX_HEALTH, 20D)
//                .add(Attributes.MOVEMENT_SPEED, 1D)
//                .add(Attributes.ATTACK_DAMAGE, 1D);
//    }
}
