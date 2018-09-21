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
@Table(name="Gender")
@ToString
@EqualsAndHashCode

public class Gender {
    @Id
    @GeneratedValue
    private @NonNull Long id_Gender;
    private @NonNull String name_Gender;


    @ManyToOne(fetch = FetchType.LAZY)   //set fetch data เป็น LAZY LAZY = fetch when needed EAGER = fetch immediately
    @JoinColumn(name= "id_Activity")      // join colume video_id จาก video กับ entity comment
    private Activity activity;

    protected Gender(){}
/*
    @OneToMany(
            mappedBy="gender", //bind many to one กับ comment
            cascade = CascadeType.ALL,
            orphanRemoval = true) //delete Cascade
    private List<Activity> Activity = new ArrayList<>();
*/

    public Gender(String name_Gender){
        this.name_Gender = name_Gender;
    }
}
