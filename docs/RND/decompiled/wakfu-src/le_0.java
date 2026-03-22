/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.RepeatedFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from lE
 */
public final class le_0
extends GeneratedMessageV3.Builder<le_0>
implements ln_1 {
    private int an;
    private List<lj_0> IF = Collections.emptyList();
    private RepeatedFieldBuilderV3<lj_0, ll_1, lm_1> IQ;
    private List<lF> IH = Collections.emptyList();
    private RepeatedFieldBuilderV3<lF, lh_0, li_0> IR;
    private int IJ;
    private int IL;
    private int IN = -1;

    public static final Descriptors.Descriptor ahI() {
        return kF.FU;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.FV.ensureFieldAccessorsInitialized(lc_0.class, le_0.class);
    }

    le_0() {
        this.D();
    }

    le_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (lc_0.gG()) {
            this.ahR();
            this.ahW();
        }
    }

    public le_0 ahJ() {
        super.clear();
        if (this.IQ == null) {
            this.IF = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.IQ.clear();
        }
        if (this.IR == null) {
            this.IH = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
        } else {
            this.IR.clear();
        }
        this.IJ = 0;
        this.an &= 0xFFFFFFFB;
        this.IL = 0;
        this.an &= 0xFFFFFFF7;
        this.IN = -1;
        this.an &= 0xFFFFFFEF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kF.FU;
    }

    public lc_0 ahH() {
        return lc_0.ahG();
    }

    public lc_0 ahK() {
        lc_0 lc_02 = this.ahL();
        if (!lc_02.isInitialized()) {
            throw le_0.newUninitializedMessageException((Message)lc_02);
        }
        return lc_02;
    }

    public lc_0 ahL() {
        lc_0 lc_02 = new lc_0(this);
        int n = this.an;
        int n2 = 0;
        if (this.IQ == null) {
            if ((this.an & 1) != 0) {
                this.IF = Collections.unmodifiableList(this.IF);
                this.an &= 0xFFFFFFFE;
            }
            lc_02.IF = this.IF;
        } else {
            lc_02.IF = this.IQ.build();
        }
        if (this.IR == null) {
            if ((this.an & 2) != 0) {
                this.IH = Collections.unmodifiableList(this.IH);
                this.an &= 0xFFFFFFFD;
            }
            lc_02.IH = this.IH;
        } else {
            lc_02.IH = this.IR.build();
        }
        if ((n & 4) != 0) {
            lc_02.IJ = this.IJ;
            n2 |= 1;
        }
        if ((n & 8) != 0) {
            lc_02.IL = this.IL;
            n2 |= 2;
        }
        if ((n & 0x10) != 0) {
            n2 |= 4;
        }
        lc_02.IN = this.IN;
        lc_02.an = n2;
        this.onBuilt();
        return lc_02;
    }

    public le_0 ahM() {
        return (le_0)super.clone();
    }

    public le_0 eA(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (le_0)super.setField(fieldDescriptor, object);
    }

    public le_0 bN(Descriptors.FieldDescriptor fieldDescriptor) {
        return (le_0)super.clearField(fieldDescriptor);
    }

    public le_0 bN(Descriptors.OneofDescriptor oneofDescriptor) {
        return (le_0)super.clearOneof(oneofDescriptor);
    }

    public le_0 bN(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (le_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public le_0 eB(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (le_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public le_0 bN(Message message) {
        if (message instanceof lc_0) {
            return this.e((lc_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public le_0 e(lc_0 lc_02) {
        if (lc_02 == lc_0.ahG()) {
            return this;
        }
        if (this.IQ == null) {
            if (!lc_02.IF.isEmpty()) {
                if (this.IF.isEmpty()) {
                    this.IF = lc_02.IF;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.ahN();
                    this.IF.addAll(lc_02.IF);
                }
                this.onChanged();
            }
        } else if (!lc_02.IF.isEmpty()) {
            if (this.IQ.isEmpty()) {
                this.IQ.dispose();
                this.IQ = null;
                this.IF = lc_02.IF;
                this.an &= 0xFFFFFFFE;
                this.IQ = lc_0.B() ? this.ahR() : null;
            } else {
                this.IQ.addAllMessages(lc_02.IF);
            }
        }
        if (this.IR == null) {
            if (!lc_02.IH.isEmpty()) {
                if (this.IH.isEmpty()) {
                    this.IH = lc_02.IH;
                    this.an &= 0xFFFFFFFD;
                } else {
                    this.ahS();
                    this.IH.addAll(lc_02.IH);
                }
                this.onChanged();
            }
        } else if (!lc_02.IH.isEmpty()) {
            if (this.IR.isEmpty()) {
                this.IR.dispose();
                this.IR = null;
                this.IH = lc_02.IH;
                this.an &= 0xFFFFFFFD;
                this.IR = lc_0.jh() ? this.ahW() : null;
            } else {
                this.IR.addAllMessages(lc_02.IH);
            }
        }
        if (lc_02.ahx()) {
            this.hB(lc_02.ahy());
        }
        if (lc_02.ahz()) {
            this.hC(lc_02.ahA());
        }
        if (lc_02.ahB()) {
            this.hD(lc_02.ahC());
        }
        this.eB(lc_0.d(lc_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        int n;
        for (n = 0; n < this.aht(); ++n) {
            if (this.hr(n).isInitialized()) continue;
            return false;
        }
        for (n = 0; n < this.ahw(); ++n) {
            if (this.ht(n).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public le_0 hp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        lc_0 lc_02 = null;
        try {
            lc_02 = (lc_0)lc_0.IP.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            lc_02 = (lc_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (lc_02 != null) {
                this.e(lc_02);
            }
        }
        return this;
    }

    private void ahN() {
        if ((this.an & 1) == 0) {
            this.IF = new ArrayList<lj_0>(this.IF);
            this.an |= 1;
        }
    }

    @Override
    public List<lj_0> ahr() {
        if (this.IQ == null) {
            return Collections.unmodifiableList(this.IF);
        }
        return this.IQ.getMessageList();
    }

    @Override
    public int aht() {
        if (this.IQ == null) {
            return this.IF.size();
        }
        return this.IQ.getCount();
    }

    @Override
    public lj_0 hr(int n) {
        if (this.IQ == null) {
            return this.IF.get(n);
        }
        return (lj_0)this.IQ.getMessage(n);
    }

    public le_0 a(int n, lj_0 lj_02) {
        if (this.IQ == null) {
            if (lj_02 == null) {
                throw new NullPointerException();
            }
            this.ahN();
            this.IF.set(n, lj_02);
            this.onChanged();
        } else {
            this.IQ.setMessage(n, (AbstractMessage)lj_02);
        }
        return this;
    }

    public le_0 a(int n, ll_1 ll_12) {
        if (this.IQ == null) {
            this.ahN();
            this.IF.set(n, ll_12.aiD());
            this.onChanged();
        } else {
            this.IQ.setMessage(n, (AbstractMessage)ll_12.aiD());
        }
        return this;
    }

    public le_0 a(lj_0 lj_02) {
        if (this.IQ == null) {
            if (lj_02 == null) {
                throw new NullPointerException();
            }
            this.ahN();
            this.IF.add(lj_02);
            this.onChanged();
        } else {
            this.IQ.addMessage((AbstractMessage)lj_02);
        }
        return this;
    }

    public le_0 b(int n, lj_0 lj_02) {
        if (this.IQ == null) {
            if (lj_02 == null) {
                throw new NullPointerException();
            }
            this.ahN();
            this.IF.add(n, lj_02);
            this.onChanged();
        } else {
            this.IQ.addMessage(n, (AbstractMessage)lj_02);
        }
        return this;
    }

    public le_0 a(ll_1 ll_12) {
        if (this.IQ == null) {
            this.ahN();
            this.IF.add(ll_12.aiD());
            this.onChanged();
        } else {
            this.IQ.addMessage((AbstractMessage)ll_12.aiD());
        }
        return this;
    }

    public le_0 b(int n, ll_1 ll_12) {
        if (this.IQ == null) {
            this.ahN();
            this.IF.add(n, ll_12.aiD());
            this.onChanged();
        } else {
            this.IQ.addMessage(n, (AbstractMessage)ll_12.aiD());
        }
        return this;
    }

    public le_0 aa(Iterable<? extends lj_0> iterable) {
        if (this.IQ == null) {
            this.ahN();
            AbstractMessageLite.Builder.addAll(iterable, this.IF);
            this.onChanged();
        } else {
            this.IQ.addAllMessages(iterable);
        }
        return this;
    }

    public le_0 ahO() {
        if (this.IQ == null) {
            this.IF = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.IQ.clear();
        }
        return this;
    }

    public le_0 hv(int n) {
        if (this.IQ == null) {
            this.ahN();
            this.IF.remove(n);
            this.onChanged();
        } else {
            this.IQ.remove(n);
        }
        return this;
    }

    public ll_1 hw(int n) {
        return (ll_1)this.ahR().getBuilder(n);
    }

    @Override
    public lm_1 hs(int n) {
        if (this.IQ == null) {
            return this.IF.get(n);
        }
        return (lm_1)this.IQ.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends lm_1> ahs() {
        if (this.IQ != null) {
            return this.IQ.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.IF);
    }

    public ll_1 ahP() {
        return (ll_1)this.ahR().addBuilder((AbstractMessage)lj_0.aiz());
    }

    public ll_1 hx(int n) {
        return (ll_1)this.ahR().addBuilder(n, (AbstractMessage)lj_0.aiz());
    }

    public List<ll_1> ahQ() {
        return this.ahR().getBuilderList();
    }

    private RepeatedFieldBuilderV3<lj_0, ll_1, lm_1> ahR() {
        if (this.IQ == null) {
            this.IQ = new RepeatedFieldBuilderV3(this.IF, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.IF = null;
        }
        return this.IQ;
    }

    private void ahS() {
        if ((this.an & 2) == 0) {
            this.IH = new ArrayList<lF>(this.IH);
            this.an |= 2;
        }
    }

    @Override
    public List<lF> ahu() {
        if (this.IR == null) {
            return Collections.unmodifiableList(this.IH);
        }
        return this.IR.getMessageList();
    }

    @Override
    public int ahw() {
        if (this.IR == null) {
            return this.IH.size();
        }
        return this.IR.getCount();
    }

    @Override
    public lF ht(int n) {
        if (this.IR == null) {
            return this.IH.get(n);
        }
        return (lF)this.IR.getMessage(n);
    }

    public le_0 a(int n, lF lF2) {
        if (this.IR == null) {
            if (lF2 == null) {
                throw new NullPointerException();
            }
            this.ahS();
            this.IH.set(n, lF2);
            this.onChanged();
        } else {
            this.IR.setMessage(n, (AbstractMessage)lF2);
        }
        return this;
    }

    public le_0 a(int n, lh_0 lh_02) {
        if (this.IR == null) {
            this.ahS();
            this.IH.set(n, lh_02.aik());
            this.onChanged();
        } else {
            this.IR.setMessage(n, (AbstractMessage)lh_02.aik());
        }
        return this;
    }

    public le_0 a(lF lF2) {
        if (this.IR == null) {
            if (lF2 == null) {
                throw new NullPointerException();
            }
            this.ahS();
            this.IH.add(lF2);
            this.onChanged();
        } else {
            this.IR.addMessage((AbstractMessage)lF2);
        }
        return this;
    }

    public le_0 b(int n, lF lF2) {
        if (this.IR == null) {
            if (lF2 == null) {
                throw new NullPointerException();
            }
            this.ahS();
            this.IH.add(n, lF2);
            this.onChanged();
        } else {
            this.IR.addMessage(n, (AbstractMessage)lF2);
        }
        return this;
    }

    public le_0 a(lh_0 lh_02) {
        if (this.IR == null) {
            this.ahS();
            this.IH.add(lh_02.aik());
            this.onChanged();
        } else {
            this.IR.addMessage((AbstractMessage)lh_02.aik());
        }
        return this;
    }

    public le_0 b(int n, lh_0 lh_02) {
        if (this.IR == null) {
            this.ahS();
            this.IH.add(n, lh_02.aik());
            this.onChanged();
        } else {
            this.IR.addMessage(n, (AbstractMessage)lh_02.aik());
        }
        return this;
    }

    public le_0 ab(Iterable<? extends lF> iterable) {
        if (this.IR == null) {
            this.ahS();
            AbstractMessageLite.Builder.addAll(iterable, this.IH);
            this.onChanged();
        } else {
            this.IR.addAllMessages(iterable);
        }
        return this;
    }

    public le_0 ahT() {
        if (this.IR == null) {
            this.IH = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.IR.clear();
        }
        return this;
    }

    public le_0 hy(int n) {
        if (this.IR == null) {
            this.ahS();
            this.IH.remove(n);
            this.onChanged();
        } else {
            this.IR.remove(n);
        }
        return this;
    }

    public lh_0 hz(int n) {
        return (lh_0)this.ahW().getBuilder(n);
    }

    @Override
    public li_0 hu(int n) {
        if (this.IR == null) {
            return this.IH.get(n);
        }
        return (li_0)this.IR.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends li_0> ahv() {
        if (this.IR != null) {
            return this.IR.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.IH);
    }

    public lh_0 ahU() {
        return (lh_0)this.ahW().addBuilder((AbstractMessage)lF.aig());
    }

    public lh_0 hA(int n) {
        return (lh_0)this.ahW().addBuilder(n, (AbstractMessage)lF.aig());
    }

    public List<lh_0> ahV() {
        return this.ahW().getBuilderList();
    }

    private RepeatedFieldBuilderV3<lF, lh_0, li_0> ahW() {
        if (this.IR == null) {
            this.IR = new RepeatedFieldBuilderV3(this.IH, (this.an & 2) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.IH = null;
        }
        return this.IR;
    }

    @Override
    public boolean ahx() {
        return (this.an & 4) != 0;
    }

    @Override
    public int ahy() {
        return this.IJ;
    }

    public le_0 hB(int n) {
        this.an |= 4;
        this.IJ = n;
        this.onChanged();
        return this;
    }

    public le_0 ahX() {
        this.an &= 0xFFFFFFFB;
        this.IJ = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean ahz() {
        return (this.an & 8) != 0;
    }

    @Override
    public int ahA() {
        return this.IL;
    }

    public le_0 hC(int n) {
        this.an |= 8;
        this.IL = n;
        this.onChanged();
        return this;
    }

    public le_0 ahY() {
        this.an &= 0xFFFFFFF7;
        this.IL = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean ahB() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public int ahC() {
        return this.IN;
    }

    public le_0 hD(int n) {
        this.an |= 0x10;
        this.IN = n;
        this.onChanged();
        return this;
    }

    public le_0 ahZ() {
        this.an &= 0xFFFFFFEF;
        this.IN = -1;
        this.onChanged();
        return this;
    }

    public final le_0 eA(UnknownFieldSet unknownFieldSet) {
        return (le_0)super.setUnknownFields(unknownFieldSet);
    }

    public final le_0 eB(UnknownFieldSet unknownFieldSet) {
        return (le_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eB(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eA(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eB(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bN(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bN(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bN(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eA(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.ahJ();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.ahM();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eB(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hp(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bN(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.ahJ();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bN(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.ahM();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eB(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eA(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eB(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bN(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bN(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bN(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eA(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hp(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.ahM();
    }

    public /* synthetic */ Message buildPartial() {
        return this.ahL();
    }

    public /* synthetic */ Message build() {
        return this.ahK();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bN(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.ahJ();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hp(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.ahM();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.ahL();
    }

    public /* synthetic */ MessageLite build() {
        return this.ahK();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.ahJ();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ahH();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ahH();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hp(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.ahM();
    }

    public /* synthetic */ Object clone() {
        return this.ahM();
    }
}

