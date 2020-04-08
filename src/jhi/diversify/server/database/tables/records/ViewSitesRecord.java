/*
 * This file is generated by jOOQ.
 */
package jhi.diversify.server.database.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.diversify.server.database.tables.ViewSites;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;


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
public class ViewSitesRecord extends TableRecordImpl<ViewSitesRecord> implements Record12<Integer, String, String, Integer, BigDecimal, BigDecimal, Timestamp, Timestamp, Long, Long, Long, String> {

    private static final long serialVersionUID = -919510455;

    /**
     * Setter for <code>diversify.view_sites.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>diversify.view_sites.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>diversify.view_sites.sitename</code>.
     */
    public void setSitename(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>diversify.view_sites.sitename</code>.
     */
    public String getSitename() {
        return (String) get(1);
    }

    /**
     * Setter for <code>diversify.view_sites.othername</code>.
     */
    public void setOthername(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>diversify.view_sites.othername</code>.
     */
    public String getOthername() {
        return (String) get(2);
    }

    /**
     * Setter for <code>diversify.view_sites.partner_id</code>.
     */
    public void setPartnerId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>diversify.view_sites.partner_id</code>.
     */
    public Integer getPartnerId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>diversify.view_sites.latitude</code>.
     */
    public void setLatitude(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>diversify.view_sites.latitude</code>.
     */
    public BigDecimal getLatitude() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>diversify.view_sites.longitude</code>.
     */
    public void setLongitude(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>diversify.view_sites.longitude</code>.
     */
    public BigDecimal getLongitude() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>diversify.view_sites.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>diversify.view_sites.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>diversify.view_sites.updated_on</code>.
     */
    public void setUpdatedOn(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>diversify.view_sites.updated_on</code>.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>diversify.view_sites.plots</code>.
     */
    public void setPlots(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>diversify.view_sites.plots</code>.
     */
    public Long getPlots() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>diversify.view_sites.columns</code>.
     */
    public void setColumns(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>diversify.view_sites.columns</code>.
     */
    public Long getColumns() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>diversify.view_sites.rows</code>.
     */
    public void setRows(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>diversify.view_sites.rows</code>.
     */
    public Long getRows() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>diversify.view_sites.partnername</code>.
     */
    public void setPartnername(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>diversify.view_sites.partnername</code>.
     */
    public String getPartnername() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, String, String, Integer, BigDecimal, BigDecimal, Timestamp, Timestamp, Long, Long, Long, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, String, String, Integer, BigDecimal, BigDecimal, Timestamp, Timestamp, Long, Long, Long, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ViewSites.VIEW_SITES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ViewSites.VIEW_SITES.SITENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ViewSites.VIEW_SITES.OTHERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ViewSites.VIEW_SITES.PARTNER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return ViewSites.VIEW_SITES.LATITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return ViewSites.VIEW_SITES.LONGITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return ViewSites.VIEW_SITES.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return ViewSites.VIEW_SITES.UPDATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return ViewSites.VIEW_SITES.PLOTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return ViewSites.VIEW_SITES.COLUMNS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return ViewSites.VIEW_SITES.ROWS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return ViewSites.VIEW_SITES.PARTNERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSitename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getOthername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getPartnerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
        return getPlots();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component10() {
        return getColumns();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component11() {
        return getRows();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getPartnername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSitename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getOthername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getPartnerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getPlots();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getColumns();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getRows();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getPartnername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewSitesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewSitesRecord value2(String value) {
        setSitename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewSitesRecord value3(String value) {
        setOthername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewSitesRecord value4(Integer value) {
        setPartnerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewSitesRecord value5(BigDecimal value) {
        setLatitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewSitesRecord value6(BigDecimal value) {
        setLongitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewSitesRecord value7(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewSitesRecord value8(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewSitesRecord value9(Long value) {
        setPlots(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewSitesRecord value10(Long value) {
        setColumns(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewSitesRecord value11(Long value) {
        setRows(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewSitesRecord value12(String value) {
        setPartnername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewSitesRecord values(Integer value1, String value2, String value3, Integer value4, BigDecimal value5, BigDecimal value6, Timestamp value7, Timestamp value8, Long value9, Long value10, Long value11, String value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewSitesRecord
     */
    public ViewSitesRecord() {
        super(ViewSites.VIEW_SITES);
    }

    /**
     * Create a detached, initialised ViewSitesRecord
     */
    public ViewSitesRecord(Integer id, String sitename, String othername, Integer partnerId, BigDecimal latitude, BigDecimal longitude, Timestamp createdOn, Timestamp updatedOn, Long plots, Long columns, Long rows, String partnername) {
        super(ViewSites.VIEW_SITES);

        set(0, id);
        set(1, sitename);
        set(2, othername);
        set(3, partnerId);
        set(4, latitude);
        set(5, longitude);
        set(6, createdOn);
        set(7, updatedOn);
        set(8, plots);
        set(9, columns);
        set(10, rows);
        set(11, partnername);
    }
}
