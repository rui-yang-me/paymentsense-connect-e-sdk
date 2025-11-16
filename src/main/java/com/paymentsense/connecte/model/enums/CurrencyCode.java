package com.paymentsense.connecte.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

/**
 * ISO 4217 货币代码枚举
 */
@Getter
public enum CurrencyCode {

    /**
     * UAE Dirham
     */
    AED("AED", "784", 2, "UAE Dirham", Arrays.asList("United Arab Emirates (The)")),

    /**
     * Afghani
     */
    AFN("AFN", "971", 2, "Afghani", Arrays.asList("Afghanistan")),

    /**
     * Lek
     */
    ALL("ALL", "008", 2, "Lek", Arrays.asList("Albania")),

    /**
     * Armenian Dram
     */
    AMD("AMD", "051", 2, "Armenian Dram", Arrays.asList("Armenia")),

    /**
     * Netherlands Antillean Guilder
     */
    ANG("ANG", "532", 2, "Netherlands Antillean Guilder", Arrays.asList("Curaçao", "Sint Maarten (Dutch Part)")),

    /**
     * Kwanza
     */
    AOA("AOA", "973", 2, "Kwanza", Arrays.asList("Angola")),

    /**
     * Argentine Peso
     */
    ARS("ARS", "032", 2, "Argentine Peso", Arrays.asList("Argentina")),

    /**
     * Australian Dollar
     */
    AUD("AUD", "036", 2, "Australian Dollar", Arrays.asList("Australia", "Christmas Island", "Cocos (Keeling) Islands (The)", "Heard Island and Mcdonald Islands", "Kiribati", "Nauru", "Norfolk Island", "Tuvalu")),

    /**
     * Aruban Florin
     */
    AWG("AWG", "533", 2, "Aruban Florin", Arrays.asList("Aruba")),

    /**
     * Azerbaijan Manat
     */
    AZN("AZN", "944", 2, "Azerbaijan Manat", Arrays.asList("Azerbaijan")),

    /**
     * Convertible Mark
     */
    BAM("BAM", "977", 2, "Convertible Mark", Arrays.asList("Bosnia and Herzegovina")),

    /**
     * Barbados Dollar
     */
    BBD("BBD", "052", 2, "Barbados Dollar", Arrays.asList("Barbados")),

    /**
     * Taka
     */
    BDT("BDT", "050", 2, "Taka", Arrays.asList("Bangladesh")),

    /**
     * Bulgarian Lev
     */
    BGN("BGN", "975", 2, "Bulgarian Lev", Arrays.asList("Bulgaria")),

    /**
     * Bahraini Dinar
     */
    BHD("BHD", "048", 3, "Bahraini Dinar", Arrays.asList("Bahrain")),

    /**
     * Burundi Franc
     */
    BIF("BIF", "108", 0, "Burundi Franc", Arrays.asList("Burundi")),

    /**
     * Bermudian Dollar
     */
    BMD("BMD", "060", 2, "Bermudian Dollar", Arrays.asList("Bermuda")),

    /**
     * Brunei Dollar
     */
    BND("BND", "096", 2, "Brunei Dollar", Arrays.asList("Brunei Darussalam")),

    /**
     * Boliviano
     */
    BOB("BOB", "068", 2, "Boliviano", Arrays.asList("Bolivia (Plurinational State Of)")),

    /**
     * Mvdol
     */
    BOV("BOV", "984", 2, "Mvdol", Arrays.asList("Bolivia (Plurinational State Of)")),

    /**
     * Brazilian Real
     */
    BRL("BRL", "986", 2, "Brazilian Real", Arrays.asList("Brazil")),

    /**
     * Bahamian Dollar
     */
    BSD("BSD", "044", 2, "Bahamian Dollar", Arrays.asList("Bahamas (The)")),

    /**
     * Ngultrum
     */
    BTN("BTN", "064", 2, "Ngultrum", Arrays.asList("Bhutan")),

