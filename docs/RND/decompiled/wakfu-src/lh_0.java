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
 * Renamed from lH
 */
public final class lh_0
extends GeneratedMessageV3.Builder<lh_0>
implements li_0 {
    private int an;
    private int IU;
    private int Gx;

    public static final Descriptors.Descriptor aii() {
        return kF.FY;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.FZ.ensureFieldAccessorsInitialized(lF.class, lh_0.class);
    }

    lh_0() {
        this.D();
    }

    lh_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (lF.ju()) {
            // empty if block
        }
    }

    public lh_0 aij() {
        super.clear();
        this.IU = 0;
        this.an &= 0xFFFFFFFE;
        this.Gx = 0;
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kF.FY;
    }

    public lF aih() {
        return lF.aig();
    }

    public lF aik() {
        lF lF2 = this.ail();
        if (!lF2.isInitialized()) {
            throw lh_0.newUninitializedMessageException((Message)lF2);
        }
        return lF2;
    }

    public lF ail() {
        lF lF2 = new lF(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            lF2.IU = this.IU;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            lF2.Gx = this.Gx;
            n2 |= 2;
        }
        lF2.an = n2;
        this.onBuilt();
        return lF2;
    }

    public lh_0 aim() {
        return (lh_0)super.clone();
    }

    public lh_0 eC(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (lh_0)super.setField(fieldDescriptor, object);
    }

    public lh_0 bO(Descriptors.FieldDescriptor fieldDescriptor) {
        return (lh_0)super.clearField(fieldDescriptor);
    }

    public lh_0 bO(Descriptors.OneofDescriptor oneofDescriptor) {
        return (lh_0)super.clearOneof(oneofDescriptor);
    }

    public lh_0 bO(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (lh_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public lh_0 eD(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (lh_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public lh_0 bO(Message message) {
        if (message instanceof lF) {
            return this.d((lF)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public lh_0 d(lF lF2) {
        if (lF2 == lF.aig()) {
            return this;
        }
        if (lF2.aib()) {
            this.hE(lF2.aic());
        }
        if (lF2.acr()) {
            this.hF(lF2.acs());
        }
        this.eD(lF.c(lF2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.aib()) {
            return false;
        }
        return this.acr();
    }

    public lh_0 hs(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        lF lF2 = null;
        try {
            lF2 = (lF)lF.IX.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            lF2 = (lF)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (lF2 != null) {
                this.d(lF2);
            }
        }
        return this;
    }

    @Override
    public boolean aib() {
        return (this.an & 1) != 0;
    }

    @Override
    public int aic() {
        return this.IU;
    }

    public lh_0 hE(int n) {
        this.an |= 1;
        this.IU = n;
        this.onChanged();
        return this;
    }

    public lh_0 ain() {
        this.an &= 0xFFFFFFFE;
        this.IU = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean acr() {
        return (this.an & 2) != 0;
    }

    @Override
    public int acs() {
        return this.Gx;
    }

    public lh_0 hF(int n) {
        this.an |= 2;
        this.Gx = n;
        this.onChanged();
        return this;
    }

    public lh_0 aio() {
        this.an &= 0xFFFFFFFD;
        this.Gx = 0;
        this.onChanged();
        return this;
    }

    public final lh_0 eC(UnknownFieldSet unknownFieldSet) {
        return (lh_0)super.setUnknownFields(unknownFieldSet);
    }

    public final lh_0 eD(UnknownFieldSet unknownFieldSet) {
        return (lh_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eD(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eC(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eD(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bO(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bO(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bO(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eC(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aij();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aim();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eD(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hs(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bO(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aij();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bO(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aim();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eD(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eC(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eD(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bO(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bO(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bO(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eC(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hs(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aim();
    }

    public /* synthetic */ Message buildPartial() {
        return this.ail();
    }

    public /* synthetic */ Message build() {
        return this.aik();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bO(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aij();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hs(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aim();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.ail();
    }

    public /* synthetic */ MessageLite build() {
        return this.aik();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aij();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aih();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aih();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hs(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aim();
    }

    public /* synthetic */ Object clone() {
        return this.aim();
    }
}

