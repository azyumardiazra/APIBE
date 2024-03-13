package com.kelompoktiga.demo.Repository;

import com.kelompoktiga.demo.model.Queue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueRepository extends CrudRepository <Queue,Long>{
}
