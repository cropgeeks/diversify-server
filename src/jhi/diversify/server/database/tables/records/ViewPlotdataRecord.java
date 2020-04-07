/*
 * This file is generated by jOOQ.
 */
package jhi.diversify.server.database.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.diversify.server.database.tables.ViewPlotdata;

import org.jooq.Field;
import org.jooq.Record17;
import org.jooq.Row17;
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
public class ViewPlotdataRecord extends TableRecordImpl<ViewPlotdataRecord> implements Record17<String, String, Integer, String, Integer, Integer, Integer, Integer, BigDecimal, Timestamp, Timestamp, Integer, String, Integer, String, String, String> {

    private static final long serialVersionUID = 650572246;

    /**
     * Create a detached ViewPlotdataRecord
     */
    public ViewPlotdataRecord() {
        super(ViewPlotdata.VIEW_PLOTDATA);
    }

    /**
     * Getter for <code>diversify.view_plotdata.plotcode</code>.
     */
    public String getPlotcode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>diversify.view_plotdata.crops</code>.
     */
    public void setCrops(String value) {
        set(1, value);
    }

    /**
     * Create a detached, initialised ViewPlotdataRecord
     */
    public ViewPlotdataRecord(String plotcode, String crops, Integer siteid, String sitename, Integer id, Integer plotId, Integer traitId, Integer rep, BigDecimal value, Timestamp createdOn, Timestamp updatedOn, Integer datasetid, String datasetname, Integer year, String traitname, String traitcode, String unit) {
        super(ViewPlotdata.VIEW_PLOTDATA);

        set(0, plotcode);
        set(1, crops);
        set(2, siteid);
        set(3, sitename);
        set(4, id);
        set(5, plotId);
        set(6, traitId);
        set(7, rep);
        set(8, value);
        set(9, createdOn);
        set(10, updatedOn);
        set(11, datasetid);
        set(12, datasetname);
        set(13, year);
        set(14, traitname);
        set(15, traitcode);
        set(16, unit);
    }

    /**
     * Setter for <code>diversify.view_plotdata.siteId</code>.
     */
    public void setSiteid(Integer value) {
        set(2, value);
    }

    /**
     * Setter for <code>diversify.view_plotdata.plotcode</code>.
     */
    public void setPlotcode(String value) {
        set(0, value);
    }

