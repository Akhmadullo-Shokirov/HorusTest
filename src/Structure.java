import java.util.List;
import java.util.Optional;

public interface Structure {
    // returns any element with the given color
    Optional<Block> findBlockByColor(String color);

    // return all elements from the given material
    List<Block> findBlocksByMaterial(String material);

    //returns the number of all elements in the structure
    int count();
}
