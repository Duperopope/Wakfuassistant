/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eCb
 */
public final class ecb_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pyv = new ArrayList();
    public static final String pyw = "monster";
    private boolean pym;
    private boolean pyx = true;

    public ecb_0(ArrayList<amx_1> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        this.pym = pyw.equalsIgnoreCase(((anh_2)arrayList.get(0)).getValue());
        if (arrayList.size() > 1) {
            this.pyx = ((amz_2)arrayList.get(1)).b(null, null, null, null);
        }
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLN;
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pyv;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        if (object4 == null) {
            throw new amf_2("Pas de contexte...");
        }
        etu_0<?> etu_02 = eAs.m(object, object4);
        if (etu_02 == null) {
            throw new amf_2("Impossible de r\u00e9cup\u00e9rer le combat");
        }
        byte by = this.pym ? (byte)1 : 0;
        HashSet hashSet = new HashSet();
        if (this.pyx) {
            hashSet.addAll(etu_02.a(evb_0.fNn(), evb_0.fJ(by), evb_0.a(evb_0.l(exe_1.rFi))));
        } else {
            hashSet.addAll(etu_02.a(evb_0.fJ(by), evb_0.a(evb_0.l(exe_1.rFi))));
        }
        if (by == 0) {
            if (this.pyx) {
                hashSet.addAll(etu_02.a(evb_0.fNn(), evb_0.fJ((byte)5), evb_0.a(evb_0.l(exe_1.rFi))));
            } else {
                hashSet.addAll(etu_02.a(evb_0.fJ((byte)5), evb_0.a(evb_0.l(exe_1.rFi))));
            }
        }
        short s = 0;
        for (exP exP2 : hashSet) {
            s = GC.c(s, exP2.cmL());
        }
        return s;
    }

    static {
        pyv.add(amz_1.cJI);
        pyv.add(new amz_1[]{amz_1.cJx});
        pyv.add(new amz_1[]{amz_1.cJx, amz_1.cJz});
    }
}

