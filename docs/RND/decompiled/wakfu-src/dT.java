/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
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
import com.google.protobuf.UnknownFieldSet;

public final class dT
extends GeneratedMessageV3.Builder<dT>
implements dU {
    private int an;
    private int lq;
    private int ls;
    private int lu;
    private int lw;
    private int ly;
    private int lA;
    private int lC;
    private int lE;
    private int lG;
    private int lI;
    private int lK;
    private int lM;
    private int lO;
    private int lQ;
    private int lS;
    private int lU;

    public static final Descriptors.Descriptor tm() {
        return dQ.lm;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return dQ.ln.ensureFieldAccessorsInitialized(dR.class, dT.class);
    }

    dT() {
        this.D();
    }

    dT(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (dR.aJ()) {
            // empty if block
        }
    }

    public dT tn() {
        super.clear();
        this.lq = 0;
        this.an &= 0xFFFFFFFE;
        this.ls = 0;
        this.an &= 0xFFFFFFFD;
        this.lu = 0;
        this.an &= 0xFFFFFFFB;
        this.lw = 0;
        this.an &= 0xFFFFFFF7;
        this.ly = 0;
        this.an &= 0xFFFFFFEF;
        this.lA = 0;
        this.an &= 0xFFFFFFDF;
        this.lC = 0;
        this.an &= 0xFFFFFFBF;
        this.lE = 0;
        this.an &= 0xFFFFFF7F;
        this.lG = 0;
        this.an &= 0xFFFFFEFF;
        this.lI = 0;
        this.an &= 0xFFFFFDFF;
        this.lK = 0;
        this.an &= 0xFFFFFBFF;
        this.lM = 0;
        this.an &= 0xFFFFF7FF;
        this.lO = 0;
        this.an &= 0xFFFFEFFF;
        this.lQ = 0;
        this.an &= 0xFFFFDFFF;
        this.lS = 0;
        this.an &= 0xFFFFBFFF;
        this.lU = 0;
        this.an &= 0xFFFF7FFF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return dQ.lm;
    }

    public dR tl() {
        return dR.tk();
    }

    public dR to() {
        dR dR2 = this.tp();
        if (!dR2.isInitialized()) {
            throw dT.newUninitializedMessageException((Message)dR2);
        }
        return dR2;
    }

    public dR tp() {
        dR dR2 = new dR(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            dR2.lq = this.lq;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            dR2.ls = this.ls;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            dR2.lu = this.lu;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            dR2.lw = this.lw;
            n2 |= 8;
        }
        if ((n & 0x10) != 0) {
            dR2.ly = this.ly;
            n2 |= 0x10;
        }
        if ((n & 0x20) != 0) {
            dR2.lA = this.lA;
            n2 |= 0x20;
        }
        if ((n & 0x40) != 0) {
            dR2.lC = this.lC;
            n2 |= 0x40;
        }
        if ((n & 0x80) != 0) {
            dR2.lE = this.lE;
            n2 |= 0x80;
        }
        if ((n & 0x100) != 0) {
            dR2.lG = this.lG;
            n2 |= 0x100;
        }
        if ((n & 0x200) != 0) {
            dR2.lI = this.lI;
            n2 |= 0x200;
        }
        if ((n & 0x400) != 0) {
            dR2.lK = this.lK;
            n2 |= 0x400;
        }
        if ((n & 0x800) != 0) {
            dR2.lM = this.lM;
            n2 |= 0x800;
        }
        if ((n & 0x1000) != 0) {
            dR2.lO = this.lO;
            n2 |= 0x1000;
        }
        if ((n & 0x2000) != 0) {
            dR2.lQ = this.lQ;
            n2 |= 0x2000;
        }
        if ((n & 0x4000) != 0) {
            dR2.lS = this.lS;
            n2 |= 0x4000;
        }
        if ((n & 0x8000) != 0) {
            dR2.lU = this.lU;
            n2 |= 0x8000;
        }
        dR2.an = n2;
        this.onBuilt();
        return dR2;
    }

    public dT tq() {
        return (dT)super.clone();
    }

    public dT bg(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (dT)super.setField(fieldDescriptor, object);
    }

    public dT ad(Descriptors.FieldDescriptor fieldDescriptor) {
        return (dT)super.clearField(fieldDescriptor);
    }

    public dT ad(Descriptors.OneofDescriptor oneofDescriptor) {
        return (dT)super.clearOneof(oneofDescriptor);
    }

    public dT ad(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (dT)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public dT bh(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (dT)super.addRepeatedField(fieldDescriptor, object);
    }

    public dT ad(Message message) {
        if (message instanceof dR) {
            return this.c((dR)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public dT c(dR dR2) {
        if (dR2 == dR.tk()) {
            return this;
        }
        if (dR2.sB()) {
            this.aP(dR2.sC());
        }
        if (dR2.sD()) {
            this.aQ(dR2.sE());
        }
        if (dR2.sF()) {
            this.aR(dR2.sG());
        }
        if (dR2.sH()) {
            this.aS(dR2.sI());
        }
        if (dR2.sJ()) {
            this.aT(dR2.sK());
        }
        if (dR2.sL()) {
            this.aU(dR2.sM());
        }
        if (dR2.sN()) {
            this.aV(dR2.sO());
        }
        if (dR2.sP()) {
            this.aW(dR2.sQ());
        }
        if (dR2.sR()) {
            this.aX(dR2.sS());
        }
        if (dR2.sT()) {
            this.aY(dR2.sU());
        }
        if (dR2.sV()) {
            this.aZ(dR2.sW());
        }
        if (dR2.sX()) {
            this.ba(dR2.sY());
        }
        if (dR2.sZ()) {
            this.bb(dR2.ta());
        }
        if (dR2.tb()) {
            this.bc(dR2.tc());
        }
        if (dR2.td()) {
            this.bd(dR2.te());
        }
        if (dR2.tf()) {
            this.be(dR2.tg());
        }
        this.bh(dR.b(dR2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.sB()) {
            return false;
        }
        if (!this.sD()) {
            return false;
        }
        if (!this.sF()) {
            return false;
        }
        if (!this.sH()) {
            return false;
        }
        if (!this.sJ()) {
            return false;
        }
        if (!this.sL()) {
            return false;
        }
        if (!this.sN()) {
            return false;
        }
        if (!this.sP()) {
            return false;
        }
        if (!this.sR()) {
            return false;
        }
        if (!this.sT()) {
            return false;
        }
        if (!this.sV()) {
            return false;
        }
        return this.sX();
    }

    public dT cl(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        dR dR2 = null;
        try {
            dR2 = (dR)dR.lW.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            dR2 = (dR)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (dR2 != null) {
                this.c(dR2);
            }
        }
        return this;
    }

    @Override
    public boolean sB() {
        return (this.an & 1) != 0;
    }

    @Override
    public int sC() {
        return this.lq;
    }

    public dT aP(int n) {
        this.an |= 1;
        this.lq = n;
        this.onChanged();
        return this;
    }

    public dT tr() {
        this.an &= 0xFFFFFFFE;
        this.lq = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean sD() {
        return (this.an & 2) != 0;
    }

    @Override
    public int sE() {
        return this.ls;
    }

    public dT aQ(int n) {
        this.an |= 2;
        this.ls = n;
        this.onChanged();
        return this;
    }

    public dT ts() {
        this.an &= 0xFFFFFFFD;
        this.ls = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean sF() {
        return (this.an & 4) != 0;
    }

    @Override
    public int sG() {
        return this.lu;
    }

    public dT aR(int n) {
        this.an |= 4;
        this.lu = n;
        this.onChanged();
        return this;
    }

    public dT tt() {
        this.an &= 0xFFFFFFFB;
        this.lu = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean sH() {
        return (this.an & 8) != 0;
    }

    @Override
    public int sI() {
        return this.lw;
    }

    public dT aS(int n) {
        this.an |= 8;
        this.lw = n;
        this.onChanged();
        return this;
    }

    public dT tu() {
        this.an &= 0xFFFFFFF7;
        this.lw = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean sJ() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public int sK() {
        return this.ly;
    }

    public dT aT(int n) {
        this.an |= 0x10;
        this.ly = n;
        this.onChanged();
        return this;
    }

    public dT tv() {
        this.an &= 0xFFFFFFEF;
        this.ly = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean sL() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public int sM() {
        return this.lA;
    }

    public dT aU(int n) {
        this.an |= 0x20;
        this.lA = n;
        this.onChanged();
        return this;
    }

    public dT tw() {
        this.an &= 0xFFFFFFDF;
        this.lA = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean sN() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public int sO() {
        return this.lC;
    }

    public dT aV(int n) {
        this.an |= 0x40;
        this.lC = n;
        this.onChanged();
        return this;
    }

    public dT tx() {
        this.an &= 0xFFFFFFBF;
        this.lC = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean sP() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public int sQ() {
        return this.lE;
    }

    public dT aW(int n) {
        this.an |= 0x80;
        this.lE = n;
        this.onChanged();
        return this;
    }

    public dT ty() {
        this.an &= 0xFFFFFF7F;
        this.lE = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean sR() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public int sS() {
        return this.lG;
    }

    public dT aX(int n) {
        this.an |= 0x100;
        this.lG = n;
        this.onChanged();
        return this;
    }

    public dT tz() {
        this.an &= 0xFFFFFEFF;
        this.lG = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean sT() {
        return (this.an & 0x200) != 0;
    }

    @Override
    public int sU() {
        return this.lI;
    }

    public dT aY(int n) {
        this.an |= 0x200;
        this.lI = n;
        this.onChanged();
        return this;
    }

    public dT tA() {
        this.an &= 0xFFFFFDFF;
        this.lI = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean sV() {
        return (this.an & 0x400) != 0;
    }

    @Override
    public int sW() {
        return this.lK;
    }

    public dT aZ(int n) {
        this.an |= 0x400;
        this.lK = n;
        this.onChanged();
        return this;
    }

    public dT tB() {
        this.an &= 0xFFFFFBFF;
        this.lK = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean sX() {
        return (this.an & 0x800) != 0;
    }

    @Override
    public int sY() {
        return this.lM;
    }

    public dT ba(int n) {
        this.an |= 0x800;
        this.lM = n;
        this.onChanged();
        return this;
    }

    public dT tC() {
        this.an &= 0xFFFFF7FF;
        this.lM = 0;
        this.onChanged();
        return this;
    }

    @Override
    @Deprecated
    public boolean sZ() {
        return (this.an & 0x1000) != 0;
    }

    @Override
    @Deprecated
    public int ta() {
        return this.lO;
    }

    @Deprecated
    public dT bb(int n) {
        this.an |= 0x1000;
        this.lO = n;
        this.onChanged();
        return this;
    }

    @Deprecated
    public dT tD() {
        this.an &= 0xFFFFEFFF;
        this.lO = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean tb() {
        return (this.an & 0x2000) != 0;
    }

    @Override
    public int tc() {
        return this.lQ;
    }

    public dT bc(int n) {
        this.an |= 0x2000;
        this.lQ = n;
        this.onChanged();
        return this;
    }

    public dT tE() {
        this.an &= 0xFFFFDFFF;
        this.lQ = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean td() {
        return (this.an & 0x4000) != 0;
    }

    @Override
    public int te() {
        return this.lS;
    }

    public dT bd(int n) {
        this.an |= 0x4000;
        this.lS = n;
        this.onChanged();
        return this;
    }

    public dT tF() {
        this.an &= 0xFFFFBFFF;
        this.lS = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean tf() {
        return (this.an & 0x8000) != 0;
    }

    @Override
    public int tg() {
        return this.lU;
    }

    public dT be(int n) {
        this.an |= 0x8000;
        this.lU = n;
        this.onChanged();
        return this;
    }

    public dT tG() {
        this.an &= 0xFFFF7FFF;
        this.lU = 0;
        this.onChanged();
        return this;
    }

    public final dT bg(UnknownFieldSet unknownFieldSet) {
        return (dT)super.setUnknownFields(unknownFieldSet);
    }

    public final dT bh(UnknownFieldSet unknownFieldSet) {
        return (dT)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bh(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bg(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bh(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ad(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ad(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ad(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bg(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.tn();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.tq();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bh(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cl(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.ad(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.tn();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ad(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.tq();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bh(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bg(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bh(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ad(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ad(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ad(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bg(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cl(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.tq();
    }

    public /* synthetic */ Message buildPartial() {
        return this.tp();
    }

    public /* synthetic */ Message build() {
        return this.to();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.ad(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.tn();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cl(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.tq();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.tp();
    }

    public /* synthetic */ MessageLite build() {
        return this.to();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.tn();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.tl();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.tl();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cl(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.tq();
    }

    public /* synthetic */ Object clone() {
        return this.tq();
    }
}

