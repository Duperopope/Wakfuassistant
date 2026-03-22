/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import org.apache.log4j.Logger;

public class bRq {
    private static final Logger kZW = Logger.getLogger(bRq.class);
    private static final bRq kZX = new bRq();
    private final TIntObjectHashMap<bRp> kZY = new TIntObjectHashMap();
    private static final int kZZ = 1;
    private int laa = 0;

    private bRq() {
    }

    public static bRq ekK() {
        return kZX;
    }

    private void a(bRp bRp2, TIntObjectHashMap<bRp> tIntObjectHashMap) {
        bRp2.lK(this.laa++);
        tIntObjectHashMap.put(bRp2.d(), (Object)bRp2);
    }

    private static void a(long l, TIntObjectHashMap<bRp> tIntObjectHashMap) {
        String string = bRq.md(l);
        try {
            FileOutputStream fileOutputStream = fq_0.bO(string);
            fs_0 fs_02 = new fs_0(fileOutputStream);
            List<bRp> list = tIntObjectHashMap.valueCollection().stream().filter(bRp2 -> !bRp2.ekJ()).toList();
            fs_02.mz(-1);
            fs_02.mz(1);
            fs_02.mz(list.size());
            for (bRp bRp3 : list) {
                bRp3.a(fs_02, 1);
            }
            fs_02.close();
            fileOutputStream.close();
        }
        catch (IOException iOException) {
            kZW.warn((Object)("probl\u00e8me \u00e0 la sauvegarde des notes de carte :" + iOException.getMessage()));
        }
    }

    public boolean d(bRp bRp2) {
        boolean bl;
        boolean bl2 = bl = this.kZY.remove(bRp2.d()) != null;
        if (bl) {
            this.ekM();
        }
        return bl;
    }

    public boolean Jd(int n) {
        boolean bl;
        boolean bl2 = bl = this.kZY.remove(n) != null;
        if (bl) {
            this.ekM();
        }
        return bl;
    }

    private static String md(long l) {
        return aub_0.cVb().iw(l) + "/notes.dat";
    }

    public void ekL() {
        this.b(this.ekO(), this.kZY);
    }

    public void ekM() {
        bRq.a(this.ekO(), this.kZY);
    }

    public TIntObjectHashMap<bRp> me(long l) {
        long l2 = this.mf(l);
        if (l2 == this.ekO()) {
            return this.kZY;
        }
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        this.b(l2, (TIntObjectHashMap<bRp>)tIntObjectHashMap);
        return tIntObjectHashMap;
    }

    public bRp a(int n, int n2, int n3, String string, int n4, boolean bl) {
        bRp bRp2 = new bRp(this.laa++, n, n2, n3, string, n4, bl);
        this.a(bRp2, this.kZY);
        this.ekM();
        return bRp2;
    }

    private void b(long l, TIntObjectHashMap<bRp> tIntObjectHashMap) {
        tIntObjectHashMap.clear();
        if (l == 0L) {
            return;
        }
        String string = bRq.md(l);
        try {
            URL uRL = fq_0.bA(string);
            if (!bl_0.a(uRL)) {
                return;
            }
            apl_1 apl_12 = apl_1.dw(fo_0.by(string));
            int n = -1;
            if (apl_12.aIA() == -1) {
                n = apl_12.aIA();
            } else {
                apl_12.tw(0);
            }
            int n2 = apl_12.aIA();
            for (int i = 0; i < n2; ++i) {
                bRp bRp2 = new bRp();
                bRp2.b(apl_12, n);
                this.a(bRp2, tIntObjectHashMap);
            }
        }
        catch (IOException iOException) {
            kZW.warn((Object)("probl\u00e8me \u00e0 l'ouverture des notes de carte : " + iOException.getMessage()));
        }
    }

    public TIntObjectIterator<bRp> ekN() {
        return this.kZY.iterator();
    }

    public String toString() {
        return "LandMarkNoteManager{}";
    }

    private long ekO() {
        long l = WX.bhh();
        if (bif_2.dYO().dYb()) {
            return l;
        }
        return this.mf(l);
    }

    private long mf(long l) {
        bzq_2 bzq_22 = bzp_2.eqt().mA(l);
        return bzq_22 == null ? l : bzq_22.lEq;
    }
}

