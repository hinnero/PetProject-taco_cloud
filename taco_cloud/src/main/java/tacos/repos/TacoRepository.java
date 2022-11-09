package tacos.repos;

import org.springframework.data.repository.CrudRepository;
import tacos.datas.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
