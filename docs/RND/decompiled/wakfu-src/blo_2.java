/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/*
 * Renamed from bLO
 */
public class blo_2
extends blg_2 {
    private bgy kvg = null;
    private static final Comparator<bmx_0> kvh = new blp_2();
    private boolean kvi = false;

    public blo_2(byte by) {
        super(fqt_0.sTe, by);
    }

    private void a(ArrayList<bmx_0> arrayList, bgy bgy2) {
        bgy bgy3 = bgy2.djY();
        if (bgy3 == null) {
            return;
        }
        fqw_0 fqw_02 = bgy3.a(fqt_0.sTd, (byte)0);
        if (fqw_02 == null) {
            return;
        }
        blb_2 blb_22 = (blb_2)fqw_02.ai((short)0);
        blb_2 blb_23 = (blb_2)fqw_02.ai((short)1);
        Iterator<bmx_0> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            bmx_0 bmx_02 = iterator.next();
            short s = fqw_02.dK(bmx_02.LV());
            if (s == -1 || ((bmt_0)bmx_02.giP()).eeY()) continue;
            blb_2 blb_24 = blb_2.a(fqu_0.sTq, bmx_02.LV(), bmx_02.avr(), bmx_02.aVt());
            if (this.a(blb_24, s)) {
                iterator.remove();
                continue;
            }
            blb_24.aZp();
        }
    }

    public void bK(bgy bgy2) {
        if (!this.kvi && bgy2 == this.kvg) {
            return;
        }
        this.kvi = false;
        this.clean();
        this.kvg = bgy2;
        ArrayList<bmx_0> arrayList = new ArrayList<bmx_0>();
        Iterable<bmx_0> iterable = bgy2.dkJ();
        if (iterable == null) {
            return;
        }
        for (bmx_0 bmx_02 : iterable) {
            arrayList.add(bmx_02);
        }
        this.a(arrayList, bgy2);
        for (bmx_0 bmx_02 : arrayList) {
            if (((bmt_0)bmx_02.giP()).eeY()) continue;
            blb_2 blb_22 = blb_2.a(fqu_0.sTq, bmx_02.LV(), bmx_02.avr(), bmx_02.aVt());
            if (this.ah(((bmt_0)bmx_02.giP()).cvD())) {
                this.a(blb_22, ((bmt_0)bmx_02.giP()).cvD());
                continue;
            }
            short s = this.beO();
            this.a(blb_22, s);
        }
    }

    public void edQ() {
        this.kvi = true;
    }
}

