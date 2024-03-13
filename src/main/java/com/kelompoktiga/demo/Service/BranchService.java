package com.kelompoktiga.demo.Service;

import com.kelompoktiga.demo.Repository.BranchRepository;
import com.kelompoktiga.demo.model.Branch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BranchService {
    @Autowired
    private BranchRepository branchRepository;

    public Iterable <Branch> getAllbranch() {
        return branchRepository.findAll();
    }

    public Branch getbranchByid(Long id) {
        return branchRepository.findById(id).orElse(null);
    }

    public Branch saveBranch (Branch Branch) {
        return branchRepository.save(Branch);
    }

    public void deleteBranch(Long id) {
        branchRepository.deleteById(id);
    }
}