    /**
     * Pula
     */
    BWP("BWP", "072", 2, "Pula", Arrays.asList("Botswana")),

    /**
     * Belarusian Ruble
     */
    BYN("BYN", "933", 2, "Belarusian Ruble", Arrays.asList("Belarus")),

    /**
     * Belize Dollar
     */
    BZD("BZD", "084", 2, "Belize Dollar", Arrays.asList("Belize")),

    /**
     * Canadian Dollar
     */
    CAD("CAD", "124", 2, "Canadian Dollar", Arrays.asList("Canada")),

    /**
     * Congolese Franc
     */
    CDF("CDF", "976", 2, "Congolese Franc", Arrays.asList("Congo (The Democratic Republic of The)")),

    /**
     * WIR Euro
     */
    CHE("CHE", "947", 2, "WIR Euro", Arrays.asList("Switzerland")),

    /**
     * Swiss Franc
     */
    CHF("CHF", "756", 2, "Swiss Franc", Arrays.asList("Liechtenstein", "Switzerland")),

    /**
     * WIR Franc
     */
    CHW("CHW", "948", 2, "WIR Franc", Arrays.asList("Switzerland")),

    /**
     * Unidad de Fomento
     */
    CLF("CLF", "990", 4, "Unidad de Fomento", Arrays.asList("Chile")),

    /**
     * Chilean Peso
     */
    CLP("CLP", "152", 0, "Chilean Peso", Arrays.asList("Chile")),

    /**
     * Yuan Renminbi
     */
    CNY("CNY", "156", 2, "Yuan Renminbi", Arrays.asList("China")),

    /**
     * Colombian Peso
     */
    COP("COP", "170", 2, "Colombian Peso", Arrays.asList("Colombia")),

    /**
     * Unidad de Valor Real
     */
    COU("COU", "970", 2, "Unidad de Valor Real", Arrays.asList("Colombia")),

    /**
     * Costa Rican Colon
     */
    CRC("CRC", "188", 2, "Costa Rican Colon", Arrays.asList("Costa Rica")),

    /**
     * Peso Convertible
     */
    CUC("CUC", "931", 2, "Peso Convertible", Arrays.asList("Cuba")),

    /**
     * Cuban Peso
     */
    CUP("CUP", "192", 2, "Cuban Peso", Arrays.asList("Cuba")),

    /**
     * Cabo Verde Escudo
     */
    CVE("CVE", "132", 2, "Cabo Verde Escudo", Arrays.asList("Cabo Verde")),

    /**
     * Czech Koruna
     */
    CZK("CZK", "203", 2, "Czech Koruna", Arrays.asList("Czechia")),

    /**
     * Djibouti Franc
     */
    DJF("DJF", "262", 0, "Djibouti Franc", Arrays.asList("Djibouti")),

    /**
     * Danish Krone
     */
    DKK("DKK", "208", 2, "Danish Krone", Arrays.asList("Denmark", "Faroe Islands (The)", "Greenland")),

    /**
     * Dominican Peso
     */
    DOP("DOP", "214", 2, "Dominican Peso", Arrays.asList("Dominican Republic (The)")),

    /**
     * Algerian Dinar
     */
    DZD("DZD", "012", 2, "Algerian Dinar", Arrays.asList("Algeria")),

    /**
     * Egyptian Pound
     */
    EGP("EGP", "818", 2, "Egyptian Pound", Arrays.asList("Egypt")),

    /**
     * Nakfa
     */
    ERN("ERN", "232", 2, "Nakfa", Arrays.asList("Eritrea")),

    /**
     * Ethiopian Birr
     */
    ETB("ETB", "230", 2, "Ethiopian Birr", Arrays.asList("Ethiopia")),

