/*
 * This file is generated by jOOQ.
 */
package jhi.diversify.server.database.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.diversify.server.database.Diversify;
import jhi.diversify.server.database.tables.records.ViewTraitsRecord;

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
public class ViewTraits extends TableImpl<ViewTraitsRecord> {

    private static final long serialVersionUID = 1071328521;

    /**
     * The reference instance of <code>diversify.view_traits</code>
     */
    public static final ViewTraits VIEW_TRAITS = new ViewTraits();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTraitsRecord> getRecordType() {
        return ViewTraitsRecord.class;
    }

    /**
     * The column <code>diversify.view_traits.id</code>.
     */
    public final TableField<ViewTraitsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>diversify.view_traits.traitname</code>.
     */
    public final TableField<ViewTraitsRecord, String> TRAITNAME = createField("traitname", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>diversify.view_traits.traitcode</code>.
     */
    public final TableField<ViewTraitsRecord, String> TRAITCODE = createField("traitcode", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>diversify.view_traits.unit</code>.
     */
    public final TableField<ViewTraitsRecord, String> UNIT = createField("unit", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>diversify.view_traits.created_on</code>.
     */
    public final TableField<ViewTraitsRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>diversify.view_traits.updated_on</code>.
     */
    public final TableField<ViewTraitsRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>diversify.view_traits.species_data_points</code>.
     */
    public final TableField<ViewTraitsRecord, Long> SPECIES_DATA_POINTS = createField("species_data_points", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>diversify.view_traits.plot_data_points</code>.
     */
    public final TableField<ViewTraitsRecord, Long> PLOT_DATA_POINTS = createField("plot_data_points", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>diversify.view_traits</code> table reference
     */
    public ViewTraits() {
        this(DSL.name("view_traits"), null);
    }

    /**
     * Create an aliased <code>diversify.view_traits</code> table reference
     */
    public ViewTraits(String alias) {
        this(DSL.name(alias), VIEW_TRAITS);
    }

    /**
     * Create an aliased <code>diversify.view_traits</code> table reference
     */
    public ViewTraits(Name alias) {
        this(alias, VIEW_TRAITS);
    }

    private ViewTraits(Name alias, Table<ViewTraitsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTraits(Name alias, Table<ViewTraitsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> ViewTraits(Table<O> child, ForeignKey<O, ViewTraitsRecord> key) {
        super(child, key, VIEW_TRAITS);
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
    public ViewTraits as(String alias) {
        return new ViewTraits(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTraits as(Name alias) {
        return new ViewTraits(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTraits rename(String name) {
        return new ViewTraits(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTraits rename(Name name) {
        return new ViewTraits(name, null);
    }
}
