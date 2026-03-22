/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class eCc
extends eak_0 {
    private static final ArrayList<amz_1[]> pyy = new ArrayList();
    public static final String pyz = "monster";
    private boolean pym;
    private boolean pyx = true;

    public eCc(ArrayList<amx_1> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        this.pym = pyz.equalsIgnoreCase(((anh_2)arrayList.get(0)).getValue());
        if (arrayList.size() > 1) {
            this.pyx = ((amz_2)arrayList.get(1)).b(null, null, null, null);
        }
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLM;
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pyy;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        short s;
        if (object4 == null) {
            throw new amf_2("Pas de contexte...");
        }
        etu_0<?> etu_02 = eAs.m(object, object4);
        if (etu_02 == null) {
            throw new amf_2("Impossible de r\u00e9cup\u00e9rer le combat");
        }
        byte by = this.pym ? (byte)1 : 0;
        ArrayList arrayList = new ArrayList();
        if (this.pyx) {
            arrayList.addAll(etu_02.a(evb_0.fNn(), evb_0.fJ(by), evb_0.a(evb_0.l(exe_1.rFi))));
        } else {
            arrayList.addAll(etu_02.a(evb_0.fJ(by), evb_0.a(evb_0.l(exe_1.rFi))));
        }
        if (by == 0) {
            if (this.pyx) {
                arrayList.addAll(etu_02.a(evb_0.fNn(), evb_0.fJ((byte)5), evb_0.a(evb_0.l(exe_1.rFi))));
            } else {
                arrayList.addAll(etu_02.a(evb_0.fJ((byte)5), evb_0.a(evb_0.l(exe_1.rFi))));
            }
        }
        int s2 = Short.MAX_VALUE;
        for (exP exP2 : arrayList) {
            s = GC.b(s, exP2.cmL());
        }
        return s;
    }

    static {
        pyy.add(amz_1.cJI);
        pyy.add(new amz_1[]{amz_1.cJx});
        pyy.add(new amz_1[]{amz_1.cJx, amz_1.cJz});
    }
}