    /**
     * Euro
     */
    EUR("EUR", "978", 2, "Euro", Arrays.asList("Åland Islands", "Andorra", "Austria", "Belgium", "Cyprus", "Estonia", "European Union", "Finland", "France", "French Guiana", "French Southern Territories (The)", "Germany", "Greece", "Guadeloupe", "Holy See (The)", "Ireland", "Italy", "Latvia", "Lithuania", "Luxembourg", "Malta", "Martinique", "Mayotte", "Monaco", "Montenegro", "Netherlands (The)", "Portugal", "Réunion", "Saint Barthélemy", "Saint Martin (French Part)", "Saint Pierre and Miquelon", "San Marino", "Slovakia", "Slovenia", "Spain")),

    /**
     * Fiji Dollar
     */
    FJD("FJD", "242", 2, "Fiji Dollar", Arrays.asList("Fiji")),

    /**
     * Falkland Islands Pound
     */
    FKP("FKP", "238", 2, "Falkland Islands Pound", Arrays.asList("Falkland Islands (The) [Malvinas]")),

    /**
     * Pound Sterling
     */
    GBP("GBP", "826", 2, "Pound Sterling", Arrays.asList("Guernsey", "Isle of Man", "Jersey", "United Kingdom of Great Britain and Northern Ireland (The)")),

    /**
     * Lari
     */
    GEL("GEL", "981", 2, "Lari", Arrays.asList("Georgia")),

    /**
     * Ghana Cedi
     */
    GHS("GHS", "936", 2, "Ghana Cedi", Arrays.asList("Ghana")),

    /**
     * Gibraltar Pound
     */
    GIP("GIP", "292", 2, "Gibraltar Pound", Arrays.asList("Gibraltar")),

    /**
     * Dalasi
     */
    GMD("GMD", "270", 2, "Dalasi", Arrays.asList("Gambia (The)")),

    /**
     * Guinean Franc
     */
    GNF("GNF", "324", 0, "Guinean Franc", Arrays.asList("Guinea")),

    /**
     * Quetzal
     */
    GTQ("GTQ", "320", 2, "Quetzal", Arrays.asList("Guatemala")),

    /**
     * Guyana Dollar
     */
    GYD("GYD", "328", 2, "Guyana Dollar", Arrays.asList("Guyana")),

    /**
     * Hong Kong Dollar
     */
    HKD("HKD", "344", 2, "Hong Kong Dollar", Arrays.asList("Hong Kong")),

    /**
     * Lempira
     */
    HNL("HNL", "340", 2, "Lempira", Arrays.asList("Honduras")),

    /**
     * Kuna
     */
    HRK("HRK", "191", 2, "Kuna", Arrays.asList("Croatia")),

    /**
     * Gourde
     */
    HTG("HTG", "332", 2, "Gourde", Arrays.asList("Haiti")),

    /**
     * Forint
     */
    HUF("HUF", "348", 2, "Forint", Arrays.asList("Hungary")),

    /**
     * Rupiah
     */
    IDR("IDR", "360", 2, "Rupiah", Arrays.asList("Indonesia")),

    /**
     * New Israeli Sheqel
     */
    ILS("ILS", "376", 2, "New Israeli Sheqel", Arrays.asList("Israel")),

    /**
     * Indian Rupee
     */
    INR("INR", "356", 2, "Indian Rupee", Arrays.asList("Bhutan", "India")),

    /**
     * Iraqi Dinar
     */
    IQD("IQD", "368", 3, "Iraqi Dinar", Arrays.asList("Iraq")),

    /**
     * Iranian Rial
     */
    IRR("IRR", "364", 2, "Iranian Rial", Arrays.asList("Iran (Islamic Republic Of)")),

    /**
     * Iceland Krona
     */
    ISK("ISK", "352", 0, "Iceland Krona", Arrays.asList("Iceland")),

    /**
     * Jamaican Dollar
     */
    JMD("JMD", "388", 2, "Jamaican Dollar", Arrays.asList("Jamaica")),

