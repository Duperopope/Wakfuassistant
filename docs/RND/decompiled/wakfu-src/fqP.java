/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Function;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class fqP<S extends fqE>
extends Sg<S, ym_1>
implements gq_0<yq_1> {
    private static final Logger sVO = Logger.getLogger(fqP.class);
    private Function<zh_2, S> sVP;

    public fqP(Function<zh_2, S> function, short s, RW<S, ym_1> rW, RU<S> rU, boolean bl, boolean bl2, boolean bl3) {
        super(s, rW, rU, bl, bl2, bl3);
        this.sVP = function;
        this.a(Sj.bnT);
    }

    public fqP(short s, RW<S, ym_1> rW, RU<S> rU, boolean bl, boolean bl2, boolean bl3) {
        super(s, rW, rU, bl, bl2, bl3);
        this.a(Sj.bnT);
    }

    @Override
    public boolean a(yq_1 yq_12) {
        if (this.bnI) {
            sVO.warn((Object)"Impossible d'ajouter l'information de quantit\u00e9 \u00e0 un RawSpellLevelInventory qui n'est pas pr\u00e9vu pour");
        }
        yq_12.clear();
        for (fqE fqE2 : this) {
            if (!fqE2.bfh()) continue;
            yr_1 yr_12 = new yr_1();
            if (!fqE2.d(yr_12.alI)) {
                return false;
            }
            yq_12.alH.add(yr_12);
        }
        return true;
    }

    public zk_2 gjd() {
        zm_2 zm_22 = zk_2.axT();
        for (fqE fqE2 : this) {
            zm_22.d(fqE2.giQ());
        }
        return zm_22.axZ();
    }

    @Override
    public boolean b(yq_1 yq_12) {
        this.beQ();
        if (this.bnI) {
            sVO.warn((Object)"Impossible d'ajouter les quantit\u00e9s depuis un RawStackInventory qui ne connait pas cette information");
        }
        boolean bl = true;
        fqE fqE2 = null;
        if (this.bnG == null) {
            return false;
        }
        for (yr_1 yr_12 : yq_12.alH) {
            try {
                fqE2 = (fqE)this.bnG.x(yr_12.alI);
                if (fqE2 != null) {
                    if (((Sg)this).b(fqE2)) continue;
                    bl = false;
                    sVO.error((Object)("Unable to add spell " + fqE2.avr() + "to spell inventory"));
                    fqE2.aZp();
                    continue;
                }
                bl = false;
            }
            catch (sa_0 sa_02) {
                sVO.error((Object)adu_1.a(sa_02));
                bl = false;
                fqE2.aZp();
            }
            catch (Sz sz) {
                sVO.error((Object)adu_1.a(sz));
                bl = false;
                fqE2.aZp();
            }
        }
        return bl;
    }

    public boolean g(zk_2 zk_22) {
        this.beQ();
        boolean bl = true;
        List<zh_2> list = zk_22.axP();
        for (zh_2 zh_22 : list) {
            fqE fqE2 = (fqE)this.sVP.apply((Object)zh_22);
            if (fqE2 == null) continue;
            try {
                if (((Sg)this).b(fqE2)) continue;
                bl = false;
                sVO.error((Object)("Unable to add spell " + zh_22.axA() + "to spell inventory"));
                fqE2.aZp();
            }
            catch (Sz | sa_0 sb_02) {
                sVO.error((Object)("Failed to add " + String.valueOf(fqE2.sUL) + " to inventory"), (Throwable)sb_02);
                bl = false;
                fqE2.aZp();
            }
        }
        return bl;
    }

    public HashMap<Long, S> gje() {
        return this.bnF;
    }

    @Override
    public int pa(int n) {
        return 0;
    }

    @Override
    public int a(int n, int n2, boolean bl) {
        return 0;
    }

    @Nullable
    public S gjf() {
        Iterator iterator = this.bnF.values().iterator();
        if (iterator.hasNext()) {
            fqE fqE2 = (fqE)iterator.next();
            return (S)fqE2;
        }
        return null;
    }

    @Override
    public ArrayList<S> b(RX rX) {
        return super.b(rX);
    }
}

