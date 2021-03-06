/*
 * This file is generated by jOOQ.
 */
package jhi.diversify.server.database.tables;


import java.math.BigDecimal;

import javax.annotation.Generated;

import jhi.diversify.server.database.Diversify;
import jhi.diversify.server.database.tables.records.ViewSiteoverviewRecord;

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
public class ViewSiteoverview extends TableImpl<ViewSiteoverviewRecord> {

    private static final long serialVersionUID = 1855210665;

    /**
     * The reference instance of <code>diversify.view_siteoverview</code>
     */
    public static final ViewSiteoverview VIEW_SITEOVERVIEW = new ViewSiteoverview();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewSiteoverviewRecord> getRecordType() {
        return ViewSiteoverviewRecord.class;
    }

    /**
     * The column <code>diversify.view_siteoverview.traitid</code>.
     */
    public final TableField<ViewSiteoverviewRecord, Integer> TRAITID = createField("traitid", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>diversify.view_siteoverview.traitname</code>.
     */
    public final TableField<ViewSiteoverviewRecord, String> TRAITNAME = createField("traitname", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>diversify.view_siteoverview.traitcode</code>.
     */
    public final TableField<ViewSiteoverviewRecord, String> TRAITCODE = createField("traitcode", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>diversify.view_siteoverview.unit</code>.
     */
    public final TableField<ViewSiteoverviewRecord, String> UNIT = createField("unit", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>diversify.view_siteoverview.siteid</code>.
     */
    public final TableField<ViewSiteoverviewRecord, Integer> SITEID = createField("siteid", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>diversify.view_siteoverview.sitename</code>.
     */
    public final TableField<ViewSiteoverviewRecord, String> SITENAME = createField("sitename", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>diversify.view_siteoverview.othername</code>.
     */
    public final TableField<ViewSiteoverviewRecord, String> OTHERNAME = createField("othername", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>diversify.view_siteoverview.datasetid</code>.
     */
    public final TableField<ViewSiteoverviewRecord, Integer> DATASETID = createField("datasetid", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>diversify.view_siteoverview.datasetname</code>.
     */
    public final TableField<ViewSiteoverviewRecord, String> DATASETNAME = createField("datasetname", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>diversify.view_siteoverview.YEAR</code>.
     */
    public final TableField<ViewSiteoverviewRecord, Integer> YEAR = createField("YEAR", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>diversify.view_siteoverview.avg</code>.
     */
    public final TableField<ViewSiteoverviewRecord, BigDecimal> AVG = createField("avg", org.jooq.impl.SQLDataType.DECIMAL(65, 14), this, "");

    /**
     * The column <code>diversify.view_siteoverview.min</code>.
     */
    public final TableField<ViewSiteoverviewRecord, BigDecimal> MIN = createField("min", org.jooq.impl.SQLDataType.DECIMAL(64, 10), this, "");

    /**
     * The column <code>diversify.view_siteoverview.max</code>.
     */
    public final TableField<ViewSiteoverviewRecord, BigDecimal> MAX = createField("max", org.jooq.impl.SQLDataType.DECIMAL(64, 10), this, "");

    /**
     * The column <code>diversify.view_siteoverview.stdv</code>.
     */
    public final TableField<ViewSiteoverviewRecord, Double> STDV = createField("stdv", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * Create a <code>diversify.view_siteoverview</code> table reference
     */
    public ViewSiteoverview() {
        this(DSL.name("view_siteoverview"), null);
    }

    /**
     * Create an aliased <code>diversify.view_siteoverview</code> table reference
     */
    public ViewSiteoverview(String alias) {
        this(DSL.name(alias), VIEW_SITEOVERVIEW);
    }

    /**
     * Create an aliased <code>diversify.view_siteoverview</code> table reference
     */
    public ViewSiteoverview(Name alias) {
        this(alias, VIEW_SITEOVERVIEW);
    }

    private ViewSiteoverview(Name alias, Table<ViewSiteoverviewRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewSiteoverview(Name alias, Table<ViewSiteoverviewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> ViewSiteoverview(Table<O> child, ForeignKey<O, ViewSiteoverviewRecord> key) {
        super(child, key, VIEW_SITEOVERVIEW);
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
    public ViewSiteoverview as(String alias) {
        return new ViewSiteoverview(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewSiteoverview as(Name alias) {
        return new ViewSiteoverview(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewSiteoverview rename(String name) {
        return new ViewSiteoverview(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewSiteoverview rename(Name name) {
        return new ViewSiteoverview(name, null);
    }
}
