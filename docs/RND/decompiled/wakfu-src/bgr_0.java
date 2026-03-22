/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongIntHashMap
 *  gnu.trove.map.hash.TLongLongHashMap
 *  it.unimi.dsi.fastutil.longs.LongCollection
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import gnu.trove.map.hash.TLongIntHashMap;
import gnu.trove.map.hash.TLongLongHashMap;
import it.unimi.dsi.fastutil.longs.LongCollection;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bgR
 */
public class bgr_0 {
    protected static final Logger idx = Logger.getLogger(bgr_0.class);
    private static final bgr_0 idy = new bgr_0();
    private final ArrayList<bgy> idz = new ArrayList();
    private byte idA = 0;
    private final TLongIntHashMap idB = new TLongIntHashMap();
    private final TLongLongHashMap idC = new TLongLongHashMap();
    @NotNull
    private final LongSet idD = new LongOpenHashSet();
    private bgy idE;
    @Nullable
    private String idF;

    public static bgr_0 dmo() {
        return idy;
    }

    public void bl(byte by) {
        this.idA = by;
        bib_0.ilf.a(this.idA, this.idz);
    }

    public void a(ArrayList<byte[]> arrayList, Runnable runnable) {
        fcK.rUe.clear();
        fcL.rUh.fSQ();
        this.idB.clear();
        this.idC.clear();
        this.idz.clear();
        for (int i = 0; i < arrayList.size(); ++i) {
            bhJ bhJ2 = this.dV(arrayList.get(i));
            this.l(bhJ2);
            fcL.rUh.d(aue_0.cVJ().cVO().xl(), bhJ2);
            bhJ2.ddI().d(runnable);
        }
        this.dmv();
        csm_1.eOv().kb(true);
    }

    public void a(@NotNull LongSet longSet) {
        this.idD.clear();
        this.idD.addAll((LongCollection)longSet);
    }

    public void jy(long l) {
        this.idD.remove(l);
    }

    public boolean jz(long l) {
        return this.idD.contains(l);
    }

    private void l(bhJ bhJ2) {
        bhJ2.gg(ekj_0.R(bhJ2.Xi(), bhJ2.Sn()));
        fb_2 fb_22 = ekj_0.b(bhJ2.Xi(), bhJ2.Sn(), fm_1.pw);
        if (fb_22.AK() == 0) {
            return;
        }
        int n = fb_22.AK();
        bhJ2.CW(n);
        bgv_2 bgv_22 = (bgv_2)fgD.fXh().Vd(n);
        bhJ2.ddI().ddm().e(bgv_22);
        if (bhJ2.doJ()) {
            return;
        }
        try {
            String string = auc_0.cVq().bS("ANMEquipmentPath");
            Anm anm = ZC.dR(String.format(string, bgv_22.aVt()));
            bhJ2.ddI().b(anm, bdl_1.hKz.hKP);
        }
        catch (fu_0 fu_02) {
            // empty catch block
        }
    }

    private bhJ dV(byte[] byArray) {
        bgt_0 bgt_02 = new bgt_0(false);
        this.idz.add(bgt_02);
        try {
            bgt_02.fV(true);
            bgt_02.fR(false);
            bgt_02.as(byArray);
        }
        catch (Exception exception) {
            bgt_02.dpv().a(bgt_02.dpv().fis(), byArray);
            idx.error((Object)"Erreur durant la d\u00e9Serialization d'un personnage : ", (Throwable)exception);
        }
        return bgt_02;
    }

    public void ax(bgy bgy2) {
        if (this.ay(bgy2)) {
            return;
        }
        this.idz.add(bgy2);
    }

    public boolean ay(bgy bgy2) {
        boolean bl = this.idz.contains(bgy2);
        if (bl) {
            return true;
        }
        for (bgy bgy3 : this.idz) {
            if (bgy3.Sn() != bgy2.Sn()) continue;
            return true;
        }
        return false;
    }

