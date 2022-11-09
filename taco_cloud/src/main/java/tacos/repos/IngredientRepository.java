package tacos.repos;

import org.springframework.data.repository.CrudRepository;
import tacos.datas.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
