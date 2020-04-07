/*
 * This file is generated by jOOQ.
 */
package jhi.diversify.server.database.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jhi.diversify.server.database.Diversify;
import jhi.diversify.server.database.Indexes;
import jhi.diversify.server.database.Keys;
import jhi.diversify.server.database.tables.records.PlantpartnersRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Plantpartners extends TableImpl<PlantpartnersRecord> {

    private static final long serialVersionUID = 32983680;

    /**
     * The reference instance of <code>diversify.plantpartners</code>
     */
    public static final Plantpartners PLANTPARTNERS = new Plantpartners();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PlantpartnersRecord> getRecordType() {
        return PlantpartnersRecord.class;
    }

    /**
     * The column <code>diversify.plantpartners.id</code>.
     */
    public final TableField<PlantpartnersRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>diversify.plantpartners.plantpartnername</code>.
     */
    public final TableField<PlantpartnersRecord, String> PLANTPARTNERNAME = createField("plantpartnername", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>diversify.plantpartners.created_on</code>.
     */
    public final TableField<PlantpartnersRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>diversify.plantpartners.updated_on</code>.
     */
    public final TableField<PlantpartnersRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>diversify.plantpartners</code> table reference
     */
    public Plantpartners() {
        this(DSL.name("plantpartners"), null);
    }

    /**
     * Create an aliased <code>diversify.plantpartners</code> table reference
     */
    public Plantpartners(String alias) {
        this(DSL.name(alias), PLANTPARTNERS);
    }

    /**
     * Create an aliased <code>diversify.plantpartners</code> table reference
     */
    public Plantpartners(Name alias) {
        this(alias, PLANTPARTNERS);
    }

    private Plantpartners(Name alias, Table<PlantpartnersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Plantpartners(Name alias, Table<PlantpartnersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Plantpartners(Table<O> child, ForeignKey<O, PlantpartnersRecord> key) {
        super(child, key, PLANTPARTNERS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Diversify.DIVERSIFY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PLANTPARTNERS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PlantpartnersRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PLANTPARTNERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PlantpartnersRecord> getPrimaryKey() {
        return Keys.KEY_PLANTPARTNERS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PlantpartnersRecord>> getKeys() {
        return Arrays.<UniqueKey<PlantpartnersRecord>>asList(Keys.KEY_PLANTPARTNERS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Plantpartners as(String alias) {
        return new Plantpartners(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Plantpartners as(Name alias) {
        return new Plantpartners(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Plantpartners rename(String name) {
        return new Plantpartners(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Plantpartners rename(Name name) {
        return new Plantpartners(name, null);
    }
}
