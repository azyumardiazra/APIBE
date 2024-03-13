package com.kelompoktiga.demo.Service;

import com.kelompoktiga.demo.Repository.FeedbackRepository;
import com.kelompoktiga.demo.model.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {
    @Autowired
    private FeedbackRepository feedbackRepository;

    public Iterable <Feedback> getAllfeedbacj() {
        return feedbackRepository.findAll();
    }

    public Feedback getfeedbackByid(Long id) {
        return feedbackRepository.findById(id).orElse(null);
    }

    public Feedback saveFeedback (Feedback Feedback) {
        return feedbackRepository.save(Feedback);
    }

    public void deleteFeedback(Long id) {
        feedbackRepository.deleteById(id);
    }
}
