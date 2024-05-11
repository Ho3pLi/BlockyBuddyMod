package net.ho3pli.blockybuddymod.entity.custom;

import net.ho3pli.blockybuddymod.BlockyBuddyMod;
import net.ho3pli.blockybuddymod.entity.ModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.TryFindWaterGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class BBEntity extends LivingEntity {
    public BBEntity(EntityType<BBEntity> type, Level level) {
        super(type, level);
    }

    public BBEntity(Level level, double x, double y, double z){
        this(ModEntities.entityHolder.get(), level);
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
