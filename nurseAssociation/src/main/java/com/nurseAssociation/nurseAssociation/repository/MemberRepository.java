package com.nurseAssociation.nurseAssociation.repository;


import com.nurseAssociation.nurseAssociation.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