    /**
     * Jordanian Dinar
     */
    JOD("JOD", "400", 3, "Jordanian Dinar", Arrays.asList("Jordan")),

    /**
     * Yen
     */
    JPY("JPY", "392", 0, "Yen", Arrays.asList("Japan")),

    /**
     * Kenyan Shilling
     */
    KES("KES", "404", 2, "Kenyan Shilling", Arrays.asList("Kenya")),

    /**
     * Som
     */
    KGS("KGS", "417", 2, "Som", Arrays.asList("Kyrgyzstan")),

    /**
     * Riel
     */
    KHR("KHR", "116", 2, "Riel", Arrays.asList("Cambodia")),

    /**
     * Comorian Franc
     */
    KMF("KMF", "174", 0, "Comorian Franc ", Arrays.asList("Comoros (The)")),

    /**
     * North Korean Won
     */
    KPW("KPW", "408", 2, "North Korean Won", Arrays.asList("Korea (The Democratic People's Republic Of)")),

    /**
     * Won
     */
    KRW("KRW", "410", 0, "Won", Arrays.asList("Korea (The Republic Of)")),

    /**
     * Kuwaiti Dinar
     */
    KWD("KWD", "414", 3, "Kuwaiti Dinar", Arrays.asList("Kuwait")),

    /**
     * Cayman Islands Dollar
     */
    KYD("KYD", "136", 2, "Cayman Islands Dollar", Arrays.asList("Cayman Islands (The)")),

    /**
     * Tenge
     */
    KZT("KZT", "398", 2, "Tenge", Arrays.asList("Kazakhstan")),

    /**
     * Lao Kip
     */
    LAK("LAK", "418", 2, "Lao Kip", Arrays.asList("Lao People's Democratic Republic (The)")),

    /**
     * Lebanese Pound
     */
    LBP("LBP", "422", 2, "Lebanese Pound", Arrays.asList("Lebanon")),

    /**
     * Sri Lanka Rupee
     */
    LKR("LKR", "144", 2, "Sri Lanka Rupee", Arrays.asList("Sri Lanka")),

    /**
     * Liberian Dollar
     */
    LRD("LRD", "430", 2, "Liberian Dollar", Arrays.asList("Liberia")),

    /**
     * Loti
     */
    LSL("LSL", "426", 2, "Loti", Arrays.asList("Lesotho")),

    /**
     * Libyan Dinar
     */
    LYD("LYD", "434", 3, "Libyan Dinar", Arrays.asList("Libya")),

    /**
     * Moroccan Dirham
     */
    MAD("MAD", "504", 2, "Moroccan Dirham", Arrays.asList("Morocco", "Western Sahara")),

    /**
     * Moldovan Leu
     */
    MDL("MDL", "498", 2, "Moldovan Leu", Arrays.asList("Moldova (The Republic Of)")),

    /**
     * Malagasy Ariary
     */
    MGA("MGA", "969", 2, "Malagasy Ariary", Arrays.asList("Madagascar")),

    /**
     * Denar
     */
    MKD("MKD", "807", 2, "Denar", Arrays.asList("Macedonia (The Former Yugoslav Republic Of)")),

    /**
     * Kyat
     */
    MMK("MMK", "104", 2, "Kyat", Arrays.asList("Myanmar")),

    /**
     * Tugrik
     */
    MNT("MNT", "496", 2, "Tugrik", Arrays.asList("Mongolia")),

    /**
     * Pataca
     */
    MOP("MOP", "446", 2, "Pataca", Arrays.asList("Macao")),

    /**
     * Ouguiya
     */
    MRU("MRU", "929", 2, "Ouguiya", Arrays.asList("Mauritania")),

    /**
     * Mauritius Rupee
     */
    MUR("MUR", "480", 2, "Mauritius Rupee", Arrays.asList("Mauritius")),

    /**
     * Rufiyaa
     */
    MVR("MVR", "462", 2, "Rufiyaa", Arrays.asList("Maldives")),

