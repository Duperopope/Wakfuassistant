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
 *  com.google.protobuf.SingleFieldBuilderV3
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from oa
 */
public final class oa_2
extends GeneratedMessageV3.Builder<oa_2>
implements of_2 {
    private int an;
    private int dL;
    private int HC;
    private int PM;
    private og_2 PO;
    private SingleFieldBuilderV3<og_2, oi_2, oj_2> Qg;
    private og_2 PQ;
    private SingleFieldBuilderV3<og_2, oi_2, oj_2> Qh;
    private long PS;
    private int PU;
    private int mj;
    private int PX;
    private long PZ;
    private int Qb;
    private int Qd;

    public static final Descriptors.Descriptor atP() {
        return nx_2.PE;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nx_2.PF.ensureFieldAccessorsInitialized(ny_2.class, oa_2.class);
    }

    oa_2() {
        this.D();
    }

    oa_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ny_2.el()) {
            this.atZ();
            this.auc();
        }
    }

    public oa_2 atQ() {
        super.clear();
        this.dL = 0;
        this.an &= 0xFFFFFFFE;
        this.HC = 0;
        this.an &= 0xFFFFFFFD;
        this.PM = 0;
        this.an &= 0xFFFFFFFB;
        if (this.Qg == null) {
            this.PO = null;
        } else {
            this.Qg.clear();
        }
        this.an &= 0xFFFFFFF7;
        if (this.Qh == null) {
            this.PQ = null;
        } else {
            this.Qh.clear();
        }
        this.an &= 0xFFFFFFEF;
        this.PS = 0L;
        this.an &= 0xFFFFFFDF;
        this.PU = 0;
        this.an &= 0xFFFFFFBF;
        this.mj = 0;
        this.an &= 0xFFFFFF7F;
        this.PX = 0;
        this.an &= 0xFFFFFEFF;
        this.PZ = 0L;
        this.an &= 0xFFFFFDFF;
        this.Qb = 0;
        this.an &= 0xFFFFFBFF;
        this.Qd = 0;
        this.an &= 0xFFFFF7FF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return nx_2.PE;
    }

    public ny_2 atO() {
        return ny_2.atN();
    }

    public ny_2 atR() {
        ny_2 ny_22 = this.atS();
        if (!ny_22.isInitialized()) {
            throw oa_2.newUninitializedMessageException((Message)ny_22);
        }
        return ny_22;
    }

    public ny_2 atS() {
        ny_2 ny_22 = new ny_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            ny_22.dL = this.dL;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            ny_22.HC = this.HC;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            ny_22.PM = this.PM;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            ny_22.PO = this.Qg == null ? this.PO : (og_2)this.Qg.build();
            n2 |= 8;
        }
        if ((n & 0x10) != 0) {
            ny_22.PQ = this.Qh == null ? this.PQ : (og_2)this.Qh.build();
            n2 |= 0x10;
        }
        if ((n & 0x20) != 0) {
            ny_22.PS = this.PS;
            n2 |= 0x20;
        }
        if ((n & 0x40) != 0) {
            ny_22.PU = this.PU;
            n2 |= 0x40;
        }
        if ((n & 0x80) != 0) {
            ny_22.mj = this.mj;
            n2 |= 0x80;
        }
        if ((n & 0x100) != 0) {
            ny_22.PX = this.PX;
            n2 |= 0x100;
        }
        if ((n & 0x200) != 0) {
            ny_22.PZ = this.PZ;
            n2 |= 0x200;
        }
        if ((n & 0x400) != 0) {
            ny_22.Qb = this.Qb;
            n2 |= 0x400;
        }
        if ((n & 0x800) != 0) {
            ny_22.Qd = this.Qd;
            n2 |= 0x800;
        }
        ny_22.an = n2;
        this.onBuilt();
        return ny_22;
    }

    public oa_2 atT() {
        return (oa_2)super.clone();
    }

    public oa_2 fy(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (oa_2)super.setField(fieldDescriptor, object);
    }

    public oa_2 cm(Descriptors.FieldDescriptor fieldDescriptor) {
        return (oa_2)super.clearField(fieldDescriptor);
    }

    public oa_2 cm(Descriptors.OneofDescriptor oneofDescriptor) {
        return (oa_2)super.clearOneof(oneofDescriptor);
    }

    public oa_2 cm(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (oa_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public oa_2 fz(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (oa_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public oa_2 cm(Message message) {
        if (message instanceof ny_2) {
            return this.c((ny_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public oa_2 c(ny_2 ny_22) {
        if (ny_22 == ny_2.atN()) {
            return this;
        }
        if (ny_22.oN()) {
            this.jz(ny_22.d());
        }
        if (ny_22.aeU()) {
            this.jA(ny_22.aeV());
        }
        if (ny_22.ats()) {
            this.jB(ny_22.att());
        }
        if (ny_22.atu()) {
            this.b(ny_22.atv());
        }
        if (ny_22.atx()) {
            this.d(ny_22.aty());
        }
        if (ny_22.aps()) {
            this.bP(ny_22.atA());
        }
        if (ny_22.atB()) {
            this.jC(ny_22.atC());
        }
        if (ny_22.tK()) {
            this.jD(ny_22.tL());
        }
        if (ny_22.Xh()) {
            this.jE(ny_22.atD());
        }
        if (ny_22.atE()) {
            this.bQ(ny_22.atF());
        }
        if (ny_22.atG()) {
            this.jF(ny_22.atH());
        }
        if (ny_22.atI()) {
            this.jG(ny_22.atJ());
        }
        this.fz(ny_2.b(ny_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.oN()) {
            return false;
        }
        if (!this.aeU()) {
            return false;
        }
        if (!this.ats()) {
            return false;
        }
        if (!this.atu()) {
            return false;
        }
        if (!this.atx()) {
            return false;
        }
        if (!this.aps()) {
            return false;
        }
        if (!this.atv().isInitialized()) {
            return false;
        }
        return this.aty().isInitialized();
    }

    public oa_2 iM(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ny_2 ny_22 = null;
        try {
            ny_22 = (ny_2)ny_2.Qf.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ny_22 = (ny_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ny_22 != null) {
                this.c(ny_22);
            }
        }
        return this;
    }

    @Override
    public boolean oN() {
        return (this.an & 1) != 0;
    }

    @Override
    public int d() {
        return this.dL;
    }

    public oa_2 jz(int n) {
        this.an |= 1;
        this.dL = n;
        this.onChanged();
        return this;
    }

    public oa_2 atU() {
        this.an &= 0xFFFFFFFE;
        this.dL = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aeU() {
        return (this.an & 2) != 0;
    }

    @Override
    public int aeV() {
        return this.HC;
    }

    public oa_2 jA(int n) {
        this.an |= 2;
        this.HC = n;
        this.onChanged();
        return this;
    }

    public oa_2 atV() {
        this.an &= 0xFFFFFFFD;
        this.HC = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean ats() {
        return (this.an & 4) != 0;
    }

    @Override
    public int att() {
        return this.PM;
    }

    public oa_2 jB(int n) {
        this.an |= 4;
        this.PM = n;
        this.onChanged();
        return this;
    }

    public oa_2 atW() {
        this.an &= 0xFFFFFFFB;
        this.PM = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean atu() {
        return (this.an & 8) != 0;
    }

    @Override
    public og_2 atv() {
        if (this.Qg == null) {
            return this.PO == null ? og_2.auL() : this.PO;
        }
        return (og_2)this.Qg.getMessage();
    }

    public oa_2 a(og_2 og_22) {
        if (this.Qg == null) {
            if (og_22 == null) {
                throw new NullPointerException();
            }
            this.PO = og_22;
            this.onChanged();
        } else {
            this.Qg.setMessage((AbstractMessage)og_22);
        }
        this.an |= 8;
        return this;
    }

    public oa_2 a(oi_2 oi_22) {
        if (this.Qg == null) {
            this.PO = oi_22.auQ();
            this.onChanged();
        } else {
            this.Qg.setMessage((AbstractMessage)oi_22.auQ());
        }
        this.an |= 8;
        return this;
    }

    public oa_2 b(og_2 og_22) {
        if (this.Qg == null) {
            this.PO = (this.an & 8) != 0 && this.PO != null && this.PO != og_2.auL() ? og_2.e(this.PO).g(og_22).auR() : og_22;
            this.onChanged();
        } else {
            this.Qg.mergeFrom((AbstractMessage)og_22);
        }
        this.an |= 8;
        return this;
    }

    public oa_2 atX() {
        if (this.Qg == null) {
            this.PO = null;
            this.onChanged();
        } else {
            this.Qg.clear();
        }
        this.an &= 0xFFFFFFF7;
        return this;
    }

    public oi_2 atY() {
        this.an |= 8;
        this.onChanged();
        return (oi_2)this.atZ().getBuilder();
    }

    @Override
    public oj_2 atw() {
        if (this.Qg != null) {
            return (oj_2)this.Qg.getMessageOrBuilder();
        }
        return this.PO == null ? og_2.auL() : this.PO;
    }

    private SingleFieldBuilderV3<og_2, oi_2, oj_2> atZ() {
        if (this.Qg == null) {
            this.Qg = new SingleFieldBuilderV3((AbstractMessage)this.atv(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.PO = null;
        }
        return this.Qg;
    }

    @Override
    public boolean atx() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public og_2 aty() {
        if (this.Qh == null) {
            return this.PQ == null ? og_2.auL() : this.PQ;
        }
        return (og_2)this.Qh.getMessage();
    }

    public oa_2 c(og_2 og_22) {
        if (this.Qh == null) {
            if (og_22 == null) {
                throw new NullPointerException();
            }
            this.PQ = og_22;
            this.onChanged();
        } else {
            this.Qh.setMessage((AbstractMessage)og_22);
        }
        this.an |= 0x10;
        return this;
    }

    public oa_2 b(oi_2 oi_22) {
        if (this.Qh == null) {
            this.PQ = oi_22.auQ();
            this.onChanged();
        } else {
            this.Qh.setMessage((AbstractMessage)oi_22.auQ());
        }
        this.an |= 0x10;
        return this;
    }

    public oa_2 d(og_2 og_22) {
        if (this.Qh == null) {
            this.PQ = (this.an & 0x10) != 0 && this.PQ != null && this.PQ != og_2.auL() ? og_2.e(this.PQ).g(og_22).auR() : og_22;
            this.onChanged();
        } else {
            this.Qh.mergeFrom((AbstractMessage)og_22);
        }
        this.an |= 0x10;
        return this;
    }

    public oa_2 aua() {
        if (this.Qh == null) {
            this.PQ = null;
            this.onChanged();
        } else {
            this.Qh.clear();
        }
        this.an &= 0xFFFFFFEF;
        return this;
    }

    public oi_2 aub() {
        this.an |= 0x10;
        this.onChanged();
        return (oi_2)this.auc().getBuilder();
    }

    @Override
    public oj_2 atz() {
        if (this.Qh != null) {
            return (oj_2)this.Qh.getMessageOrBuilder();
        }
        return this.PQ == null ? og_2.auL() : this.PQ;
    }

    private SingleFieldBuilderV3<og_2, oi_2, oj_2> auc() {
        if (this.Qh == null) {
            this.Qh = new SingleFieldBuilderV3((AbstractMessage)this.aty(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.PQ = null;
        }
        return this.Qh;
    }

    @Override
    public boolean aps() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public long atA() {
        return this.PS;
    }

    public oa_2 bP(long l) {
        this.an |= 0x20;
        this.PS = l;
        this.onChanged();
        return this;
    }

    public oa_2 aud() {
        this.an &= 0xFFFFFFDF;
        this.PS = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean atB() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public int atC() {
        return this.PU;
    }

    public oa_2 jC(int n) {
        this.an |= 0x40;
        this.PU = n;
        this.onChanged();
        return this;
    }

    public oa_2 aue() {
        this.an &= 0xFFFFFFBF;
        this.PU = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean tK() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public int tL() {
        return this.mj;
    }

    public oa_2 jD(int n) {
        this.an |= 0x80;
        this.mj = n;
        this.onChanged();
        return this;
    }

    public oa_2 auf() {
        this.an &= 0xFFFFFF7F;
        this.mj = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Xh() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public int atD() {
        return this.PX;
    }

    public oa_2 jE(int n) {
        this.an |= 0x100;
        this.PX = n;
        this.onChanged();
        return this;
    }

    public oa_2 aug() {
        this.an &= 0xFFFFFEFF;
        this.PX = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean atE() {
        return (this.an & 0x200) != 0;
    }

    @Override
    public long atF() {
        return this.PZ;
    }

    public oa_2 bQ(long l) {
        this.an |= 0x200;
        this.PZ = l;
        this.onChanged();
        return this;
    }

    public oa_2 auh() {
        this.an &= 0xFFFFFDFF;
        this.PZ = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean atG() {
        return (this.an & 0x400) != 0;
    }

    @Override
    public int atH() {
        return this.Qb;
    }

    public oa_2 jF(int n) {
        this.an |= 0x400;
        this.Qb = n;
        this.onChanged();
        return this;
    }

    public oa_2 aui() {
        this.an &= 0xFFFFFBFF;
        this.Qb = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean atI() {
        return (this.an & 0x800) != 0;
    }

    @Override
    public int atJ() {
        return this.Qd;
    }

    public oa_2 jG(int n) {
        this.an |= 0x800;
        this.Qd = n;
        this.onChanged();
        return this;
    }

    public oa_2 auj() {
        this.an &= 0xFFFFF7FF;
        this.Qd = 0;
        this.onChanged();
        return this;
    }

    public final oa_2 fy(UnknownFieldSet unknownFieldSet) {
        return (oa_2)super.setUnknownFields(unknownFieldSet);
    }

    public final oa_2 fz(UnknownFieldSet unknownFieldSet) {
        return (oa_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fz(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fy(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fz(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cm(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cm(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cm(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fy(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.atQ();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.atT();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fz(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iM(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cm(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.atQ();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cm(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.atT();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fz(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fy(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fz(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cm(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cm(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cm(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fy(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iM(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.atT();
    }

    public /* synthetic */ Message buildPartial() {
        return this.atS();
    }

    public /* synthetic */ Message build() {
        return this.atR();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cm(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.atQ();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iM(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.atT();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.atS();
    }

    public /* synthetic */ MessageLite build() {
        return this.atR();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.atQ();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.atO();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.atO();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iM(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.atT();
    }

    public /* synthetic */ Object clone() {
        return this.atT();
    }
}