    public void f(bgy bgy2, int n) {
        if (!this.ay(bgy2)) {
            throw new IllegalArgumentException("Impossible de rajouter des informations de nation sur un character non-existant : " + String.valueOf(bgy2));
        }
        this.idB.put(bgy2.Sn(), n);
    }

    public int az(bgy bgy2) {
        return this.idB.get(bgy2.Sn());
    }

    public void a(bgy bgy2, long l) {
        if (!this.ay(bgy2)) {
            throw new IllegalArgumentException("Impossible de rajouter des informations de nation sur un character non-existant : " + String.valueOf(bgy2));
        }
        this.idC.put(bgy2.Sn(), l);
    }

    public long aA(bgy bgy2) {
        return this.idC.get(bgy2.Sn());
    }

    public void jA(long l) {
        for (int i = this.idz.size() - 1; i >= 0; --i) {
            bgy bgy2 = this.idz.get(i);
            if (bgy2.Sn() != l) continue;
            bgy bgy3 = this.idz.remove(i);
            this.idB.remove(bgy3.Sn());
            this.idC.remove(bgy3.Sn());
            this.dmv();
            if (this.idE != null && this.idE.Sn() == l) {
                int n = i == 0 ? 0 : i - 1;
                this.aB(this.idz.isEmpty() ? null : this.idz.get(n));
            }
            bgg_0.dlO().av(bgy3);
            return;
        }
    }

    public final void dmp() {
        this.aB(null);
        this.dmv();
    }

    public final void aB(bgy bgy2) {
        this.idE = this.idz.contains(bgy2) ? bgy2 : null;
        fse_1.gFu().f("characterChoice.selectedCharacter", this.idE);
    }

    public final bgy dmq() {
        return this.idE;
    }

    public final int dmr() {
        return this.idz.size();
    }

    public final bgy dms() {
        if (this.idF == null) {
            return null;
        }
        for (bgy bgy2 : this.idz) {
            if (!bgy2.getName().equals(this.idF)) continue;
            return bgy2;
        }
        return null;
    }

    public final bgy dmt() {
        if (this.idz == null || this.idz.size() == 0) {
            return null;
        }
        return this.idz.get(0);
    }

    public ArrayList<bgy> dmu() {
        return this.idz;
    }

    public void p(Collection<bgy> collection) {
        this.idz.clear();
        this.idz.addAll(collection);
        this.dmv();
    }

    private void dmv() {
        bib_0.ilf.a(this.idA, this.idz);
    }

    public void dmw() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (bgy fileArray : this.idz) {
            arrayList.add(fileArray.getName());
        }
        File file = new File(aub_0.cVb().cVm());
        if (!file.exists()) {
            return;
        }
        for (File file2 : file.listFiles(new bgs_0(this))) {
            if (arrayList.contains(file2.getName())) continue;
            fq_0.d(file2);
        }
    }

    @Nullable
    public String dmx() {
        return this.idF;
    }

    public void lJ(@Nullable String string) {
        this.idF = string;
    }

    public bgy jB(long l) {
        for (bgy bgy2 : this.idz) {
            if (bgy2.Sn() != l) continue;
            return bgy2;
        }
        return null;
    }

    public bgy lK(String string) {
        for (bgy bgy2 : this.idz) {
            if (!bgy2.getName().equals(string)) continue;
            return bgy2;
        }
        return null;
    }

    public void aC(bgy bgy2) {
        if (this.jB(bgy2.Sn()) != null) {
            return;
        }
        this.idz.add(bgy2);
        this.a(bgy2, bgy2.aqZ());
        this.f(bgy2, bgy2.Xt());
    }

    public short dmy() {
        if (this.idz.isEmpty()) {
            return 0;
        }
        short s = 0;
        for (bgy bgy2 : this.idz) {
            short s2;
            if (bgy2 == null || (s2 = bgy2.dnG()) <= s) continue;
            s = s2;
        }
        return s;
    }
}