    /**
     * Malawi Kwacha
     */
    MWK("MWK", "454", 2, "Malawi Kwacha", Arrays.asList("Malawi")),

    /**
     * Mexican Peso
     */
    MXN("MXN", "484", 2, "Mexican Peso", Arrays.asList("Mexico")),

    /**
     * Mexican Unidad de Inversion (UDI)
     */
    MXV("MXV", "979", 2, "Mexican Unidad de Inversion (UDI)", Arrays.asList("Mexico")),

    /**
     * Malaysian Ringgit
     */
    MYR("MYR", "458", 2, "Malaysian Ringgit", Arrays.asList("Malaysia")),

    /**
     * Mozambique Metical
     */
    MZN("MZN", "943", 2, "Mozambique Metical", Arrays.asList("Mozambique")),

    /**
     * Namibia Dollar
     */
    NAD("NAD", "516", 2, "Namibia Dollar", Arrays.asList("Namibia")),

    /**
     * Naira
     */
    NGN("NGN", "566", 2, "Naira", Arrays.asList("Nigeria")),

    /**
     * Cordoba Oro
     */
    NIO("NIO", "558", 2, "Cordoba Oro", Arrays.asList("Nicaragua")),

    /**
     * Norwegian Krone
     */
    NOK("NOK", "578", 2, "Norwegian Krone", Arrays.asList("Bouvet Island", "Norway", "Svalbard and Jan Mayen")),

    /**
     * Nepalese Rupee
     */
    NPR("NPR", "524", 2, "Nepalese Rupee", Arrays.asList("Nepal")),

    /**
     * New Zealand Dollar
     */
    NZD("NZD", "554", 2, "New Zealand Dollar", Arrays.asList("Cook Islands (The)", "New Zealand", "Niue", "Pitcairn", "Tokelau")),

    /**
     * Rial Omani
     */
    OMR("OMR", "512", 3, "Rial Omani", Arrays.asList("Oman")),

    /**
     * Balboa
     */
    PAB("PAB", "590", 2, "Balboa", Arrays.asList("Panama")),

    /**
     * Sol
     */
    PEN("PEN", "604", 2, "Sol", Arrays.asList("Peru")),

    /**
     * Kina
     */
    PGK("PGK", "598", 2, "Kina", Arrays.asList("Papua New Guinea")),

    /**
     * Philippine Peso
     */
    PHP("PHP", "608", 2, "Philippine Peso", Arrays.asList("Philippines (The)")),

    /**
     * Pakistan Rupee
     */
    PKR("PKR", "586", 2, "Pakistan Rupee", Arrays.asList("Pakistan")),

    /**
     * Zloty
     */
    PLN("PLN", "985", 2, "Zloty", Arrays.asList("Poland")),

    /**
     * Guarani
     */
    PYG("PYG", "600", 0, "Guarani", Arrays.asList("Paraguay")),

    /**
     * Qatari Rial
     */
    QAR("QAR", "634", 2, "Qatari Rial", Arrays.asList("Qatar")),

    /**
     * Romanian Leu
     */
    RON("RON", "946", 2, "Romanian Leu", Arrays.asList("Romania")),

    /**
     * Serbian Dinar
     */
    RSD("RSD", "941", 2, "Serbian Dinar", Arrays.asList("Serbia")),

    /**
     * Russian Ruble
     */
    RUB("RUB", "643", 2, "Russian Ruble", Arrays.asList("Russian Federation (The)")),

    /**
     * Rwanda Franc
     */
    RWF("RWF", "646", 0, "Rwanda Franc", Arrays.asList("Rwanda")),

    /**
     * Saudi Riyal
     */
    SAR("SAR", "682", 2, "Saudi Riyal", Arrays.asList("Saudi Arabia")),

    /**
     * Solomon Islands Dollar
     */
    SBD("SBD", "090", 2, "Solomon Islands Dollar", Arrays.asList("Solomon Islands")),

