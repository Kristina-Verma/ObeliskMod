package fox.obeliskmod.blocks.lighting;

import fox.obeliskmod.blockstateproperties.ObeliskBlockStateProperties;
import fox.obeliskmod.blockstateproperties.enumproperties.CandleSize;
import fox.obeliskmod.utility.VoxelShapeHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IEnviromentBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public class CandleWallmounted extends HorizontalBlock {
    public CandleWallmounted(Properties builder) {
        super(builder);
    }

    @Override
    public int getLightValue(BlockState state, IEnviromentBlockReader world, BlockPos pos) {
        return 12;
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return VoxelShapeHelper.createRotatedShape(state.get(BlockStateProperties.HORIZONTAL_FACING), 5, 2, 0, 11, 16, 9);
    }

    /**
     * Called periodically clientside on blocks near the player to show effects (like furnace fire particles). Note that
     * this method will always be called regardless of whether the block can receive random update ticks
     */
    @Override
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        double d0 = (double)pos.getX() + 0.5D;
        double d2 = (double)pos.getZ() + 0.625D;
        double d1;

        switch (stateIn.getBlockState().get(ObeliskBlockStateProperties.CANDLE_SIZE)) {
            case TALL:
                d1 = (double)pos.getY() + 1.125D;
                break;
            case MEDIUM:
                d1 = (double)pos.getY() + 1D;
                break;
            case SHORT:
            default:
                d1 = (double)pos.getY() + 0.875D;
        }

        worldIn.addParticle(ParticleTypes.SMOKE, d0, d1, d2, 0.0D, 0.0D, 0.0D);
        worldIn.addParticle(ParticleTypes.FLAME, d0, d1, d2, 0.0D, 0.0D, 0.0D);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        BlockState blockstate = super.getStateForPlacement(context);

        if (blockstate != null) {
            blockstate = blockstate
                    .with(BlockStateProperties.HORIZONTAL_FACING, context.getPlacementHorizontalFacing())
                    .with(ObeliskBlockStateProperties.CANDLE_SIZE, CandleSize.TALL);
        }
        return blockstate;
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> container) {
        container.add(BlockStateProperties.HORIZONTAL_FACING);
        container.add(ObeliskBlockStateProperties.CANDLE_SIZE);
    }
}
