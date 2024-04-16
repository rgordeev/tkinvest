package ru.rgordeev.tkinvest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends CrudRepository<Price, Long>, WithInsert<Price> {

}