    /**
     * Seychelles Rupee
     */
    SCR("SCR", "690", 2, "Seychelles Rupee", Arrays.asList("Seychelles")),

    /**
     * Sudanese Pound
     */
    SDG("SDG", "938", 2, "Sudanese Pound", Arrays.asList("Sudan (The)")),

    /**
     * Swedish Krona
     */
    SEK("SEK", "752", 2, "Swedish Krona", Arrays.asList("Sweden")),

    /**
     * Singapore Dollar
     */
    SGD("SGD", "702", 2, "Singapore Dollar", Arrays.asList("Singapore")),

    /**
     * Saint Helena Pound
     */
    SHP("SHP", "654", 2, "Saint Helena Pound", Arrays.asList("Saint Helena, Ascension and Tristan Da Cunha")),

    /**
     * Leone
     */
    SLL("SLL", "694", 2, "Leone", Arrays.asList("Sierra Leone")),

    /**
     * Somali Shilling
     */
    SOS("SOS", "706", 2, "Somali Shilling", Arrays.asList("Somalia")),

    /**
     * Surinam Dollar
     */
    SRD("SRD", "968", 2, "Surinam Dollar", Arrays.asList("Suriname")),

    /**
     * South Sudanese Pound
     */
    SSP("SSP", "728", 2, "South Sudanese Pound", Arrays.asList("South Sudan")),

    /**
     * Dobra
     */
    STN("STN", "930", 2, "Dobra", Arrays.asList("Sao Tome and Principe")),

    /**
     * El Salvador Colon
     */
    SVC("SVC", "222", 2, "El Salvador Colon", Arrays.asList("El Salvador")),

    /**
     * Syrian Pound
     */
    SYP("SYP", "760", 2, "Syrian Pound", Arrays.asList("Syrian Arab Republic")),

    /**
     * Lilangeni
     */
    SZL("SZL", "748", 2, "Lilangeni", Arrays.asList("Eswatini")),

    /**
     * Baht
     */
    THB("THB", "764", 2, "Baht", Arrays.asList("Thailand")),

    /**
     * Somoni
     */
    TJS("TJS", "972", 2, "Somoni", Arrays.asList("Tajikistan")),

    /**
     * Turkmenistan New Manat
     */
    TMT("TMT", "934", 2, "Turkmenistan New Manat", Arrays.asList("Turkmenistan")),

    /**
     * Tunisian Dinar
     */
    TND("TND", "788", 3, "Tunisian Dinar", Arrays.asList("Tunisia")),

    /**
     * Pa'anga
     */
    TOP("TOP", "776", 2, "Pa'anga", Arrays.asList("Tonga")),

    /**
     * Turkish Lira
     */
    TRY("TRY", "949", 2, "Turkish Lira", Arrays.asList("Turkey")),

    /**
     * Trinidad and Tobago Dollar
     */
    TTD("TTD", "780", 2, "Trinidad and Tobago Dollar", Arrays.asList("Trinidad and Tobago")),

    /**
     * New Taiwan Dollar
     */
    TWD("TWD", "901", 2, "New Taiwan Dollar", Arrays.asList("Taiwan (Province of China)")),

    /**
     * Tanzanian Shilling
     */
    TZS("TZS", "834", 2, "Tanzanian Shilling", Arrays.asList("Tanzania, United Republic Of")),

    /**
     * Hryvnia
     */
    UAH("UAH", "980", 2, "Hryvnia", Arrays.asList("Ukraine")),

    /**
     * Uganda Shilling
     */
    UGX("UGX", "800", 0, "Uganda Shilling", Arrays.asList("Uganda")),

