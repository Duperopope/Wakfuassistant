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

public final class gI
extends GeneratedMessageV3.Builder<gI>
implements gJ {
    private int an;
    private long sJ;
    private int sL;
    private long sN;

    public static final Descriptors.Descriptor Fg() {
        return gc_0.sz;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gc_0.sA.ensureFieldAccessorsInitialized(gG.class, gI.class);
    }

    gI() {
        this.D();
    }

    gI(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (gG.oV()) {
            // empty if block
        }
    }

    public gI Fh() {
        super.clear();
        this.sJ = 0L;
        this.an &= 0xFFFFFFFE;
        this.sL = 0;
        this.an &= 0xFFFFFFFD;
        this.sN = 0L;
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return gc_0.sz;
    }

    public gG Ff() {
        return gG.Fe();
    }

    public gG Fi() {
        gG gG2 = this.Fj();
        if (!gG2.isInitialized()) {
            throw gI.newUninitializedMessageException((Message)gG2);
        }
        return gG2;
    }

    public gG Fj() {
        gG gG2 = new gG(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            gG2.sJ = this.sJ;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            gG2.sL = this.sL;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            gG2.sN = this.sN;
            n2 |= 4;
        }
        gG2.an = n2;
        this.onBuilt();
        return gG2;
    }

    public gI Fk() {
        return (gI)super.clone();
    }

    public gI cm(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gI)super.setField(fieldDescriptor, object);
    }

    public gI aG(Descriptors.FieldDescriptor fieldDescriptor) {
        return (gI)super.clearField(fieldDescriptor);
    }

    public gI aG(Descriptors.OneofDescriptor oneofDescriptor) {
        return (gI)super.clearOneof(oneofDescriptor);
    }

    public gI aG(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (gI)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public gI cn(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gI)super.addRepeatedField(fieldDescriptor, object);
    }

    public gI aG(Message message) {
        if (message instanceof gG) {
            return this.d((gG)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public gI d(gG gG2) {
        if (gG2 == gG.Fe()) {
            return this;
        }
        if (gG2.EV()) {
            this.R(gG2.EW());
        }
        if (gG2.EX()) {
            this.dd(gG2.EY());
        }
        if (gG2.EZ()) {
            this.S(gG2.Fa());
        }
        this.cn(gG.c(gG2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.EV()) {
            return false;
        }
        if (!this.EX()) {
            return false;
        }
        return this.EZ();
    }

    public gI dU(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        gG gG2 = null;
        try {
            gG2 = (gG)gG.sP.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            gG2 = (gG)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (gG2 != null) {
                this.d(gG2);
            }
        }
        return this;
    }

    @Override
    public boolean EV() {
        return (this.an & 1) != 0;
    }

    @Override
    public long EW() {
        return this.sJ;
    }

    public gI R(long l) {
        this.an |= 1;
        this.sJ = l;
        this.onChanged();
        return this;
    }

    public gI Fl() {
        this.an &= 0xFFFFFFFE;
        this.sJ = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean EX() {
        return (this.an & 2) != 0;
    }

    @Override
    public int EY() {
        return this.sL;
    }

    public gI dd(int n) {
        this.an |= 2;
        this.sL = n;
        this.onChanged();
        return this;
    }

    public gI Fm() {
        this.an &= 0xFFFFFFFD;
        this.sL = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean EZ() {
        return (this.an & 4) != 0;
    }

    @Override
    public long Fa() {
        return this.sN;
    }

    public gI S(long l) {
        this.an |= 4;
        this.sN = l;
        this.onChanged();
        return this;
    }

    public gI Fn() {
        this.an &= 0xFFFFFFFB;
        this.sN = 0L;
        this.onChanged();
        return this;
    }

    public final gI cm(UnknownFieldSet unknownFieldSet) {
        return (gI)super.setUnknownFields(unknownFieldSet);
    }

    public final gI cn(UnknownFieldSet unknownFieldSet) {
        return (gI)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cn(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cm(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cn(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aG(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aG(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aG(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cm(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.Fh();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.Fk();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cn(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dU(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aG(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.Fh();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aG(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.Fk();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cn(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cm(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cn(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aG(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aG(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aG(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cm(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dU(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.Fk();
    }

    public /* synthetic */ Message buildPartial() {
        return this.Fj();
    }

    public /* synthetic */ Message build() {
        return this.Fi();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aG(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.Fh();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dU(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.Fk();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.Fj();
    }

    public /* synthetic */ MessageLite build() {
        return this.Fi();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.Fh();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Ff();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Ff();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dU(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.Fk();
    }

    public /* synthetic */ Object clone() {
        return this.Fk();
    }
}

