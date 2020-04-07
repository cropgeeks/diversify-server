/*
 * This file is generated by jOOQ.
 */
package jhi.diversify.server.database.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.diversify.server.database.tables.Partners;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class PartnersRecord extends UpdatableRecordImpl<PartnersRecord> implements Record4<Integer, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1478983997;

    /**
     * Create a detached PartnersRecord
     */
    public PartnersRecord() {
        super(Partners.PARTNERS);
    }

    /**
     * Getter for <code>diversify.partners.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>diversify.partners.partnername</code>.
     */
    public void setPartnername(String value) {
        set(1, value);
    }

    /**
     * Create a detached, initialised PartnersRecord
     */
    public PartnersRecord(Integer id, String partnername, Timestamp createdOn, Timestamp updatedOn) {
        super(Partners.PARTNERS);

        set(0, id);
        set(1, partnername);
        set(2, createdOn);
        set(3, updatedOn);
    }

    /**
     * Setter for <code>diversify.partners.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(2, value);
    }

    /**
     * Setter for <code>diversify.partners.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>diversify.partners.partnername</code>.
     */
    public String getPartnername() {
        return (String) get(1);
    }

    /**
     * Getter for <code>diversify.partners.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(2);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Timestamp, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Partners.PARTNERS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Partners.PARTNERS.PARTNERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Partners.PARTNERS.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Partners.PARTNERS.UPDATED_ON;
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
        return getPartnername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
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
        return getPartnername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PartnersRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PartnersRecord value2(String value) {
        setPartnername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PartnersRecord value3(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PartnersRecord value4(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PartnersRecord values(Integer value1, String value2, Timestamp value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>diversify.partners.updated_on</code>.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>diversify.partners.updated_on</code>.
     */
    public void setUpdatedOn(Timestamp value) {
        set(3, value);
    }
}
