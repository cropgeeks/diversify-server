/*
 * This file is generated by jOOQ.
 */
package jhi.diversify.server.database.tables;


import javax.annotation.Generated;

import jhi.diversify.server.database.Diversify;
import jhi.diversify.server.database.tables.records.ViewVarietiesRecord;

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
public class ViewVarieties extends TableImpl<ViewVarietiesRecord> {

    /**
     * The reference instance of <code>diversify.view_varieties</code>
     */
    public static final ViewVarieties VIEW_VARIETIES = new ViewVarieties();
    private static final long serialVersionUID = -18589917;

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewVarietiesRecord> getRecordType() {
        return ViewVarietiesRecord.class;
    }
    /**
     * The column <code>diversify.view_varieties.id</code>.
     */
    public final TableField<ViewVarietiesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>diversify.view_varieties.varietyname</code>.
     */
    public final TableField<ViewVarietiesRecord, String> VARIETYNAME = createField("varietyname", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>diversify.view_varieties.cropcommonname</code>.
     */
    public final TableField<ViewVarietiesRecord, String> CROPCOMMONNAME = createField("cropcommonname", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>diversify.view_varieties.croplatinname</code>.
     */
    public final TableField<ViewVarietiesRecord, String> CROPLATINNAME = createField("croplatinname", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>diversify.view_varieties.plantpartnername</code>.
     */
    public final TableField<ViewVarietiesRecord, String> PLANTPARTNERNAME = createField("plantpartnername", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>diversify.view_varieties.plots</code>.
     */
    public final TableField<ViewVarietiesRecord, Long> PLOTS = createField("plots", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>diversify.view_varieties.datapoints</code>.
     */
    public final TableField<ViewVarietiesRecord, Long> DATAPOINTS = createField("datapoints", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>diversify.view_varieties</code> table reference
     */
    public ViewVarieties() {
        this(DSL.name("view_varieties"), null);
    }

    /**
     * Create an aliased <code>diversify.view_varieties</code> table reference
     */
    public ViewVarieties(String alias) {
        this(DSL.name(alias), VIEW_VARIETIES);
    }

    /**
     * Create an aliased <code>diversify.view_varieties</code> table reference
     */
    public ViewVarieties(Name alias) {
        this(alias, VIEW_VARIETIES);
    }

    private ViewVarieties(Name alias, Table<ViewVarietiesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewVarieties(Name alias, Table<ViewVarietiesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> ViewVarieties(Table<O> child, ForeignKey<O, ViewVarietiesRecord> key) {
        super(child, key, VIEW_VARIETIES);
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
    public ViewVarieties as(String alias) {
        return new ViewVarieties(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewVarieties as(Name alias) {
        return new ViewVarieties(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewVarieties rename(String name) {
        return new ViewVarieties(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewVarieties rename(Name name) {
        return new ViewVarieties(name, null);
    }
}
