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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from di
 */
public final class di_1
extends GeneratedMessageV3.Builder<di_1>
implements dy_2 {
    private int an;
    private long jT;
    private dj_2 jV;
    private SingleFieldBuilderV3<dj_2, dl_1, dm_2> ka;
    private List<di_2> jX = Collections.emptyList();
    private RepeatedFieldBuilderV3<di_2, dk_1, dl_2> kb;

    public static final Descriptors.Descriptor pr() {
        return df_2.jx;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return df_2.jy.ensureFieldAccessorsInitialized(dg_1.class, di_1.class);
    }

    di_1() {
        this.D();
    }

    di_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (dg_1.fa()) {
            this.pz();
            this.pE();
        }
    }

    public di_1 ps() {
        super.clear();
        this.jT = 0L;
        this.an &= 0xFFFFFFFE;
        if (this.ka == null) {
            this.jV = null;
        } else {
            this.ka.clear();
        }
        this.an &= 0xFFFFFFFD;
        if (this.kb == null) {
            this.jX = Collections.emptyList();
            this.an &= 0xFFFFFFFB;
        } else {
            this.kb.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return df_2.jx;
    }

    public dg_1 pq() {
        return dg_1.pp();
    }

    public dg_1 pt() {
        dg_1 dg_12 = this.pu();
        if (!dg_12.isInitialized()) {
            throw di_1.newUninitializedMessageException((Message)dg_12);
        }
        return dg_12;
    }

    public dg_1 pu() {
        dg_1 dg_12 = new dg_1(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            dg_12.jT = this.jT;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            dg_12.jV = this.ka == null ? this.jV : (dj_2)this.ka.build();
            n2 |= 2;
        }
        if (this.kb == null) {
            if ((this.an & 4) != 0) {
                this.jX = Collections.unmodifiableList(this.jX);
                this.an &= 0xFFFFFFFB;
            }
            dg_12.jX = this.jX;
        } else {
            dg_12.jX = this.kb.build();
        }
        dg_12.an = n2;
        this.onBuilt();
        return dg_12;
    }

    public di_1 pv() {
        return (di_1)super.clone();
    }

    public di_1 aQ(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (di_1)super.setField(fieldDescriptor, object);
    }

    public di_1 V(Descriptors.FieldDescriptor fieldDescriptor) {
        return (di_1)super.clearField(fieldDescriptor);
    }

    public di_1 V(Descriptors.OneofDescriptor oneofDescriptor) {
        return (di_1)super.clearOneof(oneofDescriptor);
    }

    public di_1 V(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (di_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public di_1 aR(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (di_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public di_1 V(Message message) {
        if (message instanceof dg_1) {
            return this.c((dg_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public di_1 c(dg_1 dg_12) {
        if (dg_12 == dg_1.pp()) {
            return this;
        }
        if (dg_12.pe()) {
            this.J(dg_12.pf());
        }
        if (dg_12.pg()) {
            this.b(dg_12.ph());
        }
        if (this.kb == null) {
            if (!dg_12.jX.isEmpty()) {
                if (this.jX.isEmpty()) {
                    this.jX = dg_12.jX;
                    this.an &= 0xFFFFFFFB;
                } else {
                    this.pA();
                    this.jX.addAll(dg_12.jX);
                }
                this.onChanged();
            }
        } else if (!dg_12.jX.isEmpty()) {
            if (this.kb.isEmpty()) {
                this.kb.dispose();
                this.kb = null;
                this.jX = dg_12.jX;
                this.an &= 0xFFFFFFFB;
                this.kb = dg_1.oV() ? this.pE() : null;
            } else {
                this.kb.addAllMessages(dg_12.jX);
            }
        }
        this.aR(dg_1.b(dg_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.pe()) {
            return false;
        }
        if (!this.pg()) {
            return false;
        }
        for (int i = 0; i < this.pl(); ++i) {
            if (this.aq(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public di_1 bN(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        dg_1 dg_12 = null;
        try {
            dg_12 = (dg_1)dg_1.jZ.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            dg_12 = (dg_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (dg_12 != null) {
                this.c(dg_12);
            }
        }
        return this;
    }

    @Override
    public boolean pe() {
        return (this.an & 1) != 0;
    }

    @Override
    public long pf() {
        return this.jT;
    }

    public di_1 J(long l) {
        this.an |= 1;
        this.jT = l;
        this.onChanged();
        return this;
    }

    public di_1 pw() {
        this.an &= 0xFFFFFFFE;
        this.jT = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean pg() {
        return (this.an & 2) != 0;
    }

    @Override
    public dj_2 ph() {
        if (this.ka == null) {
            return this.jV == null ? dj_2.pR() : this.jV;
        }
        return (dj_2)this.ka.getMessage();
    }

    public di_1 a(dj_2 dj_22) {
        if (this.ka == null) {
            if (dj_22 == null) {
                throw new NullPointerException();
            }
            this.jV = dj_22;
            this.onChanged();
        } else {
            this.ka.setMessage((AbstractMessage)dj_22);
        }
        this.an |= 2;
        return this;
    }

    public di_1 a(dl_1 dl_12) {
        if (this.ka == null) {
            this.jV = dl_12.pW();
            this.onChanged();
        } else {
            this.ka.setMessage((AbstractMessage)dl_12.pW());
        }
        this.an |= 2;
        return this;
    }

    public di_1 b(dj_2 dj_22) {
        if (this.ka == null) {
            this.jV = (this.an & 2) != 0 && this.jV != null && this.jV != dj_2.pR() ? dj_2.c(this.jV).e(dj_22).pX() : dj_22;
            this.onChanged();
        } else {
            this.ka.mergeFrom((AbstractMessage)dj_22);
        }
        this.an |= 2;
        return this;
    }

    public di_1 px() {
        if (this.ka == null) {
            this.jV = null;
            this.onChanged();
        } else {
            this.ka.clear();
        }
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public dl_1 py() {
        this.an |= 2;
        this.onChanged();
        return (dl_1)this.pz().getBuilder();
    }

    @Override
    public dm_2 pi() {
        if (this.ka != null) {
            return (dm_2)this.ka.getMessageOrBuilder();
        }
        return this.jV == null ? dj_2.pR() : this.jV;
    }

    private SingleFieldBuilderV3<dj_2, dl_1, dm_2> pz() {
        if (this.ka == null) {
            this.ka = new SingleFieldBuilderV3((AbstractMessage)this.ph(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.jV = null;
        }
        return this.ka;
    }

    private void pA() {
        if ((this.an & 4) == 0) {
            this.jX = new ArrayList<di_2>(this.jX);
            this.an |= 4;
        }
    }

    @Override
    public List<di_2> pj() {
        if (this.kb == null) {
            return Collections.unmodifiableList(this.jX);
        }
        return this.kb.getMessageList();
    }

    @Override
    public int pl() {
        if (this.kb == null) {
            return this.jX.size();
        }
        return this.kb.getCount();
    }

    @Override
    public di_2 aq(int n) {
        if (this.kb == null) {
            return this.jX.get(n);
        }
        return (di_2)this.kb.getMessage(n);
    }

    public di_1 a(int n, di_2 di_22) {
        if (this.kb == null) {
            if (di_22 == null) {
                throw new NullPointerException();
            }
            this.pA();
            this.jX.set(n, di_22);
            this.onChanged();
        } else {
            this.kb.setMessage(n, (AbstractMessage)di_22);
        }
        return this;
    }

    public di_1 a(int n, dk_1 dk_12) {
        if (this.kb == null) {
            this.pA();
            this.jX.set(n, dk_12.sf());
            this.onChanged();
        } else {
            this.kb.setMessage(n, (AbstractMessage)dk_12.sf());
        }
        return this;
    }

    public di_1 a(di_2 di_22) {
        if (this.kb == null) {
            if (di_22 == null) {
                throw new NullPointerException();
            }
            this.pA();
            this.jX.add(di_22);
            this.onChanged();
        } else {
            this.kb.addMessage((AbstractMessage)di_22);
        }
        return this;
    }

    public di_1 b(int n, di_2 di_22) {
        if (this.kb == null) {
            if (di_22 == null) {
                throw new NullPointerException();
            }
            this.pA();
            this.jX.add(n, di_22);
            this.onChanged();
        } else {
            this.kb.addMessage(n, (AbstractMessage)di_22);
        }
        return this;
    }

    public di_1 a(dk_1 dk_12) {
        if (this.kb == null) {
            this.pA();
            this.jX.add(dk_12.sf());
            this.onChanged();
        } else {
            this.kb.addMessage((AbstractMessage)dk_12.sf());
        }
        return this;
    }

    public di_1 b(int n, dk_1 dk_12) {
        if (this.kb == null) {
            this.pA();
            this.jX.add(n, dk_12.sf());
            this.onChanged();
        } else {
            this.kb.addMessage(n, (AbstractMessage)dk_12.sf());
        }
        return this;
    }

    public di_1 i(Iterable<? extends di_2> iterable) {
        if (this.kb == null) {
            this.pA();
            AbstractMessageLite.Builder.addAll(iterable, this.jX);
            this.onChanged();
        } else {
            this.kb.addAllMessages(iterable);
        }
        return this;
    }

    public di_1 pB() {
        if (this.kb == null) {
            this.jX = Collections.emptyList();
            this.an &= 0xFFFFFFFB;
            this.onChanged();
        } else {
            this.kb.clear();
        }
        return this;
    }

    public di_1 as(int n) {
        if (this.kb == null) {
            this.pA();
            this.jX.remove(n);
            this.onChanged();
        } else {
            this.kb.remove(n);
        }
        return this;
    }

    public dk_1 at(int n) {
        return (dk_1)this.pE().getBuilder(n);
    }

    @Override
    public dl_2 ar(int n) {
        if (this.kb == null) {
            return this.jX.get(n);
        }
        return (dl_2)this.kb.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends dl_2> pk() {
        if (this.kb != null) {
            return this.kb.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.jX);
    }

    public dk_1 pC() {
        return (dk_1)this.pE().addBuilder((AbstractMessage)di_2.sb());
    }

    public dk_1 au(int n) {
        return (dk_1)this.pE().addBuilder(n, (AbstractMessage)di_2.sb());
    }

    public List<dk_1> pD() {
        return this.pE().getBuilderList();
    }

    private RepeatedFieldBuilderV3<di_2, dk_1, dl_2> pE() {
        if (this.kb == null) {
            this.kb = new RepeatedFieldBuilderV3(this.jX, (this.an & 4) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.jX = null;
        }
        return this.kb;
    }

    public final di_1 aQ(UnknownFieldSet unknownFieldSet) {
        return (di_1)super.setUnknownFields(unknownFieldSet);
    }

    public final di_1 aR(UnknownFieldSet unknownFieldSet) {
        return (di_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aR(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aQ(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aR(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.V(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.V(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.V(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aQ(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.ps();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.pv();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aR(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bN(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.V(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.ps();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.V(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.pv();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aR(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aQ(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aR(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.V(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.V(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.V(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aQ(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bN(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.pv();
    }

    public /* synthetic */ Message buildPartial() {
        return this.pu();
    }

    public /* synthetic */ Message build() {
        return this.pt();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.V(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.ps();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bN(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.pv();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.pu();
    }

    public /* synthetic */ MessageLite build() {
        return this.pt();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.ps();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.pq();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.pq();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bN(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.pv();
    }

    public /* synthetic */ Object clone() {
        return this.pv();
    }
}

