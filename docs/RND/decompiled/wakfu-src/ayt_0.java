/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aYT
 */
public class ayt_0
implements afl {
    private static final Logger hyb = Logger.getLogger(ayt_0.class);

    public void a(WL wL) {
        aqb_1.bGD().a(new aMw(), aMw2 -> {
            bon_2 bon_22 = new bon_2(aMw2.cjd(), aMw2.cnT(), aMw2.bnd(), ayt_0.a(aMw2));
            bop_2.egN().a(bon_22);
        });
        wL.b(this);
    }

    private static List<bom_2> a(aMw aMw2) {
        ArrayList<bom_2> arrayList = new ArrayList<bom_2>();
        if (aMw2.cnU() == null) {
            return arrayList;
        }
        for (aMx aMx2 : aMw2.cnU()) {
            bom_2 bom_22 = new bom_2(aMx2.cnV(), aMx2.cnW(), aMw2.cjd(), aMx2.cnZ(), ayt_0.kV(aMx2.cnY()), ayt_0.kV(aMx2.cnX()), ayt_0.a(aMx2));
            arrayList.add(bom_22);
            bop_2.egN().a(bom_22);
        }
        return arrayList;
    }

    @NotNull
    private static List<boo_2> a(aMx aMx2) {
        ArrayList<boo_2> arrayList = new ArrayList<boo_2>();
        if (aMx2.coa() == null) {
            hyb.warn((Object)("[Guide] Guide id=" + aMx2.cnV() + " has no element to display"));
            return arrayList;
        }
        for (aMy aMy2 : aMx2.coa()) {
            arrayList.add(new boo_2(aMy2.cob(), aMy2.coc(), aMy2.cod()));
        }
        return arrayList;
    }

    @Nullable
    private static ang_2 kV(String string) {
        try {
            return ehu_0.rY(string);
        }
        catch (Exception exception) {
            hyb.error((Object)("Error when compiling criterion for Guide : " + string), (Throwable)exception);
            return null;
        }
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.guideCategory", new Object[0]);
    }
}

