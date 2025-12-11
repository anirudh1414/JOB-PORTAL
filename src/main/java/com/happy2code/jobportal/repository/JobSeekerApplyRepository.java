package com.happy2code.jobportal.repository;

import com.happy2code.jobportal.Entity.JobPostActivity;
import com.happy2code.jobportal.Entity.JobSeekerApply;
import com.happy2code.jobportal.Entity.JobSeekerProfile;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply, Integer> {

    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);

    List<JobSeekerApply> findByJob(JobPostActivity job);
}
