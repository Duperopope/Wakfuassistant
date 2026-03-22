/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import gnu.trove.procedure.TObjectProcedure;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from caF
 */
public class caf_1
extends cab_1 {
    private static final float lHc = 0.8f;
    @NotNull
    private final String lHd;
    private final Long2ObjectMap<List<cag_1>> lHe = new Long2ObjectOpenHashMap();

    public caf_1(@NotNull String string) {
        this.lHd = string;
    }

    @Override
    protected aaq_0 a(String string, int n, int n2) {
        aaq_0 aaq_02 = super.a(string, n, n2);
        if (aaq_02 != null) {
            return aaq_02;
        }
        return caf_1.b(string, n, n2);
    }

    @Override
    public aaq_0 bl(int n, int n2) {
        return caf_1.b(this.lHd, n, n2);
    }

    @Override
    protected void a(long l2, @NotNull ScreenElement screenElement, @NotNull aaq_0 aaq_02) {
        ((List)this.lHe.computeIfAbsent(l2, l -> new ArrayList())).add(new cag_1(screenElement, aaq_02));
        WV.bnj().bnk().a(aaq_02);
    }

    public void a(long l, @NotNull fsr_0 fsr_02) {
        List list = (List)this.lHe.remove(l);
        if (list == null) {
            return;
        }
        for (cag_1 cag_12 : list) {
            cag_12.lHg.c(cag_12.lHf);
        }
        list.stream().map(cag_1::erB).distinct().forEach(aaq_02 -> {
            aaq_02.bsP();
            WV.bnj().bnk().a((aaq_0)aaq_02);
        });
        this.b(fsr_02);
    }

    public void a(long l, @Nullable caj_2 caj_22, @NotNull caq_1 caq_12) {
        this.a(l, caq_12);
        if (caj_22 != null) {
            this.a(caj_22);
        }
    }

    public void mG(long l) {
        this.f(l, 0.8f);
    }

    public void mH(long l) {
        this.f(l, 1.0f);
    }

    private void f(long l, float f2) {
        List list = (List)this.lHe.get(l);
        if (list == null) {
            return;
        }
        for (cag_1 cag_12 : list) {
            cag_12.lHf.bsG();
            cag_12.lHf.bW(f2);
        }
    }

    public void mI(long l) {
        wb_0 wb_02 = new wb_0();
        wb_02.b(WV.bnj().bnl(), l);
        wb_02.a(n -> {
            short s = GC.mS(n);
            short s2 = GC.mT(n);
            this.a(this.erw(), (int)s, (int)s2);
            return true;
        });
    }

    public void b(@NotNull fsr_0 fsr_02) {
        this.lGS = 0;
        fsr_02.y((TObjectProcedure<fam_0>)((TObjectProcedure)fam_02 -> {
            int n = Arrays.stream(((cal_2)fam_02.fRg()).eqV()).mapToInt(cak_1::erc).max().orElse(0);
            this.lGS += n;
            return true;
        }));
    }

    @Override
    public void a(@NotNull caj_2 caj_22) {
        cah_2 cah_22 = new cah_2(this.lGS + 1, caj_22.conn());
        this.a(caj_22.fRc(), caj_22.fRd(), ((cal_2)caj_22.fRg()).eqV(), cah_22, caj_22.ZC());
        caj_22.us(1);
        this.lGS += cah_22.lHb;
    }
}

