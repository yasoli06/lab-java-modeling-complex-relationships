package com.nurseAssociation.nurseAssociation.repository;

import com.nurseAssociation.nurseAssociation.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
