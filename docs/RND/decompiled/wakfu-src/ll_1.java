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

/*
 * Renamed from lL
 */
public final class ll_1
extends GeneratedMessageV3.Builder<ll_1>
implements lm_1 {
    private int an;
    private int ws;
    private int Jb;
    private int Jd;
    private int Jf;

    public static final Descriptors.Descriptor aiB() {
        return kF.FW;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.FX.ensureFieldAccessorsInitialized(lj_0.class, ll_1.class);
    }

    ll_1() {
        this.D();
    }

    ll_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (lj_0.el()) {
            // empty if block
        }
    }

    public ll_1 aiC() {
        super.clear();
        this.ws = 0;
        this.an &= 0xFFFFFFFE;
        this.Jb = 0;
        this.an &= 0xFFFFFFFD;
        this.Jd = 0;
        this.an &= 0xFFFFFFFB;
        this.Jf = 0;
        this.an &= 0xFFFFFFF7;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kF.FW;
    }

    public lj_0 aiA() {
        return lj_0.aiz();
    }

    public lj_0 aiD() {
        lj_0 lj_02 = this.aiE();
        if (!lj_02.isInitialized()) {
            throw ll_1.newUninitializedMessageException((Message)lj_02);
        }
        return lj_02;
    }

    public lj_0 aiE() {
        lj_0 lj_02 = new lj_0(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            lj_02.ws = this.ws;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            lj_02.Jb = this.Jb;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            lj_02.Jd = this.Jd;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            lj_02.Jf = this.Jf;
            n2 |= 8;
        }
        lj_02.an = n2;
        this.onBuilt();
        return lj_02;
    }

    public ll_1 aiF() {
        return (ll_1)super.clone();
    }

    public ll_1 eE(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ll_1)super.setField(fieldDescriptor, object);
    }

    public ll_1 bP(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ll_1)super.clearField(fieldDescriptor);
    }

    public ll_1 bP(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ll_1)super.clearOneof(oneofDescriptor);
    }

    public ll_1 bP(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ll_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ll_1 eF(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ll_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public ll_1 bP(Message message) {
        if (message instanceof lj_0) {
            return this.d((lj_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ll_1 d(lj_0 lj_02) {
        if (lj_02 == lj_0.aiz()) {
            return this;
        }
        if (lj_02.Ly()) {
            this.hG(lj_02.Lz());
        }
        if (lj_02.aiq()) {
            this.hH(lj_02.air());
        }
        if (lj_02.ais()) {
            this.hI(lj_02.ait());
        }
        if (lj_02.aiu()) {
            this.hJ(lj_02.aiv());
        }
        this.eF(lj_0.c(lj_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.Ly()) {
            return false;
        }
        return this.aiq();
    }

    public ll_1 hv(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        lj_0 lj_02 = null;
        try {
            lj_02 = (lj_0)lj_0.Jh.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            lj_02 = (lj_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (lj_02 != null) {
                this.d(lj_02);
            }
        }
        return this;
    }

    @Override
    public boolean Ly() {
        return (this.an & 1) != 0;
    }

    @Override
    public int Lz() {
        return this.ws;
    }

    public ll_1 hG(int n) {
        this.an |= 1;
        this.ws = n;
        this.onChanged();
        return this;
    }

    public ll_1 aiG() {
        this.an &= 0xFFFFFFFE;
        this.ws = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aiq() {
        return (this.an & 2) != 0;
    }

    @Override
    public int air() {
        return this.Jb;
    }

    public ll_1 hH(int n) {
        this.an |= 2;
        this.Jb = n;
        this.onChanged();
        return this;
    }

    public ll_1 aiH() {
        this.an &= 0xFFFFFFFD;
        this.Jb = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean ais() {
        return (this.an & 4) != 0;
    }

    @Override
    public int ait() {
        return this.Jd;
    }

    public ll_1 hI(int n) {
        this.an |= 4;
        this.Jd = n;
        this.onChanged();
        return this;
    }

    public ll_1 aiI() {
        this.an &= 0xFFFFFFFB;
        this.Jd = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aiu() {
        return (this.an & 8) != 0;
    }

    @Override
    public int aiv() {
        return this.Jf;
    }

    public ll_1 hJ(int n) {
        this.an |= 8;
        this.Jf = n;
        this.onChanged();
        return this;
    }

    public ll_1 aiJ() {
        this.an &= 0xFFFFFFF7;
        this.Jf = 0;
        this.onChanged();
        return this;
    }

    public final ll_1 eE(UnknownFieldSet unknownFieldSet) {
        return (ll_1)super.setUnknownFields(unknownFieldSet);
    }

    public final ll_1 eF(UnknownFieldSet unknownFieldSet) {
        return (ll_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eF(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eE(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eF(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bP(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bP(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bP(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eE(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aiC();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aiF();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eF(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hv(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bP(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aiC();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bP(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aiF();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eF(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eE(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eF(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bP(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bP(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bP(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eE(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hv(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aiF();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aiE();
    }

    public /* synthetic */ Message build() {
        return this.aiD();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bP(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aiC();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hv(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aiF();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aiE();
    }

    public /* synthetic */ MessageLite build() {
        return this.aiD();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aiC();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aiA();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aiA();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hv(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aiF();
    }

    public /* synthetic */ Object clone() {
        return this.aiF();
    }
}

