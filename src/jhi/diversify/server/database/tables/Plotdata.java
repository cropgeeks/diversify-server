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
import jhi.diversify.server.database.tables.records.PlotdataRecord;

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
public class Plotdata extends TableImpl<PlotdataRecord> {

    private static final long serialVersionUID = -841711712;

    /**
     * The reference instance of <code>diversify.plotdata</code>
     */
    public static final Plotdata PLOTDATA = new Plotdata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PlotdataRecord> getRecordType() {
        return PlotdataRecord.class;
    }

    /**
     * The column <code>diversify.plotdata.id</code>.
     */
    public final TableField<PlotdataRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>diversify.plotdata.dataset_id</code>.
     */
    public final TableField<PlotdataRecord, Integer> DATASET_ID = createField("dataset_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>diversify.plotdata.plot_id</code>.
     */
    public final TableField<PlotdataRecord, Integer> PLOT_ID = createField("plot_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>diversify.plotdata.trait_id</code>.
     */
    public final TableField<PlotdataRecord, Integer> TRAIT_ID = createField("trait_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>diversify.plotdata.rep</code>.
     */
    public final TableField<PlotdataRecord, Integer> REP = createField("rep", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>diversify.plotdata.value</code>.
     */
    public final TableField<PlotdataRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>diversify.plotdata.date_accuracy</code>.
     */
    public final TableField<PlotdataRecord, Integer> DATE_ACCURACY = createField("date_accuracy", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>diversify.plotdata.created_on</code>.
     */
    public final TableField<PlotdataRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>diversify.plotdata.updated_on</code>.
     */
    public final TableField<PlotdataRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>diversify.plotdata</code> table reference
     */
    public Plotdata() {
        this(DSL.name("plotdata"), null);
    }

    /**
     * Create an aliased <code>diversify.plotdata</code> table reference
     */
    public Plotdata(String alias) {
        this(DSL.name(alias), PLOTDATA);
    }

    /**
     * Create an aliased <code>diversify.plotdata</code> table reference
     */
    public Plotdata(Name alias) {
        this(alias, PLOTDATA);
    }

    private Plotdata(Name alias, Table<PlotdataRecord> aliased) {
        this(alias, aliased, null);
    }

    private Plotdata(Name alias, Table<PlotdataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Plotdata(Table<O> child, ForeignKey<O, PlotdataRecord> key) {
        super(child, key, PLOTDATA);
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
        return Arrays.<Index>asList(Indexes.PLOTDATA_DATASET_ID, Indexes.PLOTDATA_PLOT_ID, Indexes.PLOTDATA_PRIMARY, Indexes.PLOTDATA_TRAIT_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PlotdataRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PLOTDATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PlotdataRecord> getPrimaryKey() {
        return Keys.KEY_PLOTDATA_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PlotdataRecord>> getKeys() {
        return Arrays.<UniqueKey<PlotdataRecord>>asList(Keys.KEY_PLOTDATA_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<PlotdataRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PlotdataRecord, ?>>asList(Keys.PLOTDATA_IBFK_3, Keys.PLOTDATA_IBFK_1, Keys.PLOTDATA_IBFK_2);
    }

    public Datasets datasets() {
        return new Datasets(this, Keys.PLOTDATA_IBFK_3);
    }

    public Plots plots() {
        return new Plots(this, Keys.PLOTDATA_IBFK_1);
    }

    public Traits traits() {
        return new Traits(this, Keys.PLOTDATA_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Plotdata as(String alias) {
        return new Plotdata(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Plotdata as(Name alias) {
        return new Plotdata(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Plotdata rename(String name) {
        return new Plotdata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Plotdata rename(Name name) {
        return new Plotdata(name, null);
    }
}
