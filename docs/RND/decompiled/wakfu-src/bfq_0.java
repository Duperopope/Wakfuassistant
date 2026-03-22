/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bFq
 */
public class bfq_0
extends bfc_1
implements bfv_1 {
    private int jTo;
    private boolean jTp;

    public bfq_0(int n) {
        super(n);
    }

    @Override
    public void v(String[] stringArray) {
        this.jTo = Integer.parseInt(stringArray[0]);
        this.jTp = stringArray.length <= 1 || Boolean.valueOf(stringArray[1]) != false;
    }

    @Override
    public boolean aQ(ffV ffV2) {
        if (this.jTp) {
            this.aT(ffV2);
        } else {
            this.jU(ffV2.LV());
        }
        return true;
    }

    private void aT(ffV ffV2) {
        csw_2 csw_22;
        aue_0 aue_02 = aue_0.cVJ();
        if (aue_02.c(csw_22 = csw_2.eOf())) {
            return;
        }
        csw_22.a(this, ffV2);
        aue_02.a(csw_22);
    }

    @Override
    public void clear() {
    }

    public void ll(long l) {
        this.jU(l);
    }

    public int dTp() {
        return this.jTo;
    }

    public boolean dTq() {
        return this.jTp;
    }

    @Override
    public @Unmodifiable Collection<Integer> dTn() {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();
        arrayDeque.add(this.jTo);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while (!arrayDeque.isEmpty()) {
            int n = (Integer)arrayDeque.removeLast();
            fhw fhw2 = fiJ.ssM.Wb(n);
            if (fhw2 == null) continue;
            fhw2.s(fhv2 -> (fhv2.cqk() ? arrayDeque : arrayList).addLast(fhv2.avr()));
        }
        return arrayList;
    }

    @Override
    public fgM dTl() {
        return fgM.skG;
    }
}

