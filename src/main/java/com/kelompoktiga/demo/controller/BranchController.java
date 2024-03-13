package com.kelompoktiga.demo.controller;

import com.kelompoktiga.demo.Service.BranchService;
import com.kelompoktiga.demo.model.Branch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/branch")
public class BranchController {

    @Autowired
    private BranchService branchService;

    @GetMapping
    public Iterable <Branch> getAllbranch() {
        return branchService.getAllbranch();
    }

    @GetMapping("/{branchId}")
    public Branch getbranchByid(@PathVariable Long id) {
        return branchService.getbranchByid(id);
    }

    @PostMapping
    public Branch saveBranch(@RequestBody Branch branch) {
        return branchService.saveBranch(branch);
    }

    @PutMapping ("/{branchId}")
    public Branch updateBranch(@PathVariable Long id, @RequestBody Branch branch) {
        branch.setIdbranch(id);
        return branchService.saveBranch(branch);
    }

    @DeleteMapping("/{branchId}")
    public void deleteBranch(@PathVariable Long id) {
        branchService.deleteBranch(id);
    }

}