    /**
     * Setter for <code>diversify.view_plotdata.sitename</code>.
     */
    public void setSitename(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>diversify.view_plotdata.crops</code>.
     */
    public String getCrops() {
        return (String) get(1);
    }

    /**
     * Setter for <code>diversify.view_plotdata.id</code>.
     */
    public void setId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>diversify.view_plotdata.siteId</code>.
     */
    public Integer getSiteid() {
        return (Integer) get(2);
    }

    /**
     * Getter for <code>diversify.view_plotdata.sitename</code>.
     */
    public String getSitename() {
        return (String) get(3);
    }

    /**
     * Getter for <code>diversify.view_plotdata.plot_id</code>.
     */
    public Integer getPlotId() {
        return (Integer) get(5);
    }

    /**
     * Getter for <code>diversify.view_plotdata.id</code>.
     */
    public Integer getId() {
        return (Integer) get(4);
    }

    /**
     * Getter for <code>diversify.view_plotdata.trait_id</code>.
     */
    public Integer getTraitId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>diversify.view_plotdata.plot_id</code>.
     */
    public void setPlotId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>diversify.view_plotdata.rep</code>.
     */
    public Integer getRep() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>diversify.view_plotdata.value</code>.
     */
    public void setValue(BigDecimal value) {
        set(8, value);
    }

    /**
     * Setter for <code>diversify.view_plotdata.trait_id</code>.
     */
    public void setTraitId(Integer value) {
        set(6, value);
    }

    /**
     * Setter for <code>diversify.view_plotdata.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(9, value);
    }

    /**
     * Setter for <code>diversify.view_plotdata.rep</code>.
     */
    public void setRep(Integer value) {
        set(7, value);
    }

    /**
     * Setter for <code>diversify.view_plotdata.updated_on</code>.
     */
    public void setUpdatedOn(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>diversify.view_plotdata.value</code>.
     */
    public BigDecimal getValue() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>diversify.view_plotdata.datasetid</code>.
     */
    public void setDatasetid(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>diversify.view_plotdata.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(9);
    }

    /**
     * Getter for <code>diversify.view_plotdata.updated_on</code>.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(10);
    }

    /**
     * Getter for <code>diversify.view_plotdata.datasetname</code>.
     */
    public String getDatasetname() {
        return (String) get(12);
    }

    /**
     * Getter for <code>diversify.view_plotdata.datasetid</code>.
     */
    public Integer getDatasetid() {
        return (Integer) get(11);
    }

    /**
     * Getter for <code>diversify.view_plotdata.year</code>.
     */
    public Integer getYear() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>diversify.view_plotdata.datasetname</code>.
     */
    public void setDatasetname(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>diversify.view_plotdata.traitname</code>.
     */
    public String getTraitname() {
        return (String) get(14);
    }

    /**
     * Setter for <code>diversify.view_plotdata.year</code>.
     */
    public void setYear(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>diversify.view_plotdata.traitcode</code>.
     */
    public String getTraitcode() {
        return (String) get(15);
    }

    /**
     * Setter for <code>diversify.view_plotdata.traitname</code>.
     */
    public void setTraitname(String value) {
        set(14, value);
    }

    /**
     * Setter for <code>diversify.view_plotdata.traitcode</code>.
     */
    public void setTraitcode(String value) {
        set(15, value);
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<String, String, Integer, String, Integer, Integer, Integer, Integer, BigDecimal, Timestamp, Timestamp, Integer, String, Integer, String, String, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<String, String, Integer, String, Integer, Integer, Integer, Integer, BigDecimal, Timestamp, Timestamp, Integer, String, Integer, String, String, String> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * Getter for <code>diversify.view_plotdata.unit</code>.
     */
    public String getUnit() {
        return (String) get(16);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ViewPlotdata.VIEW_PLOTDATA.CROPS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ViewPlotdata.VIEW_PLOTDATA.SITEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ViewPlotdata.VIEW_PLOTDATA.SITENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ViewPlotdata.VIEW_PLOTDATA.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return ViewPlotdata.VIEW_PLOTDATA.PLOT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return ViewPlotdata.VIEW_PLOTDATA.TRAIT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return ViewPlotdata.VIEW_PLOTDATA.REP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return ViewPlotdata.VIEW_PLOTDATA.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return ViewPlotdata.VIEW_PLOTDATA.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return ViewPlotdata.VIEW_PLOTDATA.UPDATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return ViewPlotdata.VIEW_PLOTDATA.DATASETID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return ViewPlotdata.VIEW_PLOTDATA.DATASETNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return ViewPlotdata.VIEW_PLOTDATA.YEAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return ViewPlotdata.VIEW_PLOTDATA.TRAITNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return ViewPlotdata.VIEW_PLOTDATA.TRAITCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return ViewPlotdata.VIEW_PLOTDATA.UNIT;
    }

    /**
     * Setter for <code>diversify.view_plotdata.unit</code>.
     */
    public void setUnit(String value) {
        set(16, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getCrops();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getSiteid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSitename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getPlotId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getTraitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getRep();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getDatasetid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getDatasetname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component14() {
        return getYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getTraitname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getTraitcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ViewPlotdata.VIEW_PLOTDATA.PLOTCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCrops();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSiteid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSitename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getPlotId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getTraitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getRep();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getDatasetid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getDatasetname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getTraitname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getTraitcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getPlotcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value2(String value) {
        setCrops(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value3(Integer value) {
        setSiteid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value4(String value) {
        setSitename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value5(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value6(Integer value) {
        setPlotId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value7(Integer value) {
        setTraitId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value8(Integer value) {
        setRep(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value9(BigDecimal value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value10(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value11(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value12(Integer value) {
        setDatasetid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value13(String value) {
        setDatasetname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value14(Integer value) {
        setYear(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value15(String value) {
        setTraitname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value16(String value) {
        setTraitcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value17(String value) {
        setUnit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord values(String value1, String value2, Integer value3, String value4, Integer value5, Integer value6, Integer value7, Integer value8, BigDecimal value9, Timestamp value10, Timestamp value11, Integer value12, String value13, Integer value14, String value15, String value16, String value17) {
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
    public String value1() {
        return getPlotcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value1(String value) {
        setPlotcode(value);
        return this;
    }
}
