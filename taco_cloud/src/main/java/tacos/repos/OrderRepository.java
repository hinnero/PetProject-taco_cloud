package tacos.repos;

import org.springframework.data.repository.CrudRepository;
import tacos.datas.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}
