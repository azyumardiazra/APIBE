package com.kelompoktiga.demo.controller;

import com.kelompoktiga.demo.Service.QueueService;
import com.kelompoktiga.demo.model.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/queue")
public class QueueController {
    @Autowired
    private QueueService queueService;

    @GetMapping
    public Iterable <Queue> getAllqueue() {
        return queueService.getAllqueue();
    }

    @GetMapping("/{id}")
    public Queue getqueueByid(@PathVariable Long id) {
        return queueService.getqueueByid(id);
    }

    @PostMapping
    public Queue saveQueue(@RequestBody Queue queue) {
        return queueService.saveQueue(queue);
    }

    @PutMapping ("/{queueId}")
    public Queue updateQueue(@PathVariable Long id, @RequestBody Queue queue) {
        queue.setIdqueue(id);
        return queueService.saveQueue(queue);
    }

    @DeleteMapping("/{queueId}")
    public void deleteQueue(@PathVariable Long id) {
        queueService.deleteQueue(id);
    }
}
