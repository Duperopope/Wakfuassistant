/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import java.util.Set;

public final class eQb
extends ero_0 {
    private static final aox_1 reR = new enz_0(new eny_0("Params", new enx_0[0]));

    @Override
    public aox_1 bEt() {
        return reR;
    }

    public eQb() {
        this.bby();
    }

    public eQb fFd() {
        eQb eQb2 = new eQb();
        return eQb2;
    }

    @Override
    public void E(QD qD) {
    }

    @Override
    protected void c(QD qD, boolean bl) {
        this.fHg();
        if (!(this.bgF instanceof exP)) {
            bgA.error((Object)"La cible doit \u00eatre un fighter");
            return;
        }
        if (!(this.bbh() instanceof ent_0)) {
            bgA.error((Object)"Cet effet ne peut \u00eatre utilis\u00e9 que dans un combat");
            return;
        }
        exP exP2 = (exP)this.bgF;
        HashSet<exP> hashSet = new HashSet<exP>();
        abi_1[] abi_1Array = abi_1.bVP();
        for (int i = 0; i < abi_1Array.length; ++i) {
            abi_1 object = abi_1Array[i];
            hashSet.addAll(this.a(exP2, object));
        }
        for (exP exP3 : hashSet) {
            exP3.f(exe_1.rEY);
        }
    }

    private Set<exP> a(exP exP2, abi_1 abi_12) {
        Object object;
        acd_1 acd_12 = new acd_1(exP2.aZw());
        acd_12.e(abi_12);
        ent_0 ent_02 = (ent_0)this.bbh();
        etu_0 etu_02 = ent_02.fBq();
        byte by = exP2.bcP();
        HashSet<Object> hashSet = new HashSet<Object>();
        HashSet<Object> hashSet2 = new HashSet<Object>();
        HashSet<Object> hashSet3 = new HashSet<Object>();
        while (etu_02.ax(acd_12) != null) {
            object = etu_02.ax(acd_12);
            if (((exP)object).bcP() == by) {
                hashSet2.addAll(hashSet);
                hashSet3.add(object);
                hashSet.clear();
                break;
            }
            hashSet.add(object);
            acd_12.e(abi_12);
        }
        object = new HashSet();
        object.addAll(hashSet3);
        object.addAll(hashSet2);
        return object;
    }

    @Override
    public boolean bbA() {
        return false;
    }

    @Override
    public boolean bbB() {
        return true;
    }

    @Override
    public boolean bbC() {
        return false;
    }

    @Override
    public void aVH() {
        super.aVH();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fFd();
    }
}

