/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fHT
 */
public class fht_2
implements aeh_2 {
    private static final String uzJ = "xulorInspector";
    private static final String uzK = "widgetType";
    private static final String uzL = "widgetId";
    private static final String uzM = "widgetSize";
    private static final String uzN = "widgetStyle";
    private static final String uzO = "widgetParentId";
    private static final String uzP = "widgetElementMap";
    private static final String[] uzQ = new String[]{"widgetType", "widgetId", "widgetSize", "widgetStyle", "widgetParentId", "widgetElementMap"};
    private static final fht_2 uzR = new fht_2();
    private boolean uzS;
    @Nullable
    private fes_2 uzT;
    @Nullable
    private fhu_2 uzU;

    public static fht_2 gBk() {
        return uzR;
    }

    private fht_2() {
    }

    public boolean gBl() {
        return this.uzS;
    }

    public void a(@Nullable fhu_2 fhu_22) {
        this.uzU = fhu_22;
    }

    public void start() {
        this.uzS = true;
        fse_1.gFu().f(uzJ, this);
    }

    public void bhk() {
        this.uzS = false;
        fse_1.gFu().f(uzJ, (Object)null);
    }

    public void w(@Nullable fes_2 fes_22) {
        if (!this.uzS) {
            return;
        }
        if (fes_22 == this.uzT) {
            return;
        }
        this.uzT = fes_22;
        fse_1.gFu().a((aef_2)this, this.bxk());
        if (this.uzU != null) {
            this.uzU.onInspectedWidgetChanged(fes_22);
        }
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (this.uzT == null) {
            return null;
        }
        return switch (string) {
            case uzK -> this.uzT.getClass().getSimpleName();
            case uzL -> String.valueOf(this.uzT.getId());
            case uzN -> {
                String var4_4 = this.uzT.getStyle();
                if (var4_4 == null) {
                    yield "null";
                }
                if (var4_4.isBlank()) {
                    yield "[Empty]";
                }
                yield var4_4;
            }
            case uzM -> {
                fsm_1 var4_5 = this.uzT.getSize();
                if (var4_5 == null) {
                    yield "null";
                }
                yield String.format("(%d, %d)", var4_5.width, var4_5.height);
            }
            case uzO -> {
                fhv_1 var4_6 = this.uzT.getFirstParentWithId();
                if (var4_6 == null) {
                    yield "null";
                }
                yield String.valueOf(var4_6.getId());
            }
            case uzP -> {
                fhs_2 var4_7 = this.uzT.getElementMap();
                if (var4_7 == null) {
                    yield "null";
                }
                yield String.valueOf(var4_7.getId());
            }
            default -> null;
        };
    }

    @Override
    public String[] bxk() {
        return uzQ;
    }
}

