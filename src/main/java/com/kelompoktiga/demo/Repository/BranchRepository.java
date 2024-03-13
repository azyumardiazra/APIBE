package com.kelompoktiga.demo.Repository;

import com.kelompoktiga.demo.model.Branch;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends CrudRepository <Branch,Long> {
}
