/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bHx
 */
public class bhx_2
implements aeh_2 {
    private static final Logger kar = Logger.getLogger(bhx_2.class);
    public static final String kas = "objectSearchTableModel";
    public static final String kat = "onSaleSearchTableModel";
    public static final String kau = "currentOffersSearchTableModel";
    public static final String kav = "similarEntriesSearchTableModel";
    public static final String kaw = "similarOffersSearchTableModel";
    public static final String kax = "historyTableModel";
    public static final String kay = "soldItemsSearchTableModel";
    public static final String kaz = "expiredEntriesSearchTableModel";
    public static final String kaA = "expiredOffersSearchTableModel";
    public static final String kaB = "purchasedItemsSearchTableModel";
    public static final String[] kaC = new String[]{"objectSearchTableModel", "onSaleSearchTableModel", "currentOffersSearchTableModel", "similarEntriesSearchTableModel", "similarOffersSearchTableModel", "historyTableModel", "soldItemsSearchTableModel", "expiredEntriesSearchTableModel", "expiredOffersSearchTableModel", "purchasedItemsSearchTableModel"};
    private static final bhx_2 kaD = new bhx_2();
    private final fgo_2 kaE = bhx_2.GU(16905);
    private final fgo_2 kaF = bhx_2.GU(17883);
    private final fgo_2 kaG = bhx_2.GU(18907);
    private final fgo_2 kaH = bhx_2.GU(19972);
    private final fgo_2 kaI = bhx_2.GU(18492);
    private final fgo_2 kaJ = bhx_2.GU(19585);
    private final fgo_2 kaK = bhx_2.GU(17195);
    private final fgo_2 kaL = bhx_2.GU(17280);
    private final fgo_2 kaM = bhx_2.GU(18081);
    private final fgo_2 kaN = bhx_2.GU(16696);

    public static bhx_2 dWf() {
        return kaD;
    }

    private static fgo_2 GU(int n) {
        fgo_2 fgo_22 = new fgo_2();
        fgo_22.a((string, bl) -> {
            fje fje2 = bhx_2.mN(string);
            if (fje2 == null) {
                return;
            }
            aaw_1.bUq().h(new dbu_0(fje2, n));
        });
        return fgo_22;
    }

    @Nullable
    private static fje mN(String string) {
        fje fje2;
        switch (string) {
            case "name": {
                fje2 = fje.swQ;
                break;
            }
            case "level": {
                fje2 = fje.swV;
                break;
            }
            case "shardsAndElements": 
            case "offerShards": {
                fje2 = fje.swT;
                break;
            }
            case "quantity": {
                fje2 = fje.swS;
                break;
            }
            case "price": {
                fje2 = fje.swR;
                break;
            }
            case "remainingTime": 
            case "date": {
                fje2 = fje.swU;
                break;
            }
            default: {
                kar.warn((Object)("Unknown column name: " + string));
                return null;
            }
        }
        return fje2;
    }

    private bhx_2() {
    }

    @Override
    public String[] bxk() {
        return kaC;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "objectSearchTableModel": {
                return this.kaE;
            }
            case "onSaleSearchTableModel": {
                return this.kaF;
            }
            case "currentOffersSearchTableModel": {
                return this.kaG;
            }
            case "similarEntriesSearchTableModel": {
                return this.kaH;
            }
            case "similarOffersSearchTableModel": {
                return this.kaI;
            }
            case "historyTableModel": {
                return this.kaJ;
            }
            case "soldItemsSearchTableModel": {
                return this.kaK;
            }
            case "expiredEntriesSearchTableModel": {
                return this.kaL;
            }
            case "expiredOffersSearchTableModel": {
                return this.kaM;
            }
            case "purchasedItemsSearchTableModel": {
                return this.kaN;
            }
        }
        return null;
    }
}

