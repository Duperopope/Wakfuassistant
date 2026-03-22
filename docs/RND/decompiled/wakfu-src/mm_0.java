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
 * Renamed from mm
 */
public final class mm_0
extends GeneratedMessageV3.Builder<mm_0>
implements mn {
    private int an;
    private int uI;
    private int jq;
    private int KA;

    public static final Descriptors.Descriptor alg() {
        return mb_0.JP;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mb_0.JQ.ensureFieldAccessorsInitialized(mk.class, mm_0.class);
    }

    mm_0() {
        this.D();
    }

    mm_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (mk.oV()) {
            // empty if block
        }
    }

    public mm_0 alh() {
        super.clear();
        this.uI = 0;
        this.an &= 0xFFFFFFFE;
        this.jq = 0;
        this.an &= 0xFFFFFFFD;
        this.KA = 0;
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return mb_0.JP;
    }

    public mk alf() {
        return mk.ale();
    }

    public mk ali() {
        mk mk2 = this.alj();
        if (!mk2.isInitialized()) {
            throw mm_0.newUninitializedMessageException((Message)mk2);
        }
        return mk2;
    }

    public mk alj() {
        mk mk2 = new mk(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            mk2.uI = this.uI;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            mk2.jq = this.jq;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            mk2.KA = this.KA;
            n2 |= 4;
        }
        mk2.an = n2;
        this.onBuilt();
        return mk2;
    }

    public mm_0 alk() {
        return (mm_0)super.clone();
    }

    public mm_0 eQ(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mm_0)super.setField(fieldDescriptor, object);
    }

    public mm_0 bV(Descriptors.FieldDescriptor fieldDescriptor) {
        return (mm_0)super.clearField(fieldDescriptor);
    }

    public mm_0 bV(Descriptors.OneofDescriptor oneofDescriptor) {
        return (mm_0)super.clearOneof(oneofDescriptor);
    }

    public mm_0 bV(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (mm_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public mm_0 eR(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mm_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public mm_0 bV(Message message) {
        if (message instanceof mk) {
            return this.e((mk)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public mm_0 e(mk mk2) {
        if (mk2 == mk.ale()) {
            return this;
        }
        if (mk2.Im()) {
            this.ib(mk2.In());
        }
        if (mk2.oO()) {
            this.ic(mk2.oP());
        }
        if (mk2.akZ()) {
            this.id(mk2.ala());
        }
        this.eR(mk.d(mk2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.Im()) {
            return false;
        }
        if (!this.oO()) {
            return false;
        }
        return this.akZ();
    }

    public mm_0 hN(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        mk mk2 = null;
        try {
            mk2 = (mk)mk.KC.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            mk2 = (mk)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (mk2 != null) {
                this.e(mk2);
            }
        }
        return this;
    }

    @Override
    public boolean Im() {
        return (this.an & 1) != 0;
    }

    @Override
    public int In() {
        return this.uI;
    }

    public mm_0 ib(int n) {
        this.an |= 1;
        this.uI = n;
        this.onChanged();
        return this;
    }

    public mm_0 all() {
        this.an &= 0xFFFFFFFE;
        this.uI = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean oO() {
        return (this.an & 2) != 0;
    }

    @Override
    public int oP() {
        return this.jq;
    }

    public mm_0 ic(int n) {
        this.an |= 2;
        this.jq = n;
        this.onChanged();
        return this;
    }

    public mm_0 alm() {
        this.an &= 0xFFFFFFFD;
        this.jq = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean akZ() {
        return (this.an & 4) != 0;
    }

    @Override
    public int ala() {
        return this.KA;
    }

    public mm_0 id(int n) {
        this.an |= 4;
        this.KA = n;
        this.onChanged();
        return this;
    }

    public mm_0 aln() {
        this.an &= 0xFFFFFFFB;
        this.KA = 0;
        this.onChanged();
        return this;
    }

    public final mm_0 eQ(UnknownFieldSet unknownFieldSet) {
        return (mm_0)super.setUnknownFields(unknownFieldSet);
    }

    public final mm_0 eR(UnknownFieldSet unknownFieldSet) {
        return (mm_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eR(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eQ(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eR(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bV(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bV(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bV(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eQ(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.alh();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.alk();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eR(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hN(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bV(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.alh();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bV(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.alk();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eR(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eQ(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eR(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bV(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bV(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bV(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eQ(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hN(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.alk();
    }

    public /* synthetic */ Message buildPartial() {
        return this.alj();
    }

    public /* synthetic */ Message build() {
        return this.ali();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bV(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.alh();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hN(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.alk();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.alj();
    }

    public /* synthetic */ MessageLite build() {
        return this.ali();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.alh();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.alf();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.alf();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hN(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.alk();
    }

    public /* synthetic */ Object clone() {
        return this.alk();
    }
}

