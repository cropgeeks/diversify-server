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
import jhi.diversify.server.database.tables.records.SitesRecord;

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
public class Sites extends TableImpl<SitesRecord> {

    private static final long serialVersionUID = -797766198;

    /**
     * The reference instance of <code>diversify.sites</code>
     */
    public static final Sites SITES = new Sites();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SitesRecord> getRecordType() {
        return SitesRecord.class;
    }

    /**
     * The column <code>diversify.sites.id</code>.
     */
    public final TableField<SitesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>diversify.sites.sitename</code>.
     */
    public final TableField<SitesRecord, String> SITENAME = createField("sitename", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>diversify.sites.othername</code>.
     */
    public final TableField<SitesRecord, String> OTHERNAME = createField("othername", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>diversify.sites.partner_id</code>.
     */
    public final TableField<SitesRecord, Integer> PARTNER_ID = createField("partner_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>diversify.sites.latitude</code>.
     */
    public final TableField<SitesRecord, BigDecimal> LATITUDE = createField("latitude", org.jooq.impl.SQLDataType.DECIMAL(64, 10), this, "");

    /**
     * The column <code>diversify.sites.longitude</code>.
     */
    public final TableField<SitesRecord, BigDecimal> LONGITUDE = createField("longitude", org.jooq.impl.SQLDataType.DECIMAL(64, 10), this, "");

    /**
     * The column <code>diversify.sites.created_on</code>.
     */
    public final TableField<SitesRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>diversify.sites.updated_on</code>.
     */
    public final TableField<SitesRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>diversify.sites</code> table reference
     */
    public Sites() {
        this(DSL.name("sites"), null);
    }

    /**
     * Create an aliased <code>diversify.sites</code> table reference
     */
    public Sites(String alias) {
        this(DSL.name(alias), SITES);
    }

    /**
     * Create an aliased <code>diversify.sites</code> table reference
     */
    public Sites(Name alias) {
        this(alias, SITES);
    }

    private Sites(Name alias, Table<SitesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Sites(Name alias, Table<SitesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Sites(Table<O> child, ForeignKey<O, SitesRecord> key) {
        super(child, key, SITES);
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
        return Arrays.<Index>asList(Indexes.SITES_PARTNER_ID, Indexes.SITES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SitesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SITES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SitesRecord> getPrimaryKey() {
        return Keys.KEY_SITES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SitesRecord>> getKeys() {
        return Arrays.<UniqueKey<SitesRecord>>asList(Keys.KEY_SITES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<SitesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SitesRecord, ?>>asList(Keys.SITES_IBFK_1);
    }

    public Partners partners() {
        return new Partners(this, Keys.SITES_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sites as(String alias) {
        return new Sites(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sites as(Name alias) {
        return new Sites(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Sites rename(String name) {
        return new Sites(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Sites rename(Name name) {
        return new Sites(name, null);
    }
}
