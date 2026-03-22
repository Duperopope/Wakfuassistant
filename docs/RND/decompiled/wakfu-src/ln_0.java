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
 * Renamed from ln
 */
public final class ln_0
extends GeneratedMessageV3.Builder<ln_0>
implements lo_0 {
    private int an;
    private List<li> jj = Collections.emptyList();
    private RepeatedFieldBuilderV3<li, lk_1, lp_0> jm;

    public static final Descriptors.Descriptor afW() {
        return kF.Gs;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.Gt.ensureFieldAccessorsInitialized(ll_0.class, ln_0.class);
    }

    ln_0() {
        this.D();
    }

    ln_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ll_0.mZ()) {
            this.oL();
        }
    }

    public ln_0 afX() {
        super.clear();
        if (this.jm == null) {
            this.jj = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.jm.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kF.Gs;
    }

    public ll_0 afU() {
        return ll_0.afT();
    }

    public ll_0 afY() {
        ll_0 ll_02 = this.afZ();
        if (!ll_02.isInitialized()) {
            throw ln_0.newUninitializedMessageException((Message)ll_02);
        }
        return ll_02;
    }

    public ll_0 afZ() {
        ll_0 ll_02 = new ll_0(this);
        int n = this.an;
        if (this.jm == null) {
            if ((this.an & 1) != 0) {
                this.jj = Collections.unmodifiableList(this.jj);
                this.an &= 0xFFFFFFFE;
            }
            ll_02.jj = this.jj;
        } else {
            ll_02.jj = this.jm.build();
        }
        this.onBuilt();
        return ll_02;
    }

    public ln_0 aga() {
        return (ln_0)super.clone();
    }

    public ln_0 es(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ln_0)super.setField(fieldDescriptor, object);
    }

    public ln_0 bJ(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ln_0)super.clearField(fieldDescriptor);
    }

    public ln_0 bJ(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ln_0)super.clearOneof(oneofDescriptor);
    }

    public ln_0 bJ(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ln_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ln_0 et(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ln_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public ln_0 bJ(Message message) {
        if (message instanceof ll_0) {
            return this.c((ll_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ln_0 c(ll_0 ll_02) {
        if (ll_02 == ll_0.afT()) {
            return this;
        }
        if (this.jm == null) {
            if (!ll_02.jj.isEmpty()) {
                if (this.jj.isEmpty()) {
                    this.jj = ll_02.jj;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.oH();
                    this.jj.addAll(ll_02.jj);
                }
                this.onChanged();
            }
        } else if (!ll_02.jj.isEmpty()) {
            if (this.jm.isEmpty()) {
                this.jm.dispose();
                this.jm = null;
                this.jj = ll_02.jj;
                this.an &= 0xFFFFFFFE;
                this.jm = ll_0.afV() ? this.oL() : null;
            } else {
                this.jm.addAllMessages(ll_02.jj);
            }
        }
        this.et(ll_0.b(ll_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.ov(); ++i) {
            if (this.he(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public ln_0 hd(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ll_0 ll_02 = null;
        try {
            ll_02 = (ll_0)ll_0.HW.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ll_02 = (ll_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ll_02 != null) {
                this.c(ll_02);
            }
        }
        return this;
    }

    private void oH() {
        if ((this.an & 1) == 0) {
            this.jj = new ArrayList<li>(this.jj);
            this.an |= 1;
        }
    }

    @Override
    public List<li> ot() {
        if (this.jm == null) {
            return Collections.unmodifiableList(this.jj);
        }
        return this.jm.getMessageList();
    }

    @Override
    public int ov() {
        if (this.jm == null) {
            return this.jj.size();
        }
        return this.jm.getCount();
    }

    @Override
    public li he(int n) {
        if (this.jm == null) {
            return this.jj.get(n);
        }
        return (li)this.jm.getMessage(n);
    }

    public ln_0 a(int n, li li2) {
        if (this.jm == null) {
            if (li2 == null) {
                throw new NullPointerException();
            }
            this.oH();
            this.jj.set(n, li2);
            this.onChanged();
        } else {
            this.jm.setMessage(n, (AbstractMessage)li2);
        }
        return this;
    }

    public ln_0 a(int n, lk_1 lk_12) {
        if (this.jm == null) {
            this.oH();
            this.jj.set(n, lk_12.afK());
            this.onChanged();
        } else {
            this.jm.setMessage(n, (AbstractMessage)lk_12.afK());
        }
        return this;
    }

    public ln_0 d(li li2) {
        if (this.jm == null) {
            if (li2 == null) {
                throw new NullPointerException();
            }
            this.oH();
            this.jj.add(li2);
            this.onChanged();
        } else {
            this.jm.addMessage((AbstractMessage)li2);
        }
        return this;
    }

    public ln_0 b(int n, li li2) {
        if (this.jm == null) {
            if (li2 == null) {
                throw new NullPointerException();
            }
            this.oH();
            this.jj.add(n, li2);
            this.onChanged();
        } else {
            this.jm.addMessage(n, (AbstractMessage)li2);
        }
        return this;
    }

    public ln_0 a(lk_1 lk_12) {
        if (this.jm == null) {
            this.oH();
            this.jj.add(lk_12.afK());
            this.onChanged();
        } else {
            this.jm.addMessage((AbstractMessage)lk_12.afK());
        }
        return this;
    }

    public ln_0 b(int n, lk_1 lk_12) {
        if (this.jm == null) {
            this.oH();
            this.jj.add(n, lk_12.afK());
            this.onChanged();
        } else {
            this.jm.addMessage(n, (AbstractMessage)lk_12.afK());
        }
        return this;
    }

    public ln_0 Y(Iterable<? extends li> iterable) {
        if (this.jm == null) {
            this.oH();
            AbstractMessageLite.Builder.addAll(iterable, this.jj);
            this.onChanged();
        } else {
            this.jm.addAllMessages(iterable);
        }
        return this;
    }

    public ln_0 agb() {
        if (this.jm == null) {
            this.jj = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.jm.clear();
        }
        return this;
    }

    public ln_0 hg(int n) {
        if (this.jm == null) {
            this.oH();
            this.jj.remove(n);
            this.onChanged();
        } else {
            this.jm.remove(n);
        }
        return this;
    }

    public lk_1 hh(int n) {
        return (lk_1)this.oL().getBuilder(n);
    }

    @Override
    public lp_0 hf(int n) {
        if (this.jm == null) {
            return this.jj.get(n);
        }
        return (lp_0)this.jm.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends lp_0> ou() {
        if (this.jm != null) {
            return this.jm.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.jj);
    }

    public lk_1 agc() {
        return (lk_1)this.oL().addBuilder((AbstractMessage)li.afG());
    }

    public lk_1 hi(int n) {
        return (lk_1)this.oL().addBuilder(n, (AbstractMessage)li.afG());
    }

    public List<lk_1> oK() {
        return this.oL().getBuilderList();
    }

    private RepeatedFieldBuilderV3<li, lk_1, lp_0> oL() {
        if (this.jm == null) {
            this.jm = new RepeatedFieldBuilderV3(this.jj, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.jj = null;
        }
        return this.jm;
    }

    public final ln_0 es(UnknownFieldSet unknownFieldSet) {
        return (ln_0)super.setUnknownFields(unknownFieldSet);
    }

    public final ln_0 et(UnknownFieldSet unknownFieldSet) {
        return (ln_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.et(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.es(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.et(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bJ(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bJ(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bJ(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.es(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.afX();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aga();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.et(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hd(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bJ(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.afX();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bJ(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aga();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.et(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.es(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.et(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bJ(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bJ(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bJ(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.es(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hd(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aga();
    }

    public /* synthetic */ Message buildPartial() {
        return this.afZ();
    }

    public /* synthetic */ Message build() {
        return this.afY();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bJ(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.afX();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hd(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aga();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.afZ();
    }

    public /* synthetic */ MessageLite build() {
        return this.afY();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.afX();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.afU();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.afU();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hd(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aga();
    }

    public /* synthetic */ Object clone() {
        return this.aga();
    }
}

