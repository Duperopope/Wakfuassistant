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

public final class ie
extends GeneratedMessageV3.Builder<ie>
implements if {
    private int an;
    private long wq;
    private int ws;

    public static final Descriptors.Descriptor LF() {
        return hL.vI;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hL.vJ.ensureFieldAccessorsInitialized(ic.class, ie.class);
    }

    ie() {
        this.D();
    }

    ie(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ic.aJ()) {
            // empty if block
        }
    }

    public ie LG() {
        super.clear();
        this.wq = 0L;
        this.an &= 0xFFFFFFFE;
        this.ws = 0;
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return hL.vI;
    }

    public ic LE() {
        return ic.LD();
    }

    public ic LH() {
        ic ic2 = this.LI();
        if (!ic2.isInitialized()) {
            throw ie.newUninitializedMessageException((Message)ic2);
        }
        return ic2;
    }

    public ic LI() {
        ic ic2 = new ic(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            ic2.wq = this.wq;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            ic2.ws = this.ws;
            n2 |= 2;
        }
        ic2.an = n2;
        this.onBuilt();
        return ic2;
    }

    public ie LJ() {
        return (ie)super.clone();
    }

    public ie cS(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ie)super.setField(fieldDescriptor, object);
    }

    public ie aW(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ie)super.clearField(fieldDescriptor);
    }

    public ie aW(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ie)super.clearOneof(oneofDescriptor);
    }

    public ie aW(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ie)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ie cT(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ie)super.addRepeatedField(fieldDescriptor, object);
    }

    public ie aW(Message message) {
        if (message instanceof ic) {
            return this.d((ic)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ie d(ic ic2) {
        if (ic2 == ic.LD()) {
            return this;
        }
        if (ic2.Lw()) {
            this.ad(ic2.Lx());
        }
        if (ic2.Ly()) {
            this.ej(ic2.Lz());
        }
        this.cT(ic.c(ic2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.Lw()) {
            return false;
        }
        return this.Ly();
    }

    public ie eQ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ic ic2 = null;
        try {
            ic2 = (ic)ic.wu.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ic2 = (ic)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ic2 != null) {
                this.d(ic2);
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

    public ie ad(long l) {
        this.an |= 1;
        this.wq = l;
        this.onChanged();
        return this;
    }

    public ie LK() {
        this.an &= 0xFFFFFFFE;
        this.wq = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Ly() {
        return (this.an & 2) != 0;
    }

    @Override
    public int Lz() {
        return this.ws;
    }

    public ie ej(int n) {
        this.an |= 2;
        this.ws = n;
        this.onChanged();
        return this;
    }

    public ie LL() {
        this.an &= 0xFFFFFFFD;
        this.ws = 0;
        this.onChanged();
        return this;
    }

    public final ie cS(UnknownFieldSet unknownFieldSet) {
        return (ie)super.setUnknownFields(unknownFieldSet);
    }

    public final ie cT(UnknownFieldSet unknownFieldSet) {
        return (ie)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cT(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cS(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cT(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aW(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aW(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aW(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cS(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.LG();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.LJ();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cT(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eQ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aW(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.LG();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aW(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.LJ();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cT(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cS(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cT(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aW(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aW(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aW(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cS(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eQ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.LJ();
    }

    public /* synthetic */ Message buildPartial() {
        return this.LI();
    }

    public /* synthetic */ Message build() {
        return this.LH();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aW(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.LG();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eQ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.LJ();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.LI();
    }

    public /* synthetic */ MessageLite build() {
        return this.LH();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.LG();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.LE();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.LE();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eQ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.LJ();
    }

    public /* synthetic */ Object clone() {
        return this.LJ();
    }
}

