package com.elif.utility.constants;

public class RestApiUrls {
    private static final String VERSION ="/v1";
    private static final String API ="/api";
    private static final String TEST ="/test";
    private static final String DEV ="/dev";
    private static final String PROD ="/prod";
    private static final String ROOT = DEV +VERSION;

    public static final String BRAND = ROOT + "/brand";
    public static final String FEATURE = ROOT + "/feature";
    public static final String IMAGE = ROOT + "/image";
    public static final String MODEL = ROOT + "/model";
    public static final String PRODUCT = ROOT + "/product";
    public static final String PRODUCT_IMAGE = ROOT + "/product-image";
    public static final String PRODUCT_FEATURE = ROOT + "/product-feature";

    public static final String ADD = "/add";
    public static final String GET_ALL = "/get-all";
    public static final String GET_BY_ID = "/get-by-id";
    public static final String GET_BY_SUBCATEGORY = "/get-by-subcategory";
    public static final String DELETE_BY_ID = "/delete-by-id";
    public static final String CREATE_ERROR = "/test-error";
    public static final String UPLOAD = "/upload";


}
