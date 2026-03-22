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
 * Renamed from me
 */
public final class me_0
extends GeneratedMessageV3.Builder<me_0>
implements mf_0 {
    private int an;
    private long wq = -1L;
    private kW Fc;
    private SingleFieldBuilderV3<kW, kY, lh> Fh;
    private mo_0 JZ;
    private SingleFieldBuilderV3<mo_0, mq_0, mr_0> Km;
    private int Kb;
    private int Kd;
    private long Kf;
    private int Kh;
    private long Kj;

    public static final Descriptors.Descriptor akn() {
        return mb_0.JR;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mb_0.JS.ensureFieldAccessorsInitialized(mc.class, me_0.class);
    }

    me_0() {
        this.D();
    }

    me_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (mc.pT()) {
            this.aaS();
            this.akw();
        }
    }

    public me_0 ako() {
        super.clear();
        this.wq = -1L;
        this.an &= 0xFFFFFFFE;
        if (this.Fh == null) {
            this.Fc = null;
        } else {
            this.Fh.clear();
        }
        this.an &= 0xFFFFFFFD;
        if (this.Km == null) {
            this.JZ = null;
        } else {
            this.Km.clear();
        }
        this.an &= 0xFFFFFFFB;
        this.Kb = 0;
        this.an &= 0xFFFFFFF7;
        this.Kd = 0;
        this.an &= 0xFFFFFFEF;
        this.Kf = 0L;
        this.an &= 0xFFFFFFDF;
        this.Kh = 0;
        this.an &= 0xFFFFFFBF;
        this.Kj = 0L;
        this.an &= 0xFFFFFF7F;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return mb_0.JR;
    }

    public mc akm() {
        return mc.akl();
    }

    public mc akp() {
        mc mc2 = this.akq();
        if (!mc2.isInitialized()) {
            throw me_0.newUninitializedMessageException((Message)mc2);
        }
        return mc2;
    }

    public mc akq() {
        mc mc2 = new mc(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            n2 |= 1;
        }
        mc2.wq = this.wq;
        if ((n & 2) != 0) {
            mc2.Fc = this.Fh == null ? this.Fc : (kW)this.Fh.build();
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            mc2.JZ = this.Km == null ? this.JZ : (mo_0)this.Km.build();
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            mc2.Kb = this.Kb;
            n2 |= 8;
        }
        if ((n & 0x10) != 0) {
            mc2.Kd = this.Kd;
            n2 |= 0x10;
        }
        if ((n & 0x20) != 0) {
            mc2.Kf = this.Kf;
            n2 |= 0x20;
        }
        if ((n & 0x40) != 0) {
            mc2.Kh = this.Kh;
            n2 |= 0x40;
        }
        if ((n & 0x80) != 0) {
            mc2.Kj = this.Kj;
            n2 |= 0x80;
        }
        mc2.an = n2;
        this.onBuilt();
        return mc2;
    }

    public me_0 akr() {
        return (me_0)super.clone();
    }

    public me_0 eM(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (me_0)super.setField(fieldDescriptor, object);
    }

    public me_0 bT(Descriptors.FieldDescriptor fieldDescriptor) {
        return (me_0)super.clearField(fieldDescriptor);
    }

    public me_0 bT(Descriptors.OneofDescriptor oneofDescriptor) {
        return (me_0)super.clearOneof(oneofDescriptor);
    }

    public me_0 bT(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (me_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public me_0 eN(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (me_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public me_0 bT(Message message) {
        if (message instanceof mc) {
            return this.c((mc)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public me_0 c(mc mc2) {
        if (mc2 == mc.akl()) {
            return this;
        }
        if (mc2.Lw()) {
            this.bd(mc2.Lx());
        }
        if (mc2.aaz()) {
            this.n(mc2.aaA());
        }
        if (mc2.ajV()) {
            this.b(mc2.ajW());
        }
        if (mc2.ajY()) {
            this.hT(mc2.ajZ());
        }
        if (mc2.aka()) {
            this.hU(mc2.akb());
        }
        if (mc2.akc()) {
            this.be(mc2.akd());
        }
        if (mc2.ake()) {
            this.hV(mc2.akf());
        }
        if (mc2.akg()) {
            this.bf(mc2.akh());
        }
        this.eN(mc.b(mc2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.ajV()) {
            return false;
        }
        if (!this.ajY()) {
            return false;
        }
        if (!this.aka()) {
            return false;
        }
        if (!this.akc()) {
            return false;
        }
        if (!this.ake()) {
            return false;
        }
        if (this.aaz() && !this.aaA().isInitialized()) {
            return false;
        }
        return this.ajW().isInitialized();
    }

    public me_0 hH(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        mc mc2 = null;
        try {
            mc2 = (mc)mc.Kl.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            mc2 = (mc)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (mc2 != null) {
                this.c(mc2);
            }
        }
        return this;
    }

    @Override
    public boolean Lw() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Lx() {
        return this.wq;
    }

    public me_0 bd(long l) {
        this.an |= 1;
        this.wq = l;
        this.onChanged();
        return this;
    }

    public me_0 aks() {
        this.an &= 0xFFFFFFFE;
        this.wq = -1L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aaz() {
        return (this.an & 2) != 0;
    }

    @Override
    public kW aaA() {
        if (this.Fh == null) {
            return this.Fc == null ? kW.aen() : this.Fc;
        }
        return (kW)this.Fh.getMessage();
    }

    public me_0 m(kW kW2) {
        if (this.Fh == null) {
            if (kW2 == null) {
                throw new NullPointerException();
            }
            this.Fc = kW2;
            this.onChanged();
        } else {
            this.Fh.setMessage((AbstractMessage)kW2);
        }
        this.an |= 2;
        return this;
    }

    public me_0 g(kY kY2) {
        if (this.Fh == null) {
            this.Fc = kY2.aer();
            this.onChanged();
        } else {
            this.Fh.setMessage((AbstractMessage)kY2.aer());
        }
        this.an |= 2;
        return this;
    }

    public me_0 n(kW kW2) {
        if (this.Fh == null) {
            this.Fc = (this.an & 2) != 0 && this.Fc != null && this.Fc != kW.aen() ? kW.f(this.Fc).h(kW2).aes() : kW2;
            this.onChanged();
        } else {
            this.Fh.mergeFrom((AbstractMessage)kW2);
        }
        this.an |= 2;
        return this;
    }

    public me_0 akt() {
        if (this.Fh == null) {
            this.Fc = null;
            this.onChanged();
        } else {
            this.Fh.clear();
        }
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public kY aaR() {
        this.an |= 2;
        this.onChanged();
        return (kY)this.aaS().getBuilder();
    }

    @Override
    public lh aaB() {
        if (this.Fh != null) {
            return (lh)this.Fh.getMessageOrBuilder();
        }
        return this.Fc == null ? kW.aen() : this.Fc;
    }

    private SingleFieldBuilderV3<kW, kY, lh> aaS() {
        if (this.Fh == null) {
            this.Fh = new SingleFieldBuilderV3((AbstractMessage)this.aaA(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Fc = null;
        }
        return this.Fh;
    }

    @Override
    public boolean ajV() {
        return (this.an & 4) != 0;
    }

    @Override
    public mo_0 ajW() {
        if (this.Km == null) {
            return this.JZ == null ? mo_0.alu() : this.JZ;
        }
        return (mo_0)this.Km.getMessage();
    }

    public me_0 a(mo_0 mo_02) {
        if (this.Km == null) {
            if (mo_02 == null) {
                throw new NullPointerException();
            }
            this.JZ = mo_02;
            this.onChanged();
        } else {
            this.Km.setMessage((AbstractMessage)mo_02);
        }
        this.an |= 4;
        return this;
    }

    public me_0 a(mq_0 mq_02) {
        if (this.Km == null) {
            this.JZ = mq_02.aly();
            this.onChanged();
        } else {
            this.Km.setMessage((AbstractMessage)mq_02.aly());
        }
        this.an |= 4;
        return this;
    }

    public me_0 b(mo_0 mo_02) {
        if (this.Km == null) {
            this.JZ = (this.an & 4) != 0 && this.JZ != null && this.JZ != mo_0.alu() ? mo_0.c(this.JZ).e(mo_02).alz() : mo_02;
            this.onChanged();
        } else {
            this.Km.mergeFrom((AbstractMessage)mo_02);
        }
        this.an |= 4;
        return this;
    }

    public me_0 aku() {
        if (this.Km == null) {
            this.JZ = null;
            this.onChanged();
        } else {
            this.Km.clear();
        }
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public mq_0 akv() {
        this.an |= 4;
        this.onChanged();
        return (mq_0)this.akw().getBuilder();
    }

    @Override
    public mr_0 ajX() {
        if (this.Km != null) {
            return (mr_0)this.Km.getMessageOrBuilder();
        }
        return this.JZ == null ? mo_0.alu() : this.JZ;
    }

    private SingleFieldBuilderV3<mo_0, mq_0, mr_0> akw() {
        if (this.Km == null) {
            this.Km = new SingleFieldBuilderV3((AbstractMessage)this.ajW(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.JZ = null;
        }
        return this.Km;
    }

    @Override
    public boolean ajY() {
        return (this.an & 8) != 0;
    }

    @Override
    public int ajZ() {
        return this.Kb;
    }

    public me_0 hT(int n) {
        this.an |= 8;
        this.Kb = n;
        this.onChanged();
        return this;
    }

    public me_0 akx() {
        this.an &= 0xFFFFFFF7;
        this.Kb = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aka() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public int akb() {
        return this.Kd;
    }

    public me_0 hU(int n) {
        this.an |= 0x10;
        this.Kd = n;
        this.onChanged();
        return this;
    }

    public me_0 aky() {
        this.an &= 0xFFFFFFEF;
        this.Kd = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean akc() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public long akd() {
        return this.Kf;
    }

    public me_0 be(long l) {
        this.an |= 0x20;
        this.Kf = l;
        this.onChanged();
        return this;
    }

    public me_0 akz() {
        this.an &= 0xFFFFFFDF;
        this.Kf = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean ake() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public int akf() {
        return this.Kh;
    }

    public me_0 hV(int n) {
        this.an |= 0x40;
        this.Kh = n;
        this.onChanged();
        return this;
    }

    public me_0 akA() {
        this.an &= 0xFFFFFFBF;
        this.Kh = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean akg() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public long akh() {
        return this.Kj;
    }

    public me_0 bf(long l) {
        this.an |= 0x80;
        this.Kj = l;
        this.onChanged();
        return this;
    }

    public me_0 akB() {
        this.an &= 0xFFFFFF7F;
        this.Kj = 0L;
        this.onChanged();
        return this;
    }

    public final me_0 eM(UnknownFieldSet unknownFieldSet) {
        return (me_0)super.setUnknownFields(unknownFieldSet);
    }

    public final me_0 eN(UnknownFieldSet unknownFieldSet) {
        return (me_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eN(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eM(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eN(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bT(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bT(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bT(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eM(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.ako();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.akr();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eN(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hH(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bT(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.ako();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bT(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.akr();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eN(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eM(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eN(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bT(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bT(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bT(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eM(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hH(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.akr();
    }

    public /* synthetic */ Message buildPartial() {
        return this.akq();
    }

    public /* synthetic */ Message build() {
        return this.akp();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bT(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.ako();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hH(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.akr();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.akq();
    }

    public /* synthetic */ MessageLite build() {
        return this.akp();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.ako();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.akm();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.akm();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hH(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.akr();
    }

    public /* synthetic */ Object clone() {
        return this.akr();
    }
}

