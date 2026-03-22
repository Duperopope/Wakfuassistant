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
 * Renamed from lb
 */
public final class lb_0
extends GeneratedMessageV3.Builder<lb_0>
implements lc {
    private int an;
    private int HC;
    private boolean HE;

    public static final Descriptors.Descriptor afd() {
        return kF.Gc;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.Gd.ensureFieldAccessorsInitialized(kZ.class, lb_0.class);
    }

    lb_0() {
        this.D();
    }

    lb_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (kZ.aq()) {
            // empty if block
        }
    }

    public lb_0 afe() {
        super.clear();
        this.HC = 0;
        this.an &= 0xFFFFFFFE;
        this.HE = false;
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kF.Gc;
    }

    public kZ afc() {
        return kZ.afb();
    }

    public kZ aff() {
        kZ kZ2 = this.afg();
        if (!kZ2.isInitialized()) {
            throw lb_0.newUninitializedMessageException((Message)kZ2);
        }
        return kZ2;
    }

    public kZ afg() {
        kZ kZ2 = new kZ(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            kZ2.HC = this.HC;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            kZ2.HE = this.HE;
            n2 |= 2;
        }
        kZ2.an = n2;
        this.onBuilt();
        return kZ2;
    }

    public lb_0 afh() {
        return (lb_0)super.clone();
    }

    public lb_0 em(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (lb_0)super.setField(fieldDescriptor, object);
    }

    public lb_0 bG(Descriptors.FieldDescriptor fieldDescriptor) {
        return (lb_0)super.clearField(fieldDescriptor);
    }

    public lb_0 bG(Descriptors.OneofDescriptor oneofDescriptor) {
        return (lb_0)super.clearOneof(oneofDescriptor);
    }

    public lb_0 bG(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (lb_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public lb_0 en(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (lb_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public lb_0 bG(Message message) {
        if (message instanceof kZ) {
            return this.e((kZ)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public lb_0 e(kZ kZ2) {
        if (kZ2 == kZ.afb()) {
            return this;
        }
        if (kZ2.aeU()) {
            this.ha(kZ2.aeV());
        }
        if (kZ2.aeW()) {
            this.Q(kZ2.aeX());
        }
        this.en(kZ.d(kZ2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.aeU()) {
            return false;
        }
        return this.aeW();
    }

    public lb_0 gU(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        kZ kZ2 = null;
        try {
            kZ2 = (kZ)kZ.HG.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            kZ2 = (kZ)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (kZ2 != null) {
                this.e(kZ2);
            }
        }
        return this;
    }

    @Override
    public boolean aeU() {
        return (this.an & 1) != 0;
    }

    @Override
    public int aeV() {
        return this.HC;
    }

    public lb_0 ha(int n) {
        this.an |= 1;
        this.HC = n;
        this.onChanged();
        return this;
    }

    public lb_0 afi() {
        this.an &= 0xFFFFFFFE;
        this.HC = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aeW() {
        return (this.an & 2) != 0;
    }

    @Override
    public boolean aeX() {
        return this.HE;
    }

    public lb_0 Q(boolean bl) {
        this.an |= 2;
        this.HE = bl;
        this.onChanged();
        return this;
    }

    public lb_0 afj() {
        this.an &= 0xFFFFFFFD;
        this.HE = false;
        this.onChanged();
        return this;
    }

    public final lb_0 em(UnknownFieldSet unknownFieldSet) {
        return (lb_0)super.setUnknownFields(unknownFieldSet);
    }

    public final lb_0 en(UnknownFieldSet unknownFieldSet) {
        return (lb_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.en(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.em(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.en(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bG(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bG(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bG(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.em(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.afe();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.afh();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.en(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gU(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bG(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.afe();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bG(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.afh();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.en(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.em(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.en(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bG(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bG(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bG(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.em(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gU(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.afh();
    }

    public /* synthetic */ Message buildPartial() {
        return this.afg();
    }

    public /* synthetic */ Message build() {
        return this.aff();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bG(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.afe();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gU(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.afh();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.afg();
    }

    public /* synthetic */ MessageLite build() {
        return this.aff();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.afe();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.afc();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.afc();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gU(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.afh();
    }

    public /* synthetic */ Object clone() {
        return this.afh();
    }
}

