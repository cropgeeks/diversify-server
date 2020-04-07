/*
 * This file is generated by jOOQ.
 */
package jhi.diversify.server.database.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.diversify.server.database.Diversify;
import jhi.diversify.server.database.tables.records.ViewSitesRecord;

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
public class ViewSites extends TableImpl<ViewSitesRecord> {

    private static final long serialVersionUID = 1544792962;

    /**
     * The reference instance of <code>diversify.view_sites</code>
     */
    public static final ViewSites VIEW_SITES = new ViewSites();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewSitesRecord> getRecordType() {
        return ViewSitesRecord.class;
    }

    /**
     * The column <code>diversify.view_sites.id</code>.
     */
    public final TableField<ViewSitesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>diversify.view_sites.sitename</code>.
     */
    public final TableField<ViewSitesRecord, String> SITENAME = createField("sitename", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>diversify.view_sites.othername</code>.
     */
    public final TableField<ViewSitesRecord, String> OTHERNAME = createField("othername", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>diversify.view_sites.partner_id</code>.
     */
    public final TableField<ViewSitesRecord, Integer> PARTNER_ID = createField("partner_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>diversify.view_sites.latitude</code>.
     */
    public final TableField<ViewSitesRecord, BigDecimal> LATITUDE = createField("latitude", org.jooq.impl.SQLDataType.DECIMAL(64, 10), this, "");

    /**
     * The column <code>diversify.view_sites.longitude</code>.
     */
    public final TableField<ViewSitesRecord, BigDecimal> LONGITUDE = createField("longitude", org.jooq.impl.SQLDataType.DECIMAL(64, 10), this, "");

    /**
     * The column <code>diversify.view_sites.created_on</code>.
     */
    public final TableField<ViewSitesRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>diversify.view_sites.updated_on</code>.
     */
    public final TableField<ViewSitesRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>diversify.view_sites.plots</code>.
     */
    public final TableField<ViewSitesRecord, Long> PLOTS = createField("plots", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>diversify.view_sites.columns</code>.
     */
    public final TableField<ViewSitesRecord, Long> COLUMNS = createField("columns", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>diversify.view_sites.rows</code>.
     */
    public final TableField<ViewSitesRecord, Long> ROWS = createField("rows", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>diversify.view_sites.partnername</code>.
     */
    public final TableField<ViewSitesRecord, String> PARTNERNAME = createField("partnername", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>diversify.view_sites</code> table reference
     */
    public ViewSites() {
        this(DSL.name("view_sites"), null);
    }

    /**
     * Create an aliased <code>diversify.view_sites</code> table reference
     */
    public ViewSites(String alias) {
        this(DSL.name(alias), VIEW_SITES);
    }

    /**
     * Create an aliased <code>diversify.view_sites</code> table reference
     */
    public ViewSites(Name alias) {
        this(alias, VIEW_SITES);
    }

    private ViewSites(Name alias, Table<ViewSitesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewSites(Name alias, Table<ViewSitesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> ViewSites(Table<O> child, ForeignKey<O, ViewSitesRecord> key) {
        super(child, key, VIEW_SITES);
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
    public ViewSites as(String alias) {
        return new ViewSites(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewSites as(Name alias) {
        return new ViewSites(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewSites rename(String name) {
        return new ViewSites(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewSites rename(Name name) {
        return new ViewSites(name, null);
    }
}
