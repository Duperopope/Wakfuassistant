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
 *  com.google.protobuf.RepeatedFieldBuilderV3
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from kC
 */
public final class kc_2
extends GeneratedMessageV3.Builder<kc_2>
implements kd_2 {
    private int an;
    private List<kx_2> FK = Collections.emptyList();
    private RepeatedFieldBuilderV3<kx_2, kz_2, ke_2> FN;

    public static final Descriptors.Descriptor acg() {
        return kw_2.FA;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kw_2.FB.ensureFieldAccessorsInitialized(ka_2.class, kc_2.class);
    }

    kc_2() {
        this.D();
    }

    kc_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ka_2.fa()) {
            this.acp();
        }
    }

    public kc_2 ach() {
        super.clear();
        if (this.FN == null) {
            this.FK = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.FN.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kw_2.FA;
    }

    public ka_2 acf() {
        return ka_2.ace();
    }

    public ka_2 aci() {
        ka_2 ka_22 = this.acj();
        if (!ka_22.isInitialized()) {
            throw kc_2.newUninitializedMessageException((Message)ka_22);
        }
        return ka_22;
    }

    public ka_2 acj() {
        ka_2 ka_22 = new ka_2(this);
        int n = this.an;
        if (this.FN == null) {
            if ((this.an & 1) != 0) {
                this.FK = Collections.unmodifiableList(this.FK);
                this.an &= 0xFFFFFFFE;
            }
            ka_22.FK = this.FK;
        } else {
            ka_22.FK = this.FN.build();
        }
        this.onBuilt();
        return ka_22;
    }

    public kc_2 ack() {
        return (kc_2)super.clone();
    }

    public kc_2 ea(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kc_2)super.setField(fieldDescriptor, object);
    }

    public kc_2 bA(Descriptors.FieldDescriptor fieldDescriptor) {
        return (kc_2)super.clearField(fieldDescriptor);
    }

    public kc_2 bA(Descriptors.OneofDescriptor oneofDescriptor) {
        return (kc_2)super.clearOneof(oneofDescriptor);
    }

    public kc_2 bA(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (kc_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public kc_2 eb(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kc_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public kc_2 bA(Message message) {
        if (message instanceof ka_2) {
            return this.c((ka_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public kc_2 c(ka_2 ka_22) {
        if (ka_22 == ka_2.ace()) {
            return this;
        }
        if (this.FN == null) {
            if (!ka_22.FK.isEmpty()) {
                if (this.FK.isEmpty()) {
                    this.FK = ka_22.FK;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.acl();
                    this.FK.addAll(ka_22.FK);
                }
                this.onChanged();
            }
        } else if (!ka_22.FK.isEmpty()) {
            if (this.FN.isEmpty()) {
                this.FN.dispose();
                this.FN = null;
                this.FK = ka_22.FK;
                this.an &= 0xFFFFFFFE;
                this.FN = ka_2.oV() ? this.acp() : null;
            } else {
                this.FN.addAllMessages(ka_22.FK);
            }
        }
        this.eb(ka_2.b(ka_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public kc_2 gC(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ka_2 ka_22 = null;
        try {
            ka_22 = (ka_2)ka_2.FM.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ka_22 = (ka_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ka_22 != null) {
                this.c(ka_22);
            }
        }
        return this;
    }

    private void acl() {
        if ((this.an & 1) == 0) {
            this.FK = new ArrayList<kx_2>(this.FK);
            this.an |= 1;
        }
    }

    @Override
    public List<kx_2> abY() {
        if (this.FN == null) {
            return Collections.unmodifiableList(this.FK);
        }
        return this.FN.getMessageList();
    }

    @Override
    public int aca() {
        if (this.FN == null) {
            return this.FK.size();
        }
        return this.FN.getCount();
    }

    @Override
    public kx_2 gG(int n) {
        if (this.FN == null) {
            return this.FK.get(n);
        }
        return (kx_2)this.FN.getMessage(n);
    }

    public kc_2 a(int n, kx_2 kx_22) {
        if (this.FN == null) {
            if (kx_22 == null) {
                throw new NullPointerException();
            }
            this.acl();
            this.FK.set(n, kx_22);
            this.onChanged();
        } else {
            this.FN.setMessage(n, (AbstractMessage)kx_22);
        }
        return this;
    }

    public kc_2 a(int n, kz_2 kz_22) {
        if (this.FN == null) {
            this.acl();
            this.FK.set(n, kz_22.abR());
            this.onChanged();
        } else {
            this.FN.setMessage(n, (AbstractMessage)kz_22.abR());
        }
        return this;
    }

    public kc_2 d(kx_2 kx_22) {
        if (this.FN == null) {
            if (kx_22 == null) {
                throw new NullPointerException();
            }
            this.acl();
            this.FK.add(kx_22);
            this.onChanged();
        } else {
            this.FN.addMessage((AbstractMessage)kx_22);
        }
        return this;
    }

    public kc_2 b(int n, kx_2 kx_22) {
        if (this.FN == null) {
            if (kx_22 == null) {
                throw new NullPointerException();
            }
            this.acl();
            this.FK.add(n, kx_22);
            this.onChanged();
        } else {
            this.FN.addMessage(n, (AbstractMessage)kx_22);
        }
        return this;
    }

    public kc_2 a(kz_2 kz_22) {
        if (this.FN == null) {
            this.acl();
            this.FK.add(kz_22.abR());
            this.onChanged();
        } else {
            this.FN.addMessage((AbstractMessage)kz_22.abR());
        }
        return this;
    }

    public kc_2 b(int n, kz_2 kz_22) {
        if (this.FN == null) {
            this.acl();
            this.FK.add(n, kz_22.abR());
            this.onChanged();
        } else {
            this.FN.addMessage(n, (AbstractMessage)kz_22.abR());
        }
        return this;
    }

    public kc_2 U(Iterable<? extends kx_2> iterable) {
        if (this.FN == null) {
            this.acl();
            AbstractMessageLite.Builder.addAll(iterable, this.FK);
            this.onChanged();
        } else {
            this.FN.addAllMessages(iterable);
        }
        return this;
    }

    public kc_2 acm() {
        if (this.FN == null) {
            this.FK = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.FN.clear();
        }
        return this;
    }

    public kc_2 gI(int n) {
        if (this.FN == null) {
            this.acl();
            this.FK.remove(n);
            this.onChanged();
        } else {
            this.FN.remove(n);
        }
        return this;
    }

    public kz_2 gJ(int n) {
        return (kz_2)this.acp().getBuilder(n);
    }

    @Override
    public ke_2 gH(int n) {
        if (this.FN == null) {
            return this.FK.get(n);
        }
        return (ke_2)this.FN.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends ke_2> abZ() {
        if (this.FN != null) {
            return this.FN.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.FK);
    }

    public kz_2 acn() {
        return (kz_2)this.acp().addBuilder((AbstractMessage)kx_2.abN());
    }

    public kz_2 gK(int n) {
        return (kz_2)this.acp().addBuilder(n, (AbstractMessage)kx_2.abN());
    }

    public List<kz_2> aco() {
        return this.acp().getBuilderList();
    }

    private RepeatedFieldBuilderV3<kx_2, kz_2, ke_2> acp() {
        if (this.FN == null) {
            this.FN = new RepeatedFieldBuilderV3(this.FK, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.FK = null;
        }
        return this.FN;
    }

    public final kc_2 ea(UnknownFieldSet unknownFieldSet) {
        return (kc_2)super.setUnknownFields(unknownFieldSet);
    }

    public final kc_2 eb(UnknownFieldSet unknownFieldSet) {
        return (kc_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eb(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ea(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eb(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bA(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bA(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bA(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ea(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.ach();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.ack();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eb(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gC(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bA(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.ach();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bA(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.ack();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eb(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ea(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eb(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bA(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bA(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bA(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ea(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gC(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.ack();
    }

    public /* synthetic */ Message buildPartial() {
        return this.acj();
    }

    public /* synthetic */ Message build() {
        return this.aci();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bA(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.ach();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gC(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.ack();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.acj();
    }

    public /* synthetic */ MessageLite build() {
        return this.aci();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.ach();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.acf();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.acf();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gC(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.ack();
    }

    public /* synthetic */ Object clone() {
        return this.ack();
    }
}

