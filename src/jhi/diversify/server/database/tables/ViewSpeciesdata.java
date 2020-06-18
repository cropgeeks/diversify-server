/*
 * This file is generated by jOOQ.
 */
package jhi.diversify.server.database.tables;


import javax.annotation.Generated;

import jhi.diversify.server.database.Diversify;
import jhi.diversify.server.database.tables.records.ViewSpeciesdataRecord;

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
public class ViewSpeciesdata extends TableImpl<ViewSpeciesdataRecord> {

    private static final long serialVersionUID = 394687903;

    /**
     * The reference instance of <code>diversify.view_speciesdata</code>
     */
    public static final ViewSpeciesdata VIEW_SPECIESDATA = new ViewSpeciesdata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewSpeciesdataRecord> getRecordType() {
        return ViewSpeciesdataRecord.class;
    }

    /**
     * The column <code>diversify.view_speciesdata.traitid</code>.
     */
    public final TableField<ViewSpeciesdataRecord, Integer> TRAITID = createField("traitid", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>diversify.view_speciesdata.traitname</code>.
     */
    public final TableField<ViewSpeciesdataRecord, String> TRAITNAME = createField("traitname", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>diversify.view_speciesdata.traitcode</code>.
     */
    public final TableField<ViewSpeciesdataRecord, String> TRAITCODE = createField("traitcode", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>diversify.view_speciesdata.siteid</code>.
     */
    public final TableField<ViewSpeciesdataRecord, Integer> SITEID = createField("siteid", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>diversify.view_speciesdata.sitename</code>.
     */
    public final TableField<ViewSpeciesdataRecord, String> SITENAME = createField("sitename", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>diversify.view_speciesdata.partnername</code>.
     */
    public final TableField<ViewSpeciesdataRecord, String> PARTNERNAME = createField("partnername", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>diversify.view_speciesdata.rate</code>.
     */
    public final TableField<ViewSpeciesdataRecord, Integer> RATE = createField("rate", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>diversify.view_speciesdata.cropname</code>.
     */
    public final TableField<ViewSpeciesdataRecord, String> CROPNAME = createField("cropname", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>diversify.view_speciesdata.varietyid</code>.
     */
    public final TableField<ViewSpeciesdataRecord, Integer> VARIETYID = createField("varietyid", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>diversify.view_speciesdata.varietyname</code>.
     */
    public final TableField<ViewSpeciesdataRecord, String> VARIETYNAME = createField("varietyname", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>diversify.view_speciesdata.value</code>.
     */
    public final TableField<ViewSpeciesdataRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>diversify.view_speciesdata</code> table reference
     */
    public ViewSpeciesdata() {
        this(DSL.name("view_speciesdata"), null);
    }

    /**
     * Create an aliased <code>diversify.view_speciesdata</code> table reference
     */
    public ViewSpeciesdata(String alias) {
        this(DSL.name(alias), VIEW_SPECIESDATA);
    }

    /**
     * Create an aliased <code>diversify.view_speciesdata</code> table reference
     */
    public ViewSpeciesdata(Name alias) {
        this(alias, VIEW_SPECIESDATA);
    }

    private ViewSpeciesdata(Name alias, Table<ViewSpeciesdataRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewSpeciesdata(Name alias, Table<ViewSpeciesdataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> ViewSpeciesdata(Table<O> child, ForeignKey<O, ViewSpeciesdataRecord> key) {
        super(child, key, VIEW_SPECIESDATA);
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
    public ViewSpeciesdata as(String alias) {
        return new ViewSpeciesdata(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewSpeciesdata as(Name alias) {
        return new ViewSpeciesdata(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewSpeciesdata rename(String name) {
        return new ViewSpeciesdata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewSpeciesdata rename(Name name) {
        return new ViewSpeciesdata(name, null);
    }
}
