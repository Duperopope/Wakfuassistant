/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.EnumMap;
import org.apache.log4j.Logger;

/*
 * Renamed from bMj
 */
public class bmj_1
implements aeh_2 {
    private static final Logger kvT = Logger.getLogger(bmj_1.class);
    private static final EnumMap<eNd, bmj_1> kvU = new EnumMap(eNd.class);
    public static final String kvV = "name";
    public static final String kvW = "description";
    public static final String kvX = "elementIconUrl";
    public static final String kvY = "decoratorStyle";
    public static final String kvZ = "buttonStyle";
    public static final String kwa = "spellDescription";
    public static final String kwb = "stringMaster";
    public static final String kwc = "iconStyleMaster";
    public static final String kwd = "color";
    private final byte kwe;
    protected final eNd kwf;
    public static final String[] kwg;
    private static final String kwh = "IconFireElement";
    private static final String kwi = "IconEarthElement";
    private static final String kwj = "IconAirElement";
    private static final String kwk = "IconStasisElement";
    private static final String kwl = "IconWaterElement";
    private static final String kwm = "IconSupportElement";
    private static final awx_2 kwn;
    private static final awx_2 kwo;
    private static final awx_2 kwp;
    private static final awx_2 kwq;
    private static final awx_2 kwr;
    private static final awx_2 kws;

    bmj_1(eNd eNd2) {
        this.kwf = eNd2;
        this.kwe = eNd2.aJr();
    }

    public byte aJr() {
        return this.kwe;
    }

    public static bmj_1[] f(eym eym2) {
        ArrayList arrayList = new ArrayList();
        eym2.C(new bmk_1(arrayList));
        return arrayList.toArray(new bmj_1[arrayList.size()]);
    }

    public static bmj_1 f(eNd eNd2) {
        return kvU.get(eNd2);
    }

    public static bmj_1 cq(byte by) {
        return kvU.get(eNd.ff(by));
    }

    public eNd dTh() {
        return this.kwf;
    }

    public String een() {
        return aum_0.cWf().c(this.kwf.name(), new Object[0]);
    }

    public String getDescription() {
        return aum_0.cWf().c(String.format("%s%s", "characterCreation.elementDescription.", this.kwf.name()), new Object[0]);
    }

    public String eeo() {
        return aum_0.cWf().c(String.format("%s%s", "desc.showSpells.", this.kwf.name()), new Object[0]);
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kvV)) {
            return this.een();
        }
        if (string.equals(kvW)) {
            return this.getDescription();
        }
        if (string.equals(kvX)) {
            String string2 = null;
            try {
                string2 = String.format(auc_0.cVq().bS("elementsIconsPath"), this.kwf.name());
            }
            catch (fu_0 fu_02) {
                // empty catch block
            }
            return string2;
        }
        if (string.equals(kvY)) {
            return "elementDecorator" + this.aJr();
        }
        if (string.equals(kvZ)) {
            return this.kwf.name();
        }
        if (string.equals(kwa)) {
            return this.eeo();
        }
        if (string.equalsIgnoreCase(kwb)) {
            return this.eep();
        }
        if (string.equalsIgnoreCase(kwc)) {
            return this.eeq();
        }
        if (string.equalsIgnoreCase(kwd)) {
            return this.getColor();
        }
        return null;
    }

    private String eep() {
        switch (this.kwf.aJr()) {
            case 3: {
                return aum_0.cWf().c("desc.earthMaster", new Object[0]);
            }
            case 2: {
                return aum_0.cWf().c("desc.waterMaster", new Object[0]);
            }
            case 4: {
                return aum_0.cWf().c("desc.airMaster", new Object[0]);
            }
            case 1: {
                return aum_0.cWf().c("desc.fireMaster", new Object[0]);
            }
            case 0: {
                return aum_0.cWf().c("desc.physicalMaster", new Object[0]);
            }
            case 5: {
                return aum_0.cWf().c("desc.stasisMaster", new Object[0]);
            }
            case 9: {
                return aum_0.cWf().c("desc.supportMaster", new Object[0]);
            }
        }
        return null;
    }

    private String eeq() {
        try {
            switch (this.kwf.aJr()) {
                case 3: {
                    return kwi;
                }
                case 2: {
                    return kwl;
                }
                case 4: {
                    return kwj;
                }
                case 1: {
                    return kwh;
                }
                case 5: {
                    return kwk;
                }
                case 0: {
                    return null;
                }
                case 9: {
                    return kwm;
                }
            }
            return null;
        }
        catch (Exception exception) {
            kvT.error((Object)"Unknow Element");
            return null;
        }
    }

    private axb_2 getColor() {
        try {
            switch (this.kwf.aJr()) {
                case 3: {
                    return kwn;
                }
                case 2: {
                    return kwo;
                }
                case 4: {
                    return kwp;
                }
                case 1: {
                    return kwq;
                }
                case 5: {
                    return kwr;
                }
                case 0: {
                    return null;
                }
                case 9: {
                    return kws;
                }
            }
            return null;
        }
        catch (Exception exception) {
            kvT.error((Object)"Unknow Element");
            return null;
        }
    }

    @Override
    public String[] bxk() {
        return kwg;
    }

    static {
        for (eNd eNd2 : eNd.values()) {
            kvU.put(eNd2, new bmj_1(eNd2));
        }
        kwg = new String[]{kvV, kvW, kvX, kvY, kwa, kvZ, kwb, kwc, kwd};
        kwn = new awx_2(0.75f, 1.0f, 0.19f, 1.0f);
        kwo = new awx_2(0.19f, 0.69f, 1.0f, 1.0f);
        kwp = new awx_2(0.57f, 0.29f, 1.0f, 1.0f);
        kwq = new awx_2(1.0f, 0.67f, 0.19f, 1.0f);
        kwr = new awx_2(1.0f, 0.35f, 1.0f, 1.0f);
        kws = new awx_2(0.76f, 0.62f, 0.0f, 1.0f);
    }
}

