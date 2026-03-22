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
 * Renamed from lf
 */
public final class lf_0
extends GeneratedMessageV3.Builder<lf_0>
implements lg_0 {
    private int an;
    private int HJ;
    private int HL;

    public static final Descriptors.Descriptor afv() {
        return kF.Ge;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.Gf.ensureFieldAccessorsInitialized(ld_0.class, lf_0.class);
    }

    lf_0() {
        this.D();
    }

    lf_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ld_0.afu()) {
            // empty if block
        }
    }

    public lf_0 afw() {
        super.clear();
        this.HJ = 0;
        this.an &= 0xFFFFFFFE;
        this.HL = 0;
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kF.Ge;
    }

    public ld_0 aft() {
        return ld_0.afs();
    }

    public ld_0 afx() {
        ld_0 ld_02 = this.afy();
        if (!ld_02.isInitialized()) {
            throw lf_0.newUninitializedMessageException((Message)ld_02);
        }
        return ld_02;
    }

    public ld_0 afy() {
        ld_0 ld_02 = new ld_0(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            ld_02.HJ = this.HJ;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            ld_02.HL = this.HL;
            n2 |= 2;
        }
        ld_02.an = n2;
        this.onBuilt();
        return ld_02;
    }

    public lf_0 afz() {
        return (lf_0)super.clone();
    }

    public lf_0 eo(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (lf_0)super.setField(fieldDescriptor, object);
    }

    public lf_0 bH(Descriptors.FieldDescriptor fieldDescriptor) {
        return (lf_0)super.clearField(fieldDescriptor);
    }

    public lf_0 bH(Descriptors.OneofDescriptor oneofDescriptor) {
        return (lf_0)super.clearOneof(oneofDescriptor);
    }

    public lf_0 bH(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (lf_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public lf_0 ep(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (lf_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public lf_0 bH(Message message) {
        if (message instanceof ld_0) {
            return this.e((ld_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public lf_0 e(ld_0 ld_02) {
        if (ld_02 == ld_0.afs()) {
            return this;
        }
        if (ld_02.afl()) {
            this.hb(ld_02.afm());
        }
        if (ld_02.afn()) {
            this.hc(ld_02.afo());
        }
        this.ep(ld_0.d(ld_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.afl()) {
            return false;
        }
        return this.afn();
    }

    public lf_0 gX(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ld_0 ld_02 = null;
        try {
            ld_02 = (ld_0)ld_0.HN.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ld_02 = (ld_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ld_02 != null) {
                this.e(ld_02);
            }
        }
        return this;
    }

    @Override
    public boolean afl() {
        return (this.an & 1) != 0;
    }

    @Override
    public int afm() {
        return this.HJ;
    }

    public lf_0 hb(int n) {
        this.an |= 1;
        this.HJ = n;
        this.onChanged();
        return this;
    }

    public lf_0 afA() {
        this.an &= 0xFFFFFFFE;
        this.HJ = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean afn() {
        return (this.an & 2) != 0;
    }

    @Override
    public int afo() {
        return this.HL;
    }

    public lf_0 hc(int n) {
        this.an |= 2;
        this.HL = n;
        this.onChanged();
        return this;
    }

    public lf_0 afB() {
        this.an &= 0xFFFFFFFD;
        this.HL = 0;
        this.onChanged();
        return this;
    }

    public final lf_0 eo(UnknownFieldSet unknownFieldSet) {
        return (lf_0)super.setUnknownFields(unknownFieldSet);
    }

    public final lf_0 ep(UnknownFieldSet unknownFieldSet) {
        return (lf_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ep(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eo(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ep(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bH(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bH(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bH(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eo(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.afw();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.afz();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ep(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gX(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bH(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.afw();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bH(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.afz();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ep(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eo(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ep(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bH(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bH(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bH(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eo(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gX(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.afz();
    }

    public /* synthetic */ Message buildPartial() {
        return this.afy();
    }

    public /* synthetic */ Message build() {
        return this.afx();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bH(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.afw();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gX(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.afz();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.afy();
    }

    public /* synthetic */ MessageLite build() {
        return this.afx();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.afw();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aft();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aft();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gX(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.afz();
    }

    public /* synthetic */ Object clone() {
        return this.afz();
    }
}

