/*
 * This file is generated by jOOQ.
 */
package jhi.diversify.server.database.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.diversify.server.database.Diversify3;
import jhi.diversify.server.database.tables.records.ViewPlotdataRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class ViewPlotdata extends TableImpl<ViewPlotdataRecord> {

    private static final long serialVersionUID = 2060063781;

    /**
     * The reference instance of <code>diversify3.view_plotdata</code>
     */
    public static final ViewPlotdata VIEW_PLOTDATA = new ViewPlotdata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewPlotdataRecord> getRecordType() {
        return ViewPlotdataRecord.class;
    }

    /**
     * The column <code>diversify3.view_plotdata.plotcode</code>.
     */
    public final TableField<ViewPlotdataRecord, String> PLOTCODE = createField("plotcode", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>diversify3.view_plotdata.crops</code>.
     */
    public final TableField<ViewPlotdataRecord, String> CROPS = createField("crops", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>diversify3.view_plotdata.siteId</code>.
     */
    public final TableField<ViewPlotdataRecord, Integer> SITEID = createField("siteId", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>diversify3.view_plotdata.sitename</code>.
     */
    public final TableField<ViewPlotdataRecord, String> SITENAME = createField("sitename", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>diversify3.view_plotdata.id</code>.
     */
    public final TableField<ViewPlotdataRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>diversify3.view_plotdata.plot_id</code>.
     */
    public final TableField<ViewPlotdataRecord, Integer> PLOT_ID = createField("plot_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>diversify3.view_plotdata.trait_id</code>.
     */
    public final TableField<ViewPlotdataRecord, Integer> TRAIT_ID = createField("trait_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>diversify3.view_plotdata.rep</code>.
     */
    public final TableField<ViewPlotdataRecord, Integer> REP = createField("rep", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>diversify3.view_plotdata.value</code>.
     */
    public final TableField<ViewPlotdataRecord, BigDecimal> VALUE = createField("value", org.jooq.impl.SQLDataType.DECIMAL(64, 10).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.0000000000", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>diversify3.view_plotdata.created_on</code>.
     */
    public final TableField<ViewPlotdataRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>diversify3.view_plotdata.updated_on</code>.
     */
    public final TableField<ViewPlotdataRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>diversify3.view_plotdata.datasetid</code>.
     */
    public final TableField<ViewPlotdataRecord, Integer> DATASETID = createField("datasetid", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>diversify3.view_plotdata.datasetname</code>.
     */
    public final TableField<ViewPlotdataRecord, String> DATASETNAME = createField("datasetname", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>diversify3.view_plotdata.year</code>.
     */
    public final TableField<ViewPlotdataRecord, Integer> YEAR = createField("year", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>diversify3.view_plotdata.traitname</code>.
     */
    public final TableField<ViewPlotdataRecord, String> TRAITNAME = createField("traitname", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>diversify3.view_plotdata.traitcode</code>.
     */
    public final TableField<ViewPlotdataRecord, String> TRAITCODE = createField("traitcode", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>diversify3.view_plotdata.unit</code>.
     */
    public final TableField<ViewPlotdataRecord, String> UNIT = createField("unit", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>diversify3.view_plotdata</code> table reference
     */
    public ViewPlotdata() {
        this(DSL.name("view_plotdata"), null);
    }

    /**
     * Create an aliased <code>diversify3.view_plotdata</code> table reference
     */
    public ViewPlotdata(String alias) {
        this(DSL.name(alias), VIEW_PLOTDATA);
    }

    /**
     * Create an aliased <code>diversify3.view_plotdata</code> table reference
     */
    public ViewPlotdata(Name alias) {
        this(alias, VIEW_PLOTDATA);
    }

    private ViewPlotdata(Name alias, Table<ViewPlotdataRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewPlotdata(Name alias, Table<ViewPlotdataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> ViewPlotdata(Table<O> child, ForeignKey<O, ViewPlotdataRecord> key) {
        super(child, key, VIEW_PLOTDATA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Diversify3.DIVERSIFY3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdata as(String alias) {
        return new ViewPlotdata(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewPlotdata as(Name alias) {
        return new ViewPlotdata(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewPlotdata rename(String name) {
        return new ViewPlotdata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewPlotdata rename(Name name) {
        return new ViewPlotdata(name, null);
    }
}
