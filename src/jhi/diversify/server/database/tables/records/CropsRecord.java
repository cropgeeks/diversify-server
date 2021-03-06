/*
 * This file is generated by jOOQ.
 */
package jhi.diversify.server.database.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.diversify.server.database.tables.Crops;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class CropsRecord extends UpdatableRecordImpl<CropsRecord> implements Record6<Integer, String, String, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 61184292;

    /**
     * Setter for <code>diversify.crops.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>diversify.crops.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>diversify.crops.cropcommonname</code>.
     */
    public void setCropcommonname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>diversify.crops.cropcommonname</code>.
     */
    public String getCropcommonname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>diversify.crops.croplatinname</code>.
     */
    public void setCroplatinname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>diversify.crops.croplatinname</code>.
     */
    public String getCroplatinname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>diversify.crops.plantpartner_id</code>.
     */
    public void setPlantpartnerId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>diversify.crops.plantpartner_id</code>.
     */
    public Integer getPlantpartnerId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>diversify.crops.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>diversify.crops.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>diversify.crops.updated_on</code>.
     */
    public void setUpdatedOn(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>diversify.crops.updated_on</code>.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Crops.CROPS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Crops.CROPS.CROPCOMMONNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Crops.CROPS.CROPLATINNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Crops.CROPS.PLANTPARTNER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Crops.CROPS.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Crops.CROPS.UPDATED_ON;
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
        return getCropcommonname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCroplatinname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getPlantpartnerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getUpdatedOn();
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
        return getCropcommonname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCroplatinname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getPlantpartnerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CropsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CropsRecord value2(String value) {
        setCropcommonname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CropsRecord value3(String value) {
        setCroplatinname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CropsRecord value4(Integer value) {
        setPlantpartnerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CropsRecord value5(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CropsRecord value6(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CropsRecord values(Integer value1, String value2, String value3, Integer value4, Timestamp value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CropsRecord
     */
    public CropsRecord() {
        super(Crops.CROPS);
    }

    /**
     * Create a detached, initialised CropsRecord
     */
    public CropsRecord(Integer id, String cropcommonname, String croplatinname, Integer plantpartnerId, Timestamp createdOn, Timestamp updatedOn) {
        super(Crops.CROPS);

        set(0, id);
        set(1, cropcommonname);
        set(2, croplatinname);
        set(3, plantpartnerId);
        set(4, createdOn);
        set(5, updatedOn);
    }
}
