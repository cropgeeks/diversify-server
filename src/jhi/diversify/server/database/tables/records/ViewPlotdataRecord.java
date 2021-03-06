/*
 * This file is generated by jOOQ.
 */
package jhi.diversify.server.database.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.diversify.server.database.tables.ViewPlotdata;

import org.jooq.Field;
import org.jooq.Record18;
import org.jooq.Row18;
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
public class ViewPlotdataRecord extends TableRecordImpl<ViewPlotdataRecord> implements Record18<String, String, Integer, String, String, Integer, Integer, Integer, Integer, BigDecimal, Timestamp, Timestamp, Integer, String, Integer, String, String, String> {

    private static final long serialVersionUID = 1082398976;

    /**
     * Setter for <code>diversify.view_plotdata.plotcode</code>.
     */
    public void setPlotcode(String value) {
        set(0, value);
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
     * Getter for <code>diversify.view_plotdata.crops</code>.
     */
    public String getCrops() {
        return (String) get(1);
    }

    /**
     * Setter for <code>diversify.view_plotdata.siteId</code>.
     */
    public void setSiteid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>diversify.view_plotdata.siteId</code>.
     */
    public Integer getSiteid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>diversify.view_plotdata.sitename</code>.
     */
    public void setSitename(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>diversify.view_plotdata.sitename</code>.
     */
    public String getSitename() {
        return (String) get(3);
    }

    /**
     * Setter for <code>diversify.view_plotdata.partnername</code>.
     */
    public void setPartnername(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>diversify.view_plotdata.partnername</code>.
     */
    public String getPartnername() {
        return (String) get(4);
    }

    /**
     * Setter for <code>diversify.view_plotdata.id</code>.
     */
    public void setId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>diversify.view_plotdata.id</code>.
     */
    public Integer getId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>diversify.view_plotdata.plot_id</code>.
     */
    public void setPlotId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>diversify.view_plotdata.plot_id</code>.
     */
    public Integer getPlotId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>diversify.view_plotdata.trait_id</code>.
     */
    public void setTraitId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>diversify.view_plotdata.trait_id</code>.
     */
    public Integer getTraitId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>diversify.view_plotdata.rep</code>.
     */
    public void setRep(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>diversify.view_plotdata.rep</code>.
     */
    public Integer getRep() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>diversify.view_plotdata.value</code>.
     */
    public void setValue(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>diversify.view_plotdata.value</code>.
     */
    public BigDecimal getValue() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>diversify.view_plotdata.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>diversify.view_plotdata.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>diversify.view_plotdata.updated_on</code>.
     */
    public void setUpdatedOn(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>diversify.view_plotdata.updated_on</code>.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>diversify.view_plotdata.datasetid</code>.
     */
    public void setDatasetid(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>diversify.view_plotdata.datasetid</code>.
     */
    public Integer getDatasetid() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>diversify.view_plotdata.datasetname</code>.
     */
    public void setDatasetname(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>diversify.view_plotdata.datasetname</code>.
     */
    public String getDatasetname() {
        return (String) get(13);
    }

    /**
     * Setter for <code>diversify.view_plotdata.year</code>.
     */
    public void setYear(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>diversify.view_plotdata.year</code>.
     */
    public Integer getYear() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>diversify.view_plotdata.traitname</code>.
     */
    public void setTraitname(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>diversify.view_plotdata.traitname</code>.
     */
    public String getTraitname() {
        return (String) get(15);
    }

    /**
     * Setter for <code>diversify.view_plotdata.traitcode</code>.
     */
    public void setTraitcode(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>diversify.view_plotdata.traitcode</code>.
     */
    public String getTraitcode() {
        return (String) get(16);
    }

    /**
     * Setter for <code>diversify.view_plotdata.unit</code>.
     */
    public void setUnit(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>diversify.view_plotdata.unit</code>.
     */
    public String getUnit() {
        return (String) get(17);
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<String, String, Integer, String, String, Integer, Integer, Integer, Integer, BigDecimal, Timestamp, Timestamp, Integer, String, Integer, String, String, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<String, String, Integer, String, String, Integer, Integer, Integer, Integer, BigDecimal, Timestamp, Timestamp, Integer, String, Integer, String, String, String> valuesRow() {
        return (Row18) super.valuesRow();
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
    public Field<String> field5() {
        return ViewPlotdata.VIEW_PLOTDATA.PARTNERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return ViewPlotdata.VIEW_PLOTDATA.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return ViewPlotdata.VIEW_PLOTDATA.PLOT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return ViewPlotdata.VIEW_PLOTDATA.TRAIT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return ViewPlotdata.VIEW_PLOTDATA.REP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return ViewPlotdata.VIEW_PLOTDATA.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return ViewPlotdata.VIEW_PLOTDATA.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return ViewPlotdata.VIEW_PLOTDATA.UPDATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return ViewPlotdata.VIEW_PLOTDATA.DATASETID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return ViewPlotdata.VIEW_PLOTDATA.DATASETNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return ViewPlotdata.VIEW_PLOTDATA.YEAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return ViewPlotdata.VIEW_PLOTDATA.TRAITNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return ViewPlotdata.VIEW_PLOTDATA.TRAITCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return ViewPlotdata.VIEW_PLOTDATA.UNIT;
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
    public String component5() {
        return getPartnername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getPlotId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getTraitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getRep();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component13() {
        return getDatasetid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getDatasetname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component15() {
        return getYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getTraitname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getTraitcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getUnit();
    }

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
    public String value5() {
        return getPartnername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getPlotId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getTraitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getRep();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getDatasetid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getDatasetname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getTraitname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getTraitcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value1(String value) {
        setPlotcode(value);
        return this;
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
    public ViewPlotdataRecord value5(String value) {
        setPartnername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value6(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value7(Integer value) {
        setPlotId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value8(Integer value) {
        setTraitId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value9(Integer value) {
        setRep(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value10(BigDecimal value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value11(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value12(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value13(Integer value) {
        setDatasetid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value14(String value) {
        setDatasetname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value15(Integer value) {
        setYear(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value16(String value) {
        setTraitname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value17(String value) {
        setTraitcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord value18(String value) {
        setUnit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdataRecord values(String value1, String value2, Integer value3, String value4, String value5, Integer value6, Integer value7, Integer value8, Integer value9, BigDecimal value10, Timestamp value11, Timestamp value12, Integer value13, String value14, Integer value15, String value16, String value17, String value18) {
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
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewPlotdataRecord
     */
    public ViewPlotdataRecord() {
        super(ViewPlotdata.VIEW_PLOTDATA);
    }

    /**
     * Create a detached, initialised ViewPlotdataRecord
     */
    public ViewPlotdataRecord(String plotcode, String crops, Integer siteid, String sitename, String partnername, Integer id, Integer plotId, Integer traitId, Integer rep, BigDecimal value, Timestamp createdOn, Timestamp updatedOn, Integer datasetid, String datasetname, Integer year, String traitname, String traitcode, String unit) {
        super(ViewPlotdata.VIEW_PLOTDATA);

        set(0, plotcode);
        set(1, crops);
        set(2, siteid);
        set(3, sitename);
        set(4, partnername);
        set(5, id);
        set(6, plotId);
        set(7, traitId);
        set(8, rep);
        set(9, value);
        set(10, createdOn);
        set(11, updatedOn);
        set(12, datasetid);
        set(13, datasetname);
        set(14, year);
        set(15, traitname);
        set(16, traitcode);
        set(17, unit);
    }
}
