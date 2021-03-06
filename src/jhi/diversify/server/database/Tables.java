/*
 * This file is generated by jOOQ.
 */
package jhi.diversify.server.database;


import javax.annotation.Generated;

import jhi.diversify.server.database.tables.Crops;
import jhi.diversify.server.database.tables.Datasets;
import jhi.diversify.server.database.tables.Partners;
import jhi.diversify.server.database.tables.Plantpartners;
import jhi.diversify.server.database.tables.Plotdata;
import jhi.diversify.server.database.tables.Plots;
import jhi.diversify.server.database.tables.Sites;
import jhi.diversify.server.database.tables.Speciesdata;
import jhi.diversify.server.database.tables.Traits;
import jhi.diversify.server.database.tables.Varieties;
import jhi.diversify.server.database.tables.Varietyinplot;
import jhi.diversify.server.database.tables.ViewPlotdata;
import jhi.diversify.server.database.tables.ViewSiteoverview;
import jhi.diversify.server.database.tables.ViewSites;
import jhi.diversify.server.database.tables.ViewSpeciesdata;
import jhi.diversify.server.database.tables.ViewSpeciesdataTraits;
import jhi.diversify.server.database.tables.ViewTraits;
import jhi.diversify.server.database.tables.ViewVarieties;


/**
 * Convenience access to all tables in diversify
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>diversify.crops</code>.
     */
    public static final Crops CROPS = jhi.diversify.server.database.tables.Crops.CROPS;

    /**
     * The table <code>diversify.datasets</code>.
     */
    public static final Datasets DATASETS = jhi.diversify.server.database.tables.Datasets.DATASETS;

    /**
     * The table <code>diversify.partners</code>.
     */
    public static final Partners PARTNERS = jhi.diversify.server.database.tables.Partners.PARTNERS;

    /**
     * The table <code>diversify.plantpartners</code>.
     */
    public static final Plantpartners PLANTPARTNERS = jhi.diversify.server.database.tables.Plantpartners.PLANTPARTNERS;

    /**
     * The table <code>diversify.plotdata</code>.
     */
    public static final Plotdata PLOTDATA = jhi.diversify.server.database.tables.Plotdata.PLOTDATA;

    /**
     * The table <code>diversify.plots</code>.
     */
    public static final Plots PLOTS = jhi.diversify.server.database.tables.Plots.PLOTS;

    /**
     * The table <code>diversify.sites</code>.
     */
    public static final Sites SITES = jhi.diversify.server.database.tables.Sites.SITES;

    /**
     * The table <code>diversify.speciesdata</code>.
     */
    public static final Speciesdata SPECIESDATA = jhi.diversify.server.database.tables.Speciesdata.SPECIESDATA;

    /**
     * The table <code>diversify.traits</code>.
     */
    public static final Traits TRAITS = jhi.diversify.server.database.tables.Traits.TRAITS;

    /**
     * The table <code>diversify.varieties</code>.
     */
    public static final Varieties VARIETIES = jhi.diversify.server.database.tables.Varieties.VARIETIES;

    /**
     * The table <code>diversify.varietyinplot</code>.
     */
    public static final Varietyinplot VARIETYINPLOT = jhi.diversify.server.database.tables.Varietyinplot.VARIETYINPLOT;

    /**
     * VIEW
     */
    public static final ViewPlotdata VIEW_PLOTDATA = jhi.diversify.server.database.tables.ViewPlotdata.VIEW_PLOTDATA;

    /**
     * VIEW
     */
    public static final ViewSiteoverview VIEW_SITEOVERVIEW = jhi.diversify.server.database.tables.ViewSiteoverview.VIEW_SITEOVERVIEW;

    /**
     * VIEW
     */
    public static final ViewSites VIEW_SITES = jhi.diversify.server.database.tables.ViewSites.VIEW_SITES;

    /**
     * VIEW
     */
    public static final ViewSpeciesdata VIEW_SPECIESDATA = jhi.diversify.server.database.tables.ViewSpeciesdata.VIEW_SPECIESDATA;

    /**
     * VIEW
     */
    public static final ViewSpeciesdataTraits VIEW_SPECIESDATA_TRAITS = jhi.diversify.server.database.tables.ViewSpeciesdataTraits.VIEW_SPECIESDATA_TRAITS;

    /**
     * VIEW
     */
    public static final ViewTraits VIEW_TRAITS = jhi.diversify.server.database.tables.ViewTraits.VIEW_TRAITS;

    /**
     * VIEW
     */
    public static final ViewVarieties VIEW_VARIETIES = jhi.diversify.server.database.tables.ViewVarieties.VIEW_VARIETIES;
}
