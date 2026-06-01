package net.octtking.totemforge.block.states;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public abstract class ChorusPaste extends Block {

    private static final VoxelShape[] LEVEL_SHAPE = new VoxelShape[]{
            VoxelShapes.empty(),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
    };

    public ChorusPaste(AbstractBlock.Settings settings) {
        super(settings);
    }

    public static class HeatedChorusPasteSourceBlock extends ChorusPaste{


        public static final BooleanProperty FLOWING = BooleanProperty.of("flowing");

        public HeatedChorusPasteSourceBlock(Settings settings) {
            super(settings);
            setDefaultState(this.getDefaultState().with(FLOWING,false));
        }
        //shape
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            if(state.get(FLOWING)){
                return LEVEL_SHAPE[6];
            }else{
                return LEVEL_SHAPE[7];
            }
        }
        //defite
        @Override
        protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
            builder.add(FLOWING);
        }
    }
    public static class HeatedChorusPasteFlowingBlock extends ChorusPaste {
        public static final IntProperty LEVEL = Properties.LEVEL_1_8;


        public HeatedChorusPasteFlowingBlock(AbstractBlock.Settings settings) {
            super(settings);
            this.setDefaultState(this.stateManager.getDefaultState().with(LEVEL, 8));
        }

        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return LEVEL_SHAPE[state.get(LEVEL)];
        }

        @Override
        protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
            builder.add(LEVEL);
        }
    }

        @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if(entity instanceof LivingEntity) {
            entity.slowMovement(state, new Vec3d(0.8F, 0.75, 0.8F));
        }
    }
}
