package de.smirkingbandits.antonio.financeapp.repository.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Antonio on 17.08.2017.
 */
@Entity
public class Report {
    @PrimaryKey
    public long id;
    public String name;
}
