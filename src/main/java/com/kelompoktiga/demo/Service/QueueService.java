package com.kelompoktiga.demo.Service;

import com.kelompoktiga.demo.Repository.QueueRepository;
import com.kelompoktiga.demo.model.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueueService {
@Autowired
    private QueueRepository queueRepository;

    public Iterable <Queue> getAllqueue() {
        return queueRepository.findAll();
    }

    public Queue getqueueByid(Long id) {
        return queueRepository.findById(id).orElse(null);
    }

    public Queue saveQueue (Queue Queue) {
        return queueRepository.save(Queue);
    }

    public void deleteQueue(Long id) {
        queueRepository.deleteById(id);
    }
}
