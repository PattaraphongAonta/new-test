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
@Table(name="KindActivity")
@ToString
@EqualsAndHashCode

public class KindActivity {
    @Id
    @GeneratedValue
    private @NonNull Long id_kind;
    private @NonNull String kind_Activity;


    @OneToMany(
            mappedBy="kindActivity", //bind many to one กับ comment
            cascade = CascadeType.ALL,
            orphanRemoval = true) //delete Cascade
    private List<Activity> Activity = new ArrayList<>();
    public KindActivity(String kind_Activity){
        this.kind_Activity = kind_Activity;

    }
}
