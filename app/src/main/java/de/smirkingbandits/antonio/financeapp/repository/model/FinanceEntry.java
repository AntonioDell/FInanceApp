package de.smirkingbandits.antonio.financeapp.repository.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Antonio on 17.08.2017.
 */
@Entity(indices = @Index(value = "tagId"),
        foreignKeys = @ForeignKey(entity = FinanceEntryTag.class, parentColumns = "id", childColumns = "tagId"))
public class FinanceEntry {

    @PrimaryKey
    public long id;
    public String description;
    public double amount;
    public long tagId;

}
