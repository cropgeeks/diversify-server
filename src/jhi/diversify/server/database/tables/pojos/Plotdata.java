/*
 * This file is generated by jOOQ.
 */
package jhi.diversify.server.database.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Plotdata implements Serializable {

    private static final long serialVersionUID = 1148771300;

    private Integer   id;
    private Integer   datasetId;
    private Integer   plotId;
    private Integer   traitId;
    private Integer   rep;
    private String    value;
    private Integer   dateAccuracy;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Plotdata() {}

    public Plotdata(Plotdata value) {
        this.id = value.id;
        this.datasetId = value.datasetId;
        this.plotId = value.plotId;
        this.traitId = value.traitId;
        this.rep = value.rep;
        this.value = value.value;
        this.dateAccuracy = value.dateAccuracy;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Plotdata(
        Integer   id,
        Integer   datasetId,
        Integer   plotId,
        Integer   traitId,
        Integer   rep,
        String    value,
        Integer   dateAccuracy,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.datasetId = datasetId;
        this.plotId = plotId;
        this.traitId = traitId;
        this.rep = rep;
        this.value = value;
        this.dateAccuracy = dateAccuracy;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDatasetId() {
        return this.datasetId;
    }

    public void setDatasetId(Integer datasetId) {
        this.datasetId = datasetId;
    }

    public Integer getPlotId() {
        return this.plotId;
    }

    public void setPlotId(Integer plotId) {
        this.plotId = plotId;
    }

    public Integer getTraitId() {
        return this.traitId;
    }

    public void setTraitId(Integer traitId) {
        this.traitId = traitId;
    }

    public Integer getRep() {
        return this.rep;
    }

    public void setRep(Integer rep) {
        this.rep = rep;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getDateAccuracy() {
        return this.dateAccuracy;
    }

    public void setDateAccuracy(Integer dateAccuracy) {
        this.dateAccuracy = dateAccuracy;
    }

    public Timestamp getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public Timestamp getUpdatedOn() {
        return this.updatedOn;
    }

    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Plotdata (");

        sb.append(id);
        sb.append(", ").append(datasetId);
        sb.append(", ").append(plotId);
        sb.append(", ").append(traitId);
        sb.append(", ").append(rep);
        sb.append(", ").append(value);
        sb.append(", ").append(dateAccuracy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
}
