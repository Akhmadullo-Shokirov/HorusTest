import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure {
    private List<Block> blocks;

    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }

    /**
     * Finds a block by its color.
     * @param color a block color.
     * @return An Optional block object if there are matches to the given color.
     * An empty Optional object is returned if no matched found, or the blocks list is empty.
     */
    @Override
    public Optional<Block> findBlockByColor(String color) {
        if (checkIfBlocksListNotNull()) {
            for (Block block : this.blocks) {
                if (block.getColor().equals(color)) {
                    return Optional.of(block);
                }
            }
        }
        return Optional.empty();
    }

    /**
     * Finds all blocks which have the same material as the given parameter
     * @param material name of the block material that's used to find blocks
     * @return a list of blocks that have the same material as the given material parameter.
     * If there are no matches, an empty list of blocks is returned.
     * If the blocks list equals to null, null value is returned.
     */
    @Override
    public List<Block> findBlocksByMaterial(String material) {
        if (checkIfBlocksListNotNull()) {
            List<Block> foundBlocksList = new ArrayList<>();
            for (Block block : this.blocks) {
                if (block.getMaterial().equals(material)) {
                    foundBlocksList.add(block);
                }
            }
            return foundBlocksList;
        }
        return null;
    }

    /**
     * Counts the elements of the Wall.
     * @return the number of blocks in the Wall structure
     */
    @Override
    public int count() {
        if (checkIfBlocksListNotNull()) {
            return this.blocks.size();
        }
        return 0;
    }

    /**
     * A helper method used to verify whether blocks list is null or not.
     * This logic is used many times in other methods,
     * that's why include the logic to check blocks list in this method
     */
    private boolean checkIfBlocksListNotNull() {
        return this.blocks != null;
    }
}
