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
 * Renamed from ki
 */
public final class ki_0
extends GeneratedMessageV3.Builder<ki_0>
implements kr_0 {
    private int an;
    private List<kj_0> EP = Collections.emptyList();
    private RepeatedFieldBuilderV3<kj_0, kl_0, km_0> EU;
    private List<kn_0> ER = Collections.emptyList();
    private RepeatedFieldBuilderV3<kn_0, kp_0, kq_0> EV;

    public static final Descriptors.Descriptor aae() {
        return kb.Ez;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kb.EA.ensureFieldAccessorsInitialized(kg_0.class, ki_0.class);
    }

    ki_0() {
        this.D();
    }

    ki_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (kg_0.gG()) {
            this.aan();
            this.aas();
        }
    }

    public ki_0 aaf() {
        super.clear();
        if (this.EU == null) {
            this.EP = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.EU.clear();
        }
        if (this.EV == null) {
            this.ER = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
        } else {
            this.EV.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kb.Ez;
    }

    public kg_0 aad() {
        return kg_0.aac();
    }

    public kg_0 aag() {
        kg_0 kg_02 = this.aah();
        if (!kg_02.isInitialized()) {
            throw ki_0.newUninitializedMessageException((Message)kg_02);
        }
        return kg_02;
    }

    public kg_0 aah() {
        kg_0 kg_02 = new kg_0(this);
        int n = this.an;
        if (this.EU == null) {
            if ((this.an & 1) != 0) {
                this.EP = Collections.unmodifiableList(this.EP);
                this.an &= 0xFFFFFFFE;
            }
            kg_02.EP = this.EP;
        } else {
            kg_02.EP = this.EU.build();
        }
        if (this.EV == null) {
            if ((this.an & 2) != 0) {
                this.ER = Collections.unmodifiableList(this.ER);
                this.an &= 0xFFFFFFFD;
            }
            kg_02.ER = this.ER;
        } else {
            kg_02.ER = this.EV.build();
        }
        this.onBuilt();
        return kg_02;
    }

    public ki_0 aai() {
        return (ki_0)super.clone();
    }

    public ki_0 dQ(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ki_0)super.setField(fieldDescriptor, object);
    }

    public ki_0 bv(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ki_0)super.clearField(fieldDescriptor);
    }

    public ki_0 bv(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ki_0)super.clearOneof(oneofDescriptor);
    }

    public ki_0 bv(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ki_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ki_0 dR(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ki_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public ki_0 bv(Message message) {
        if (message instanceof kg_0) {
            return this.c((kg_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ki_0 c(kg_0 kg_02) {
        if (kg_02 == kg_0.aac()) {
            return this;
        }
        if (this.EU == null) {
            if (!kg_02.EP.isEmpty()) {
                if (this.EP.isEmpty()) {
                    this.EP = kg_02.EP;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.aaj();
                    this.EP.addAll(kg_02.EP);
                }
                this.onChanged();
            }
        } else if (!kg_02.EP.isEmpty()) {
            if (this.EU.isEmpty()) {
                this.EU.dispose();
                this.EU = null;
                this.EP = kg_02.EP;
                this.an &= 0xFFFFFFFE;
                this.EU = kg_0.B() ? this.aan() : null;
            } else {
                this.EU.addAllMessages(kg_02.EP);
            }
        }
        if (this.EV == null) {
            if (!kg_02.ER.isEmpty()) {
                if (this.ER.isEmpty()) {
                    this.ER = kg_02.ER;
                    this.an &= 0xFFFFFFFD;
                } else {
                    this.aao();
                    this.ER.addAll(kg_02.ER);
                }
                this.onChanged();
            }
        } else if (!kg_02.ER.isEmpty()) {
            if (this.EV.isEmpty()) {
                this.EV.dispose();
                this.EV = null;
                this.ER = kg_02.ER;
                this.an &= 0xFFFFFFFD;
                this.EV = kg_0.jh() ? this.aas() : null;
            } else {
                this.EV.addAllMessages(kg_02.ER);
            }
        }
        this.dR(kg_0.b(kg_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        int n;
        for (n = 0; n < this.ZV(); ++n) {
            if (this.gq(n).isInitialized()) continue;
            return false;
        }
        for (n = 0; n < this.ZY(); ++n) {
            if (this.gs(n).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public ki_0 gn(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        kg_0 kg_02 = null;
        try {
            kg_02 = (kg_0)kg_0.ET.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            kg_02 = (kg_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (kg_02 != null) {
                this.c(kg_02);
            }
        }
        return this;
    }

    private void aaj() {
        if ((this.an & 1) == 0) {
            this.EP = new ArrayList<kj_0>(this.EP);
            this.an |= 1;
        }
    }

    @Override
    public List<kj_0> ZT() {
        if (this.EU == null) {
            return Collections.unmodifiableList(this.EP);
        }
        return this.EU.getMessageList();
    }

    @Override
    public int ZV() {
        if (this.EU == null) {
            return this.EP.size();
        }
        return this.EU.getCount();
    }

    @Override
    public kj_0 gq(int n) {
        if (this.EU == null) {
            return this.EP.get(n);
        }
        return (kj_0)this.EU.getMessage(n);
    }

    public ki_0 a(int n, kj_0 kj_02) {
        if (this.EU == null) {
            if (kj_02 == null) {
                throw new NullPointerException();
            }
            this.aaj();
            this.EP.set(n, kj_02);
            this.onChanged();
        } else {
            this.EU.setMessage(n, (AbstractMessage)kj_02);
        }
        return this;
    }

    public ki_0 a(int n, kl_0 kl_02) {
        if (this.EU == null) {
            this.aaj();
            this.EP.set(n, kl_02.aaL());
            this.onChanged();
        } else {
            this.EU.setMessage(n, (AbstractMessage)kl_02.aaL());
        }
        return this;
    }

    public ki_0 a(kj_0 kj_02) {
        if (this.EU == null) {
            if (kj_02 == null) {
                throw new NullPointerException();
            }
            this.aaj();
            this.EP.add(kj_02);
            this.onChanged();
        } else {
            this.EU.addMessage((AbstractMessage)kj_02);
        }
        return this;
    }

    public ki_0 b(int n, kj_0 kj_02) {
        if (this.EU == null) {
            if (kj_02 == null) {
                throw new NullPointerException();
            }
            this.aaj();
            this.EP.add(n, kj_02);
            this.onChanged();
        } else {
            this.EU.addMessage(n, (AbstractMessage)kj_02);
        }
        return this;
    }

    public ki_0 a(kl_0 kl_02) {
        if (this.EU == null) {
            this.aaj();
            this.EP.add(kl_02.aaL());
            this.onChanged();
        } else {
            this.EU.addMessage((AbstractMessage)kl_02.aaL());
        }
        return this;
    }

    public ki_0 b(int n, kl_0 kl_02) {
        if (this.EU == null) {
            this.aaj();
            this.EP.add(n, kl_02.aaL());
            this.onChanged();
        } else {
            this.EU.addMessage(n, (AbstractMessage)kl_02.aaL());
        }
        return this;
    }

    public ki_0 R(Iterable<? extends kj_0> iterable) {
        if (this.EU == null) {
            this.aaj();
            AbstractMessageLite.Builder.addAll(iterable, this.EP);
            this.onChanged();
        } else {
            this.EU.addAllMessages(iterable);
        }
        return this;
    }

    public ki_0 aak() {
        if (this.EU == null) {
            this.EP = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.EU.clear();
        }
        return this;
    }

    public ki_0 gu(int n) {
        if (this.EU == null) {
            this.aaj();
            this.EP.remove(n);
            this.onChanged();
        } else {
            this.EU.remove(n);
        }
        return this;
    }

    public kl_0 gv(int n) {
        return (kl_0)this.aan().getBuilder(n);
    }

    @Override
    public km_0 gr(int n) {
        if (this.EU == null) {
            return this.EP.get(n);
        }
        return (km_0)this.EU.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends km_0> ZU() {
        if (this.EU != null) {
            return this.EU.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.EP);
    }

    public kl_0 aal() {
        return (kl_0)this.aan().addBuilder((AbstractMessage)kj_0.aaH());
    }

    public kl_0 gw(int n) {
        return (kl_0)this.aan().addBuilder(n, (AbstractMessage)kj_0.aaH());
    }

    public List<kl_0> aam() {
        return this.aan().getBuilderList();
    }

    private RepeatedFieldBuilderV3<kj_0, kl_0, km_0> aan() {
        if (this.EU == null) {
            this.EU = new RepeatedFieldBuilderV3(this.EP, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.EP = null;
        }
        return this.EU;
    }

    private void aao() {
        if ((this.an & 2) == 0) {
            this.ER = new ArrayList<kn_0>(this.ER);
            this.an |= 2;
        }
    }

    @Override
    public List<kn_0> ZW() {
        if (this.EV == null) {
            return Collections.unmodifiableList(this.ER);
        }
        return this.EV.getMessageList();
    }

    @Override
    public int ZY() {
        if (this.EV == null) {
            return this.ER.size();
        }
        return this.EV.getCount();
    }

    @Override
    public kn_0 gs(int n) {
        if (this.EV == null) {
            return this.ER.get(n);
        }
        return (kn_0)this.EV.getMessage(n);
    }

    public ki_0 a(int n, kn_0 kn_02) {
        if (this.EV == null) {
            if (kn_02 == null) {
                throw new NullPointerException();
            }
            this.aao();
            this.ER.set(n, kn_02);
            this.onChanged();
        } else {
            this.EV.setMessage(n, (AbstractMessage)kn_02);
        }
        return this;
    }

    public ki_0 a(int n, kp_0 kp_02) {
        if (this.EV == null) {
            this.aao();
            this.ER.set(n, kp_02.abe());
            this.onChanged();
        } else {
            this.EV.setMessage(n, (AbstractMessage)kp_02.abe());
        }
        return this;
    }

    public ki_0 a(kn_0 kn_02) {
        if (this.EV == null) {
            if (kn_02 == null) {
                throw new NullPointerException();
            }
            this.aao();
            this.ER.add(kn_02);
            this.onChanged();
        } else {
            this.EV.addMessage((AbstractMessage)kn_02);
        }
        return this;
    }

    public ki_0 b(int n, kn_0 kn_02) {
        if (this.EV == null) {
            if (kn_02 == null) {
                throw new NullPointerException();
            }
            this.aao();
            this.ER.add(n, kn_02);
            this.onChanged();
        } else {
            this.EV.addMessage(n, (AbstractMessage)kn_02);
        }
        return this;
    }

    public ki_0 a(kp_0 kp_02) {
        if (this.EV == null) {
            this.aao();
            this.ER.add(kp_02.abe());
            this.onChanged();
        } else {
            this.EV.addMessage((AbstractMessage)kp_02.abe());
        }
        return this;
    }

    public ki_0 b(int n, kp_0 kp_02) {
        if (this.EV == null) {
            this.aao();
            this.ER.add(n, kp_02.abe());
            this.onChanged();
        } else {
            this.EV.addMessage(n, (AbstractMessage)kp_02.abe());
        }
        return this;
    }

    public ki_0 S(Iterable<? extends kn_0> iterable) {
        if (this.EV == null) {
            this.aao();
            AbstractMessageLite.Builder.addAll(iterable, this.ER);
            this.onChanged();
        } else {
            this.EV.addAllMessages(iterable);
        }
        return this;
    }

    public ki_0 aap() {
        if (this.EV == null) {
            this.ER = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.EV.clear();
        }
        return this;
    }

    public ki_0 gx(int n) {
        if (this.EV == null) {
            this.aao();
            this.ER.remove(n);
            this.onChanged();
        } else {
            this.EV.remove(n);
        }
        return this;
    }

    public kp_0 gy(int n) {
        return (kp_0)this.aas().getBuilder(n);
    }

    @Override
    public kq_0 gt(int n) {
        if (this.EV == null) {
            return this.ER.get(n);
        }
        return (kq_0)this.EV.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends kq_0> ZX() {
        if (this.EV != null) {
            return this.EV.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.ER);
    }

    public kp_0 aaq() {
        return (kp_0)this.aas().addBuilder((AbstractMessage)kn_0.aba());
    }

    public kp_0 gz(int n) {
        return (kp_0)this.aas().addBuilder(n, (AbstractMessage)kn_0.aba());
    }

    public List<kp_0> aar() {
        return this.aas().getBuilderList();
    }

    private RepeatedFieldBuilderV3<kn_0, kp_0, kq_0> aas() {
        if (this.EV == null) {
            this.EV = new RepeatedFieldBuilderV3(this.ER, (this.an & 2) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.ER = null;
        }
        return this.EV;
    }

    public final ki_0 dQ(UnknownFieldSet unknownFieldSet) {
        return (ki_0)super.setUnknownFields(unknownFieldSet);
    }

    public final ki_0 dR(UnknownFieldSet unknownFieldSet) {
        return (ki_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dR(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dQ(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dR(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bv(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bv(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bv(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dQ(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aaf();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aai();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dR(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gn(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bv(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aaf();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bv(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aai();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dR(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dQ(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dR(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bv(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bv(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bv(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dQ(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gn(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aai();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aah();
    }

    public /* synthetic */ Message build() {
        return this.aag();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bv(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aaf();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gn(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aai();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aah();
    }

    public /* synthetic */ MessageLite build() {
        return this.aag();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aaf();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aad();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aad();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gn(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aai();
    }

    public /* synthetic */ Object clone() {
        return this.aai();
    }
}

