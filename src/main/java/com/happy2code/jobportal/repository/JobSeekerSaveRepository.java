package com.happy2code.jobportal.repository;
import com.happy2code.jobportal.Entity.JobPostActivity;
import com.happy2code.jobportal.Entity.JobSeekerProfile;
import com.happy2code.jobportal.Entity.JobSeekerSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {

    public List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);

    List<JobSeekerSave> findByJob(JobPostActivity job);

}
