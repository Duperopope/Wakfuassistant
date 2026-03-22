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

public final class AL
extends GeneratedMessageV3.Builder<AL>
implements AM {
    private int an;
    private int Gx;
    private Ab arh;
    private SingleFieldBuilderV3<Ab, Ad, Ae> ark;

    public static final Descriptors.Descriptor aED() {
        return zS.apz;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zS.apA.ensureFieldAccessorsInitialized(aj_0.class, AL.class);
    }

    AL() {
        this.D();
    }

    AL(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (aj_0.aEC()) {
            this.aEL();
        }
    }

    public AL aEE() {
        super.clear();
        this.Gx = 0;
        this.an &= 0xFFFFFFFE;
        if (this.ark == null) {
            this.arh = null;
        } else {
            this.ark.clear();
        }
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return zS.apz;
    }

    public aj_0 aEB() {
        return aj_0.aEA();
    }

    public aj_0 aEF() {
        aj_0 aj_02 = this.aEG();
        if (!aj_02.isInitialized()) {
            throw AL.newUninitializedMessageException((Message)aj_02);
        }
        return aj_02;
    }

    public aj_0 aEG() {
        aj_0 aj_02 = new aj_0(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            aj_02.Gx = this.Gx;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            aj_02.arh = this.ark == null ? this.arh : (Ab)this.ark.build();
            n2 |= 2;
        }
        aj_02.an = n2;
        this.onBuilt();
        return aj_02;
    }

    public AL aEH() {
        return (AL)super.clone();
    }

    public AL gC(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (AL)super.setField(fieldDescriptor, object);
    }

    public AL cO(Descriptors.FieldDescriptor fieldDescriptor) {
        return (AL)super.clearField(fieldDescriptor);
    }

    public AL cO(Descriptors.OneofDescriptor oneofDescriptor) {
        return (AL)super.clearOneof(oneofDescriptor);
    }

    public AL cO(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (AL)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public AL gD(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (AL)super.addRepeatedField(fieldDescriptor, object);
    }

    public AL cO(Message message) {
        if (message instanceof aj_0) {
            return this.c((aj_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public AL c(aj_0 aj_02) {
        if (aj_02 == aj_0.aEA()) {
            return this;
        }
        if (aj_02.acr()) {
            this.lo(aj_02.acs());
        }
        if (aj_02.aEu()) {
            this.e(aj_02.aEv());
        }
        this.gD(aj_0.b(aj_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return !this.aEu() || this.aEv().isInitialized();
    }

    public AL ks(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        aj_0 aj_02 = null;
        try {
            aj_02 = (aj_0)aj_0.arj.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            aj_02 = (aj_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (aj_02 != null) {
                this.c(aj_02);
            }
        }
        return this;
    }

    @Override
    public boolean acr() {
        return (this.an & 1) != 0;
    }

    @Override
    public int acs() {
        return this.Gx;
    }

    public AL lo(int n) {
        this.an |= 1;
        this.Gx = n;
        this.onChanged();
        return this;
    }

    public AL aEI() {
        this.an &= 0xFFFFFFFE;
        this.Gx = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aEu() {
        return (this.an & 2) != 0;
    }

    @Override
    public Ab aEv() {
        if (this.ark == null) {
            return this.arh == null ? Ab.aBM() : this.arh;
        }
        return (Ab)this.ark.getMessage();
    }

    public AL d(Ab ab) {
        if (this.ark == null) {
            if (ab == null) {
                throw new NullPointerException();
            }
            this.arh = ab;
            this.onChanged();
        } else {
            this.ark.setMessage((AbstractMessage)ab);
        }
        this.an |= 2;
        return this;
    }

    public AL a(Ad ad) {
        if (this.ark == null) {
            this.arh = ad.aBR();
            this.onChanged();
        } else {
            this.ark.setMessage((AbstractMessage)ad.aBR());
        }
        this.an |= 2;
        return this;
    }

    public AL e(Ab ab) {
        if (this.ark == null) {
            this.arh = (this.an & 2) != 0 && this.arh != null && this.arh != Ab.aBM() ? Ab.a(this.arh).c(ab).aBS() : ab;
            this.onChanged();
        } else {
            this.ark.mergeFrom((AbstractMessage)ab);
        }
        this.an |= 2;
        return this;
    }

    public AL aEJ() {
        if (this.ark == null) {
            this.arh = null;
            this.onChanged();
        } else {
            this.ark.clear();
        }
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Ad aEK() {
        this.an |= 2;
        this.onChanged();
        return (Ad)this.aEL().getBuilder();
    }

    @Override
    public Ae aEw() {
        if (this.ark != null) {
            return (Ae)this.ark.getMessageOrBuilder();
        }
        return this.arh == null ? Ab.aBM() : this.arh;
    }

    private SingleFieldBuilderV3<Ab, Ad, Ae> aEL() {
        if (this.ark == null) {
            this.ark = new SingleFieldBuilderV3((AbstractMessage)this.aEv(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.arh = null;
        }
        return this.ark;
    }

    public final AL gC(UnknownFieldSet unknownFieldSet) {
        return (AL)super.setUnknownFields(unknownFieldSet);
    }

    public final AL gD(UnknownFieldSet unknownFieldSet) {
        return (AL)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gD(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gC(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gD(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cO(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cO(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cO(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gC(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aEE();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aEH();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gD(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ks(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cO(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aEE();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cO(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aEH();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gD(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gC(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gD(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cO(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cO(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cO(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gC(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ks(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aEH();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aEG();
    }

    public /* synthetic */ Message build() {
        return this.aEF();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cO(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aEE();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ks(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aEH();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aEG();
    }

    public /* synthetic */ MessageLite build() {
        return this.aEF();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aEE();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aEB();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aEB();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ks(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aEH();
    }

    public /* synthetic */ Object clone() {
        return this.aEH();
    }
}

