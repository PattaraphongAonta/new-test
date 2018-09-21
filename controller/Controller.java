package com.sa.group18.demo.controller;

        import com.sa.group18.demo.entity.Activity;
        import com.sa.group18.demo.entity.Gender;
        import com.sa.group18.demo.entity.KindActivity;
        import com.sa.group18.demo.entity.Room;
        import com.sa.group18.demo.repository.ActivityRepository;
        import com.sa.group18.demo.repository.GenderRepository;
        import com.sa.group18.demo.repository.KindActivityRepository;
        import com.sa.group18.demo.repository.RoomRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.CrossOrigin;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.Collection;
        import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins =  "http://localhost:4200")
public class Controller {

    @Autowired
    private ActivityRepository activityRepository;
    @Autowired
    private GenderRepository genderRepository;
    @Autowired
    private KindActivityRepository kindActivityRepository;
    @Autowired
    private RoomRepository roomRepository;


    //------------ Activity---------------
    @GetMapping("/activity")
    public Collection<Activity> getActivity(){
        return activityRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping("/activity/{id_Activity}")
    public Activity getOneActivity(@PathVariable Long id_Activity ){
        return activityRepository.findById(id_Activity).get();
    }

    //------------Gender-----------------------
    @GetMapping("/gender")
    public Collection<Gender> getGender(){
        return genderRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping("/gender/{id_Gender}")
    public Gender getOneGender(@PathVariable Long id_Gender ){
        return genderRepository.findById(id_Gender).get();
    }

    //---------------KindActivity---------------------
    @GetMapping("/kindActivity")
    public Collection<KindActivity> getKindActivity(){
        return kindActivityRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping("/kindActivity/{id_kind}")
    public KindActivity getOneKindActivity(@PathVariable Long id_kind ){
        return kindActivityRepository.findById(id_kind).get();
    }

    //---------------Room---------------------------
    @GetMapping("/room")
    public Collection<Room> getRoom(){
        return roomRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping("/room/{id_room}")
    public Room getOneRoom(@PathVariable Long id_room ){
        return roomRepository.findById(id_room).get();
    }
}
