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
 * Renamed from m
 */
public final class m_0
extends GeneratedMessageV3.Builder<m_0>
implements n_0 {
    private h ae;
    private SingleFieldBuilderV3<h, j_0, s_0> ah;

    public static final Descriptors.Descriptor Z() {
        return g_0.G;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return g_0.H.ensureFieldAccessorsInitialized(k.class, m_0.class);
    }

    m_0() {
        this.D();
    }

    m_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (k.Y()) {
            // empty if block
        }
    }

    public m_0 aa() {
        super.clear();
        if (this.ah == null) {
            this.ae = null;
        } else {
            this.ae = null;
            this.ah = null;
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return g_0.G;
    }

    public k X() {
        return k.W();
    }

    public k ab() {
        k k2 = this.ac();
        if (!k2.isInitialized()) {
            throw m_0.newUninitializedMessageException((Message)k2);
        }
        return k2;
    }

    public k ac() {
        k k2 = new k(this);
        k2.ae = this.ah == null ? this.ae : (h)this.ah.build();
        this.onBuilt();
        return k2;
    }

    public m_0 ad() {
        return (m_0)super.clone();
    }

    public m_0 c(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (m_0)super.setField(fieldDescriptor, object);
    }

    public m_0 b(Descriptors.FieldDescriptor fieldDescriptor) {
        return (m_0)super.clearField(fieldDescriptor);
    }

    public m_0 b(Descriptors.OneofDescriptor oneofDescriptor) {
        return (m_0)super.clearOneof(oneofDescriptor);
    }

    public m_0 b(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (m_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public m_0 d(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (m_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public m_0 b(Message message) {
        if (message instanceof k) {
            return this.c((k)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public m_0 c(k k2) {
        if (k2 == k.W()) {
            return this;
        }
        if (k2.Q()) {
            this.e(k2.R());
        }
        this.d(k.b(k2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public m_0 f(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        k k2 = null;
        try {
            k2 = (k)k.ag.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            k2 = (k)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (k2 != null) {
                this.c(k2);
            }
        }
        return this;
    }

    @Override
    public boolean Q() {
        return this.ah != null || this.ae != null;
    }

    @Override
    public h R() {
        if (this.ah == null) {
            return this.ae == null ? h.y() : this.ae;
        }
        return (h)this.ah.getMessage();
    }

    public m_0 d(h h2) {
        if (this.ah == null) {
            if (h2 == null) {
                throw new NullPointerException();
            }
            this.ae = h2;
            this.onChanged();
        } else {
            this.ah.setMessage((AbstractMessage)h2);
        }
        return this;
    }

    public m_0 a(j_0 j_02) {
        if (this.ah == null) {
            this.ae = j_02.F();
            this.onChanged();
        } else {
            this.ah.setMessage((AbstractMessage)j_02.F());
        }
        return this;
    }

    public m_0 e(h h2) {
        if (this.ah == null) {
            this.ae = this.ae != null ? h.a(this.ae).c(h2).G() : h2;
            this.onChanged();
        } else {
            this.ah.mergeFrom((AbstractMessage)h2);
        }
        return this;
    }

    public m_0 ae() {
        if (this.ah == null) {
            this.ae = null;
            this.onChanged();
        } else {
            this.ae = null;
            this.ah = null;
        }
        return this;
    }

    public j_0 af() {
        this.onChanged();
        return (j_0)this.ag().getBuilder();
    }

    @Override
    public s_0 S() {
        if (this.ah != null) {
            return (s_0)this.ah.getMessageOrBuilder();
        }
        return this.ae == null ? h.y() : this.ae;
    }

    private SingleFieldBuilderV3<h, j_0, s_0> ag() {
        if (this.ah == null) {
            this.ah = new SingleFieldBuilderV3((AbstractMessage)this.R(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.ae = null;
        }
        return this.ah;
    }

    public final m_0 c(UnknownFieldSet unknownFieldSet) {
        return (m_0)super.setUnknownFields(unknownFieldSet);
    }

    public final m_0 d(UnknownFieldSet unknownFieldSet) {
        return (m_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.d(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.c(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.d(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.b(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.b(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.b(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.c(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aa();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.ad();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.d(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.f(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.b(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aa();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.b(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.ad();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.d(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.c(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.d(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.b(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.b(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.b(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.c(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.f(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.ad();
    }

    public /* synthetic */ Message buildPartial() {
        return this.ac();
    }

    public /* synthetic */ Message build() {
        return this.ab();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.b(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aa();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.f(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.ad();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.ac();
    }

    public /* synthetic */ MessageLite build() {
        return this.ab();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aa();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.X();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.X();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.f(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.ad();
    }

    public /* synthetic */ Object clone() {
        return this.ad();
    }
}