    /**
     * US Dollar
     */
    USD("USD", "840", 2, "US Dollar", Arrays.asList("American Samoa", "Bonaire, Sint Eustatius and Saba", "British Indian Ocean Territory (The)", "Ecuador", "El Salvador", "Guam", "Haiti", "Marshall Islands (The)", "Micronesia (Federated States Of)", "Northern Mariana Islands (The)", "Palau", "Panama", "Puerto Rico", "Timor-Leste", "Turks and Caicos Islands (The)", "United States Minor Outlying Islands (The)", "United States of America (The)", "Virgin Islands (British)", "Virgin Islands (U.S.)")),

    /**
     * US Dollar (Next day)
     */
    USN("USN", "997", 2, "US Dollar (Next day)", Arrays.asList("United States of America (The)")),

    /**
     * Uruguay Peso en Unidades Indexadas (UI)
     */
    UYI("UYI", "940", 0, "Uruguay Peso en Unidades Indexadas (UI)", Arrays.asList("Uruguay")),

    /**
     * Peso Uruguayo
     */
    UYU("UYU", "858", 2, "Peso Uruguayo", Arrays.asList("Uruguay")),

    /**
     * Unidad Previsional
     */
    UYW("UYW", "927", 4, "Unidad Previsional", Arrays.asList("Uruguay")),

    /**
     * Uzbekistan Sum
     */
    UZS("UZS", "860", 2, "Uzbekistan Sum", Arrays.asList("Uzbekistan")),

    /**
     * Bolívar Soberano
     */
    VES("VES", "928", 2, "Bolívar Soberano", Arrays.asList("Venezuela (Bolivarian Republic Of)")),

    /**
     * Dong
     */
    VND("VND", "704", 0, "Dong", Arrays.asList("Viet Nam")),

    /**
     * Vatu
     */
    VUV("VUV", "548", 0, "Vatu", Arrays.asList("Vanuatu")),

    /**
     * Tala
     */
    WST("WST", "882", 2, "Tala", Arrays.asList("Samoa")),

    /**
     * CFA Franc BEAC
     */
    XAF("XAF", "950", 0, "CFA Franc BEAC", Arrays.asList("Cameroon", "Central African Republic (The)", "Chad", "Congo (The)", "Equatorial Guinea", "Gabon")),

    /**
     * Silver
     */
    XAG("XAG", "961", 0, "Silver", Arrays.asList("Zz11_silver")),

    /**
     * Gold
     */
    XAU("XAU", "959", 0, "Gold", Arrays.asList("Zz08_gold")),

    /**
     * Bond Markets Unit European Composite Unit (EURCO)
     */
    XBA("XBA", "955", 0, "Bond Markets Unit European Composite Unit (EURCO)", Arrays.asList("Zz01_bond Markets Unit European_eurco")),

    /**
     * Bond Markets Unit European Monetary Unit (E.M.U.-6)
     */
    XBB("XBB", "956", 0, "Bond Markets Unit European Monetary Unit (E.M.U.-6)", Arrays.asList("Zz02_bond Markets Unit European_emu-6")),

    /**
     * Bond Markets Unit European Unit of Account 9 (E.U.A.-9)
     */
    XBC("XBC", "957", 0, "Bond Markets Unit European Unit of Account 9 (E.U.A.-9)", Arrays.asList("Zz03_bond Markets Unit European_eua-9")),

    /**
     * Bond Markets Unit European Unit of Account 17 (E.U.A.-17)
     */
    XBD("XBD", "958", 0, "Bond Markets Unit European Unit of Account 17 (E.U.A.-17)", Arrays.asList("Zz04_bond Markets Unit European_eua-17")),

