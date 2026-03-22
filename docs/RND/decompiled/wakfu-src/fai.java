/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Iterator;
import org.apache.log4j.Logger;

public final class fai
implements feq {
    private static final Logger rND = Logger.getLogger(fai.class);
    private final fak rNE;
    private final RL<ffV, uy_1> rNF;
    private int o;
    private boolean cHn;
    private long jEK;

    public fai(fak fak2) {
        this.rNE = fak2;
        this.rNF = new RL<ffV, uy_1>(fah.rNA, fag.rNz, fak2.rOO, true);
        this.rNF.a(Sj.bnP);
    }

    @Override
    public boolean bq(ffV ffV2) {
        return this.rNF.i(ffV2);
    }

    @Override
    public boolean bp(ffV ffV2) {
        try {
            return this.bq(ffV2) && this.rNF.b(ffV2);
        }
        catch (sb_0 sb_02) {
            rND.error((Object)"[GUILD_STORAGE] Impossible d'ajouter un item \u00e0 l'inventaire alors qu'on \u00e0 pourtant test\u00e9 le canAdd", (Throwable)sb_02);
            return false;
        }
    }

    @Override
    public boolean a(ffV ffV2, byte by) {
        return this.rNF.b(ffV2, (short)by);
    }

    @Override
    public boolean b(ffV ffV2, byte by) {
        try {
            return this.a(ffV2, by) && this.rNF.a(ffV2, by);
        }
        catch (sb_0 sb_02) {
            rND.error((Object)"[GUILD_STORAGE] Impossible d'ajouter un item \u00e0 l'inventaire alors qu'on \u00e0 pourtant test\u00e9 le canAdd", (Throwable)sb_02);
            return false;
        }
    }

    @Override
    public boolean br(ffV ffV2) {
        return this.rNF.j(ffV2);
    }

    @Override
    public boolean bs(ffV ffV2) {
        return this.br(ffV2) && this.rNF.c(ffV2);
    }

    @Override
    public boolean c(long l, short s) {
        return this.rNF.c(l, s);
    }

    @Override
    public boolean k(long l, short s) {
        return this.c(l, s) && this.rNF.b(l, -s);
    }

    @Override
    public boolean efK() {
        return true;
    }

    @Override
    public ffV lR(long l) {
        return this.rNF.dN(l);
    }

    @Override
    public ffV cv(byte by) {
        return this.rNF.ai(by);
    }

    public int aVo() {
        return this.rNF.aVo();
    }

    public short bfa() {
        return this.rNF.bfa();
    }

    @Override
    public byte lS(long l) {
        return (byte)this.rNF.dK(l);
    }

    public Iterator<ffV> iterator() {
        return this.rNF.bk(false);
    }

    public Iterator<ffV> fQL() {
        return this.rNF.bk(true);
    }

    public void a(Sp sp) {
        this.rNF.a(sp);
    }

    public void b(Sp sp) {
        this.rNF.b(sp);
    }

    public boolean isEnabled() {
        return this.cHn;
    }

    public long ZC() {
        return this.jEK;
    }

    public kc fQM() {
        ke ke2 = kc.ZE();
        ke2.gm(this.o);
        ke2.P(this.cHn);
        Iterator<ffV> iterator = this.iterator();
        while (iterator.hasNext()) {
            ffV ffV2 = iterator.next();
            kL kL2 = kJ.acW().gR(this.lS(ffV2.LV())).c(fga_0.cK(ffV2));
            ke2.a(kL2);
        }
        if (this.jEK >= 0L) {
            ke2.aO(this.jEK);
        } else {
            ke2.ZR();
        }
        return ke2.ZK();
    }

    public void g(kc kc2) {
        this.o = kc2.d();
        this.cHn = kc2.getEnabled();
        this.rNF.beZ();
        kc2.ot().forEach(kJ2 -> {
            try {
                this.rNF.a(fga_0.f(kJ2), (short)kJ2.Lz());
            }
            catch (sb_0 sb_02) {
                rND.error((Object)("[GUILD_STORAGE] Error unserializing an item from compartment " + kc2.d()), (Throwable)sb_02);
            }
        });
        this.jEK = kc2.ZB() ? kc2.ZC() : -1L;
    }

    public fak fQN() {
        return this.rNE;
    }

    public String toString() {
        return "GuildStorageCompartment{m_inventory=" + String.valueOf(this.rNF) + "}";
    }
}

