package com.sa.group18.demo.entity;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@Table(name="Activity")
@ToString
@EqualsAndHashCode
public class Activity {
    @Id
    @GeneratedValue
    private @NonNull Long id_Activity;
    private @NonNull String name_Activity;
    private @NonNull String time;
    private @NonNull Integer people;
    private @NonNull Integer age;
    private @NonNull String day;


    @OneToMany(
            mappedBy="activity", //bind many to one กับ comment
            cascade = CascadeType.ALL,
            orphanRemoval = true) //delete Cascade
    private List<Gender> Gender = new ArrayList<>();


/*
    @ManyToOne(fetch = FetchType.LAZY)   //set fetch data เป็น LAZY LAZY = fetch when needed EAGER = fetch immediately
    @JoinColumn(name= "id_gender")      // join colume video_id จาก video กับ entity comment
    private Gender gender;
*/
    @ManyToOne(fetch = FetchType.LAZY)   //set fetch data เป็น LAZY LAZY = fetch when needed EAGER = fetch immediately
    @JoinColumn(name= "id_kind")      // join colume video_id จาก video กับ entity comment
    private KindActivity kindActivity;

    @ManyToOne(fetch = FetchType.LAZY)   //set fetch data เป็น LAZY LAZY = fetch when needed EAGER = fetch immediately
    @JoinColumn(name= "id_room")      // join colume video_id จาก video กับ entity comment
    private Room room;
    
    public Activity(String name_Activity, String time, Integer people, Integer age, String day){
        this.age = age;
        this.day = day;
        this.people = people;
        this.time = time;
        this.name_Activity = name_Activity;

    }
}
