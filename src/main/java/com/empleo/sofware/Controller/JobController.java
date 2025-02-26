package com.empleo.sofware.Controller;

import com.empleo.sofware.Entidades.Job;
import com.empleo.sofware.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/jobs")
    public class JobController {
        @Autowired
        private JobService jobService;

        @GetMapping
        public List<Job> getAllJobs() {
            return jobService.getAllJobs();
        }

        @PostMapping
        public Job createJob(@RequestBody Job job) {
            return jobService.createJob(job);
        }
    }

