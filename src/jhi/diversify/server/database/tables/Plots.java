/*
 * This file is generated by jOOQ.
 */
package jhi.diversify.server.database.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jhi.diversify.server.database.Diversify;
import jhi.diversify.server.database.Indexes;
import jhi.diversify.server.database.Keys;
import jhi.diversify.server.database.tables.records.PlotsRecord;

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
public class Plots extends TableImpl<PlotsRecord> {

    private static final long serialVersionUID = 1741992966;

    /**
     * The reference instance of <code>diversify.plots</code>
     */
    public static final Plots PLOTS = new Plots();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PlotsRecord> getRecordType() {
        return PlotsRecord.class;
    }

    /**
     * The column <code>diversify.plots.id</code>.
     */
    public final TableField<PlotsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>diversify.plots.dataset_id</code>.
     */
    public final TableField<PlotsRecord, Integer> DATASET_ID = createField("dataset_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>diversify.plots.plotcode</code>.
     */
    public final TableField<PlotsRecord, String> PLOTCODE = createField("plotcode", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>diversify.plots.owncode</code>.
     */
    public final TableField<PlotsRecord, String> OWNCODE = createField("owncode", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>diversify.plots.site_id</code>.
     */
    public final TableField<PlotsRecord, Integer> SITE_ID = createField("site_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>diversify.plots.block</code>.
     */
    public final TableField<PlotsRecord, Integer> BLOCK = createField("block", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>diversify.plots.plot</code>.
     */
    public final TableField<PlotsRecord, String> PLOT = createField("plot", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>diversify.plots.subplot</code>.
     */
    public final TableField<PlotsRecord, Integer> SUBPLOT = createField("subplot", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>diversify.plots.row</code>.
     */
    public final TableField<PlotsRecord, Integer> ROW = createField("row", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>diversify.plots.col</code>.
     */
    public final TableField<PlotsRecord, Integer> COL = createField("col", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>diversify.plots.rep</code>.
     */
    public final TableField<PlotsRecord, Integer> REP = createField("rep", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>diversify.plots.subrep</code>.
     */
    public final TableField<PlotsRecord, Integer> SUBREP = createField("subrep", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>diversify.plots.management</code>.
     */
    public final TableField<PlotsRecord, String> MANAGEMENT = createField("management", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>diversify.plots.latitude</code>.
     */
    public final TableField<PlotsRecord, BigDecimal> LATITUDE = createField("latitude", org.jooq.impl.SQLDataType.DECIMAL(64, 10), this, "");

    /**
     * The column <code>diversify.plots.longitude</code>.
     */
    public final TableField<PlotsRecord, BigDecimal> LONGITUDE = createField("longitude", org.jooq.impl.SQLDataType.DECIMAL(64, 10), this, "");

    /**
     * The column <code>diversify.plots.created_on</code>.
     */
    public final TableField<PlotsRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>diversify.plots.updated_on</code>.
     */
    public final TableField<PlotsRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>diversify.plots</code> table reference
     */
    public Plots() {
        this(DSL.name("plots"), null);
    }

    /**
     * Create an aliased <code>diversify.plots</code> table reference
     */
    public Plots(String alias) {
        this(DSL.name(alias), PLOTS);
    }

    /**
     * Create an aliased <code>diversify.plots</code> table reference
     */
    public Plots(Name alias) {
        this(alias, PLOTS);
    }

    private Plots(Name alias, Table<PlotsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Plots(Name alias, Table<PlotsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Plots(Table<O> child, ForeignKey<O, PlotsRecord> key) {
        super(child, key, PLOTS);
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
        return Arrays.<Index>asList(Indexes.PLOTS_DATASET_ID, Indexes.PLOTS_PRIMARY, Indexes.PLOTS_SITE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PlotsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PLOTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PlotsRecord> getPrimaryKey() {
        return Keys.KEY_PLOTS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PlotsRecord>> getKeys() {
        return Arrays.<UniqueKey<PlotsRecord>>asList(Keys.KEY_PLOTS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<PlotsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PlotsRecord, ?>>asList(Keys.PLOTS_IBFK_2, Keys.PLOTS_IBFK_1);
    }

    public Datasets datasets() {
        return new Datasets(this, Keys.PLOTS_IBFK_2);
    }

    public Sites sites() {
        return new Sites(this, Keys.PLOTS_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Plots as(String alias) {
        return new Plots(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Plots as(Name alias) {
        return new Plots(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Plots rename(String name) {
        return new Plots(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Plots rename(Name name) {
        return new Plots(name, null);
    }
}
