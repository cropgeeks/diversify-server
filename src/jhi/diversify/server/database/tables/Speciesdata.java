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
import jhi.diversify.server.database.tables.records.SpeciesdataRecord;

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
public class Speciesdata extends TableImpl<SpeciesdataRecord> {

    /**
     * The reference instance of <code>diversify.speciesdata</code>
     */
    public static final Speciesdata SPECIESDATA = new Speciesdata();
    private static final long serialVersionUID = 777004890;

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SpeciesdataRecord> getRecordType() {
        return SpeciesdataRecord.class;
    }
    /**
     * The column <code>diversify.speciesdata.id</code>.
     */
    public final TableField<SpeciesdataRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>diversify.speciesdata.dataset_id</code>.
     */
    public final TableField<SpeciesdataRecord, Integer> DATASET_ID = createField("dataset_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>diversify.speciesdata.trait_id</code>.
     */
    public final TableField<SpeciesdataRecord, Integer> TRAIT_ID = createField("trait_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>diversify.speciesdata.varietyinplot_id</code>.
     */
    public final TableField<SpeciesdataRecord, Integer> VARIETYINPLOT_ID = createField("varietyinplot_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>diversify.speciesdata.rep</code>.
     */
    public final TableField<SpeciesdataRecord, Integer> REP = createField("rep", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>diversify.speciesdata.value</code>.
     */
    public final TableField<SpeciesdataRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>diversify.speciesdata.date_accuracy</code>.
     */
    public final TableField<SpeciesdataRecord, Integer> DATE_ACCURACY = createField("date_accuracy", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>diversify.speciesdata.created_on</code>.
     */
    public final TableField<SpeciesdataRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>diversify.speciesdata.updated_on</code>.
     */
    public final TableField<SpeciesdataRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>diversify.speciesdata</code> table reference
     */
    public Speciesdata() {
        this(DSL.name("speciesdata"), null);
    }

    /**
     * Create an aliased <code>diversify.speciesdata</code> table reference
     */
    public Speciesdata(String alias) {
        this(DSL.name(alias), SPECIESDATA);
    }

    /**
     * Create an aliased <code>diversify.speciesdata</code> table reference
     */
    public Speciesdata(Name alias) {
        this(alias, SPECIESDATA);
    }

    private Speciesdata(Name alias, Table<SpeciesdataRecord> aliased) {
        this(alias, aliased, null);
    }

    private Speciesdata(Name alias, Table<SpeciesdataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Speciesdata(Table<O> child, ForeignKey<O, SpeciesdataRecord> key) {
        super(child, key, SPECIESDATA);
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
        return Arrays.<Index>asList(Indexes.SPECIESDATA_DATASET_ID, Indexes.SPECIESDATA_PRIMARY, Indexes.SPECIESDATA_TRAIT_ID, Indexes.SPECIESDATA_VARIETYINPLOT_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SpeciesdataRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SPECIESDATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SpeciesdataRecord> getPrimaryKey() {
        return Keys.KEY_SPECIESDATA_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SpeciesdataRecord>> getKeys() {
        return Arrays.<UniqueKey<SpeciesdataRecord>>asList(Keys.KEY_SPECIESDATA_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<SpeciesdataRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SpeciesdataRecord, ?>>asList(Keys.SPECIESDATA_IBFK_3, Keys.SPECIESDATA_IBFK_1, Keys.SPECIESDATA_IBFK_2);
    }

    public Datasets datasets() {
        return new Datasets(this, Keys.SPECIESDATA_IBFK_3);
    }

    public Traits traits() {
        return new Traits(this, Keys.SPECIESDATA_IBFK_1);
    }

    public Varietyinplot varietyinplot() {
        return new Varietyinplot(this, Keys.SPECIESDATA_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Speciesdata as(String alias) {
        return new Speciesdata(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Speciesdata as(Name alias) {
        return new Speciesdata(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Speciesdata rename(String name) {
        return new Speciesdata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Speciesdata rename(Name name) {
        return new Speciesdata(name, null);
    }
}
