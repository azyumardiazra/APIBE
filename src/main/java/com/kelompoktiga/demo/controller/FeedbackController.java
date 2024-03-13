package com.kelompoktiga.demo.controller;

import com.kelompoktiga.demo.Service.FeedbackService;
import com.kelompoktiga.demo.model.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.support.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/feedback")
public class FeedbackController {
    @Autowired
    private FeedbackService feedbackService;

    @GetMapping
    public Iterable <Feedback> getAllfeedback() {
        return feedbackService.getAllfeedbacj();
    }

    @GetMapping("/{feedbackId}")
    public Feedback getfeedbackByid(@PathVariable Long id) {
        return feedbackService.getfeedbackByid(id);
    }

    @PostMapping
    public Feedback saveCustomer(@RequestBody Feedback feedback) {
        return feedbackService.saveFeedback(feedback);
    }

    @PutMapping("/{feedbackId}")
    public Feedback updateFeedback(@PathVariable Long id, @RequestBody Feedback feedback) {
        feedback.setIdfeedback(id);
        return feedbackService.saveFeedback(feedback);
    }

    @DeleteMapping("/{feedbackId}")
    public void deleteFeedback(@PathVariable Long id) {
        feedbackService.deleteFeedback(id);
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getBindingResult().getFieldError().getDefaultMessage());
    }
}
