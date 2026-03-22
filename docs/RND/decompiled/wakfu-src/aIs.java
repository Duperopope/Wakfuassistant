/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.set.hash.TIntHashSet;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Stack;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class aIs
extends aff_0 {
    private static final Logger dXY = Logger.getLogger(aIs.class);
    private final Stack<aKs> dXZ = new Stack();
    private boolean dYa;
    private boolean dYb;
    private boolean dYc;
    private boolean dYd;
    private int dYe;
    private int dYf;
    private final TIntHashSet dYg = new TIntHashSet();
    private final boolean[] dYh = new boolean[256];
    private ZH dYi;
    private final ArrayList<ZH> dYj = new ArrayList();
    private static final Comparator<ZH> dYk = new aIu();

    public aIs(WL wL) {
        super(wL);
        this.bqL().a(agj_0.cuH);
        this.a(bLe.ecw());
        this.a(afh_0.bxU());
        this.a(ZM.bqw());
        this.a(fau_2.tQS);
        this.a(bir_1.dZt());
        this.a(caz_1.lId);
        this.bqL().a(new aIt(this));
    }

    public void el(boolean bl) {
        this.dYc = bl;
    }

    public void em(boolean bl) {
        this.dYa = bl;
    }

    public void en(boolean bl) {
        this.dYb = bl;
    }

    @Override
    public void bN(boolean bl) {
        super.bN(bl);
        this.ct(0.0f);
        this.cm(false);
        aki_0.ciX().clear();
        akj_0.ciY().clear();
        bLe.ecw().clear();
        cAY.eHc().reset();
        ZM.bqw().clear();
        awm_1.bPn().bPq();
    }

    @Override
    public void qy(int n) {
        aah_0.brY().qF(n);
        XQ.bSY.qF(n);
        super.qy(n);
        this.cgy();
    }

    private static boolean l(char c2) {
        return c2 >= '\u0000' && c2 < '\u0100';
    }

    @Override
    public boolean b(KeyEvent keyEvent) {
        char c2;
        if (this.dYa) {
            dcl_0.m(keyEvent);
        }
        if (aIs.l(c2 = keyEvent.getKeyChar()) && !this.dYh[c2]) {
            this.dYh[c2] = true;
        }
        return false;
    }

    @Override
    public boolean c(KeyEvent keyEvent) {
        char c2;
        if (this.dYb) {
            dcl_0.n(keyEvent);
        }
        if (aIs.l(c2 = keyEvent.getKeyChar())) {
            this.dYh[c2] = false;
        }
        return false;
    }

    @Override
    public boolean a(KeyEvent keyEvent) {
        return false;
    }

    @Override
    public boolean d(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean e(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean b(MouseEvent mouseEvent) {
        if (!this.dYg.contains(mouseEvent.getButton())) {
            this.dYg.add(mouseEvent.getButton());
        }
        this.dYe = mouseEvent.getX();
        this.dYf = mouseEvent.getY();
        dcm_0.ai(mouseEvent.getX(), mouseEvent.getY(), mouseEvent.getButton());
        return false;
    }

    @Override
    public boolean c(MouseEvent mouseEvent) {
        if (this.dYg.contains(mouseEvent.getButton())) {
            this.dYg.remove(mouseEvent.getButton());
        }
        dcm_0.D(mouseEvent.getX(), mouseEvent.getY(), mouseEvent.getButton(), mouseEvent.getModifiersEx());
        return true;
    }

    @Override
    public boolean a(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean a(MouseWheelEvent mouseWheelEvent) {
        if (!csz_1.ePn().ePm()) {
            this.bqL().cA((float)mouseWheelEvent.getWheelRotation() * 0.1f);
        }
        return false;
    }

    @Override
    public boolean f(MouseEvent mouseEvent) {
        int n;
        super.f(mouseEvent);
        if (!this.dYd) {
            return false;
        }
        int n2 = mouseEvent.getX() - this.dYe;
        if (n2 * n2 + (n = mouseEvent.getY() - this.dYf) * n < 200) {
            return true;
        }
        dcm_0.eX(mouseEvent.getX(), mouseEvent.getY());
        return false;
    }

    @Override
    public boolean g(MouseEvent mouseEvent) {
        super.g(mouseEvent);
        this.cW(mouseEvent.getX(), mouseEvent.getY());
        return false;
    }

    private boolean cgx() {
        return !this.dYg.isEmpty();
    }

    void cW(int n, int n2) {
        this.dYi = this.cX(n, n2);
        if (!this.cgx()) {
            if (this.dYc) {
                dcm_0.eW(n, n2);
            }
        } else if (this.dYd) {
            dcm_0.eX(n, n2);
        }
    }

    public ZH cX(int n, int n2) {
        bKV bKV2;
        adj_0 adj_022;
        this.dYj.clear();
        float f2 = this.bT(n);
        float f3 = this.bU(n2);
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        int n3 = bgt_02 == null ? -1 : bgt_02.dmW();
        ArrayList arrayList = adn_0.bvh().ax(f2, f3);
        for (adj_0 adj_022 : arrayList) {
            boolean bl;
            if (adj_022 == null || !(bl = adj_022.bqo() == n3) || !adj_022.bqs()) continue;
            this.dYj.add(adj_022);
        }
        afk_0 afk_02 = (afk_0)afh_0.bxU().ay(f2, f3);
        if (afk_02 != null) {
            this.dYj.add(afk_02);
        }
        if ((adj_022 = ZM.bqw().ay(f2, f3)) != null && adj_022 instanceof ZH) {
            this.dYj.add(adj_022);
        }
        if (n3 == -1 && (bKV2 = bLe.ecw().b(new aIv(this, n, n2))) != null) {
            this.dYj.add(bKV2);
        }
        this.dYj.sort(dYk);
        ZH zH = null;
        if (!this.dYj.isEmpty()) {
            zH = this.dYj.get(0);
        }
        adn_0.bvh().a(zH);
        bLe.ecw().a(zH);
        afh_0.bxU().a(zH);
        ZM.bqw().a(zH);
        if (zH != null && zH.bqs()) {
            zH.setSelected(true);
        }
        return zH;
    }

    @NotNull
    public ArrayList<ZH> cY(int n, int n2) {
        float f2 = this.bT(n);
        float f3 = this.bU(n2);
        boolean bl = false;
        if (aue_0.cVJ().cVK() != null) {
            bl = aue_0.cVJ().cVK().dkZ() != null;
        }
        ArrayList<ZH> arrayList = new ArrayList<ZH>();
        ArrayList arrayList2 = adn_0.bvh().ax(f2, f3);
        arrayList.addAll(arrayList2);
        if (!bl) {
            ArrayList arrayList3 = afh_0.bxU().ax(f2, f3);
            arrayList.addAll(arrayList3);
            Collection<bKV> collection = bLe.ecw().a(new aIv(this, n, n2));
            arrayList.addAll(collection);
            ArrayList<ZH> arrayList4 = aJP.cig().bv(f2, f3);
            if (arrayList4 != null) {
                arrayList.addAll(arrayList4);
            }
        }
        arrayList.sort(dYk);
        return arrayList;
    }

    @Override
    public boolean a(FocusEvent focusEvent) {
        return false;
    }

    @Override
    public boolean b(FocusEvent focusEvent) {
        return false;
    }

    public void a(aKs aKs2) {
        this.dXZ.push(aKs2);
    }

    public void cgy() {
        while (!this.dXZ.empty()) {
            aKs aKs2 = this.dXZ.pop();
            aKs2.aPc();
        }
    }

    public ZH cgz() {
        return this.dYi;
    }

    public boolean yz(int n) {
        assert (aIs.l((char)n));
        return this.dYh[n];
    }

    public boolean yA(int n) {
        return this.dYg.contains(n);
    }

    public void eo(boolean bl) {
        this.dYd = bl;
    }

    @Override
    protected void bO(boolean bl) {
        super.bO(bl);
        bzl_2.eqr().iQ(bl);
    }

    @Override
    protected aaj_0 a(arr_2 arr_22) {
        aIs aIs2 = new aIs(this.cqI);
        aIs2.bYk = arr_22;
        return aIs2;
    }

    @Override
    protected void bqR() {
        super.bqR();
        aiy_0.dYv.clear();
    }

    public aIv cZ(int n, int n2) {
        return new aIv(this, n, n2);
    }

    static /* synthetic */ float a(aIs aIs2, float f2) {
        return aIs2.bT(f2);
    }

    static /* synthetic */ float b(aIs aIs2, float f2) {
        return aIs2.bU(f2);
    }
}

