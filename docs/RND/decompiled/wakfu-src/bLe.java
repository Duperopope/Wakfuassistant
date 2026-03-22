/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.wakfu.client.console.command.display.HideFightOccluders;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bLe
extends ZB<bKV> {
    private static final Logger krK = Logger.getLogger(bLe.class);
    private static final bLe krL = new bLe();
    static final int[] krM = new int[1];
    protected final TLongObjectHashMap<bKV> krN;
    final ArrayList<bKV> krO = new ArrayList(8);
    private final boolean krP = true;
    private final ArrayList<bLa> krQ;
    private final ArrayList<bLb> krR;
    private final ArrayList<bLa> krS;
    private final ArrayList<bLb> krT;

    public bLe() {
        this.krN = new TLongObjectHashMap();
        this.krQ = new ArrayList();
        this.krR = new ArrayList();
        this.krS = new ArrayList();
        this.krT = new ArrayList();
    }

    @Override
    public void a(aaj_0 aaj_02, int n) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return;
        }
        bLe.krM[0] = 2;
        this.bUI.clear();
        this.krN.forEachValue((TObjectProcedure)new bLf(this, aaj_02, n));
        int n2 = this.krO.size();
        for (int i = 0; i < n2; ++i) {
            this.b(this.krO.get(i));
        }
        this.krO.clear();
    }

    @Override
    public void a(aaj_0 aaj_02, float f2, float f3) {
        this.bUI.clear();
        this.krN.forEachValue((TObjectProcedure)new bLg(this, aaj_02));
    }

    private void m(bKV bKV2) {
        int n = this.krS.size();
        for (int i = 0; i < n; ++i) {
            this.krS.get(i).i(bKV2);
        }
    }

    private void n(bKV bKV2) {
        int n = this.krT.size();
        for (int i = 0; i < n; ++i) {
            this.krT.get(i).h(bKV2);
        }
    }

    public void o(bKV bKV2) {
        long l = GC.s(bKV2.bcC(), bKV2.bcD());
        if (!this.krN.containsKey(l)) {
            this.krN.put(l, (Object)bKV2);
            bzj_2.eqi().a(bKV2);
            this.a(bKV2, bKV2.bcC(), bKV2.bcD(), (int)bKV2.bcE());
            bKV2.ech();
            this.m(bKV2);
        } else {
            krK.warn((Object)("Impossible d'ajouter une resource en " + bKV2.bcC() + ":" + bKV2.bcD() + " car il en existe d\u00e9j\u00e0 une."));
        }
    }

    public void clear() {
        TLongObjectIterator tLongObjectIterator = this.krN.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            bKV bKV2 = (bKV)tLongObjectIterator.value();
            bKV2.bpI();
            bKV2.aZp();
        }
        this.krN.clear();
        this.bUI.clear();
        this.krS.clear();
        this.krS.addAll(this.krQ);
        this.krT.clear();
        this.krT.addAll(this.krR);
    }

    public bKV dQ(int n, int n2) {
        return (bKV)this.krN.get(GC.s(n, n2));
    }

    public void u(TObjectProcedure<bKV> tObjectProcedure) {
        this.krN.forEachValue(tObjectProcedure);
    }

    public void ecv() {
        krK.info((Object)"Supression de toutes les resources du ResourceManager.");
        this.krN.forEachValue((TObjectProcedure)new bLh(this));
        if (!this.krN.isEmpty()) {
            krK.error((Object)("Il reste encore " + this.krN.size() + " apr\u00e8s la supression !!!"));
        }
        this.krS.clear();
        this.krS.addAll(this.krQ);
        this.krT.clear();
        this.krT.addAll(this.krR);
    }

    public void b(bKV bKV2) {
        if (bKV2 != null) {
            this.krN.remove(bKV2.Sn());
            bzj_2.eqi().b(bKV2);
            wy_0 wy_02 = wa_0.aQ((short)bKV2.bcC(), (short)bKV2.bcD());
            if (wy_02 != null) {
                wy_02.b(bKV2.bcC(), bKV2.bcD(), false);
            } else {
                krK.warn((Object)("retrait d'une ressource en (" + bKV2.bcC() + ", " + bKV2.bcD() + ") alors que la map est inconnue/pas charg\u00e9e\t"));
            }
            this.n(bKV2);
            bKV2.aZp();
        } else {
            krK.error((Object)"Impossible de retirer une resource null");
        }
    }

    public void lJ(long l) {
        bKV bKV2 = (bKV)this.krN.get(l);
        if (bKV2 != null) {
            this.b(bKV2);
        } else {
            krK.warn((Object)("Impossible de supprimer une resource d'ID " + l + " qui n'existe pas"));
        }
    }

    public boolean dR(int n, int n2) {
        return this.krN.contains(GC.s(n, n2));
    }

    public static bLe ecw() {
        return krL;
    }

    public void a(bLa bLa2) {
        if (this.krQ.contains(bLa2)) {
            return;
        }
        this.krQ.add(bLa2);
        this.b(bLa2);
    }

    public void a(bLb bLb2) {
        if (this.krR.contains(bLb2)) {
            return;
        }
        this.krR.add(bLb2);
        this.b(bLb2);
    }

    public void b(bLa bLa2) {
        if (!this.krS.contains(bLa2)) {
            this.krS.add(bLa2);
        }
    }

    public void b(bLb bLb2) {
        if (!this.krT.contains(bLb2)) {
            this.krT.add(bLb2);
        }
    }

    public boolean c(bLa bLa2) {
        return this.krS.remove(bLa2);
    }

    public boolean c(bLb bLb2) {
        return this.krT.remove(bLb2);
    }

    @Override
    protected void a(bKV bKV2, int n, int n2, int n3) {
        super.a(bKV2, n, n2, n3);
        HideFightOccluders.g(bKV2);
    }

    @Override
    public void bpi() {
        this.krN.forEachValue((TObjectProcedure)new bLi(this));
    }

    @NotNull
    public Collection<bKV> a(aIv aIv2) {
        bKV bKV2;
        HashSet<bKV> hashSet = new HashSet<bKV>(this.ax(aIv2.cgB(), aIv2.cgC()));
        if (aIv2.cgA() && (bKV2 = (bKV)this.aY(aIv2.bcC(), aIv2.bcD())) != null) {
            hashSet.add(bKV2);
        }
        return hashSet;
    }

    @Nullable
    public bKV b(aIv aIv2) {
        bKV bKV2 = (bKV)this.ay(aIv2.cgB(), aIv2.cgC());
        if (bKV2 != null) {
            return bKV2;
        }
        if (!aIv2.cgA()) {
            return null;
        }
        return (bKV)this.aY(aIv2.bcC(), aIv2.bcD());
    }

    static /* synthetic */ ArrayList a(bLe bLe2) {
        return bLe2.bUI;
    }

    static /* synthetic */ void a(bLe bLe2, ZH zH, aaj_0 aaj_02) {
        bLe2.a(zH, aaj_02);
    }

    static /* synthetic */ ArrayList b(bLe bLe2) {
        return bLe2.bUI;
    }
}

