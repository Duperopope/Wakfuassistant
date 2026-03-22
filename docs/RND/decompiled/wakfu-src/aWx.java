/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Optional;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class aWx {
    public static final String huZ = "[se]";
    public static final String hva = "[target]";
    public static final String hvb = "[casterName]";
    public static final String hvc = "\\[se\\]";
    public static final String hvd = "\\[target\\]";
    public static final String hve = "\\[casterName\\]";
    private final aWv hvf;
    private static final Logger hvg = Logger.getLogger(aWx.class);
    private static final int[] hvh = new int[]{enf_0.qPB.d(), enf_0.qQO.d(), enf_0.qPF.d()};

    public aWx(aWv aWv2) {
        this.hvf = aWv2;
    }

    void cXz() {
        bsS bsS2 = this.hvf.cja();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bsS2 == null || bgt_02 == null || !bsS2.equals(bgt_02.dmV())) {
            return;
        }
        if (!this.cXB()) {
            return;
        }
        if (this.hvf.cXu() instanceof erh_0) {
            return;
        }
        if (!this.cXA()) {
            return;
        }
        qu_0 qu_02 = this.hvf.cXu().bbc();
        if (qu_02 == null) {
            return;
        }
        if (qu_02 instanceof bgy && bjv_2.aM((bgy)qu_02)) {
            return;
        }
        long l = this.hvf.Qy();
        if (!aWx.a(bsS2, l)) {
            return;
        }
        String string = this.cXC();
        if (!string.isEmpty()) {
            aWv.hse.ap(string);
        }
    }

    private static boolean a(bsS bsS2, long l) {
        if (l == Long.MIN_VALUE) {
            return true;
        }
        if (bsS2.kq(l) != null) {
            return true;
        }
        if (bsS2.bai().dp(l) != null) {
            return true;
        }
        if (bsS2 instanceof bsj_0) {
            return ((bsj_0)bsS2).qH(l) != null;
        }
        return false;
    }

    private boolean cXA() {
        return this.hvf.cXu().bba() != null && ((enk_0)this.hvf.cXu().bba()).fAo();
    }

    private boolean cXB() {
        return !ArrayUtils.contains((int[])hvh, (int)this.hvf.cXu().d());
    }

    private String iH(long l) {
        qu_0 qu_02;
        bsS bsS2 = this.hvf.cja();
        bgy bgy2 = bsS2.kq(l);
        if (bgy2 != null) {
            return bgy2.getName();
        }
        eSS eSS2 = (eSS)bsS2.bai().dp(l);
        if (eSS2 != null) {
            return eSS2.getName();
        }
        if (bsS2 instanceof bsj_0 && (qu_02 = ((bsj_0)bsS2).qH(l)) instanceof bCA) {
            return ((bCA)((Object)qu_02)).getName();
        }
        return "";
    }

    @NotNull
    private String cXC() {
        ahv_2 ahv_22 = new ahv_2();
        boolean bl = ((enk_0)this.hvf.cXu().bba()).fAr() || this.hvf.Qy() == Long.MIN_VALUE;
        long l = bl ? this.hvf.Qw() : this.hvf.Qy();
        ahv_22.ceC().e(aPc.ewx).c(this.iH(l));
        ahv_22.c(aum_0.cWf().c("colon", new Object[0]));
        ahv_22.ceD();
        ahv_22.ceC().e(aPc.eww);
        String string = this.b(ahv_22, false);
        return string == null ? "" : string;
    }

    private String b(ahv_2 ahv_22, boolean bl) {
        Object object;
        Optional<String> optional;
        int n;
        int n2 = this.hvf.cXu().d();
        ArrayList<String> arrayList = new ArrayList<String>();
        enk_0 enk_02 = (enk_0)this.hvf.cXu().bba();
        int n3 = enk_02.aZH();
        String string = "";
        if (n3 != -1 && !bl && aum_0.cWf().e(13, n3)) {
            boolean bl2 = n2 == enf_0.qVv.d() && enk_02.fAn() > 0;
            int n4 = n = bl2 ? enk_02.a(0, ((eNl)this.hvf.cXu().bbf()).cmL(), ene_0.qPu) : this.hvf.cXu().getValue();
            if (n2 == enf_0.qUT.d()) {
                String string2 = "";
                if (enk_02.fAn() > 1) {
                    string2 = String.valueOf(enk_02.a(1, ((eNl)this.hvf.cXu().bbf()).cmL(), ene_0.qPu));
                }
                optional = (bmq_0)fqX.gjM().Zr(this.hvf.cXu().getValue());
                string = aum_0.cWf().a(13, (long)n3, ((bmq_0)((Object)optional)).getName(), string2);
            } else if (n2 == enf_0.qUR.d()) {
                eor_0 eor_02 = (eor_0)this.hvf.cXu();
                int n5 = 0;
                if (this.hvf.cXu().bba() != null && ((enk_0)this.hvf.cXu().bba()).fAn() >= 2) {
                    n5 = ((enk_0)this.hvf.cXu().bba()).a(1, eor_02.fHf(), ene_0.qPu);
                }
                object = (bmq_0)fqX.gjM().Zr(eor_02.ecx());
                string = aum_0.cWf().a(13, (long)n3, eLL.a((fqU)object, ((eor_0)this.hvf.cXu()).fCw(), ((fqU)object).gjG(), true), n5);
            } else if (n2 == enf_0.qTV.d() || n2 == enf_0.qTU.d() || n2 == enf_0.qUb.d() || n2 == enf_0.qUc.d()) {
                int n6 = 0;
                if (this.hvf.cXu().bba() != null && ((enk_0)this.hvf.cXu().bba()).fAn() >= 1) {
                    n6 = ((enk_0)this.hvf.cXu().bba()).a(0, this.hvf.cXu().fHf(), ene_0.qPu);
                }
                optional = aum_0.cWf().a(6, (long)n6, new Object[0]);
                string = aum_0.cWf().a(13, (long)n3, optional);
            } else if (n2 == enf_0.qUe.d() || n2 == enf_0.qUf.d()) {
                int n7 = 0;
                if (this.hvf.cXu().bba() != null && ((enk_0)this.hvf.cXu().bba()).fAn() >= 2) {
                    n7 = ((enk_0)this.hvf.cXu().bba()).a(1, this.hvf.cXu().fHf(), ene_0.qPu);
                }
                optional = aum_0.cWf().a(6, (long)n7, new Object[0]);
                string = aum_0.cWf().a(13, (long)n3, optional);
            } else if (n2 == enf_0.qUj.d()) {
                if (this.hvf.cXu().bba() != null && ((enk_0)this.hvf.cXu().bba()).fAn() >= 1) {
                    int n8 = ((enk_0)this.hvf.cXu().bba()).a(0, this.hvf.cXu().fHf(), ene_0.qPu);
                    arrayList.add(aum_0.cWf().a(7, (long)n8, new Object[0]));
                }
            } else {
                string = aum_0.cWf().a(13, (long)n3, aum_0.cWf().cQ(n));
            }
        }
        if (string.contains(huZ)) {
            String string3 = this.b(ahv_22, true);
            string = string.replaceAll(hvc, string3);
        } else if (bl || string.isEmpty() || n3 == eNT.fBM().aZH()) {
            String string4 = "";
            if (aum_0.cWf().e(10, n2)) {
                string4 = aum_0.cWf().J(30, n2);
            }
            if (!string4.isEmpty()) {
                if (n2 == enf_0.qUR.d()) {
                    eor_0 eor_03 = (eor_0)this.hvf.cXu();
                    String string5 = String.valueOf(eor_03.fCw());
                    optional = (bmq_0)fqX.gjM().Zr(eor_03.ecx());
                    switch (eor_03.cXt()) {
                        case 3: 
                        case 6: {
                            return null;
                        }
                        case 2: {
                            string4 = aum_0.cWf().c("effect.immuned", ((bmq_0)((Object)optional)).getName());
                            break;
                        }
                        default: {
                            object = new StringBuilder(eLL.a((fqU)((Object)optional), ((eor_0)this.hvf.cXu()).fCw(), ((fqU)((Object)optional)).gjG(), true));
                            this.a((StringBuilder)object);
                            arrayList.add(((StringBuilder)object).toString());
                            arrayList.add(string5);
                            break;
                        }
                    }
                } else if (n2 == enf_0.qUT.d()) {
                    bmq_0 bmq_02 = (bmq_0)fqX.gjM().Zr(this.hvf.cXu().getValue());
                    StringBuilder stringBuilder = new StringBuilder(bmq_02.getName());
                    this.a(stringBuilder);
                    arrayList.add(stringBuilder.toString());
                } else if (n2 == enf_0.qTR.d() || n2 == enf_0.qTS.d() || n2 == enf_0.qTW.d()) {
                    StringBuilder stringBuilder = new StringBuilder().append(aum_0.cWf().a(6, (long)this.hvf.cXu().getValue(), new Object[0]));
                    this.a(stringBuilder);
                    arrayList.add(stringBuilder.toString());
                } else if (n2 == enf_0.qUh.d()) {
                    bgv_2 bgv_22 = (bgv_2)fgD.fXh().Vd(this.hvf.cXu().getValue());
                    StringBuilder stringBuilder = bgv_22 != null ? new StringBuilder(bgv_22.getName()) : new StringBuilder("");
                    this.a(stringBuilder);
                    arrayList.add(stringBuilder.toString());
                } else if (n2 == enf_0.qUo.d()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    this.a(stringBuilder);
                    arrayList.add(stringBuilder.toString());
                } else if (n2 == enf_0.qPI.d() || n2 == enf_0.qQO.d()) {
                    if (this.hvf.cXu().bba() != null && ((enk_0)this.hvf.cXu().bba()).fAn() >= 3) {
                        eot_0 eot_02 = (eot_0)this.hvf.cXu();
                        int n9 = eot_02.getValue();
                        int n10 = ((enk_0)eot_02.bba()).a(2, eot_02.fHf(), ene_0.qPu);
                        arrayList.add(String.valueOf(n9));
                        arrayList.add(eLL.Rs(n10));
                    }
                } else if (n2 == enf_0.qTd.d() || n2 == enf_0.qTe.d()) {
                    if (this.hvf.cXu().bba() != null && ((enk_0)this.hvf.cXu().bba()).fAn() >= 1) {
                        n = ((enk_0)this.hvf.cXu().bba()).a(0, this.hvf.cXu().fHf(), ene_0.qPu);
                        arrayList.add(eLL.Rt(n));
                    }
                } else if (n2 == enf_0.qTb.d() || n2 == enf_0.qTc.d()) {
                    if (this.hvf.cXu().bba() != null && ((enk_0)this.hvf.cXu().bba()).fAn() >= 1) {
                        n = ((enk_0)this.hvf.cXu().bba()).a(0, this.hvf.cXu().fHf(), ene_0.qPu);
                        arrayList.add(eLL.Ru(n));
                    }
                } else if (n2 == enf_0.qTf.d() || n2 == enf_0.qTg.d()) {
                    if (this.hvf.cXu().bba() != null && ((enk_0)this.hvf.cXu().bba()).fAn() >= 1) {
                        n = ((enk_0)this.hvf.cXu().bba()).a(0, this.hvf.cXu().fHf(), ene_0.qPu);
                        arrayList.add(eLL.Rv(n));
                    }
                } else if (n2 == enf_0.qTV.d() || n2 == enf_0.qTT.d() || n2 == enf_0.qTO.d() || n2 == enf_0.qTU.d()) {
                    if (this.hvf.cXu().bba() != null && ((enk_0)this.hvf.cXu().bba()).fAn() >= 1) {
                        n = ((enk_0)this.hvf.cXu().bba()).a(0, this.hvf.cXu().fHf(), ene_0.qPu);
                        arrayList.add(aum_0.cWf().a(6, (long)n, new Object[0]));
                    }
                } else if (n2 == enf_0.qUb.d() || n2 == enf_0.qUc.d()) {
                    if (this.hvf.cXu().bba() != null && ((enk_0)this.hvf.cXu().bba()).fAn() >= 1) {
                        n = ((enk_0)this.hvf.cXu().bba()).a(0, this.hvf.cXu().fHf(), ene_0.qPu);
                        arrayList.add(aum_0.cWf().a(6, (long)n, new Object[0]));
                    }
                } else if (n2 == enf_0.qUe.d() || n2 == enf_0.qUf.d()) {
                    if (this.hvf.cXu().bba() != null && ((enk_0)this.hvf.cXu().bba()).fAn() >= 2) {
                        n = ((enk_0)this.hvf.cXu().bba()).a(1, this.hvf.cXu().fHf(), ene_0.qPu);
                        arrayList.add(aum_0.cWf().a(6, (long)n, new Object[0]));
                    }
                } else if (n2 == enf_0.qUj.d()) {
                    if (this.hvf.cXu().bba() != null && ((enk_0)this.hvf.cXu().bba()).fAn() >= 1) {
                        n = ((enk_0)this.hvf.cXu().bba()).a(0, this.hvf.cXu().fHf(), ene_0.qPu);
                        arrayList.add(aum_0.cWf().a(7, (long)n, new Object[0]));
                    }
                } else if (n2 == enf_0.qSP.d() || n2 == enf_0.qSZ.d()) {
                    if (this.hvf.cXu().bba() != null) {
                        qu_0 qu_02 = this.hvf.cXu().bbc();
                        eNd eNd2 = eqb_0.a(qu_02);
                        arrayList.add(String.valueOf(this.hvf.cWC()));
                        arrayList.add(this.cXD());
                        optional = eLL.qJe.b(eNd2);
                        optional.ifPresent(arrayList::add);
                    }
                } else if (n2 == enf_0.qSO.d()) {
                    if (this.hvf.cXu().bba() != null) {
                        eNd eNd3 = eqb_0.b(this.hvf.cXu().bbd());
                        arrayList.add(String.valueOf(this.hvf.cWC()));
                        arrayList.add(this.cXD());
                        Optional<String> optional2 = eLL.qJe.b(eNd3);
                        optional2.ifPresent(arrayList::add);
                    }
                } else {
                    StringBuilder stringBuilder = new StringBuilder().append(aum_0.cWf().cQ(this.hvf.cXu().getValue()));
                    this.a(stringBuilder);
                    arrayList.add(stringBuilder.toString());
                    arrayList.add(this.cXD());
                }
                string4 = this.kP(string4);
                ahv_22.c(string4);
                this.c(ahv_22);
                ahv_22.ceD();
                try {
                    string = Bz.a(ahv_22.ceL(), arrayList.toArray());
                }
                catch (Exception exception) {
                    hvg.error((Object)("probl\u00e8me dans le formattage de la chaine " + String.valueOf(ahv_22)), (Throwable)exception);
                }
            }
        } else if (string != null) {
            ahv_22.c(this.kP(string));
            ahv_22.ceD();
            string = ahv_22.ceL();
        }
        return string;
    }

    private void c(ahv_2 ahv_22) {
        switch (this.hvf.cXu().cXt()) {
            case 7: {
                ahv_22.c(" (").c(aum_0.cWf().c("exec.block.chat", new Object[0])).c(")");
            }
        }
    }

    private String kP(String string) {
        bgy bgy2;
        String string2 = emr_0.sp(string);
        if (!string2.contains(hva) && !string2.contains(hvb)) {
            return string2;
        }
        bsS bsS2 = this.hvf.cja();
        String string3 = bsS2.kq(this.hvf.Qy()).getName();
        string2 = string2.replaceAll(hvd, string3);
        qu_0 qu_02 = this.hvf.cXu().bbc();
        if (qu_02 != null && (bgy2 = bsS2.kq(qu_02.Sn())) != null) {
            string2 = string2.replaceAll(hve, bgy2.getName());
        }
        return string2;
    }

    private String cXD() {
        if (bdm_2.a(this.hvf)) {
            ahv_2 ahv_22 = new ahv_2();
            ahv_22.k(' ');
            bdm_2.e(ahv_22);
            return ahv_22.ceL();
        }
        return "";
    }

    private void a(StringBuilder stringBuilder) {
        switch (this.hvf.cXu().cXt()) {
            case 4: {
                stringBuilder.append(" (").append(aum_0.cWf().c("exec.absorb", new Object[0])).append(")");
                break;
            }
            case 1: {
                stringBuilder.append(" (").append(aum_0.cWf().c("exec.failed", new Object[0])).append(")");
                break;
            }
            case 2: {
                stringBuilder.append(" (").append(aum_0.cWf().c("exec.immune", new Object[0])).append(")");
                break;
            }
            case 13: {
                stringBuilder.append(" (").append(aum_0.cWf().c("exec.seduction.immunity", new Object[0])).append(")");
                break;
            }
            case 3: 
            case 6: {
                stringBuilder.append(" (").append(aum_0.cWf().c("exec.resist", new Object[0])).append(")");
                break;
            }
            case 12: {
                stringBuilder.append(" (").append(aum_0.cWf().c("exec.level.too.high", new Object[0])).append(")");
                break;
            }
            case 14: {
                stringBuilder.append(" (").append(aum_0.cWf().c("exec.seduction.success", new Object[0])).append(")");
            }
        }
    }
}

