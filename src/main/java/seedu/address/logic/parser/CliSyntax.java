package seedu.address.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_NAME = new Prefix("n/");
    public static final Prefix PREFIX_PHONE = new Prefix("p/");
    public static final Prefix PREFIX_EMAIL = new Prefix("e/");
    public static final Prefix PREFIX_ADDRESS = new Prefix("a/");
    public static final Prefix PREFIX_TAG = new Prefix("t/");
    public static final Prefix PREFIX_PERSON_CATEGORY = new Prefix("c/");
    public static final Prefix PREFIX_INDEX = new Prefix("i/");
    public static final Prefix PREFIX_ORDER = new Prefix("o/");

    // Prefixes for orders
    public static final Prefix PREFIX_ORDER_STATUS = new Prefix("o_s/");
    public static final Prefix PREFIX_ORDER_REQUESTS = new Prefix("o_r/");
    public static final Prefix PREFIX_ORDER_PRICE = new Prefix("o_p/");
    public static final Prefix PREFIX_ORDER_PRICE_RANGE = new Prefix("o_pr/");
    public static final Prefix PREFIX_ORDER_ADDITIONAL_REQUESTS = new Prefix("o_ar/");
    public static final Prefix PREFIX_ORDER_DATE = new Prefix("o_d/");
    public static final Prefix PREFIX_ORDER_PET = new Prefix("o_pt/");

    // Prefixes for pets
    public static final Prefix PREFIX_PET_DATE_OF_BIRTH = new Prefix("p_d/");
    public static final Prefix PREFIX_PET_AGE = new Prefix("p_a/");
    public static final Prefix PREFIX_PET_COLOR = new Prefix("p_c/");
    public static final Prefix PREFIX_PET_COLOR_PATTERN = new Prefix("p_cp/");
    public static final Prefix PREFIX_PET_HEIGHT = new Prefix("p_h/");
    public static final Prefix PREFIX_PET_CERTIFICATE = new Prefix("p_cert/");
    public static final Prefix PREFIX_PET_SPECIES = new Prefix("p_s/");
    public static final Prefix PREFIX_PET_VACCINATION_STATUS = new Prefix("p_v/");
    public static final Prefix PREFIX_PET_VACCINATION_WEIGHT = new Prefix("p_w/");
}
