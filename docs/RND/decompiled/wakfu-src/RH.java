/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class RH
extends ff_1
implements RI {
    private static final Logger bma = Logger.getLogger(RH.class);
    public static final byte bmb = 0;
    protected long aXv;
    private short bmc;
    protected final acd_1 bmd = new acd_1();
    protected long bme;
    protected short bmf;
    private boolean bmg;
    protected boolean bmh;
    protected boolean bmi;
    protected short baz;
    protected final HashSet<acd_1> bmj = new HashSet();
    private abi_1 bmk;
    protected String baB;
    protected boolean bml;
    protected boolean bmm;
    protected byte bmn = 0;
    private boolean bmo;
    private final HashSet<RF> bmp = new HashSet();
    protected ayv_2 bmq;
    private ArrayList<rz_0> bmr;

    protected RH() {
    }

    public final short bei() {
        return this.baz;
    }

    public abi_1 bcB() {
        return this.bmk;
    }

    public abstract int bcC();

    public abstract int bcD();

    public abstract short bcE();

    public void a(abi_1 abi_12) {
        this.bmk = abi_12;
    }

    public boolean bej() {
        return false;
    }

    @Override
    public long Sn() {
        return this.aXv;
    }

    public void dC(long l) {
        this.aXv = l;
    }

    public void a(RF rF) {
        this.bmp.add(rF);
    }

    public void e(Collection<RF> collection) {
        this.bmp.addAll(collection);
    }

    public final void f(Collection<RF> collection) {
        this.bmp.clear();
        if (collection != null) {
            this.bmp.addAll(collection);
        }
    }

    public void b(RF rF) {
        this.bmp.remove(rF);
    }

    public void g(Collection<RF> collection) {
        this.bmp.removeAll(collection);
    }

    public boolean c(RF rF) {
        return this.bmp.contains(rF);
    }

    public Iterator<RF> bek() {
        return this.bmp.iterator();
    }

    public int bel() {
        return this.bmp.size();
    }

    public final short bem() {
        return this.bmf;
    }

    public void ac(short s) {
        this.bmf = s;
    }

    public final long ben() {
        return this.bme;
    }

    public void dD(long l) {
        this.bme = l;
    }

    @Override
    public final acd_1 aZw() {
        return this.bmd;
    }

    public final boolean beo() {
        return this.bmm;
    }

    public void bf(boolean bl) {
        this.bmm = bl;
    }

    public boolean bep() {
        return false;
    }

    public boolean beq() {
        return this.bml && this.bmg;
    }

    public boolean isUsable() {
        return this.bmh && !this.ber();
    }

    public boolean bg(boolean bl) {
        return bl ? this.bmh : this.isUsable();
    }

    public void setUsable(boolean bl) {
        this.bmh = bl;
    }

    public boolean ber() {
        return this.bmi;
    }

    public void bh(boolean bl) {
        this.bmi = bl;
        this.bev();
    }

    public boolean isVisible() {
        return this.bmg;
    }

    public void setVisible(boolean bl) {
        this.bmg = bl;
        if (!bl) {
            this.bi(false);
        }
    }

    public void dj(String string) {
        this.baB = string.intern();
    }

    protected void a(ayv_2 ayv_22) {
        this.bmq = ayv_22;
    }

    public fi_1[] bes() {
        return new fi_1[]{this.bex(), this.bey()};
    }

    @Override
    public void aVI() {
        this.aXv = 0L;
        this.bmc = 0;
        this.bmd.reset();
        this.bme = 0L;
        this.bmf = (short)Short.MAX_VALUE;
        this.bmg = false;
        this.bmh = false;
        this.bmi = false;
        this.baz = 0;
        this.bmk = abi_1.dzq;
        this.baB = null;
        this.bml = false;
        this.bmm = false;
        this.bmn = 0;
        this.bmo = false;
    }

    @Override
    public void aVH() {
        this.aXv = Long.MAX_VALUE;
        this.bmj.clear();
        this.bmp.clear();
        if (this.bmr != null) {
            this.bmr.clear();
            this.bmr = null;
        }
    }

    @Override
    public void aZp() {
        if (this.bmq != null) {
            try {
                this.bmq.returnObject(this);
            }
            catch (Exception exception) {
                bma.error((Object)"Erreur lors du retour au pool", (Throwable)exception);
            }
            this.bmq = null;
        } else {
            bma.error((Object)("Double release de " + String.valueOf(this.getClass())), (Throwable)new Exception());
            this.aVH();
        }
    }

    public final void a(rz_0 rz_02) {
        if (this.bmr == null) {
            this.bmr = new ArrayList(1);
        }
        if (this.bmr.contains(rz_02)) {
            return;
        }
        this.bmr.add(rz_02);
    }

    public final void bet() {
        this.bmr.clear();
        this.bmr = null;
    }

    public boolean h(acd_1 acd_12) {
        return !this.bmj.isEmpty() && this.bmj.contains(acd_12);
    }

    public HashSet<acd_1> beu() {
        return this.bmj;
    }

    public final void bev() {
        if (this.bmr != null) {
            for (rz_0 rz_02 : this.bmr) {
                rz_02.onInteractiveElementChanges(this);
            }
        }
    }

    @Override
    public fi_1[] zj() {
        return new fi_1[]{this.aVL(), this.bew(), this.bex(), this.bey(), this.aVM(), this.aVN()};
    }

    protected abstract fi_1 aVL();

    protected abstract fi_1 bew();

    protected abstract fi_1 bex();

    protected abstract fi_1 bey();

    protected abstract fi_1 aVM();

    protected abstract fi_1 aVN();

    public final void b(rz_0 rz_02) {
        if (this.bmr != null) {
            this.bmr.remove(rz_02);
        }
    }

    public void bi(boolean bl) {
        this.bml = bl;
    }

    public String toString() {
        return "[" + this.getClass().getSimpleName() + " id=" + this.aXv + "]" + String.valueOf(this.aZw());
    }

    protected abstract wy_0 aVO();

    public void aa(byte by) {
        this.bmn = by;
    }

    public byte bez() {
        return this.bmn;
    }

    public void ad(short s) {
        this.bmc = s;
    }

    public short beA() {
        return this.bmc;
    }

    public boolean beB() {
        return false;
    }

    public void beC() {
        this.bmo = true;
    }

    public void beD() {
        this.bmo = false;
    }

    public boolean beE() {
        return this.bmo;
    }

    public void beF() {
    }

    public List<abi_1> beG() {
        return List.of(abi_1.dzk, abi_1.dzm);
    }

    public boolean c(abi_1 abi_12) {
        return this.beG().contains(abi_12);
    }
}

