/*
 * This file is generated by jOOQ.
 */
package jhi.diversify.server.database.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.diversify.server.database.tables.Plots;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.UpdatableRecordImpl;


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
public class PlotsRecord extends UpdatableRecordImpl<PlotsRecord> implements Record17<Integer, Integer, String, String, Integer, Integer, String, Integer, Integer, Integer, Integer, Integer, String, BigDecimal, BigDecimal, Timestamp, Timestamp> {

    private static final long serialVersionUID = 609830660;

    /**
     * Create a detached PlotsRecord
     */
    public PlotsRecord() {
        super(Plots.PLOTS);
    }

    /**
     * Create a detached, initialised PlotsRecord
     */
    public PlotsRecord(Integer id, Integer datasetId, String plotcode, String owncode, Integer siteId, Integer block, String plot, Integer subplot, Integer row, Integer col, Integer rep, Integer subrep, String management, BigDecimal latitude, BigDecimal longitude, Timestamp createdOn, Timestamp updatedOn) {
        super(Plots.PLOTS);

        set(0, id);
        set(1, datasetId);
        set(2, plotcode);
        set(3, owncode);
        set(4, siteId);
        set(5, block);
        set(6, plot);
        set(7, subplot);
        set(8, row);
        set(9, col);
        set(10, rep);
        set(11, subrep);
        set(12, management);
        set(13, latitude);
        set(14, longitude);
        set(15, createdOn);
        set(16, updatedOn);
    }

    /**
     * Getter for <code>diversify.plots.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>diversify.plots.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>diversify.plots.dataset_id</code>.
     */
    public Integer getDatasetId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>diversify.plots.dataset_id</code>.
     */
    public void setDatasetId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>diversify.plots.plotcode</code>.
     */
    public String getPlotcode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>diversify.plots.plotcode</code>.
     */
    public void setPlotcode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>diversify.plots.owncode</code>.
     */
    public String getOwncode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>diversify.plots.owncode</code>.
     */
    public void setOwncode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>diversify.plots.site_id</code>.
     */
    public Integer getSiteId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>diversify.plots.site_id</code>.
     */
    public void setSiteId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>diversify.plots.block</code>.
     */
    public Integer getBlock() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>diversify.plots.block</code>.
     */
    public void setBlock(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>diversify.plots.plot</code>.
     */
    public String getPlot() {
        return (String) get(6);
    }

    /**
     * Setter for <code>diversify.plots.plot</code>.
     */
    public void setPlot(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>diversify.plots.subplot</code>.
     */
    public Integer getSubplot() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>diversify.plots.subplot</code>.
     */
    public void setSubplot(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>diversify.plots.row</code>.
     */
    public Integer getRow() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>diversify.plots.row</code>.
     */
    public void setRow(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>diversify.plots.col</code>.
     */
    public Integer getCol() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>diversify.plots.col</code>.
     */
    public void setCol(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>diversify.plots.rep</code>.
     */
    public Integer getRep() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>diversify.plots.rep</code>.
     */
    public void setRep(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>diversify.plots.subrep</code>.
     */
    public Integer getSubrep() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>diversify.plots.subrep</code>.
     */
    public void setSubrep(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>diversify.plots.management</code>.
     */
    public String getManagement() {
        return (String) get(12);
    }

    /**
     * Setter for <code>diversify.plots.management</code>.
     */
    public void setManagement(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>diversify.plots.latitude</code>.
     */
    public BigDecimal getLatitude() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>diversify.plots.latitude</code>.
     */
    public void setLatitude(BigDecimal value) {
        set(13, value);
    }

    /**
     * Getter for <code>diversify.plots.longitude</code>.
     */
    public BigDecimal getLongitude() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>diversify.plots.longitude</code>.
     */
    public void setLongitude(BigDecimal value) {
        set(14, value);
    }

    /**
     * Getter for <code>diversify.plots.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(15);
    }

    /**
     * Setter for <code>diversify.plots.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(15, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Integer, Integer, String, String, Integer, Integer, String, Integer, Integer, Integer, Integer, Integer, String, BigDecimal, BigDecimal, Timestamp, Timestamp> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Integer, Integer, String, String, Integer, Integer, String, Integer, Integer, Integer, Integer, Integer, String, BigDecimal, BigDecimal, Timestamp, Timestamp> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * Getter for <code>diversify.plots.updated_on</code>.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(16);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Plots.PLOTS.DATASET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Plots.PLOTS.PLOTCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Plots.PLOTS.OWNCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Plots.PLOTS.SITE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Plots.PLOTS.BLOCK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Plots.PLOTS.PLOT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Plots.PLOTS.SUBPLOT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Plots.PLOTS.ROW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return Plots.PLOTS.COL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return Plots.PLOTS.REP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return Plots.PLOTS.SUBREP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Plots.PLOTS.MANAGEMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field14() {
        return Plots.PLOTS.LATITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field15() {
        return Plots.PLOTS.LONGITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field16() {
        return Plots.PLOTS.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field17() {
        return Plots.PLOTS.UPDATED_ON;
    }

    /**
     * Setter for <code>diversify.plots.updated_on</code>.
     */
    public void setUpdatedOn(Timestamp value) {
        set(16, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPlotcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getOwncode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getSiteId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getBlock();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getPlot();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getSubplot();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getCol();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getRep();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getSubrep();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getManagement();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component14() {
        return getLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component15() {
        return getLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component16() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component17() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Plots.PLOTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPlotcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getOwncode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getSiteId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getBlock();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPlot();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getSubplot();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getCol();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getRep();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getSubrep();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getManagement();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value14() {
        return getLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value15() {
        return getLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value16() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value17() {
        return getUpdatedOn();
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
    public PlotsRecord value2(Integer value) {
        setDatasetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlotsRecord value3(String value) {
        setPlotcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlotsRecord value4(String value) {
        setOwncode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlotsRecord value5(Integer value) {
        setSiteId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlotsRecord value6(Integer value) {
        setBlock(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlotsRecord value7(String value) {
        setPlot(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlotsRecord value8(Integer value) {
        setSubplot(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlotsRecord value9(Integer value) {
        setRow(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlotsRecord value10(Integer value) {
        setCol(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlotsRecord value11(Integer value) {
        setRep(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlotsRecord value12(Integer value) {
        setSubrep(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlotsRecord value13(String value) {
        setManagement(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlotsRecord value14(BigDecimal value) {
        setLatitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlotsRecord value15(BigDecimal value) {
        setLongitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlotsRecord value16(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlotsRecord value17(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlotsRecord values(Integer value1, Integer value2, String value3, String value4, Integer value5, Integer value6, String value7, Integer value8, Integer value9, Integer value10, Integer value11, Integer value12, String value13, BigDecimal value14, BigDecimal value15, Timestamp value16, Timestamp value17) {
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
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

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
    public PlotsRecord value1(Integer value) {
        setId(value);
        return this;
    }
}
