package com.sa.group18.demo.repository;

import com.sa.group18.demo.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestController
@CrossOrigin(origins = "http://localhost:4200")
public interface RoomRepository extends JpaRepository<Room,Long> {
}
