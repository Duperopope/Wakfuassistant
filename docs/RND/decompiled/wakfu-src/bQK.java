/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Comparator;

public class bQK
implements aeh_2 {
    public static final Comparator<bQN> kWY = new bQL();
    public static final String kWZ = "elements";
    public static final String kXa = "name";
    public static final String kXb = "iconStyle";
    public static final String kXc = "enabled";
    public static final String[] kXd = new String[]{"elements"};
    private final bQV kXe;
    final TIntObjectHashMap<bQN> kXf = new TIntObjectHashMap();

    @Override
    public String[] bxk() {
        return kXd;
    }

    public bQK(bQV bQV2) {
        this.kXe = bQV2;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kWZ)) {
            ArrayList<bQN> arrayList = this.ejY();
            bQN bQN2 = arrayList.get(0);
            if (!bQN2.bVe()) {
                bQN2.dJz();
            }
            return arrayList;
        }
        if (string.equals(kXa)) {
            int n = this.kXe.d();
            return n == -1 ? aum_0.cWf().c(this.kXe.getTag(), new Object[0]) : bQD.ejE().IV(n);
        }
        if (string.equals(kXb)) {
            return this.kXe.getStyle();
        }
        if (string.equals(kXc)) {
            return !this.kXf.isEmpty();
        }
        return null;
    }

    private ArrayList<bQN> ejY() {
        ArrayList<bQN> arrayList = new ArrayList<bQN>();
        this.kXf.forEachValue((TObjectProcedure)new bQM(this, arrayList));
        arrayList.sort(kWY);
        return arrayList;
    }

    public void a(bQN bQN2) {
        this.kXf.put(bQN2.cjd(), (Object)bQN2);
    }

    public bQN Ja(int n) {
        return (bQN)this.kXf.get(n);
    }

    public byte aJr() {
        return (byte)this.kXe.d();
    }

    public byte ejZ() {
        return (byte)this.kXe.ordinal();
    }
}

