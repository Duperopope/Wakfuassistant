/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fJe
 */
public class fje_2
extends fha_2 {
    public static final String TAG = "ItemRenderer";
    private static final Logger uDk = Logger.getLogger(fje_2.class);
    private fjf_1 uDl = null;
    private ArrayList<fhv_1> uDm = new ArrayList();
    private fbd_1 tYT = null;
    private fjj_2 uDn;
    private ArrayList<fsj_2> uDo = new ArrayList();
    private ArrayList<fio_1> bMZ = new ArrayList();
    private static final ArrayList<fhv_1> uDp = new ArrayList();
    public static final int uDq = 1086840917;
    public static final int uDr = -1351902487;
    public static final int uDs = -1164731176;
    public static final int uDt = 1737415497;
    public static final int uDu = 2096925462;
    public static final int uDv = 1076426565;
    public static final int uDw = -842497956;
    public static final int uDx = -347632250;
    public static final int uDy = -1037804509;
    public static final int uDz = 511141863;
    public static final int uDA = 520837978;
    public static final int uDB = 1497720703;
    public static final int uDC = 555106394;
    public static final int uDD = 881302303;
    public static final int uDE = 1550573716;
    public static final int uDF = 29251698;
    public static final int uDG = 555142212;
    public static final int uDH = 555372279;
    public static final int uDI = 39515613;
    public static final int uDJ = 728660769;
    public static final int uDK = 45681909;
    public static final int uDL = 552298621;
    public static final int uDM = 151596945;
    public static final int uDN = -1013405773;
    public static final int uDO = -1013405330;
    public static final int uDP = -1046180197;
    public static final int uDQ = -1032982784;
    public static final int uDR = 1928152871;
    public static final int uDS = 1055781365;
    public static final int uDT = -647313169;

    public void x(fcv_1 fcv_12) {
        for (fio_1 fio_12 : this.bMZ) {
            fcv_12.a(fio_12.gBy(), fio_12, false);
        }
    }

    public void y(fcv_1 fcv_12) {
        for (fio_1 fio_12 : this.bMZ) {
            fcv_12.b(fio_12.gBy(), fio_12, false);
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public fjf_1 getManager() {
        return this.uDl;
    }

    public void setManager(fjf_1 fjf_12) {
        this.uDl = fjf_12;
    }

    public void setOnActivation(fmd_2 fmd_22) {
        this.bMZ.add(fmd_22);
    }

    public void setOnClick(fmz_1 fmz_12) {
        this.bMZ.add(fmz_12);
    }

    public void setOnDoubleClick(fma_2 fma_22) {
        this.bMZ.add(fma_22);
    }

    public void setOnFocusChange(fmn_2 fmn_22) {
        this.bMZ.add(fmn_22);
    }

    public void setOnKeyPress(fms_2 fms_22) {
        this.bMZ.add(fms_22);
    }

    public void setOnKeyRelease(fmt_2 fmt_22) {
        this.bMZ.add(fmt_22);
    }

    public void setOnKeyType(fmu_2 fmu_22) {
        this.bMZ.add(fmu_22);
    }

    public void setOnListSelectionChange(fmv_2 fmv_22) {
        this.bMZ.add(fmv_22);
    }

    public void setOnMouseDrag(fmc_2 fmc_22) {
        this.bMZ.add(fmc_22);
    }

    public void setOnMouseDragIn(fmb_2 fmb_22) {
        this.bMZ.add(fmb_22);
    }

    public void setOnMouseDragOut(fmd_1 fmd_12) {
        this.bMZ.add(fmd_12);
    }

    public void setOnMouseEnter(fme_1 fme_12) {
        this.bMZ.add(fme_12);
    }

    public void setOnMouseExit(fmf_2 fmf_22) {
        this.bMZ.add(fmf_22);
    }

    public void setOnMouseMove(fmg_1 fmg_12) {
        this.bMZ.add(fmg_12);
    }

    public void setOnMousePress(fmh_2 fmh_22) {
        this.bMZ.add(fmh_22);
    }

    public void setOnMouseRelease(fmi_2 fmi_22) {
        this.bMZ.add(fmi_22);
    }

    public void setOnMouseWheel(fmj_2 fmj_22) {
        this.bMZ.add(fmj_22);
    }

    public void setOnItemOut(fmq_1 fmq_12) {
        this.bMZ.add(fmq_12);
    }

    public void setOnItemOver(fmr_2 fmr_22) {
        this.bMZ.add(fmr_22);
    }

    public void setOnItemClick(fmo_2 fmo_22) {
        this.bMZ.add(fmo_22);
    }

    public void setOnItemDoubleClick(fmp_1 fmp_12) {
        this.bMZ.add(fmp_12);
    }

    public void setOnDrag(fmh_1 fmh_12) {
        this.bMZ.add(fmh_12);
    }

    public void setOnDrop(fmk_1 fmk_12) {
        this.bMZ.add(fmk_12);
    }

    public void setOnDropOut(fml_2 fml_22) {
        this.bMZ.add(fml_22);
    }

    public void setOnDragOut(fmi_1 fmi_12) {
        this.bMZ.add(fmi_12);
    }

    public void setOnDragOver(fmj_1 fmj_12) {
        this.bMZ.add(fmj_12);
    }

    public void setOnSliderMove(fmp_2 fmp_22) {
        this.bMZ.add(fmp_22);
    }

    public void setOnSelectionChange(fmo_1 fmo_12) {
        this.bMZ.add(fmo_12);
    }

    public void setOnPopupDisplay(fmk_2 fmk_22) {
        this.bMZ.add(fmk_22);
    }

    public void setOnPopupHide(fml_1 fml_12) {
        this.bMZ.add(fml_12);
    }

    @Override
    public void d(fhv_1 fhv_12) {
        boolean bl = true;
        if (fhv_12 instanceof fjj_2) {
            this.uDn = (fjj_2)((Object)fhv_12);
        } else if (fhv_12 instanceof fsj_2) {
            this.uDo.add((fsj_2)fhv_12);
        } else {
            if (fhv_12 instanceof fes_2) {
                ((fes_2)fhv_12).setVisible(false);
            }
            this.uDm.add(fhv_12);
            fhv_12.setIsATemplate(true);
            bl = false;
        }
        if (bl) {
            super.a(fhv_12, false);
        }
    }

    public boolean isRenderableCompatible(fcv_1 fcv_12) {
        Object object;
        if (this.uDn != null && (object = this.uDn.getResult(fcv_12)) instanceof Boolean) {
            return (Boolean)object;
        }
        return true;
    }

    public void w(fcv_1 fcv_12) {
        Object object;
        this.tYT = null;
        ArrayList<fsd_1> arrayList = new ArrayList<fsd_1>();
        fhs_2 fhs_22 = new fhs_2(null, this.nQt.gqC());
        fhs_22.j(this.nQt);
        for (fsj_2 fsj_22 : this.uDo) {
            fsj_22.gFQ();
            object = fsj_22.getProperty();
            if (object != null) {
                ((fsf_1)object).an(fcv_12);
            }
            fsj_22.ao(fcv_12);
        }
        this.x(fcv_12);
        int n = this.uDm.size();
        for (int i = 0; i < n; ++i) {
            object = this.uDm.get(i).gAK();
            if (object instanceof fes_2) {
                ((fes_2)object).setVisible(true);
            }
            this.a((fhv_1)object, uDp, arrayList, fcv_12, null, fhs_22);
            fcv_12.k((fhv_1)object);
        }
        if (this.tYT != null) {
            fcv_12.setDragNDropable(this.tYT);
        }
        fcv_12.setInnerElementMap(fhs_22);
        fcv_12.setRenderableChildren(uDp.toArray(new fhv_1[uDp.size()]));
        fcv_12.setItemElements(arrayList);
        uDp.clear();
    }

    private void a(fhv_1 fhv_12, ArrayList<fhv_1> arrayList, ArrayList<fsd_1> arrayList2, fcv_1 fcv_12, fbd_1 fbd_12, fhs_2 fhs_22) {
        fhv_12.setElementMap(fhs_22);
        if (fhv_12.getId() != null) {
            fhs_22.a(fhv_12.getId(), fhv_12);
        }
        if (fhv_12 instanceof fsd_1 && fhv_12.getParentOfType(fje_2.class) == null) {
            arrayList2.add((fsd_1)fhv_12);
            fhv_1 fhv_13 = fhv_12.getParent() != null ? fhv_12.getParent() : fcv_12;
            if (!arrayList.contains(fhv_13)) {
                arrayList.add(fhv_13);
            }
        }
        if (fhv_12 instanceof fes_2) {
            fhv_12.setRenderableParent(fcv_12);
            if (fhv_12 instanceof fbd_1) {
                this.tYT = fbd_12 = (fbd_1)fhv_12;
                ((fes_2)fhv_12).setDragAndDropParent(fbd_12);
            }
        }
        for (fhv_1 fhv_14 : fhv_12.getChildren()) {
            this.a(fhv_14, arrayList, arrayList2, fcv_12, fbd_12, fhs_22);
        }
        for (fhv_1 fhv_14 : fhv_12.getIndirectChildren()) {
            this.a(fhv_14, arrayList, arrayList2, fcv_12, fbd_12, fhs_22);
        }
    }

    private void a(fhv_1 fhv_12, String string, int n, fsc_1 fsc_12, String string2, fjj_2 fjj_22) {
        if (fhv_12 == null || string == null) {
            return;
        }
        try {
            ftb_1.a(string, fhv_12, fsc_12, n, string2, fjj_22);
        }
        catch (Exception exception) {
            uDk.error((Object)("Erreur \u00e0 l'invoke method=" + string), (Throwable)exception);
        }
    }

    public void a(fhv_1[] fhv_1Array, fsc_1 fsc_12) {
        if (fhv_1Array == null) {
            return;
        }
        for (fhv_1 fhv_12 : fhv_1Array) {
            ArrayList<fhv_1> arrayList = fhv_12.getChildren();
            fhv_1[] fhv_1Array2 = arrayList.toArray(new fhv_1[arrayList.size()]);
            fhv_12.grv();
            for (fhv_1 fhv_13 : fhv_1Array2) {
                if (!(fhv_13 instanceof fsd_1)) continue;
                fsd_1 fsd_12 = (fsd_1)fhv_13;
                String string = fsc_12 != null ? fsd_12.getField() : null;
                this.a(fhv_12, fsd_12.getAttribute(), fsd_12.getAttributeHash(), fsc_12, string, fsd_12.getResultProvider());
            }
        }
    }

    @Override
    public boolean M(fiq_1 fiq_12) {
        return false;
    }

    @Override
    public boolean N(fiq_1 fiq_12) {
        return false;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.uDn = null;
        this.tYT = null;
        this.bMZ.clear();
        this.bMZ = null;
        this.uDo.clear();
        this.uDo = null;
        if (this.uDm != null) {
            for (int i = this.uDm.size() - 1; i >= 0; --i) {
                this.uDm.get(i).aZp();
            }
            this.uDm.clear();
            this.uDm = null;
        }
        this.uDl = null;
    }

    @Override
    public void aVI() {
        super.aVI();
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        fje_2 fje_22 = (fje_2)fhi_22;
        fje_22.bMZ.addAll(this.bMZ);
        for (int i = 0; i < this.uDm.size(); ++i) {
            fje_22.uDm.add(this.uDm.get(i).gAK());
        }
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 1086840917) {
            this.setOnActivation(fic_12.b(fmd_2.class, string));
        } else if (n == -1351902487) {
            this.setOnClick(fic_12.b(fmz_1.class, string));
        } else if (n == -1164731176) {
            this.setOnDoubleClick(fic_12.b(fma_2.class, string));
        } else if (n == 1737415497) {
            this.setOnFocusChange(fic_12.b(fmn_2.class, string));
        } else if (n == 2096925462) {
            this.setOnItemClick(fic_12.b(fmo_2.class, string));
        } else if (n == 1076426565) {
            this.setOnItemDoubleClick(fic_12.b(fmp_1.class, string));
        } else if (n == -842497956) {
            this.setOnItemOut(fic_12.b(fmq_1.class, string));
        } else if (n == -347632250) {
            this.setOnItemOver(fic_12.b(fmr_2.class, string));
        } else if (n == -1013405773) {
            this.setOnDrag(fic_12.b(fmh_1.class, string));
        } else if (n == -1013405330) {
            this.setOnDrop(fic_12.b(fmk_1.class, string));
        } else if (n == -1046180197) {
            this.setOnDragOut(fic_12.b(fmi_1.class, string));
        } else if (n == -1032982784) {
            this.setOnDropOut(fic_12.b(fml_2.class, string));
        } else if (n == 1928152871) {
            this.setOnDragOver(fic_12.b(fmj_1.class, string));
        } else if (n == -1037804509) {
            this.setOnKeyPress(fic_12.b(fms_2.class, string));
        } else if (n == 511141863) {
            this.setOnKeyRelease(fic_12.b(fmt_2.class, string));
        } else if (n == 520837978) {
            this.setOnKeyType(fic_12.b(fmu_2.class, string));
        } else if (n == 1497720703) {
            this.setOnListSelectionChange(fic_12.b(fmv_2.class, string));
        } else if (n == 555106394) {
            this.setOnMouseDrag(fic_12.b(fmc_2.class, string));
        } else if (n == 881302303) {
            this.setOnMouseDragIn(fic_12.b(fmb_2.class, string));
        } else if (n == 1550573716) {
            this.setOnMouseDragOut(fic_12.b(fmd_1.class, string));
        } else if (n == 29251698) {
            this.setOnMouseEnter(fic_12.b(fme_1.class, string));
        } else if (n == 555142212) {
            this.setOnMouseExit(fic_12.b(fmf_2.class, string));
        } else if (n == 555372279) {
            this.setOnMouseMove(fic_12.b(fmg_1.class, string));
        } else if (n == 39515613) {
            this.setOnMousePress(fic_12.b(fmh_2.class, string));
        } else if (n == 728660769) {
            this.setOnMouseRelease(fic_12.b(fmi_2.class, string));
        } else if (n == 45681909) {
            this.setOnMouseWheel(fic_12.b(fmj_2.class, string));
        } else if (n == 552298621) {
            this.setOnSelectionChange(fic_12.b(fmo_1.class, string));
        } else if (n == 151596945) {
            this.setOnSliderMove(fic_12.b(fmp_2.class, string));
        } else if (n == 1055781365) {
            this.setOnPopupDisplay(fic_12.b(fmk_2.class, string));
        } else if (n == -647313169) {
            this.setOnPopupHide(fic_12.b(fml_1.class, string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }
}