    /**
     * East Caribbean Dollar
     */
    XCD("XCD", "951", 2, "East Caribbean Dollar", Arrays.asList("Anguilla", "Antigua and Barbuda", "Dominica", "Grenada", "Montserrat", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines")),

    /**
     * SDR (Special Drawing Right)
     */
    XDR("XDR", "960", 0, "SDR (Special Drawing Right)", Arrays.asList("International Monetary Fund (Imf) ")),

    /**
     * CFA Franc BCEAO
     */
    XOF("XOF", "952", 0, "CFA Franc BCEAO", Arrays.asList("Benin", "Burkina Faso", "Côte d'Ivoire", "Guinea-Bissau", "Mali", "Niger (The)", "Senegal", "Togo")),

    /**
     * Palladium
     */
    XPD("XPD", "964", 0, "Palladium", Arrays.asList("Zz09_palladium")),

    /**
     * CFP Franc
     */
    XPF("XPF", "953", 0, "CFP Franc", Arrays.asList("French Polynesia", "New Caledonia", "Wallis and Futuna")),

    /**
     * Platinum
     */
    XPT("XPT", "962", 0, "Platinum", Arrays.asList("Zz10_platinum")),

    /**
     * Sucre
     */
    XSU("XSU", "994", 0, "Sucre", Arrays.asList("Sistema Unitario De Compensacion Regional De Pagos \"Sucre\"")),

    /**
     * Codes specifically reserved for testing purposes
     */
    XTS("XTS", "963", 0, "Codes specifically reserved for testing purposes", Arrays.asList("Zz06_testing_code")),

    /**
     * ADB Unit of Account
     */
    XUA("XUA", "965", 0, "ADB Unit of Account", Arrays.asList("Member Countries of the African Development Bank Group")),

    /**
     * The codes assigned for transactions where no currency is involved
     */
    XXX("XXX", "999", 0, "The codes assigned for transactions where no currency is involved", Arrays.asList("Zz07_no_currency")),

    /**
     * Yemeni Rial
     */
    YER("YER", "886", 2, "Yemeni Rial", Arrays.asList("Yemen")),

    /**
     * Rand
     */
    ZAR("ZAR", "710", 2, "Rand", Arrays.asList("Lesotho", "Namibia", "South Africa")),

    /**
     * Zambian Kwacha
     */
    ZMW("ZMW", "967", 2, "Zambian Kwacha", Arrays.asList("Zambia")),

    /**
     * Zimbabwe Dollar
     */
    ZWL("ZWL", "932", 2, "Zimbabwe Dollar", Arrays.asList("Zimbabwe"));

    private final String code;
    @JsonValue
    private final String number;
    private final int digits;
    private final String currencyName;
    private final List<String> countries;

    CurrencyCode(String code, String number, int digits, String currencyName, List<String> countries) {
        this.code = code;
        this.number = number;
        this.digits = digits;
        this.currencyName = currencyName;
        this.countries = countries;
    }

    public String getCode() {
        return code;
    }

    public String getNumber() {
        return number;
    }

    public int getDigits() {
        return digits;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public List<String> getCountries() {
        return countries;
    }

    @Override
    public String toString() {
        return code + " (" + number + ") - " + currencyName;
    }

    /**
     * Get the numeric ISO 4217 code.
     * This is used for JSON serialization to match API requirements.
     *
     * @return the three-digit numeric code
     */
    public String getNumericCode() {
        return number;
    }

    /**
     * Get CurrencyCode from numeric code string.
     *
     * @param number the numeric currency code (e.g., "826")
     * @return the corresponding CurrencyCode
     * @throws IllegalArgumentException if code is not supported
     */
    @JsonCreator
    public static CurrencyCode fromCode(String number) {
        for (CurrencyCode currency : values()) {
            if (currency.number.equals(number)) {
                return currency;
            }
        }
        throw new IllegalArgumentException("Unsupported currency code: " + number);
    }

    /**
     * Get CurrencyCode from alphabetic code (e.g., "GBP", "USD").
     *
     * @param alphaCode the alphabetic currency code
     * @return the corresponding CurrencyCode
     * @throws IllegalArgumentException if code is not supported
     */
    public static CurrencyCode fromAlphaCode(String alphaCode) {
        try {
            return valueOf(alphaCode.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Unsupported currency alpha code: " + alphaCode);
        }
    }
}