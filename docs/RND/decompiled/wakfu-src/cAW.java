/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.Table
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

public class cAW
implements air_2,
cBg {
    private final Table<Byte, Integer, cAX> mpV = HashBasedTable.create();
    private cAX mpW;
    private String mpL;

    @Override
    @Nullable
    public aix_2 a(byte by, int n, String string) {
        cAX cAX2 = (cAX)this.mpV.get((Object)by, (Object)n);
        aix_2 aix_22 = this.a(string, cAX2);
        if (aix_22 != null) {
            return aix_22;
        }
        cAX cAX3 = (cAX)this.mpV.get((Object)by, (Object)0);
        aix_2 aix_23 = this.a(string, cAX3);
        if (aix_23 != null) {
            return aix_23;
        }
        return this.mpW.oS(string);
    }

    @Nullable
    private aix_2 a(String string, @Nullable cAX cAX2) {
        if (cAX2 == null) {
            return null;
        }
        return cAX2.oS(string);
    }

    public void aUI() {
        this.oR(this.mpL);
    }

    public void oR(String string) {
        this.mpL = string;
        aqr_2 aqr_22 = new aqr_2();
        aqs_2 aqs_22 = new aqs_2();
        aqr_22.ex(string);
        aqr_22.a(aqs_22, new ape_1[0]);
        aqr_22.close();
        this.mpV.clear();
        aqt_2 aqt_22 = aqs_22.bGT();
        for (apd_1 apd_12 : aqt_22.fp("mount")) {
            byte by = apd_12.fq("type").bCn();
            ArrayList<apd_1> arrayList = apd_12.fo("skin");
            for (apd_1 apd_13 : arrayList) {
                cAX cAX2 = new cAX();
                int n = apd_13.fq("id").bCo();
                for (apd_1 apd_14 : apd_13.getChildren()) {
                    if (apd_14.getChildren().isEmpty()) continue;
                    String string2 = apd_14.getName();
                    ArrayList<apd_1> arrayList2 = apd_14.fo("sound");
                    for (apd_1 apd_15 : arrayList2) {
                        cAX2.a(this.n(apd_15), string2);
                    }
                }
                this.mpV.put((Object)by, (Object)n, (Object)cAX2);
            }
        }
        this.mpW = (cAX)this.mpV.get((Object)0, (Object)0);
    }
}

