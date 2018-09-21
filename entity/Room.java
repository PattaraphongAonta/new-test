package com.sa.group18.demo.entity;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.*;
import java.util.*;

@Entity
@Data
@Table(name="Room")
@ToString
@EqualsAndHashCode

public class Room {
    @Id
    @GeneratedValue
    private @NonNull Long id_room;
    private @NonNull int name_room;

    @OneToMany(
            mappedBy="room", //bind many to one กับ comment
            cascade = CascadeType.ALL,
            orphanRemoval = true) //delete Cascade
    private List<Activity> Activity = new ArrayList<>();

    public Room(Integer name_room){

        this.name_room = name_room;
    }
}
