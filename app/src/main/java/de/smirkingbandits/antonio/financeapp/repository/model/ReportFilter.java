package de.smirkingbandits.antonio.financeapp.repository.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Antonio on 17.08.2017.
 */
@Entity(foreignKeys = @ForeignKey(entity = Report.class, parentColumns = "id", childColumns = "reportId"),
        indices = @Index(value = "reportId"))
public class ReportFilter {
    @PrimaryKey
    public long id;
    public long reportId;


}
