package com.kelompoktiga.demo.Repository;

import com.kelompoktiga.demo.model.Feedback;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends CrudRepository <Feedback,Long> {

}
