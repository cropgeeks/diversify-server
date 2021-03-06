/*
 * This file is generated by jOOQ.
 */
package jhi.diversify.server.database.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewSites implements Serializable {

    private static final long serialVersionUID = -118910238;

    private Integer    id;
    private String     sitename;
    private String     othername;
    private Integer    partnerId;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private Timestamp  createdOn;
    private Timestamp  updatedOn;
    private Long       plots;
    private Long       columns;
    private Long       rows;
    private String     partnername;

    public ViewSites() {}

    public ViewSites(ViewSites value) {
        this.id = value.id;
        this.sitename = value.sitename;
        this.othername = value.othername;
        this.partnerId = value.partnerId;
        this.latitude = value.latitude;
        this.longitude = value.longitude;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
        this.plots = value.plots;
        this.columns = value.columns;
        this.rows = value.rows;
        this.partnername = value.partnername;
    }

    public ViewSites(
        Integer    id,
        String     sitename,
        String     othername,
        Integer    partnerId,
        BigDecimal latitude,
        BigDecimal longitude,
        Timestamp  createdOn,
        Timestamp  updatedOn,
        Long       plots,
        Long       columns,
        Long       rows,
        String     partnername
    ) {
        this.id = id;
        this.sitename = sitename;
        this.othername = othername;
        this.partnerId = partnerId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.plots = plots;
        this.columns = columns;
        this.rows = rows;
        this.partnername = partnername;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSitename() {
        return this.sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename;
    }

    public String getOthername() {
        return this.othername;
    }

    public void setOthername(String othername) {
        this.othername = othername;
    }

    public Integer getPartnerId() {
        return this.partnerId;
    }

    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    public BigDecimal getLatitude() {
        return this.latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return this.longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
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

    public Long getPlots() {
        return this.plots;
    }

    public void setPlots(Long plots) {
        this.plots = plots;
    }

    public Long getColumns() {
        return this.columns;
    }

    public void setColumns(Long columns) {
        this.columns = columns;
    }

    public Long getRows() {
        return this.rows;
    }

    public void setRows(Long rows) {
        this.rows = rows;
    }

    public String getPartnername() {
        return this.partnername;
    }

    public void setPartnername(String partnername) {
        this.partnername = partnername;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewSites (");

        sb.append(id);
        sb.append(", ").append(sitename);
        sb.append(", ").append(othername);
        sb.append(", ").append(partnerId);
        sb.append(", ").append(latitude);
        sb.append(", ").append(longitude);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);
        sb.append(", ").append(plots);
        sb.append(", ").append(columns);
        sb.append(", ").append(rows);
        sb.append(", ").append(partnername);

        sb.append(")");
        return sb.toString();
    }
}
