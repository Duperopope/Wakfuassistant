/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bnl
 */
public class bnl_1
implements aeh_2 {
    public static final String iHj = "roomTypePermList";
    public static final String iHk = "individualList";
    public static final String iHl = "individualMaxSizeText";
    public static final String iHm = "individualMaxSizeReached";
    private final fnE iHn;
    private final bny_2[] iHo;

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(iHj)) {
            return this.iHo;
        }
        if (string.equals(iHk)) {
            return this.dyo();
        }
        if (string.equals(iHm)) {
            int n = this.iHn.geI().size();
            return n >= 25;
        }
        if (string.equals(iHl)) {
            ahv_2 ahv_22 = new ahv_2();
            int n = this.iHn.geI().size();
            ahv_22.c(aum_0.cWf().c("dimBag.individualCappedSize", n, 25));
            return ahv_22.ceL();
        }
        return null;
    }

    private Object dyo() {
        ArrayList<bnm_1> arrayList = new ArrayList<bnm_1>();
        for (fnD fnD2 : this.iHn.geI()) {
            arrayList.add(new bnm_1(this, fnD2.Sn(), fnD2.getName()));
        }
        return arrayList;
    }

    public void a(fnC fnC2) {
        this.iHn.a(fnC2);
    }

    public void a(fnD fnD2) {
        int n = this.iHn.geI().size();
        if (n >= 25) {
            aPd.e("desc.individualRightsMaxSizeReached", new Object[0]);
            return;
        }
        this.iHn.a(fnD2);
        this.dyp();
        fse_1.gFu().a((aef_2)this, iHk, iHj, iHl, iHm);
    }

    public void kd(long l) {
        this.iHn.kd(l);
        this.dyp();
        fse_1.gFu().a((aef_2)this, iHk, iHj, iHl, iHm);
    }

    private void dyp() {
        for (bny_2 bny_22 : this.iHo) {
            bny_22.dyp();
        }
    }

    public bnl_1(fnE fnE2) {
        this.iHn = fnE2;
        this.iHo = this.dyq();
    }

    public bny_2[] dyq() {
        int[] nArray = this.dyr();
        bny_2[] bny_2Array = new bny_2[nArray.length];
        for (int i = 0; i < nArray.length; ++i) {
            bny_2Array[i] = new bny_2(nArray[i], this.iHn);
        }
        return bny_2Array;
    }

    public int[] dyr() {
        int n;
        Object object;
        int n2;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        bnv_2 bnv_22 = aue_0.cVJ().cVK().dnw();
        for (n2 = 0; n2 < 9; n2 = (int)((byte)(n2 + 1))) {
            object = bnv_22.g((byte)n2, true);
            if (object == null || arrayList.contains(n = ((ffV)object).avr())) continue;
            arrayList.add(n);
        }
        n2 = arrayList.size();
        object = new int[n2];
        for (n = 0; n < n2; ++n) {
            object[n] = (Integer)arrayList.get(n);
        }
        return object;
    }

    public fnE dys() {
        return this.iHn;
    }
}

