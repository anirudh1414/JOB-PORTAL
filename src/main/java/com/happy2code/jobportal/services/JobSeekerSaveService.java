package com.happy2code.jobportal.services;

import com.happy2code.jobportal.Entity.JobPostActivity;
import com.happy2code.jobportal.Entity.JobSeekerProfile;
import com.happy2code.jobportal.Entity.JobSeekerSave;
import com.happy2code.jobportal.repository.JobSeekerSaveRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerSaveService {

    private final JobSeekerSaveRepository jobSeekerSaveRepository;

    public JobSeekerSaveService(JobSeekerSaveRepository jobSeekerSaveRepository) {
        this.jobSeekerSaveRepository = jobSeekerSaveRepository;
    }

    public List<JobSeekerSave> getCandidatesJob(JobSeekerProfile userAccountId) {
        return jobSeekerSaveRepository.findByUserId(userAccountId);
    }

    public List<JobSeekerSave> getJobCandidates(JobPostActivity job) {
        return jobSeekerSaveRepository.findByJob(job);
    }

    public void addNew(JobSeekerSave jobSeekerSave) {
        // ✅ Always ensure new record creation
        jobSeekerSave.setId(null);
        jobSeekerSaveRepository.save(jobSeekerSave);
    }

}
